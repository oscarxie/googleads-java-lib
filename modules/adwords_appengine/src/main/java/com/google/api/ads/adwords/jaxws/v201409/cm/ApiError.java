
package com.google.api.ads.adwords.jaxws.v201409.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201409.billing.BudgetOrderError;
import com.google.api.ads.adwords.jaxws.v201409.billing.CustomerOrderLineError;
import com.google.api.ads.adwords.jaxws.v201409.ch.CustomerSyncError;
import com.google.api.ads.adwords.jaxws.v201409.express.ExpressBusinessError;
import com.google.api.ads.adwords.jaxws.v201409.express.PromotionError;
import com.google.api.ads.adwords.jaxws.v201409.mcm.ManagedCustomerServiceError;
import com.google.api.ads.adwords.jaxws.v201409.o.TargetingIdeaError;
import com.google.api.ads.adwords.jaxws.v201409.o.TrafficEstimatorError;
import com.google.api.ads.adwords.jaxws.v201409.rm.UserListError;


/**
 * 
 *             The API error base class that provides details about an error that occurred
 *             while processing a service request.
 *             
 *             <p>The OGNL field path is provided for parsers to identify the request data
 *             element that may have caused the error.</p>
 *           
 * 
 * <p>Java class for ApiError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApiError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fieldPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trigger" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApiError.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApiError", propOrder = {
    "fieldPath",
    "trigger",
    "errorString",
    "apiErrorType"
})
@XmlSeeAlso({
    CustomerSyncError.class,
    BudgetOrderError.class,
    CustomerOrderLineError.class,
    ManagedCustomerServiceError.class,
    ExpressBusinessError.class,
    PromotionError.class,
    CampaignSharedSetError.class,
    InternalApiError.class,
    ReadOnlyError.class,
    com.google.api.ads.adwords.jaxws.v201409.cm.CurrencyCodeError.class,
    CampaignError.class,
    BulkMutateJobError.class,
    NullError.class,
    DateError.class,
    AuthorizationError.class,
    AdGroupCriterionError.class,
    ExperimentError.class,
    QueryError.class,
    StringLengthError.class,
    ClientTermsError.class,
    AdParamError.class,
    TargetError.class,
    RequestError.class,
    AdGroupFeedError.class,
    EntityNotFound.class,
    QuotaError.class,
    RangeError.class,
    SharedCriterionError.class,
    GeoLocationError.class,
    MultiplierError.class,
    StringFormatError.class,
    SelectorError.class,
    ReportDefinitionError.class,
    CampaignCriterionError.class,
    BiddingStrategyError.class,
    EntityAccessDenied.class,
    PolicyViolationError.class,
    StatsQueryError.class,
    VideoError.class,
    IdError.class,
    OperationAccessDenied.class,
    RegionCodeError.class,
    ConversionTrackingError.class,
    CustomerFeedError.class,
    RateExceededError.class,
    LocationCriterionServiceError.class,
    AdxError.class,
    FunctionError.class,
    FunctionParsingError.class,
    RequiredError.class,
    AuthenticationError.class,
    FeedItemError.class,
    BiddingErrors.class,
    SettingError.class,
    PagingError.class,
    CriterionError.class,
    MediaError.class,
    OperatorError.class,
    BudgetError.class,
    NotEmptyError.class,
    AdGroupServiceError.class,
    BiddingError.class,
    com.google.api.ads.adwords.jaxws.v201409.cm.CollectionSizeError.class,
    FeedError.class,
    UrlError.class,
    NewEntityCreationError.class,
    DatabaseError.class,
    ImageError.class,
    CampaignAdExtensionError.class,
    AdError.class,
    ForwardCompatibilityError.class,
    CampaignFeedError.class,
    AdExtensionError.class,
    RejectedError.class,
    AudioError.class,
    LabelError.class,
    FeedMappingError.class,
    DistinctError.class,
    AdGroupAdError.class,
    SizeLimitError.class,
    DateRangeError.class,
    EntityCountLimitExceeded.class,
    JobError.class,
    DataError.class,
    OfflineConversionError.class,
    SharedSetError.class,
    QuotaCheckError.class,
    ExperimentServiceError.class,
    NotWhitelistedError.class,
    TargetingIdeaError.class,
    com.google.api.ads.adwords.jaxws.v201409.o.CurrencyCodeError.class,
    TrafficEstimatorError.class,
    com.google.api.ads.adwords.jaxws.v201409.rm.CollectionSizeError.class,
    UserListError.class
})
public abstract class ApiError {

    protected String fieldPath;
    protected String trigger;
    protected String errorString;
    @XmlElement(name = "ApiError.Type")
    protected String apiErrorType;

    /**
     * Gets the value of the fieldPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldPath() {
        return fieldPath;
    }

    /**
     * Sets the value of the fieldPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldPath(String value) {
        this.fieldPath = value;
    }

    /**
     * Gets the value of the trigger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrigger() {
        return trigger;
    }

    /**
     * Sets the value of the trigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrigger(String value) {
        this.trigger = value;
    }

    /**
     * Gets the value of the errorString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorString() {
        return errorString;
    }

    /**
     * Sets the value of the errorString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorString(String value) {
        this.errorString = value;
    }

    /**
     * Gets the value of the apiErrorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiErrorType() {
        return apiErrorType;
    }

    /**
     * Sets the value of the apiErrorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiErrorType(String value) {
        this.apiErrorType = value;
    }

}
