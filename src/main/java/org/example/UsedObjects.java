package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsedObjects {
    //Single Input Field
    @FindBy(xpath = "//div//ul//li//ul//li//a[text()='Input Forms']")
    public static WebElement InputFormLink;
    @FindBy(xpath = "//body/div[@id='easycont']/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    public static WebElement SingleInputFieldLink;
    @FindBy(xpath = "//input[@id='user-message']")
    public static WebElement UserMessage;
    @FindBy(xpath = "//button[contains(text(),'Show Message')]")
    public static WebElement ShowMessage;
    @FindBy(xpath = "//label[contains(text(),'Your Message:')]")
    public static WebElement ValidationLabelEle;
    /* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
//Two Input Fields
    @FindBy(xpath = "//input[@id='value1']")
    public static WebElement aValueele;
    @FindBy(xpath = "//input[@id='value2']")
    public static WebElement bValueele;
    @FindBy(xpath = "//button[contains(text(),'Get Total')]")
    public static WebElement GetTotalEle;
    @FindBy(xpath = "//label[contains(text(),'Total a + b =')]")
    public static WebElement TotalValueEle;
    /* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
// Single Checkbox Demo
    public static By VerificationMessage = By.cssSelector("#txtAge");
    @FindBy(css = "#txtAge")
    public static WebElement VerificationMessageAssert;
    @FindBy(xpath = "//div//ul//li//ul//li//li//a[text()='Checkbox Demo']")
    public static WebElement CheckBoxLink;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/label[1]")
    public static WebElement CheckBox1;
    /* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
// Multiple Checkbox Demo
    @FindBy(xpath = "//input[@id='check1']")
    public static WebElement CheckBoxClick;
    @FindBy(xpath = "//body/div[@id='easycont']/div[1]/div[2]/div[2]/div[2]/div[1]/label[1]/input[1]")
    public static WebElement UnCheckClickAll;
    @FindBy(xpath = "//input[@id='check1']")
    public static WebElement CheckBoxClick2;
    /* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
// Radio Buttons Demo
    public static By RadioMessage = By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/p[3]");
    @FindBy(xpath = "//body/div[@id='easycont']/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[3]/a[1]")
    public static WebElement RadioButtonLink;
    @FindBy(xpath = "//body/div[@id='easycont']/div[1]/div[2]/div[1]/div[2]/label[1]")
    public static WebElement RadioButtonClick;
    @FindBy(xpath = "//button[@id='buttoncheck']")
    public static WebElement CheckValue;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/p[3]")
    public static WebElement ShowRadioMessage;
    /* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
//Group Radio Button Demo
    public static By GroupRadioMessage = By.xpath("//body[1]/div[2]/div[1]/div[2]/div[2]/div[2]/p[2]");
    @FindBy(xpath = "//body/div[@id='easycont']/div[1]/div[2]/div[2]/div[2]/div[1]/label[2]/input[1]")
    public static WebElement GroupRadioGender;
    @FindBy(xpath = "//body/div[@id='easycont']/div[1]/div[2]/div[2]/div[2]/div[2]/label[3]/input[1]")
    public static WebElement GroupRadioAge;
    @FindBy(xpath = "//button[contains(text(),'Get values')]")
    public static WebElement GetValues;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[2]/p[2]")
    public static WebElement RadioMsg;
    /* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Select List Demo
    @FindBy(xpath = "//body/div[@id='easycont']/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[4]/a[1]")
    public static WebElement SelectListLink;
    @FindBy(xpath = "//select[@id='select-demo']")
    public static WebElement ListDemo;
    @FindBy(css = "div.container-fluid.text-center:nth-child(2) div.row div.col-md-6.text-left:nth-child(2) div.panel.panel-default:nth-child(4) div.panel-body > p.selected-value:nth-child(5)")
    public static WebElement DaysClicked;
    /* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Multi Select List Demo
    @FindBy(xpath = "//select[@id='multi-select']")
    public static WebElement Select2option;
    @FindBy(xpath = "//button[@id='printMe']")
    public static WebElement PrintSelect;
    @FindBy(css = "div.container-fluid.text-center:nth-child(2) div.row div.col-md-6.text-left:nth-child(2) div.panel.panel-default:nth-child(5) div.panel-body > p.getall-selected:nth-child(9)")
    public static WebElement StateSelect;
    /* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Input form With Validation
    @FindBy(xpath = "//div//ul//li//ul//li//li//a[text()='Input Form Submit']")
    public static WebElement InputFormValidationLink;
    @FindBy(xpath = "//body/div[2]/div[1]/div[2]/section[1]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/input[1]")
    public static WebElement FnameInput;
    @FindBy(xpath = "//body/div[2]/div[1]/div[2]/section[1]/form[1]/fieldset[1]/div[2]/div[1]/div[1]/input[1]")
    public static WebElement LnameInput;
    @FindBy(xpath = "//body/div[2]/div[1]/div[2]/section[1]/form[1]/fieldset[1]/div[3]/div[1]/div[1]/input[1]")
    public static WebElement EmailInput;
    @FindBy(xpath = "//body/div[2]/div[1]/div[2]/section[1]/form[1]/fieldset[1]/div[4]/div[1]/div[1]/input[1]")
    public static WebElement PhoneInput;
    @FindBy(xpath = "//body/div[2]/div[1]/div[2]/section[1]/form[1]/fieldset[1]/div[5]/div[1]/div[1]/input[1]")
    public static WebElement AddressInput;
    @FindBy(xpath = "//body/div[2]/div[1]/div[2]/section[1]/form[1]/fieldset[1]/div[6]/div[1]/div[1]/input[1]")
    public static WebElement CityInput;
    @FindBy(xpath = "//div//select[@name='state']")
    public static WebElement StateInput;
    @FindBy(xpath = "//body/div[2]/div[1]/div[2]/section[1]/form[1]/fieldset[1]/div[8]/div[1]/div[1]/input[1]")
    public static WebElement ZipInput;
    @FindBy(xpath = "//body/div[2]/div[1]/div[2]/section[1]/form[1]/fieldset[1]/div[9]/div[1]/div[1]/input[1]")
    public static WebElement WebInput;
    @FindBy(xpath = "//body/div[2]/div[1]/div[2]/section[1]/form[1]/fieldset[1]/div[10]/div[1]/div[1]/label[1]/input[1]")
    public static WebElement RadioHosting;
    @FindBy(xpath = "//body/div[2]/div[1]/div[2]/section[1]/form[1]/fieldset[1]/div[11]/div[1]/div[1]/textarea[1]")
    public static WebElement ProjDescInput;
    @FindBy(xpath = "//body/div[2]/div[1]/div[2]/section[1]/form[1]/fieldset[1]/div[13]/div[1]/button[1]")
    public static WebElement SendClick;
    /* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Ajax Form With LoadingIcon
    @FindBy(xpath = "//div//ul//li//ul//li//li//a[text()='Ajax Form Submit']")
    public static WebElement AjaxFormLink;
    @FindBy(xpath = "//input[@id='title']")
    public static WebElement NameTextbox;
    @FindBy(xpath = "//textarea[@id='description']")
    public static WebElement TextDescription;
    @FindBy(xpath = "//input[@id='btn-submit']")
    public static WebElement SubmitClick;
    @FindBy(xpath = "//div[@id='submit-control']")
    public static WebElement SubmitMessage;
    /* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //SingleSelectSearchSelectCountry
    @FindBy(xpath = "//div//ul//li//ul//li//li//a[text()='JQuery Select dropdown']")
    public static WebElement JquerySingleSelectLink;
    @FindBy(xpath = "//body/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/span[1]/span[1]/span[1]")
    public static WebElement CountryDropDown;
    @FindBy(xpath = "//body/span[1]/span[1]/span[1]/input[1]")
    public static WebElement CountryDropDownSearch;
    @FindBy(xpath = "//li[contains(text(),'Denmark')]")
    public static WebElement ClickSearchItem;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/span[1]/span[1]/span[1]/span[1]")
    public static WebElement CountryTerritories;
    @FindBy(xpath = "//body[1]/span[1]/span[1]/span[1]/input[1]")
    public static WebElement TeritoriesPick;
    @FindBy(xpath = "//body[1]/span[1]/span[1]/span[1]/ul[1]/li[1]")
    public static WebElement EnterStates;
    @FindBy(xpath = "//body[1]/span[1]/span[1]/span[2]/ul[1]/li[1]")
    public static WebElement EnterTerritories;
    @FindBy(xpath = "//select[@id='files']")
    public static WebElement FilesPick;

    /* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Bootstrap Date Picker
    @FindBy(xpath = "//div//ul//li//ul//li//a[text()='Date pickers']")
    public static WebElement DatePickersLink;
    @FindBy(xpath = "//div//ul//li//ul//li//li//a[text()='Bootstrap Date Picker']")
    public static WebElement BoostrapDatePickersLink;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
    public static WebElement SelectDateBox;
    @FindBy(xpath = "//body[1]/div[3]/div[1]/table[1]/thead[1]/tr[2]/th[2]")
    public static WebElement CurrentDateNow;
    @FindBy(xpath = "//body[1]/div[3]/div[1]/table[1]/thead[1]/tr[2]/th[2]")
    public static WebElement backBtn;
    @FindBy(xpath = "//body[1]/div[3]/div[2]/table[1]/thead[1]/tr[2]/th[2]")
    public static WebElement SelectYear;
    @FindBy(xpath = "//body[1]/div[3]/div[2]/table[1]/thead[1]/tr[2]/th[1]")
    public static WebElement ExpectedYear;
    /* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Bootstrap Date Range Picker
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
    public static WebElement ClickStartDate;
    @FindBy(xpath = "//body[1]/div[3]/div[2]/table[1]/thead[1]/tr[2]/th[1]")
    public static WebElement BackBtn1;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/input[2]")
    public static WebElement ClickEndDate;
    @FindBy(xpath = "//body[1]/div[3]/div[2]/table[1]/thead[1]/tr[2]/th[3]")
    public static WebElement BackBtn22;
    @FindBy(xpath = "//body[1]/div[3]/div[1]/table[1]/thead[1]/tr[2]/th[2]")
    public static WebElement GetCurrentStartDate;
    @FindBy(xpath = "//body[1]/div[3]/div[1]/table[1]/thead[1]/tr[2]/th[2]")
    public static WebElement CurrentStartDateNow;
    @FindBy(xpath = "//body[1]/div[3]/div[1]/table[1]/thead[1]/tr[2]/th[2]")
    public static WebElement StartDateNow;
    @FindBy(xpath = "//body[1]/div[3]/div[2]/table[1]/thead[1]/tr[2]/th[2]")
    public static WebElement StartDateNow22;
    @FindBy(xpath = "//body[1]/div[3]/div[1]/table[1]/thead[1]/tr[2]/th[2]")
    public static WebElement GetCurrentEndDateNow;
    @FindBy(xpath = "//body[1]/div[3]/div[1]/table[1]/thead[1]/tr[2]/th[2]")
    public static WebElement LatestEndDatenow;
    @FindBy(xpath = "//body[1]/div[3]/div[2]/table[1]/thead[1]/tr[2]/th[2]")
    public static WebElement GetLatestEndDatenow;
    @FindBy(xpath = "//body[1]/div[3]/div[2]/table[1]/thead[1]/tr[2]/th[2]")
    public static WebElement FinalLatestEnddateNow;
    /* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //JQuery Date Range Picker
    @FindBy(xpath = "//div//ul//li//ul//li//li//a[text()='JQuery Date Picker']")
    public static WebElement JqueryDatePickerLink;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")
    public static WebElement FromDateRange;
    @FindBy(xpath = "//body[1]/div[3]/div[1]/div[1]/select[1]")
    public static WebElement CalendarYearList;
    @FindBy(className = "ui-datepicker-year")
    public static WebElement YearSelectedList;
    @FindBy(xpath = "//body[1]/div[3]/div[1]/a[1]/span[1]")
    public static WebElement NextBtn;
    @FindBy(xpath = "//body[1]/div[3]/table[1]/tbody[1]/tr[2]/td[7]/a[1]")
    public static WebElement DateClick1;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[2]")
    public static WebElement ToDateRange;
    @FindBy(xpath = "//body[1]/div[3]/div[1]/div[1]/select[1]")
    public static WebElement CalendarYearList2;
    @FindBy(xpath = "//body[1]/div[3]/table[1]/tbody[1]/tr[4]/td[3]/a[1]")
    public static WebElement DateClick2;
    /* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //table with pagination
    @FindBy(xpath = "//div//ul//li//ul//li//a[text()='Table']")
    public static WebElement TableLink;
    @FindBy(xpath = "//div//ul//li//ul//li//li//a[text()='Table Pagination']")
    public static WebElement TablePaginationLink;
    @FindBy(xpath = "//ul[@id='myPager']//li[@class='active']")
    public static WebElement ActivePage;


    /* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //table with Search
    @FindBy(xpath = "//div//ul//li//ul//li//li//a[text()='Table Data Search']")
    public static WebElement TableDataSearchlink;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]")
    public static WebElement SearchinsideTable;

    /* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //table with Disabled Text Box
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[1]")
    public static WebElement ActivateTextBox;

    public static By WaitForTextBox = By.xpath("//thead/tr[1]/th[2]/input[1]");

    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/table[1]/thead[1]/tr[1]/th[2]/input[1]")
    public static WebElement EnterUserName;

    /* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //table with Filter
    @FindBy(xpath = "//div//ul//li//ul//li//li//a[text()='Table Filter ']")
    public static WebElement TableFilterLink;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[2]")
    public static WebElement OptionFilterBtn;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/section[1]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/div[1]/h4[1]")
    public static WebElement CheckBoxFilterMessage;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/section[1]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/div[1]/p[1]")
    public static WebElement TableMessageFilter;
    /* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //table Sort and Search
    @FindBy(xpath = "//div//ul//li//ul//li//li//a[text()='Table Sort & Search']")
    public static WebElement TableSortandSearch;
    @FindBy(xpath = "//div[@id='example_paginate']//span//a[@class='paginate_button current']")
    public static WebElement ActivePageNow1;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]")
    public static WebElement NextBtnPage;

    /* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //table DataDownload
    @FindBy(xpath = "//div//ul//li//ul//li//li//a[text()='Table Data Download']")
    public static WebElement TableDataDownloadLink;

    /* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //JQuery Download
    @FindBy(xpath = "//div//ul//li//ul//li//a[text()='Progress Bars & Sliders']")
    public static WebElement ProgressbarsAndSliders;
    @FindBy(xpath = "//div//ul//li//ul//li//li//a[text()='JQuery Download Progress bars']")
    public static WebElement ProgressBarsandSlidersLink;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")
    public static WebElement DownloadButton;
    @FindBy(xpath = "//body[1]/div[3]/div[2]/div[1]")
    public static WebElement PercentageLoad;
    public static By Closebtn = By.xpath("//body[1]/div[3]/div[3]/div[1]/button[1]");

/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Bootstrap Download

    @FindBy(xpath = "//div//ul//li//ul//li//li//a[text()='Bootstrap Progress bar']")
    public static WebElement BootstrapProgressBarLink;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")
    public static WebElement DownloadButtonPrgrsBar;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    public static WebElement ProgressBarElement;

    /* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Drag and Drop sliders
    @FindBy(xpath = "//div//ul//li//ul//li//li//a[text()='Drag & Drop Sliders']")
    public static WebElement DragandDroplink;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/input[1]")
    public static WebElement SliderBar1;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/section[1]/div[1]/div[2]/div[1]/input[1]")
    public static WebElement SliderBar2;

/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Bootstrap Alerts
    @FindBy(xpath = "//div//ul//li//ul//li//a[text()='Alerts & Modals']")
    public static WebElement AlertsandModalsLink;
    @FindBy(xpath = "//div//ul//li//ul//li//li//a[text()='Bootstrap Alerts']")
    public static WebElement BootstrapAlerts;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")
    public static WebElement AlertBtn1;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]")
    public static WebElement AssertHiddenEle;
    public static By ElementTobehidden = By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]");
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]")
    public static WebElement AlertBtn2;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/button[1]")
    public static WebElement AlertBtn3;
/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Bootstrap Modals

    @FindBy(xpath = "//div//ul//li//ul//li//li//a[text()='Bootstrap Modals']")
    public static WebElement BootstrapModalsLink;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]")
    public static WebElement LaunchModalBtn;
    public static By WaitforModalToAppear = By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]");
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
    public static WebElement ModalToAppear;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]")
    public static WebElement SingleModalMessage;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/a[2]")
    public static WebElement SaveChangesModalBtn;
    public static By WaitforModalToDisAppear = By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]");
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/a[1]")
    public static WebElement LaunchMultipleModals;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[5]")
    public static WebElement MultipleModalMessage;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/a[1]")
    public static WebElement LaunchNextModal;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[6]/a[2]")
    public static WebElement SaveChanges2ndModal;
    public static By Waitfor2ndModal = By.xpath("//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]");
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]")
    public static WebElement ModalTowait2;
    public static By WaitforMultipleModalToAppear = By.xpath("//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]");
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]")
    public static WebElement MultipleModalToAppear;

    /* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //ProgressBar Modal

    @FindBy(xpath = "//div//ul//li//ul//li//li//a[text()='Progress Bar Modal']")
    public static WebElement BootstrapLink;
    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/h3[1]")
    public static WebElement NotifsModal;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/button[1]")
    public static WebElement ClickToStartProgress;
    public static By ModalToBeVisible = By.xpath("//body[1]/div[3]");

    /* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Windows Modal
    @FindBy(xpath = "//div//ul//li//ul//li//li//a[text()='Window Popup Modal']")
    public static WebElement BootstrapWindowPopupLink;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]")
    public static WebElement FlwonTwittterbtn;
    public static By TwitterElement = By.xpath ("//body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[5]/label[1]/div[1]/div[2]/div[1]/input[1]");
    @FindBy(xpath = "/html/body/div[1]/div/div/div/main/div/div/div/div[2]/div[2]/div/div[1]/div/h1/span/span")
    public static WebElement TwitterText;
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[5]/label[1]/div[1]/div[2]/div[1]/input[1]")
    public static WebElement TwitterElementTxtBox;
    public static By FbElementwait = By.xpath ("//body[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]");
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[5]/div/div/div[1]/div/div[2]/div/div/div/div[2]/form/div/div[3]/div/label/div/div/input")
    public static WebElement FBInput;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/a[1]")
    public static WebElement FollowAllBtn;
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/span[1]/span[1]")
    public static WebElement StringFacebook;

/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //File Download

    @FindBy(xpath = "//div//ul//li//ul//li//li//a[text()='File Download']")
    public static WebElement FileDownloadLink;
    @FindBy(id = "textbox")
    public static WebElement DataToDownload;
    public static By GenerateFileBTn = By.xpath ("//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[1]");
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[1]")
    public static WebElement GenerateFileBTnActive;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/a[1]")
    public static WebElement DownloadGenerateBtn;

    /* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //JavaScripts Alert

    @FindBy(xpath = "//div//ul//li//ul//li//li//a[text()='Javascript Alerts']")
    public static WebElement JavascriptAlerts;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[1]")
    public static WebElement Clickme1st;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[2]/button[1]")
    public static WebElement Clickme2nd;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[2]/div[2]/button[1]")
    public static WebElement GetTextAlert1;
    public static By ValidationAlert = By.xpath ("//body[1]/div[2]/div[1]/div[2]/div[2]/div[2]/p[3]");
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[3]/div[2]/button[1]")
    public static WebElement LastAlertText;
    public static By FinalJavaAlert = By.xpath ("//body[1]/div[2]/div[1]/div[2]/div[3]/div[2]/p[3]");
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[3]/div[2]/p[3]")
    public static WebElement LastAlertTextPopup;

    /* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Bootstrap List Box

    @FindBy(xpath = "//div//ul//li//ul//li//a[text()='List Box']")
    public static WebElement LIstBoxLink;
    @FindBy(xpath = "//div//ul//li//ul//li//li//a[text()='Bootstrap List Box']")
    public static WebElement BootstrapListBoxLink;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[2]/span[1]")
    public static WebElement MoveToRight;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[1]/span[1]")
    public static WebElement MoveToLeft;

    /* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //JQuery Dual List Box Demo

    @FindBy(xpath = "//div//ul//li//ul//li//li//a[text()='JQuery List Box']")
    public static WebElement DuallistBoxlink;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/select[1]")
    public static WebElement ListBox1;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]")
    public static WebElement AddBtntoLeft;
    @FindBy(xpath = "//button[contains(text(),'Add All')]")
    public static WebElement AddAllBtntoleft;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/select[1]")
    public static WebElement ListBox2;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/button[3]")
    public static WebElement Remove1Btn;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/button[4]")
    public static WebElement RemoveAllBtn;

    /* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Data List Filter
    @FindBy(xpath = "//div//ul//li//ul//li//li//a[text()='Data List Filter']")
    public static WebElement DataListFilter;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/section[1]/div[1]/div[1]/input[1]")
    public static WebElement SearchForData;
    public static By DataShown = By.xpath("//body[1]/div[2]/div[1]/div[2]/section[1]/div[1]/div[2]/div[2]/div[1]/h5[1]");
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[2]/section[1]/div[1]/div[2]/div[4]/div[1]/h4[1]")
    public static WebElement GetFilteredTitle;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/section[1]/div[1]/div[2]/div[2]/div[1]/h4[1]")
    public static WebElement GetFilteredEmployeeName;

    /* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Others Drag and Drop

    @FindBy(xpath = "//div//ul//li//ul//li//a[text()='Others']")
    public static WebElement OthersExampleLink;
    @FindBy(xpath = "//div//ul//li//ul//li//li//a[text()='Drag and Drop']")
    public static WebElement DataDragoandDropLink;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]")
    public static WebElement DropPlaceData;

    /* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Dynamic Data Loading

    @FindBy(xpath = "//div//ul//li//ul//li//li//a[text()='Dynamic Data Loading']")
    public static WebElement DynamicDataLoading;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[1]")
    public static WebElement GetNewUserBtn;
    public static By DataToload = By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/br[4]");
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]")
    public static WebElement GetNewUserName;

    /* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Charts Demo
    @FindBy(xpath = "//div//ul//li//ul//li//li//a[text()='Charts Demo']")
    public static WebElement ChartsDemoLink;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/ul[1]/li[1]/h2[1]")
    public static WebElement VideoPele;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/ul[1]/li[2]/h2[1]")
    public static WebElement Photopele;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/ul[1]/li[3]/h2[1]")
    public static WebElement AudioPele;
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/h3[1]")
    public static WebElement MarketCapEle;
}
