from appium import webdriver
from appium.webdriver.common.appiumby import AppiumBy

cap = dict(
    platformName="Android",
    automationName="UIAutomator2",
    deviceName="Android",
)

url = "http://localhost:4724"
driver = webdriver.Remote(url, cap)

el = driver.find_element(by=AppiumBy.ACCESSIBILITY_ID, value='Bluboy Test')
el.click()
driver.implicitly_wait(50)
enter_mobile_number = driver.find_element(by=AppiumBy.XPATH, value="//*[@text='Enter Mobile Number']")
enter_mobile_number.click()
enter_mobile_number.send_keys('9949721349')
check_box = driver.find_element(by=AppiumBy.ID, value="com.bluboy.android.test:id/checkBoxLogin")
check_box.click()
submit = driver.find_element(by=AppiumBy.XPATH, value="//*[@text='SIGNUP / LOGIN']")
submit.click()
driver.implicitly_wait(50)
ok = driver.find_element(by=AppiumBy.ID, value="com.bluboy.android.test:id/btnYes")
ok.click()
driver.implicitly_wait(50)
driver.back()
submit = driver.find_element(by=AppiumBy.XPATH, value="//*[@text='SIGNUP / LOGIN']")
submit.click()
'''ok=driver.find_element(by=AppiumBy.ID,value="com.bluboy.android.test:id/btnYes")
ok.click()
driver.implicitly_wait(50)
driver.back()
submit = driver.find_element(by=AppiumBy.XPATH, value="//*[@text='SIGNUP / LOGIN']")
submit.click()'''
otp = driver.find_element(by=AppiumBy.ID, value="com.bluboy.android.test:id/pinView")
otp.send_keys('1111')
verify = driver.find_element(by=AppiumBy.ID, value="com.bluboy.android.test:id/buttonSubmit")
verify.click()
'''
desired_capabilities = dict(
    deviceName="Android",
    platformName='Android',
    appPackage="com.bluboy.android",
    appActivity="com.bluboy.android.ui.splash.SplashActivity"

)

url = "http://localhost:4724"
driver = webdriver.Remote(url, desired_capabilities)
el = driver.find_element(by=AppiumBy.XPATH, value='//*[@text="Bluboy"]')
el.click()
driver = webdriver.Remote(url,desired_capabilities)
'''