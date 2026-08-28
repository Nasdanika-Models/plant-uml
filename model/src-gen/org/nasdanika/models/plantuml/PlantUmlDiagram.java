/**
 */
package org.nasdanika.models.plantuml;

import org.nasdanika.models.presentation.Slide;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plant Uml Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  One @startuml ... @enduml block.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.plantuml.PlantUmlDiagram#getKind <em>Kind</em>}</li>
 *   <li>{@link org.nasdanika.models.plantuml.PlantUmlDiagram#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.plantuml.PlantUmlDiagram#getBlockName <em>Block Name</em>}</li>
 *   <li>{@link org.nasdanika.models.plantuml.PlantUmlDiagram#isParsed <em>Parsed</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.plantuml.PlantumlPackage#getPlantUmlDiagram()
 * @model
 * @generated
 */
public interface PlantUmlDiagram extends Slide {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.plantuml.DiagramKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.nasdanika.models.plantuml.DiagramKind
	 * @see #setKind(DiagramKind)
	 * @see org.nasdanika.models.plantuml.PlantumlPackage#getPlantUmlDiagram_Kind()
	 * @model unique="false"
	 * @generated
	 */
	DiagramKind getKind();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.plantuml.PlantUmlDiagram#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.nasdanika.models.plantuml.DiagramKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(DiagramKind value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Full source text of the block (without the @startuml/@enduml delimiters) �
	 * always preserved; save re-emits it verbatim when structure was not modified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.nasdanika.models.plantuml.PlantumlPackage#getPlantUmlDiagram_Source()
	 * @model unique="false"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.plantuml.PlantUmlDiagram#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Block Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Value after @startuml, if any (block name).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Block Name</em>' attribute.
	 * @see #setBlockName(String)
	 * @see org.nasdanika.models.plantuml.PlantumlPackage#getPlantUmlDiagram_BlockName()
	 * @model unique="false"
	 * @generated
	 */
	String getBlockName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.plantuml.PlantUmlDiagram#getBlockName <em>Block Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Name</em>' attribute.
	 * @see #getBlockName()
	 * @generated
	 */
	void setBlockName(String value);

	/**
	 * Returns the value of the '<em><b>Parsed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Structural view (participants/classes/components as diagram nodes,
	 * arrows as connections) populated by kind-specific parsers where implemented;
	 * inherited children/connections from Diagram are used for this.
	 * 'parsed' indicates whether the structural view is authoritative.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parsed</em>' attribute.
	 * @see #setParsed(boolean)
	 * @see org.nasdanika.models.plantuml.PlantumlPackage#getPlantUmlDiagram_Parsed()
	 * @model unique="false"
	 * @generated
	 */
	boolean isParsed();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.plantuml.PlantUmlDiagram#isParsed <em>Parsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parsed</em>' attribute.
	 * @see #isParsed()
	 * @generated
	 */
	void setParsed(boolean value);

} // PlantUmlDiagram
