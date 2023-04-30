# ระบบ ตู้เย็น

## ผู้จัดทำ
นาย ศรุต ชิตสุข

5910451219

# การวางโครงสร้างไฟล์

###เริ่มจากสร้าง class สำหรับเก็บข้อมูลอาหาร

ชื่อคลาสว่า FoodInformations มี subclass คือ

ได้แก่ 

Fish , FrozoenFoods , IceCream , Juice , Meat , Milk , SoftDrink , Vegetable

###Class ช่องแช่สำหรับเก็บข้อมูลอาหารได้แก่

BoxOfRefrigeratorInformation 

- มี filed type  เป็น ArrayList เพื่อเก็บอาหารจากคลาส FoodInformatinos
- มี method สำหรับการ read จากไฟล์.csv ลงช่องแช่ และมีสำหรับการ write จากช่องแช่ลงไฟล์.csv

 - มี subclass คือ BoxOfNormal และ BoxOfFreezer
 
 ###Class สำหรับส่ง object ไป class อื่น
 class
 - ContainerA  จะมี method เพื่อให้ object ของ FoodInformations ไปเก็บไว้ที่ ContainerC 
 โดยจะประกาศ object ของ class ContainerA ในเริ่มต้นที่จะส่งไป
 
 - ContainerB จะประกาศ object ของ class ContainerB ใน class ปลายทาง 
  โดย ContainerB มีหน้าที่ get object จาก ContainerC ที่ส่งมาจาก
  Container A
   
 - ContainerC จะเป็นตัวกลางรับส่งจาก ContainerA ไป ContainerB
 
##Controller Class and fxml

###HomePageController
method
+ มีปุ่ม Open Refrigerator เพื่อเปิดตู้เย็น
+ มีปุ่ม Profile ไปหน้าผู้จัดทำ
+ ควบคุมหน้า HomePage.fxml
###ProfileController
method
+ มีปุ่ม Home เพื่อไปหน้า Home และมีข้อมูลผู้จัดทำ
+ ควบคุมหน้า profile.fxml

###RefrigeratorController
method
+ มีปุ่มให้เลือกช่องแช่
+ มีปุ่ม Home เพื่อไปหน้า Home
+ ควบคุมหน้า RefrigeratorPage.fxml 

###FoodInformationsController
method
+ มีช่องให้ใส่ชื่ออาหาร , ใส่วันหมดอายุ , น้ำหนัก , จำนวนอาหาร
 (ไม่ต้องใส่ ประเภทอาหาร กับ หมายเลขช่องแช่ เพราะเลือกจากหน้า RefrigeratorController)
+ มีปุ่มให้กดโชว์อาหารข้อมูลในช่องแช่ (กดหรือไม่กดก็ได้)
+ เมื่อกดปุ่ม Add จะเพิ่มอาหารเข้าช่องแช่ และจะโชว์อาหารล่าสุดที่เพิ่มเข้าไปในช่องแช่ และโชว์อาหารในช่องแช่ ณ ปัจจุบัน
+ เมื่อกดปุ่ม Delete จะลบอาหารที่จะหมดอายุก่อน และจะโชว์อาหารล่าสุดที่ลบออกไป
+ มีปุ่ม Back เพื่อกลับไปหน้าเลือกช่องแช่
+ ควบคุมหน้า FoodInformatinos.fxml

###วิธีการติดตั้ง/รัน
+ เปิด Command Prompt
+ ไปที่อยู่ของ jar file กับ resoure folder ที่อยู่ด้วยกัน
+ เช่นอยู่ตรงที่ F:\5910451219\jarFileFolder
+ พิมพ์ cd.. แล้ว enter จนกว่าจะเหลือแค่ C:\>
+ พิมพ์ F: แล้ว enter
+ พิมพ์ cd F:\5910451219\jarFileFolder
+ พิมพ์ java -jar(เว้นวรรค)แล้วลาก jar file มาใส่ตรงที่พิมพ์หลังจากเว้นวรรค หรือจะพิมพ์ที่อยู่ของ jar file มาใส่แล้วตามด้วยชื่อ jar file