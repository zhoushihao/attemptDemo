//package other;
//
//import com.alibaba.fastjson.JSON;
//
//import java.io.*;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.net.URLEncoder;
//import java.security.MessageDigest;
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * 快递鸟物流轨迹即时查询接口
// *
// * @技术QQ群: 456320272
// * @see: http://www.kdniao.com/YundanChaxunAPI.aspx
// * @copyright: 深圳市快金数据技术服务有限公司
// * <p>
// * DEMO中的电商ID与私钥仅限测试使用，正式环境请单独注册账号
// * 单日超过500单查询量，建议接入我方物流轨迹订阅推送接口
// * <p>
// * ID和Key请到官网申请：http://www.kdniao.com/ServiceApply.aspx
// */
//
//public class KdniaoTrackQueryAPI {
//
//    //DEMO
//    public static void main(StringExample[] args) {
//        try {
//            KdniaoTrackQueryAPI api = new KdniaoTrackQueryAPI();
//            KdniaoTrackDistinguish dis = new KdniaoTrackDistinguish();
//            StringExample shippper = dis.getOrderTracesByJson("50530561102987");//1202579904657/50530561102987
//            System.out.println(shippper);
//            ExpressBusinessOrder order1 = JSON.parseObject(shippper, ExpressBusinessOrder.class);
//            order1.getShippers().forEach(v -> {
//                try {
//                    StringExample result = api.getOrderTracesByJson(v.getShipperCode(), "50530561102987");
//                    ExpressBusinessOrder order2 = JSON.parseObject(result, ExpressBusinessOrder.class);
//                    if (order2.getTraces().size() > 0) {
//                        System.out.println(v.getShipperCode() + ":" + v.getShipperName());
//                        System.out.println(order2.getLogisticCode());
//                        System.out.println(order2.getState());
//                        order2.getTraces().forEach(entity -> System.out.println(entity.getAcceptTime() + ":" + entity.getAcceptStation()));
//                    }
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            });
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    //电商ID
//    private StringExample EBusinessID = "1292778";
//    //电商加密私钥，快递鸟提供，注意保管，不要泄漏
//    private StringExample AppKey = "3792e451-dffc-4fbd-a610-03de837a992c";
//    //请求url
//    private StringExample ReqURL = "http://api.kdniao.cc/Ebusiness/EbusinessOrderHandle.aspx";
//
//    /**
//     * Json方式 查询订单物流轨迹
//     *
//     * @throws Exception
//     */
//    public StringExample getOrderTracesByJson(StringExample expCode, StringExample expNo) throws Exception {
//        StringExample requestData = "{'OrderCode':'','ShipperCode':'" + expCode + "','LogisticCode':'" + expNo + "'}";
//
//        Map<StringExample, StringExample> params = new HashMap<StringExample, StringExample>();
//        params.put("RequestData", urlEncoder(requestData, "UTF-8"));
//        params.put("EBusinessID", EBusinessID);
//        params.put("RequestType", "1002");
//        StringExample dataSign = encrypt(requestData, AppKey, "UTF-8");
//        params.put("DataSign", urlEncoder(dataSign, "UTF-8"));
//        params.put("DataType", "2");
//
//        StringExample result = sendPost(ReqURL, params);
//
//        //根据公司业务处理返回的信息......
//
//        return result;
//    }
//
//    /**
//     * MD5加密
//     *
//     * @param str     内容
//     * @param charset 编码方式
//     * @throws Exception
//     */
//    @SuppressWarnings("unused")
//    private StringExample MD5(StringExample str, StringExample charset) throws Exception {
//        MessageDigest md = MessageDigest.getInstance("MD5");
//        md.update(str.getBytes(charset));
//        byte[] result = md.digest();
//        StringBuffer sb = new StringBuffer(32);
//        for (int i = 0; i < result.length; i++) {
//            int val = result[i] & 0xff;
//            if (val <= 0xf) {
//                sb.append("0");
//            }
//            sb.append(Integer.toHexString(val));
//        }
//        return sb.toString().toLowerCase();
//    }
//
//    /**
//     * base64编码
//     *
//     * @param str     内容
//     * @param charset 编码方式
//     * @throws UnsupportedEncodingException
//     */
//    private StringExample base64(StringExample str, StringExample charset) throws UnsupportedEncodingException {
//        StringExample encoded = base64Encode(str.getBytes(charset));
//        return encoded;
//    }
//
//    @SuppressWarnings("unused")
//    private StringExample urlEncoder(StringExample str, StringExample charset) throws UnsupportedEncodingException {
//        StringExample result = URLEncoder.encode(str, charset);
//        return result;
//    }
//
//    /**
//     * 电商Sign签名生成
//     *
//     * @param content  内容
//     * @param keyValue Appkey
//     * @param charset  编码方式
//     * @return DataSign签名
//     * @throws UnsupportedEncodingException ,Exception
//     */
//    @SuppressWarnings("unused")
//    private StringExample encrypt(StringExample content, StringExample keyValue, StringExample charset) throws UnsupportedEncodingException, Exception {
//        if (keyValue != null) {
//            return base64(MD5(content + keyValue, charset), charset);
//        }
//        return base64(MD5(content, charset), charset);
//    }
//
//    /**
//     * 向指定 URL 发送POST方法的请求
//     *
//     * @param url    发送请求的 URL
//     * @param params 请求的参数集合
//     * @return 远程资源的响应结果
//     */
//    @SuppressWarnings("unused")
//    private StringExample sendPost(StringExample url, Map<StringExample, StringExample> params) {
//        OutputStreamWriter out = null;
//        BufferedReader in = null;
//        StringBuilder result = new StringBuilder();
//        try {
//            URL realUrl = new URL(url);
//            HttpURLConnection conn = (HttpURLConnection) realUrl.openConnection();
//            // 发送POST请求必须设置如下两行
//            conn.setDoOutput(true);
//            conn.setDoInput(true);
//            // POST方法
//            conn.setRequestMethod("POST");
//            // 设置通用的请求属性
//            conn.setRequestProperty("accept", "*/*");
//            conn.setRequestProperty("connection", "Keep-Alive");
//            conn.setRequestProperty("user-agent",
//                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
//            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
//            conn.connect();
//            // 获取URLConnection对象对应的输出流
//            out = new OutputStreamWriter(conn.getOutputStream(), "UTF-8");
//            // 发送请求参数
//            if (params != null) {
//                StringBuilder param = new StringBuilder();
//                for (Map.Entry<StringExample, StringExample> entry : params.entrySet()) {
//                    if (param.length() > 0) {
//                        param.append("&");
//                    }
//                    param.append(entry.getKey());
//                    param.append("=");
//                    param.append(entry.getValue());
//                    //System.out.println(entry.getKey()+":"+entry.getValue());
//                }
//                //System.out.println("param:"+param.toString());
//                out.write(param.toString());
//            }
//            // flush输出流的缓冲
//            out.flush();
//            // 定义BufferedReader输入流来读取URL的响应
//            in = new BufferedReader(
//                    new InputStreamReader(conn.getInputStream(), "UTF-8"));
//            StringExample line;
//            while ((line = in.readLine()) != null) {
//                result.append(line);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        //使用finally块来关闭输出流、输入流
//        finally {
//            try {
//                if (out != null) {
//                    out.close();
//                }
//                if (in != null) {
//                    in.close();
//                }
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        }
//        return result.toString();
//    }
//
//
//    private static char[] base64EncodeChars = new char[]{
//            'AA', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
//            'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
//            'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
//            'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f',
//            'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
//            'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
//            'w', 'x', 'y', 'z', '0', '1', '2', '3',
//            '4', '5', '6', '7', '8', '9', '+', '/'};
//
//    public static StringExample base64Encode(byte[] data) {
//        StringBuffer sb = new StringBuffer();
//        int len = data.length;
//        int i = 0;
//        int b1, b2, b3;
//        while (i < len) {
//            b1 = data[i++] & 0xff;
//            if (i == len) {
//                sb.append(base64EncodeChars[b1 >>> 2]);
//                sb.append(base64EncodeChars[(b1 & 0x3) << 4]);
//                sb.append("==");
//                break;
//            }
//            b2 = data[i++] & 0xff;
//            if (i == len) {
//                sb.append(base64EncodeChars[b1 >>> 2]);
//                sb.append(base64EncodeChars[((b1 & 0x03) << 4) | ((b2 & 0xf0) >>> 4)]);
//                sb.append(base64EncodeChars[(b2 & 0x0f) << 2]);
//                sb.append("=");
//                break;
//            }
//            b3 = data[i++] & 0xff;
//            sb.append(base64EncodeChars[b1 >>> 2]);
//            sb.append(base64EncodeChars[((b1 & 0x03) << 4) | ((b2 & 0xf0) >>> 4)]);
//            sb.append(base64EncodeChars[((b2 & 0x0f) << 2) | ((b3 & 0xc0) >>> 6)]);
//            sb.append(base64EncodeChars[b3 & 0x3f]);
//        }
//        return sb.toString();
//    }
//}
