/**
 * CompanyServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201403;

public class CompanyServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.google.api.ads.dfp.axis.v201403.CompanyServiceInterface {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[3];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createCompanies");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "companies"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "Company"), com.google.api.ads.dfp.axis.v201403.Company[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "Company"));
        oper.setReturnClass(com.google.api.ads.dfp.axis.v201403.Company[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "rval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "ApiExceptionFault"),
                      "com.google.api.ads.dfp.axis.v201403.ApiException",
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "ApiException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCompaniesByStatement");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "filterStatement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "Statement"), com.google.api.ads.dfp.axis.v201403.Statement.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "CompanyPage"));
        oper.setReturnClass(com.google.api.ads.dfp.axis.v201403.CompanyPage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "rval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "ApiExceptionFault"),
                      "com.google.api.ads.dfp.axis.v201403.ApiException",
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "ApiException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateCompanies");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "companies"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "Company"), com.google.api.ads.dfp.axis.v201403.Company[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "Company"));
        oper.setReturnClass(com.google.api.ads.dfp.axis.v201403.Company[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "rval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "ApiExceptionFault"),
                      "com.google.api.ads.dfp.axis.v201403.ApiException",
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "ApiException"), 
                      true
                     ));
        _operations[2] = oper;

    }

    public CompanyServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public CompanyServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public CompanyServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "ApiError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.ApiError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "ApiException");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.ApiException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "ApiVersionError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.ApiVersionError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "ApiVersionError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.ApiVersionErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "ApplicationException");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.ApplicationException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "AppliedLabel");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.AppliedLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "Authentication");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.Authentication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "AuthenticationError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.AuthenticationError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "AuthenticationError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.AuthenticationErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "BooleanValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.BooleanValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "CommonError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.CommonError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "CommonError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.CommonErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "Company");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.Company.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "Company.CreditStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.CompanyCreditStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "Company.Type");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.CompanyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "CompanyCreditStatusError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.CompanyCreditStatusError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "CompanyCreditStatusError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.CompanyCreditStatusErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "CompanyError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.CompanyError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "CompanyError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.CompanyErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "CompanyPage");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.CompanyPage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "CrossSellError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.CrossSellError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "CrossSellError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.CrossSellErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "Date");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.Date.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "DateTime");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.DateTime.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "DateTimeValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.DateTimeValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "DateValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.DateValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "FeatureError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.FeatureError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "FeatureError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.FeatureErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "InternalApiError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.InternalApiError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "InternalApiError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.InternalApiErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "InvalidEmailError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.InvalidEmailError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "InvalidEmailError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.InvalidEmailErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "LabelEntityAssociationError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.LabelEntityAssociationError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "LabelEntityAssociationError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.LabelEntityAssociationErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "NotNullError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.NotNullError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "NotNullError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.NotNullErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "NumberValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.NumberValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "OAuth");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.OAuth.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "ParseError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.ParseError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "ParseError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.ParseErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "PermissionError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.PermissionError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "PermissionError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.PermissionErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "PublisherQueryLanguageContextError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.PublisherQueryLanguageContextError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "PublisherQueryLanguageContextError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.PublisherQueryLanguageContextErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "PublisherQueryLanguageSyntaxError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.PublisherQueryLanguageSyntaxError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "PublisherQueryLanguageSyntaxError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.PublisherQueryLanguageSyntaxErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "QuotaError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.QuotaError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "QuotaError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.QuotaErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "RequiredError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.RequiredError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "RequiredError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.RequiredErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "ServerError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.ServerError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "ServerError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.ServerErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "SetValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.SetValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "SoapRequestHeader");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.SoapRequestHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "SoapResponseHeader");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.SoapResponseHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "Statement");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.Statement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "StatementError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.StatementError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "StatementError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.StatementErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "String_ValueMapEntry");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.String_ValueMapEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "StringLengthError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.StringLengthError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "StringLengthError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.StringLengthErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "TeamError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.TeamError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "TeamError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.TeamErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "TextValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.TextValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "TypeError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.TypeError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "UniqueError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.UniqueError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "Value");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201403.Value.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.google.api.ads.dfp.axis.v201403.Company[] createCompanies(com.google.api.ads.dfp.axis.v201403.Company[] companies) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201403.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "createCompanies"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {companies});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfp.axis.v201403.Company[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfp.axis.v201403.Company[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfp.axis.v201403.Company[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfp.axis.v201403.ApiException) {
              throw (com.google.api.ads.dfp.axis.v201403.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfp.axis.v201403.CompanyPage getCompaniesByStatement(com.google.api.ads.dfp.axis.v201403.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201403.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "getCompaniesByStatement"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {filterStatement});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfp.axis.v201403.CompanyPage) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfp.axis.v201403.CompanyPage) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfp.axis.v201403.CompanyPage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfp.axis.v201403.ApiException) {
              throw (com.google.api.ads.dfp.axis.v201403.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfp.axis.v201403.Company[] updateCompanies(com.google.api.ads.dfp.axis.v201403.Company[] companies) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201403.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "updateCompanies"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {companies});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfp.axis.v201403.Company[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfp.axis.v201403.Company[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfp.axis.v201403.Company[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfp.axis.v201403.ApiException) {
              throw (com.google.api.ads.dfp.axis.v201403.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
