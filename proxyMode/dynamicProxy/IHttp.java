package proxyMode.dynamicProxy;

public interface IHttp {
    void request(String sendData);

    void onSuccess(String receivedData);
}