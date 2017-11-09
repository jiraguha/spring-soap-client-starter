package accountinfo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.0
 * 2017-11-09T17:09:16.792+03:00
 * Generated source version: 3.1.0
 * 
 */
@WebService(targetNamespace = "http://AccountInfo", name = "AccountInfoPortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface AccountInfoPortType {

    @WebMethod(operationName = "AccountInfoGet", action = "/AccountInfo#Get")
    @WebResult(name = "AccountInfoGetResponse", targetNamespace = "http://AccountInfo", partName = "AccountInfoGetResponse")
    public AccountInfoGetOutParms accountInfoGet(
        @WebParam(partName = "BankInfo", name = "BankInfo", targetNamespace = "http://AccountInfo")
        BankInfo bankInfo,
        @WebParam(partName = "AccountInfoGetInParms", name = "AccountInfoGetInParms", targetNamespace = "http://AccountInfo")
        AccountInfoGetInParms accountInfoGetInParms
    ) throws MsgNotFoundException;

    @WebMethod(operationName = "AccountInfoList", action = "/AccountInfoList#Get")
    @WebResult(name = "AccountInfoList", targetNamespace = "http://AccountInfo", partName = "AccountInfoList")
    public ResultSet accountInfoList(
        @WebParam(partName = "BankInfo", name = "BankInfo", targetNamespace = "http://AccountInfo")
        BankInfo bankInfo,
        @WebParam(partName = "AccountInfoListInParms", name = "AccountInfoListInParms", targetNamespace = "http://AccountInfo")
        AccountInfoListInParms accountInfoListInParms
    ) throws MsgNotFoundException;
}
