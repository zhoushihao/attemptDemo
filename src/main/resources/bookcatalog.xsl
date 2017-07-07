<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:template match="/">
        <html>
            <body style="text-align:center">
                <table>
                    <tr bgcolor="#9acd32">
                        <th align="left">title</th>
                        <th align="left">bookname</th>
                        <th align="left">artist</th>
                        <th align="left">country</th>
                        <th align="left">company</th>
                        <th align="left">price</th>
                        <th align="left">year</th>
                    </tr>
                    <xsl:for-each select="catalog/book">
                        <tr>
                            <td><xsl:value-of select="title"/></td>
                            <td><xsl:value-of select="bookname"/></td>
                            <td><xsl:value-of select="artist"/></td>
                            <td><xsl:value-of select="country"/></td>
                            <td><xsl:value-of select="company"/></td>
                            <td><xsl:value-of select="price"/></td>
                            <td><xsl:value-of select="year"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>