using NUnit.Framework;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using System.Threading;

namespace WebTest
{
    public class Tests
    {
        public IWebDriver driver;

        [SetUp]
        public void Setup()
        {
            // driver = new ChromeDriver(@"/Users/ceshi/Driver");
            driver = new ChromeDriver();
            driver.Navigate().GoToUrl("https://www.baidu.com");
        }

        [Test]
        public void TestBaiduSearch()
        {
            Thread.Sleep(2000);
            driver.FindElement(By.Id("kw")).SendKeys("菜鸟教程");
            Thread.Sleep(2000);
            driver.FindElement(By.Id("su")).Click();
            Thread.Sleep(2000);
        }

        [TearDown]
        public void TearDown()
        {
            driver.Close();
        }
    }
}