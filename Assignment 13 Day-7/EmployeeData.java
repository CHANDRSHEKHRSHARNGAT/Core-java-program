// <!-- <employee>
//     <empid>1</empid>
//     <empname>John</empname>
//     <empsalary>30000</empsalary>
// </employee> -->

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class EmployeeData {

  public static void main(String[] args) {

    try {
      File inputFile = new File("employeedata.xml");
      DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
      Document doc = dBuilder.parse(inputFile);
      doc.getDocumentElement().normalize();

      NodeList nList = doc.getElementsByTagName("employee");

      for (int temp = 0; temp < nList.getLength(); temp++) {
        Node nNode = nList.item(temp);

        if (nNode.getNodeType() == Node.ELEMENT_NODE) {
          Element eElement = (Element) nNode;
          System.out.println("Employee ID: " + eElement.getElementsByTagName("empid").item(0).getTextContent());
          System.out.println("Employee Name: " + eElement.getElementsByTagName("empname").item(0).getTextContent());
          System.out.println("Employee Salary: " + eElement.getElementsByTagName("empsalary").item(0).getTextContent());
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
