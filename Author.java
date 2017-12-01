package packages;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
*/
public class Author {

	private int id;
	private String name;
	private String surname;
	private String dateOfBirthday;
	private String country;
	private String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDateOfBirthday() {
		return dateOfBirthday;
	}

	public void setDateOfBirthday(String dateOfBirthday) {
		this.dateOfBirthday = dateOfBirthday;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Author(int id, String name, String surname, String dateOfBirthday, String country, String city) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.dateOfBirthday = dateOfBirthday;
		this.country = country;
		this.city = city;
	}

	public Author() {
	}

	@Override
	public String toString() {
		return id + " " + name + " " + surname + " " + dateOfBirthday + " " + country + " " + city;
	}
	
	
	/////////////////////////////////////JSON////////////////////////////////////
	/*
	public static ArrayList<Author> exportJSON(String path) throws FileNotFoundException {

		Type authorType = new TypeToken<ArrayList<Author>>() {}.getType();
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new FileReader(path));
		ArrayList<Author> authors = gson.fromJson(reader, authorType);
		return authors;
	}
	
	public static void importJSON(ArrayList<Author> authors) throws IOException {		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonString = gson.toJson(authors);
		FileWriter fileWriter = new FileWriter("import.json");
        fileWriter.write(jsonString);
        fileWriter.close();
	}
	
/////////////////////////////////////////////XML///////////////////////////////////////////////////////////////////
	
	public static ArrayList<Author> exportXML(String path) throws ParserConfigurationException, IOException, SAXException {
		File file = new File(path);
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = (Document) builder.parse(file);
		NodeList nodeList = document.getElementsByTagName("Author");
		ArrayList<Author> authors = new ArrayList<Author>();
		for(int i = 0; i < nodeList.getLength(); i ++) {
			Node node = (Node) nodeList.item(i);
			if (Node.ELEMENT_NODE == node.getNodeType()) {
                Element element = (Element) node;
                Author author = new AuthorBuilder(element.getElementsByTagName("name").item(0).getTextContent()).
                		setId(Integer.valueOf(element.getElementsByTagName("id").item(0).getTextContent())).
                		setSurname(element.getElementsByTagName("surname").item(0).getTextContent()).
                		setDateOfBirthday(element.getElementsByTagName("dateOfBirthday").item(0).getTextContent()).
                		setCountry(element.getElementsByTagName("country").item(0).getTextContent()).
                		setCity(element.getElementsByTagName("city").item(0).getTextContent()).build();
                authors.add(author);
            }
		}
		return authors;
	}
	
	public static void importXML(ArrayList<Author> authors) throws ParserConfigurationException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
        try {
        	Document doc = builder.newDocument();
        	Element rootElement = doc.createElement("AllAuthors");
        	doc.appendChild(rootElement);
        	for(int i = 0; i < authors.size(); i ++) {
        		Element authorNode = doc.createElement("Author");
        		Element idNode = doc.createElement("id");    
        		idNode.appendChild(doc.createTextNode(String.valueOf(authors.get(i).getId())));
        		Element nameNode = doc.createElement("name"); 
        		nameNode.appendChild(doc.createTextNode(authors.get(i).getName()));
        		Element surnameNode = doc.createElement("surname");
        		surnameNode.appendChild(doc.createTextNode(authors.get(i).getSurname()));
        		Element dateOfBirthdayNode = doc.createElement("dateOfBirthday");
        		dateOfBirthdayNode.appendChild(doc.createTextNode(authors.get(i).getDateOfBirthday()));
        		Element countryNode = doc.createElement("country");
        		countryNode.appendChild(doc.createTextNode(authors.get(i).getCountry()));
        		Element cityNode = doc.createElement("city");
        		cityNode.appendChild(doc.createTextNode(authors.get(i).getCity()));
        		authorNode.appendChild(idNode);
        		authorNode.appendChild(nameNode);
        		authorNode.appendChild(surnameNode);
        		authorNode.appendChild(dateOfBirthdayNode);
        		authorNode.appendChild(countryNode);
        		authorNode.appendChild(cityNode);
        		rootElement.appendChild(authorNode);
        	} 
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();

            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
 
           // StreamResult console = new StreamResult(System.out);
            StreamResult file = new StreamResult(new File("import.xml"));
 
            //transformer.transform(source, console);
            transformer.transform(source, file);
        } catch(Exception e) {
        	e.printStackTrace();
        }
	}
	*/
	@Override
	public boolean equals(Object object) {
		if ((object instanceof Author) && ((((Author) object).getId()) == this.id)
				&& (((Author) object).getName() == this.name) && ((((Author) object).getSurname() == this.surname))
				&& ((((Author) object).getDateOfBirthday() == this.dateOfBirthday))
				&& ((((Author) object).getCountry() == this.country)) && ((((Author) object).getCity() == this.city))) {
			return true;
		} else {
			return false;
		}
	
		
	}
	
	public static class AuthorBuilder{
		private int id;
		private String name;
		private String surname;
		private String dateOfBirthday;
		private String country;
		private String city;
		
		public AuthorBuilder(String name) {
			this.name = name;
		}
		
		public AuthorBuilder setId(int id) {
			this.id = id;
			return this;
		}
		
		public AuthorBuilder setSurname(String surname) {
			this.surname = surname;
			return this;
		}
		
		public AuthorBuilder setDateOfBirthday(String dateOfBirthday) {
			this.dateOfBirthday = dateOfBirthday;
			return this;
		}
		
		public AuthorBuilder setCountry(String country) {
			this.country = country;
			return this;
		}
		
		public AuthorBuilder setCity(String city) {
			this.city = city;
			return this;
		}
	
		
		Author build() {
			Author author = new Author();
			
			Pattern namePattern = Pattern.compile("^[a-zA-Z]{1,15}$");
			
			
			Matcher nameMatch = namePattern.matcher(this.name);
			Matcher surnameMatch = namePattern.matcher(this.surname);
			Matcher countryMatch = namePattern.matcher(this.country);
			Matcher cityMatch = namePattern.matcher(this.city);
			
			if(!(nameMatch.matches()))
				throw new IllegalArgumentException("Enter correct name.");
			if(!(surnameMatch.matches()))
				throw new IllegalArgumentException("Enter correct surname.");
			if(!(countryMatch.matches()))
				throw new IllegalArgumentException("Enter correct country");
			if(!(cityMatch.matches()))
				throw new IllegalArgumentException("Enter correct city.");
			if (this.id < 1)
				throw new IllegalArgumentException("id must be a positive integer number");
			
			
			author.setName(name);
			author.setId(id);
			author.setSurname(surname);
			author.setDateOfBirthday(dateOfBirthday);
			author.setCountry(country);
			author.setCity(city);
			
			return author;
		}
		
		
	}
}

