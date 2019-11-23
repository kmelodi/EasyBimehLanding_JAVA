/*
 * EasyBimehLandingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ir.notifaano.server.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.type.TypeReference;

import ir.notifaano.server.*;
import ir.notifaano.server.models.*;
import ir.notifaano.server.exceptions.*;
import ir.notifaano.server.http.client.HttpClient;
import ir.notifaano.server.http.client.HttpContext;
import ir.notifaano.server.http.request.HttpRequest;
import ir.notifaano.server.http.response.HttpResponse;
import ir.notifaano.server.http.response.HttpStringResponse;
import ir.notifaano.server.http.client.APICallBack;
import ir.notifaano.server.controllers.syncwrapper.APICallBackCatcher;

public class CarBodyController extends BaseController {
    //private static variables for the singleton pattern
    private static final Object syncObject = new Object();
    private static CarBodyController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the CarBodyController class 
     */
    public static CarBodyController getInstance() {
        if (null == instance) {
            synchronized (syncObject) {
                if (null == instance) {
                    instance = new CarBodyController();
                }
            }
        }
        return instance;
    }

    /**
     * دریافت برند خودرو
     * @param    xApiKey    Required parameter: شناسه ی اختصاصی ارتباط با سرور
     * @return    Returns the CarBrand response from the API call 
     */
    public CarBrand getCarBrand(
                final String xApiKey
    ) throws Throwable {

        HttpRequest _request = _buildGetCarBrandRequest(xApiKey);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleGetCarBrandResponse(_context);
    }

    /**
     * دریافت برند خودرو
     * @param    xApiKey    Required parameter: شناسه ی اختصاصی ارتباط با سرور
     */
    public void getCarBrandAsync(
                final String xApiKey,
                final APICallBack<CarBrand> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildGetCarBrandRequest(xApiKey);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            CarBrand returnValue = _handleGetCarBrandResponse(_context);
                            callBack.onSuccess(_context, returnValue);
                        } catch (Exception e) {
                            callBack.onFailure(_context, e);
                        }
                    }

                    public void onFailure(HttpContext _context, Throwable _exception) {
                        // Let the caller know of the failure
                        callBack.onFailure(_context, _exception);
                    }
                });
            }
        };

        // Execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Builds the HttpRequest object for getCarBrand
     */
    private HttpRequest _buildGetCarBrandRequest(
                final String xApiKey) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/ComboData/CarBrands");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>();
        _headers.put("x-api-key", xApiKey);
        _headers.put("user-agent", BaseController.userAgent);
        _headers.put("accept", "application/json");


        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for getCarBrand
     * @return An object of type CarBrand
     */
    private CarBrand _handleGetCarBrandResponse(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnAfterResponse(_context);
        }

        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        String _responseBody = ((HttpStringResponse)_response).getBody();
        CarBrand _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<CarBrand>(){});

        return _result;
    }

    /**
     * دریافت لیست تیپ خودرو
     * @param    carBrandId    Required parameter: شناسه ی برند خودرو
     * @param    xApiKey    Required parameter: کلید اختصاصی ارتباط با سرور
     * @return    Returns the CarBrandTips response from the API call 
     */
    public CarBrandTips getCarBrandTips(
                final int carBrandId,
                final String xApiKey
    ) throws Throwable {

        HttpRequest _request = _buildGetCarBrandTipsRequest(carBrandId, xApiKey);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleGetCarBrandTipsResponse(_context);
    }

    /**
     * دریافت لیست تیپ خودرو
     * @param    carBrandId    Required parameter: شناسه ی برند خودرو
     * @param    xApiKey    Required parameter: کلید اختصاصی ارتباط با سرور
     */
    public void getCarBrandTipsAsync(
                final int carBrandId,
                final String xApiKey,
                final APICallBack<CarBrandTips> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildGetCarBrandTipsRequest(carBrandId, xApiKey);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            CarBrandTips returnValue = _handleGetCarBrandTipsResponse(_context);
                            callBack.onSuccess(_context, returnValue);
                        } catch (Exception e) {
                            callBack.onFailure(_context, e);
                        }
                    }

                    public void onFailure(HttpContext _context, Throwable _exception) {
                        // Let the caller know of the failure
                        callBack.onFailure(_context, _exception);
                    }
                });
            }
        };

        // Execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Builds the HttpRequest object for getCarBrandTips
     */
    private HttpRequest _buildGetCarBrandTipsRequest(
                final int carBrandId,
                final String xApiKey) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/ComboData/CarBrandTips");

        //process query parameters
        Map<String, Object> _queryParameters = new HashMap<String, Object>();
        _queryParameters.put("carBrandId", carBrandId);
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, _queryParameters);
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>();
        _headers.put("x-api-key", xApiKey);
        _headers.put("user-agent", BaseController.userAgent);
        _headers.put("accept", "application/json");


        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for getCarBrandTips
     * @return An object of type CarBrandTips
     */
    private CarBrandTips _handleGetCarBrandTipsResponse(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnAfterResponse(_context);
        }

        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        String _responseBody = ((HttpStringResponse)_response).getBody();
        CarBrandTips _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<CarBrandTips>(){});

        return _result;
    }

    /**
     * آیا این نوع بیمه نامه، طرح بیمه ای دارد؟
     * @param    subDomain    Required parameter: دامنه یا زیر دامنه ی مرکز بیمه
     * @param    insurancePolicyType    Required parameter: شناسه ی نوع بیمه نامه => بیمه بدنه=2
     * @param    xApiKey    Required parameter: کلید اختصاصی ارتباط با سرور
     * @return    Returns the HasPlan response from the API call 
     */
    public HasPlan getHasPlan(
                final String subDomain,
                final int insurancePolicyType,
                final String xApiKey
    ) throws Throwable {

        HttpRequest _request = _buildGetHasPlanRequest(subDomain, insurancePolicyType, xApiKey);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleGetHasPlanResponse(_context);
    }

    /**
     * آیا این نوع بیمه نامه، طرح بیمه ای دارد؟
     * @param    subDomain    Required parameter: دامنه یا زیر دامنه ی مرکز بیمه
     * @param    insurancePolicyType    Required parameter: شناسه ی نوع بیمه نامه => بیمه بدنه=2
     * @param    xApiKey    Required parameter: کلید اختصاصی ارتباط با سرور
     */
    public void getHasPlanAsync(
                final String subDomain,
                final int insurancePolicyType,
                final String xApiKey,
                final APICallBack<HasPlan> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildGetHasPlanRequest(subDomain, insurancePolicyType, xApiKey);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            HasPlan returnValue = _handleGetHasPlanResponse(_context);
                            callBack.onSuccess(_context, returnValue);
                        } catch (Exception e) {
                            callBack.onFailure(_context, e);
                        }
                    }

                    public void onFailure(HttpContext _context, Throwable _exception) {
                        // Let the caller know of the failure
                        callBack.onFailure(_context, _exception);
                    }
                });
            }
        };

        // Execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Builds the HttpRequest object for getHasPlan
     */
    private HttpRequest _buildGetHasPlanRequest(
                final String subDomain,
                final int insurancePolicyType,
                final String xApiKey) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/InsurancePolicyPlan/HasPlan");

        //process query parameters
        Map<String, Object> _queryParameters = new HashMap<String, Object>();
        _queryParameters.put("subDomain", subDomain);
        _queryParameters.put("insurancePolicyType", insurancePolicyType);
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, _queryParameters);
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>();
        _headers.put("x-api-key", xApiKey);
        _headers.put("user-agent", BaseController.userAgent);
        _headers.put("accept", "application/json");


        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for getHasPlan
     * @return An object of type HasPlan
     */
    private HasPlan _handleGetHasPlanResponse(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnAfterResponse(_context);
        }

        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        String _responseBody = ((HttpStringResponse)_response).getBody();
        HasPlan _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<HasPlan>(){});

        return _result;
    }

}
