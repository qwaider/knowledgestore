//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.10 at 04:45:50 PM CET 
//

package eu.fbk.knowledgestore.populator.naf.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "externalReferences", "Span" })
@XmlRootElement(name = "role")
public class Role {

	@XmlAttribute(name = "id", required = true)
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlID
	protected String id;
	@XmlAttribute(name = "uri")
	@XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	protected String uri;
	@XmlAttribute(name = "confidence")
	@XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	protected String confidence;
	@XmlAttribute(name = "semRole", required = true)
	@XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	protected String semRole;
	@XmlElement(name = "externalReferences", required = true, type = ExternalReferences.class)
	protected List<Object> externalReferences;
	@XmlElement(name = "span", required = true, type = Span.class)
	protected eu.fbk.knowledgestore.populator.naf.model.Span Span;

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setId(String value) {
		this.id = value;
	}

	/**
	 * Gets the value of the uri property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * Sets the value of the uri property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUri(String value) {
		this.uri = value;
	}

	/**
	 * Gets the value of the confidence property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getConfidence() {
		return confidence;
	}

	/**
	 * Sets the value of the confidence property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setConfidence(String value) {
		this.confidence = value;
	}

	/**
	 * Gets the value of the semRole property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSemRole() {
		return semRole;
	}

	/**
	 * Sets the value of the semRole property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSemRole(String value) {
		this.semRole = value;
	}

	/**
	 * Gets the value of the externalReferencesOrSpan property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the externalReferencesOrSpan property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getExternalReferencesOrSpan().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ExternalReferences } {@link Span }
	 * 
	 * 
	 */
	public List<Object> getExternalReferences() {
		if (externalReferences == null) {
			externalReferences = new ArrayList<Object>();
		}
		return this.externalReferences;
	}

	public Span getSpan() {
		return Span;
	}

	public void setSpan(eu.fbk.knowledgestore.populator.naf.model.Span span) {
		Span = span;
	}

}