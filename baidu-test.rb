require 'selenium-webdriver'
require 'test-unit'

class BaiduTest < Test::Unit::TestCase
  def setup
    @driver = Selenium::WebDriver.for :chrome
    @url = "https://www.baidu.com/"
  end

  def test_baidu_search
    @driver.get(@url)
    sleep 2
    @query_box = @driver.find_element(:id, 'kw')
    @query_box.send_keys("菜鸟教程")
    @query_box.submit
    sleep 2
    @click_button = @driver.find_element(:id, "su")
    @click_button.click
    sleep 2
  end

  def teardown
    @driver.quit
  end
end