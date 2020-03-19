$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CucumberFrameworkPOM-validateURL.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenari os"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "validating the youtubeURL",
  "description": "",
  "id": "validating-the-youtubeurl",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@youtubeURL"
    }
  ]
});
formatter.scenario({
  "line": 24,
  "name": "youtube URL validaton",
  "description": "",
  "id": "validating-the-youtubeurl;youtube-url-validaton",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "user opens the youtube browser",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "user clicks on search button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user navigates to results page and clicks on particular link",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "user subscribe the channel and validates the URL",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberFrameworkPOMvalidateURL.user_opens_the_youtube_browser()"
});
formatter.result({
  "duration": 19140724100,
  "status": "passed"
});
formatter.match({
  "location": "CucumberFrameworkPOMvalidateURL.user_clicks_on_search_button()"
});
formatter.result({
  "duration": 17606626000,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d80.0.3987.132)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-5NIBD47\u0027, ip: \u0027192.168.2.24\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.132, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\anush\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:50938}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 1dcc323e37bba8d6953eb39caa354b4c\n*** Element info: {Using\u003dxpath, value\u003d//button[@id\u003d\u0027search-icon-legacy\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.test.cucumberFrameworkpagesPOM.YoutubeSearch.\u003cinit\u003e(YoutubeSearch.java:16)\r\n\tat stepDefinations.CucumberFrameworkPOMvalidateURL.user_clicks_on_search_button(CucumberFrameworkPOMvalidateURL.java:41)\r\n\tat ✽.And user clicks on search button(CucumberFrameworkPOM-validateURL.feature:26)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CucumberFrameworkPOMvalidateURL.user_navigates_to_results_page_and_clicks_on_particular_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CucumberFrameworkPOMvalidateURL.user_subscribe_the_channel_and_validates_the_URL()"
});
formatter.result({
  "status": "skipped"
});
});