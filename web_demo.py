# coding=utf-8
import time
import unittest
from selenium import webdriver


class BaiduSearch(unittest.TestCase):
    def setUp(self):
        self.driver = webdriver.Chrome()

    def test_search_in_python_org(self):
        driver = self.driver
        driver.get("https://www.baidu.com")
        time.sleep(2)
        driver.find_element_by_id("kw").send_keys("菜鸟教程")
        time.sleep(2)
        driver.find_element_by_id("su").click()
        time.sleep(2)

    def tearDown(self):
        self.driver.close()


if __name__ == "__main__":
    unittest.main()
