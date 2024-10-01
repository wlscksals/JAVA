package CH21;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C11SelenumAPImain_1 {
	private static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	private static final String WEB_DRIVER_PATH = "C:\\Users\\wlsck\\git\\JAVA\\src\\Driver\\chromedriver-win32\\chromedriver.exe";
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		
		ChromeOptions options = new ChromeOptions();
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.naver.com");
		//특정 위치 요소 선택(키워드 입력하기)
				WebElement searchEl = driver.findElement(By.id("query"));

				//키워드 입력
				searchEl.sendKeys("노트북");
				
				//엔터키 전달
				searchEl.sendKeys(Keys.RETURN);
				
				//노트북 검색 이후에 쇼핑 버튼 클릭
				WebElement shoppingBtnEl =  driver.findElement(By.cssSelector(".api_pcpg_wrap .tab:nth-child(1)"));
				//target_blank(새창열기) 제거 
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].removeAttribute('target')",shoppingBtnEl);
				shoppingBtnEl.click();
				
				//네이버포털 -> '노트북'검색 -> 쇼핑 클릭-> 삼성 노트북(엔터)
				
				WebElement itemsHeaderEl =  driver.findElement(By.cssSelector("._searchInput_search_text_3CUDs"));
				itemsHeaderEl.sendKeys("삼성 노트북");
				itemsHeaderEl.sendKeys(Keys.RETURN);
				
				
				//네이버포털 -> '노트북'검색 -> 쇼핑 클릭-> 삼성 노트북(엔터) -> 리뷰 많은순 클릭
				List<WebElement> Els =  driver.findElements(By.cssSelector(".subFilter_sort_box__FpfWA a"));
				Els.forEach(el->{
					if(el.getText().contains("리뷰 많은순"))
						el.click();
				});
				
				//영역내 모든 정보 긁어오기 basicList_list_basis__uNBZx
				List<WebElement> El2s =  driver.findElements(By.cssSelector(".basicList_list_basis__uNBZx"));
				
				
				//파일로 저장
				Writer out = new FileWriter("C:\\TMP_IO\\index.html");
			
				//css link 빼내오기
				List<WebElement> cssLinks = driver.findElements(By.tagName("link"));
				for(WebElement link : cssLinks) {
					String rel = link.getAttribute("rel");
					if(rel.equals("stylesheet")){
						String href = link.getAttribute("href");
						System.out.println("CSS 링크 : " + href);
					}
				}
				
				//본문내용
				for(WebElement el :El2s) {
					String elHTML = el.getAttribute("outerHTML");
					out.write(elHTML+"\n");
				}
				out.flush();
				out.close();
			}

		}

