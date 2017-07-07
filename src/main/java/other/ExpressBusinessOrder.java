package other;

import java.util.List;

/**
 * Created by Administrator on 2017/6/20 0020.
 */
public class ExpressBusinessOrder {
    private String EBusinessID;//商户标识
    private String ShipperCode;//快递公司编号
    private boolean Success;//是否成功
    private String LogisticCode;//快递单号
    private String State;//状态码
    private List<ExpressBusinessDetail> Traces;//快递内容
    private List<ExpressBusinessShipper> Shippers;//快递公司

    public List<ExpressBusinessShipper> getShippers() {
        return Shippers;
    }

    public void setShippers(List<ExpressBusinessShipper> shippers) {
        Shippers = shippers;
    }

    public String getEBusinessID() {
        return EBusinessID;
    }

    public void setEBusinessID(String EBusinessID) {
        this.EBusinessID = EBusinessID;
    }

    public String getShipperCode() {
        return ShipperCode;
    }

    public void setShipperCode(String shipperCode) {
        ShipperCode = shipperCode;
    }

    public boolean isSuccess() {
        return Success;
    }

    public void setSuccess(boolean success) {
        Success = success;
    }

    public String getLogisticCode() {
        return LogisticCode;
    }

    public void setLogisticCode(String logisticCode) {
        LogisticCode = logisticCode;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public List<ExpressBusinessDetail> getTraces() {
        return Traces;
    }

    public void setTraces(List<ExpressBusinessDetail> traces) {
        Traces = traces;
    }
}
