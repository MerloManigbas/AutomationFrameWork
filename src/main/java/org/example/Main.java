package org.example;
import org.example.AlertsandModals.*;
import org.example.DatePickers.BootstrapDatePickerSample;
import org.example.DatePickers.BootstrapDateRange;
import org.example.DatePickers.JQueryDatePickerSample;
import org.example.ListBox.BootstrapListBox;
import org.example.ListBox.DataListFilter;
import org.example.ListBox.JQueryDualListBoxDemo;
import org.example.Others.ChartsDemo;
import org.example.Others.DataDragandDrop;
import org.example.Others.DynamicDataLoading;
import org.example.ProgressBarsandSliders.BootstrapProgressBar;
import org.example.ProgressBarsandSliders.DragandDropSliders;
import org.example.ProgressBarsandSliders.JQueryDownload;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.InputForms.*;
import org.example.Table.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.seleniumeasy.com/");

/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Single Input Field
        SingleInputField SingleInputField = new SingleInputField(driver);
        SingleInputField.SingleInputFieldStart();
        SingleInputField.SingleInputFieldDemo();
        SingleInputField.SingleInputFieldClose("SingleInputField Validation Completed");

/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Two Input Fields
        TwoInputField TwoInputField = new TwoInputField(driver);
        TwoInputField.TwoInputFieldStart();
        TwoInputField.TwoInputFieldDemo();
        TwoInputField.TwoInputFieldClose("TwoInputField Validation Completed");

/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    // Single Checkbox Demo
        SingleCheckBoxDemo SingleCheckBoxDemo = new SingleCheckBoxDemo(driver);
        SingleCheckBoxDemo.SingleCheckBoxDemoStart();
        SingleCheckBoxDemo.SingleCheckBoxDemoProcess();
        SingleCheckBoxDemo.SingleCheckBoxDemoClose("SingleCheckBoxDemo Validation Completed");

/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Multiple Checkbox Demo
        MultipleCheckBox MultipleCheckBox = new MultipleCheckBox(driver);
        MultipleCheckBox.MultipleCheckboxDemoStart();
        MultipleCheckBox.MultipleCheckboxDemoDemo();
        MultipleCheckBox.MultipleCheckboxDemoClose("MultipleCheckBox Validation Completed");

/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Radio Button Demo
        RadioButtonsDemo RadioButtonsDemo = new RadioButtonsDemo(driver);
        RadioButtonsDemo.RadioButtonDemoStart();
        RadioButtonsDemo.RadioButtonDemoDemo();
        RadioButtonsDemo.RadioButtonDemoClose("RadioButtonsDemo Validation Completed");

/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Group Radio Button Demo
        GroupRadioButtonDemo GroupRadioButtonDemo = new GroupRadioButtonDemo(driver);
        GroupRadioButtonDemo.GroupRadioButtonDemoStart();
        GroupRadioButtonDemo.GroupRadioButtonDemoDemo();
        GroupRadioButtonDemo.GroupRadioButtonDemoClose("GroupRadioButtonDemo Validation Completed");

/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Select List Demo
        SelectListDemo SelectListDemo = new SelectListDemo(driver);
        SelectListDemo.SelectListDemoStart();
        SelectListDemo.SelectListDemoDemo();
        SelectListDemo.SelectListDemoClose("SelectListDemo Validation Completed");

/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Multi Select List Demo
        MultiSelectListDemo MultiSelectListDemo = new MultiSelectListDemo(driver);
        MultiSelectListDemo.MultiSelectListDemoStart();
        MultiSelectListDemo.MultiSelectListDemoDemo();
        MultiSelectListDemo.MultiSelectListDemoClose("MultiSelectListDemo Validation Completed");

/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Input form with validations
        InputFormWithValidations InputFormWithValidations = new InputFormWithValidations(driver);
        InputFormWithValidations.InputformwithvalidationsStart();
        InputFormWithValidations.Inputformwithvalidations();
        InputFormWithValidations.InputformwithvalidationsClose("InputFormWithValidations Validation Completed");

/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Ajax Form Submit with Loading icon
        AjaxFormwithLoadingIcon AjaxFormwithLoadingIcon = new AjaxFormwithLoadingIcon(driver);
        AjaxFormwithLoadingIcon.AjaxFormSubmitwithLoadingStart();
        AjaxFormwithLoadingIcon.AjaxFormSubmitwithLoadingicon();
        AjaxFormwithLoadingIcon.AjaxFormSubmitwithLoadingiconClose("AjaxFormSubmitwithLoadingicon Validation Completed");

/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Multi Select - Search and Select multiple states
        SingleSelectSearchSelectCountry SingleSelectSearchSelectCountry = new SingleSelectSearchSelectCountry(driver);
        SingleSelectSearchSelectCountry.SingleSelectSearchSelectCountryStart();
        SingleSelectSearchSelectCountry.SingleSelectSearchSelectCountryDemoDemo();
        SingleSelectSearchSelectCountry.SingleSelectSearchSelectCountryClose("SingleSelectSearchSelectCountry Validation Completed");

/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Bootstrap Date Pickers Example
        BootstrapDatePickerSample BootstrapDatePickerSample = new BootstrapDatePickerSample(driver);
        BootstrapDatePickerSample.BootstrapDatePickersExample("BootstrapDatePickersExample Validation Completed");

/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Bootstrap Date Range
        BootstrapDateRange BootstrapDateRange = new BootstrapDateRange(driver);
        BootstrapDateRange.BootstrapDateRange("BootstrapDateRange Validation Completed");

/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //JQuery Date Picker Demo
        JQueryDatePickerSample JQueryDatePickerSample = new JQueryDatePickerSample(driver);
        JQueryDatePickerSample.JQueryDatePickerDemo("JQueryDatePickerDemo Validation Completed");

/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Table with Pagination Example
        TablewithPaginationExample TablewithPaginationExample = new TablewithPaginationExample(driver);
        TablewithPaginationExample.TablewithPaginationExample("TablewithPaginationExample Validation Completed");

/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Table data search
        Tabledatasearch Tabledatasearch = new Tabledatasearch(driver);
        Tabledatasearch.Tabledatasearch("Tabledatasearch Validation Completed");

/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Table data search activate textbox
        Tabledatasearchactivatetextbox Tabledatasearchactivatetextbox = new Tabledatasearchactivatetextbox(driver);
        Tabledatasearchactivatetextbox.Tabledatasearchactivatetextbox("Tabledatasearchactivatetextbox Validation Completed");

/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Table Filter
        TableFilter TableFilter = new TableFilter(driver);
        TableFilter.TableFilter("TableFilter Validation Completed");

/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Table Sort and search
        TableSortAndSearch TableSortAndSearch = new TableSortAndSearch(driver);
        TableSortAndSearch.TableSortAndSearch("TableSortAndSearch Validation Completed");

/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Table Data Download
        TableDataDownload TableDataDownload = new TableDataDownload(driver);
        TableDataDownload.TableDataDownload("TableDataDownload Validation Completed");

/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //JQuery Download Progress bars
        JQueryDownload JQueryDownload = new JQueryDownload(driver);
        JQueryDownload.JQUERYDOWNLOAD("JQueryDownloadProgressbar Validation Completed");

/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Bootstrap Download Progress Bar
        BootstrapProgressBar BootstrapProgressBar = new BootstrapProgressBar(driver);
        BootstrapProgressBar.BootstrapProgressBar("BootstrapDownloadProgressbar Validation Completed");

/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Drag and Drop Sliders
        DragandDropSliders DragandDropSliders = new DragandDropSliders(driver);
        DragandDropSliders.DragandDropBar("DragandDropSliders Validation Completed");

/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Bootstrap Alerts
        BootstrapAlerts BootstrapAlerts = new BootstrapAlerts(driver);
        BootstrapAlerts.BootstrapAlerts("BootstrapAlerts Validation Completed");
/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Bootstrap Modals
        BootsrapModals BootsrapModals = new BootsrapModals(driver);
        BootsrapModals.AllModalsExample("BootsrapModals Validation Completed");

/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Windows Popup Modals
        WindowPopUpModal WindowPopUpModal = new WindowPopUpModal(driver);
        WindowPopUpModal.WindowPopUpModalNew("WindowPopUpModal Validation Completed");

/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //ProgressBar Modals
        ProgressBarModals ProgressBarModals = new ProgressBarModals(driver);
        ProgressBarModals.ProgressBarModals("ProgressBarModals Validation Completed");

/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Java Script Alert
        JavaScriptsAlertsDemo JavaScriptsAlertsDemo = new JavaScriptsAlertsDemo(driver);
        JavaScriptsAlertsDemo.JavaScriptsAlertsDemo("JavaScriptsAlertsDemo Validation Completed");

/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //File Download Demo
        FileDownloadDemo FileDownloadDemo = new FileDownloadDemo(driver);
        FileDownloadDemo.FileDownloadDemo("FileDownloadDemo Validation Completed");

/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Bootstrap List Box
        BootstrapListBox BootstrapListBox = new BootstrapListBox(driver);
        BootstrapListBox.BootstrapListBox("BootstrapListBox Validation Completed");

/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //JQuery Dual ListBox Demo
        JQueryDualListBoxDemo JQueryDualListBoxDemo = new JQueryDualListBoxDemo(driver);
        JQueryDualListBoxDemo.JQueryDualListBoxDemo("JQueryDualListBoxDemo Validation Completed");

/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Data List Filter
        DataListFilter DataListFilter = new DataListFilter(driver);
        DataListFilter.DataListFilter("DataListFilter Validation Completed");

/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Data Drag and Drop
        DataDragandDrop DataDragandDrop = new DataDragandDrop(driver);
        DataDragandDrop.DataDragandDrop("DataDragandDrop Validation Completed");

/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Data Drag and Drop
        DynamicDataLoading DynamicDataLoading = new DynamicDataLoading(driver);
        DynamicDataLoading.DynamicDataLoading("DynamicDataLoading Validation Completed");

/* -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //Charts Demo
        ChartsDemo ChartsDemo = new ChartsDemo(driver);
        ChartsDemo.ChartsDemo("ChartsDemo Validation Completed");

    }
}
