/**
 */
package org.nasdanika.models.plantuml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.nasdanika.models.presentation.PresentationPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.plantuml.PlantumlFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel featureDelegation='Dynamic' complianceLevel='21.0' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.models'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel' Nasdanika='urn:org.nasdanika'"
 * @generated
 */
public interface PlantumlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "plantuml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://plantuml.models.nasdanika.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.plantuml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlantumlPackage eINSTANCE = org.nasdanika.models.plantuml.impl.PlantumlPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.plantuml.impl.PlantUmlDocumentImpl <em>Plant Uml Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.plantuml.impl.PlantUmlDocumentImpl
	 * @see org.nasdanika.models.plantuml.impl.PlantumlPackageImpl#getPlantUmlDocument()
	 * @generated
	 */
	int PLANT_UML_DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DOCUMENT__ID = PresentationPackage.PRESENTATION__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DOCUMENT__DOCUMENTATION = PresentationPackage.PRESENTATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DOCUMENT__DOC_REF = PresentationPackage.PRESENTATION__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DOCUMENT__DOC_FORMAT = PresentationPackage.PRESENTATION__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DOCUMENT__DOC_CONTENTS = PresentationPackage.PRESENTATION__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DOCUMENT__DOC_SECTIONS = PresentationPackage.PRESENTATION__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DOCUMENT__MARKERS = PresentationPackage.PRESENTATION__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DOCUMENT__ICON = PresentationPackage.PRESENTATION__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DOCUMENT__URIS = PresentationPackage.PRESENTATION__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DOCUMENT__NAME = PresentationPackage.PRESENTATION__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DOCUMENT__TAGS = PresentationPackage.PRESENTATION__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DOCUMENT__PROPERTIES = PresentationPackage.PRESENTATION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Semantic Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DOCUMENT__SEMANTIC_ELEMENTS = PresentationPackage.PRESENTATION__SEMANTIC_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DOCUMENT__CHILDREN = PresentationPackage.PRESENTATION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DOCUMENT__WIDTH = PresentationPackage.PRESENTATION__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DOCUMENT__HEIGHT = PresentationPackage.PRESENTATION__HEIGHT;

	/**
	 * The feature id for the '<em><b>Slides</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DOCUMENT__SLIDES = PresentationPackage.PRESENTATION__SLIDES;

	/**
	 * The feature id for the '<em><b>Master Slides</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DOCUMENT__MASTER_SLIDES = PresentationPackage.PRESENTATION__MASTER_SLIDES;

	/**
	 * The number of structural features of the '<em>Plant Uml Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DOCUMENT_FEATURE_COUNT = PresentationPackage.PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DOCUMENT___COLLECT__OBJECT_EREFERENCE_ELIST = PresentationPackage.PRESENTATION___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DOCUMENT___GET_REFERRERS__EREFERENCE = PresentationPackage.PRESENTATION___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Plant Uml Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DOCUMENT_OPERATION_COUNT = PresentationPackage.PRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.plantuml.impl.PlantUmlDiagramImpl <em>Plant Uml Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.plantuml.impl.PlantUmlDiagramImpl
	 * @see org.nasdanika.models.plantuml.impl.PlantumlPackageImpl#getPlantUmlDiagram()
	 * @generated
	 */
	int PLANT_UML_DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DIAGRAM__ID = PresentationPackage.SLIDE__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DIAGRAM__DOCUMENTATION = PresentationPackage.SLIDE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DIAGRAM__DOC_REF = PresentationPackage.SLIDE__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DIAGRAM__DOC_FORMAT = PresentationPackage.SLIDE__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DIAGRAM__DOC_CONTENTS = PresentationPackage.SLIDE__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DIAGRAM__DOC_SECTIONS = PresentationPackage.SLIDE__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DIAGRAM__MARKERS = PresentationPackage.SLIDE__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DIAGRAM__ICON = PresentationPackage.SLIDE__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DIAGRAM__URIS = PresentationPackage.SLIDE__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DIAGRAM__NAME = PresentationPackage.SLIDE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DIAGRAM__TAGS = PresentationPackage.SLIDE__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DIAGRAM__PROPERTIES = PresentationPackage.SLIDE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Semantic Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DIAGRAM__SEMANTIC_ELEMENTS = PresentationPackage.SLIDE__SEMANTIC_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DIAGRAM__CHILDREN = PresentationPackage.SLIDE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DIAGRAM__MASTER = PresentationPackage.SLIDE__MASTER;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DIAGRAM__HIDDEN = PresentationPackage.SLIDE__HIDDEN;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DIAGRAM__NOTES = PresentationPackage.SLIDE__NOTES;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DIAGRAM__KIND = PresentationPackage.SLIDE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DIAGRAM__SOURCE = PresentationPackage.SLIDE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Block Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DIAGRAM__BLOCK_NAME = PresentationPackage.SLIDE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parsed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DIAGRAM__PARSED = PresentationPackage.SLIDE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Plant Uml Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DIAGRAM_FEATURE_COUNT = PresentationPackage.SLIDE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DIAGRAM___COLLECT__OBJECT_EREFERENCE_ELIST = PresentationPackage.SLIDE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DIAGRAM___GET_REFERRERS__EREFERENCE = PresentationPackage.SLIDE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Plant Uml Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_UML_DIAGRAM_OPERATION_COUNT = PresentationPackage.SLIDE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.plantuml.DiagramKind <em>Diagram Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.plantuml.DiagramKind
	 * @see org.nasdanika.models.plantuml.impl.PlantumlPackageImpl#getDiagramKind()
	 * @generated
	 */
	int DIAGRAM_KIND = 2;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.plantuml.PlantUmlDocument <em>Plant Uml Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plant Uml Document</em>'.
	 * @see org.nasdanika.models.plantuml.PlantUmlDocument
	 * @generated
	 */
	EClass getPlantUmlDocument();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.plantuml.PlantUmlDiagram <em>Plant Uml Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plant Uml Diagram</em>'.
	 * @see org.nasdanika.models.plantuml.PlantUmlDiagram
	 * @generated
	 */
	EClass getPlantUmlDiagram();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.plantuml.PlantUmlDiagram#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.nasdanika.models.plantuml.PlantUmlDiagram#getKind()
	 * @see #getPlantUmlDiagram()
	 * @generated
	 */
	EAttribute getPlantUmlDiagram_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.plantuml.PlantUmlDiagram#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.nasdanika.models.plantuml.PlantUmlDiagram#getSource()
	 * @see #getPlantUmlDiagram()
	 * @generated
	 */
	EAttribute getPlantUmlDiagram_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.plantuml.PlantUmlDiagram#getBlockName <em>Block Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Name</em>'.
	 * @see org.nasdanika.models.plantuml.PlantUmlDiagram#getBlockName()
	 * @see #getPlantUmlDiagram()
	 * @generated
	 */
	EAttribute getPlantUmlDiagram_BlockName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.plantuml.PlantUmlDiagram#isParsed <em>Parsed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parsed</em>'.
	 * @see org.nasdanika.models.plantuml.PlantUmlDiagram#isParsed()
	 * @see #getPlantUmlDiagram()
	 * @generated
	 */
	EAttribute getPlantUmlDiagram_Parsed();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.plantuml.DiagramKind <em>Diagram Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diagram Kind</em>'.
	 * @see org.nasdanika.models.plantuml.DiagramKind
	 * @generated
	 */
	EEnum getDiagramKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PlantumlFactory getPlantumlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.plantuml.impl.PlantUmlDocumentImpl <em>Plant Uml Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.plantuml.impl.PlantUmlDocumentImpl
		 * @see org.nasdanika.models.plantuml.impl.PlantumlPackageImpl#getPlantUmlDocument()
		 * @generated
		 */
		EClass PLANT_UML_DOCUMENT = eINSTANCE.getPlantUmlDocument();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.plantuml.impl.PlantUmlDiagramImpl <em>Plant Uml Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.plantuml.impl.PlantUmlDiagramImpl
		 * @see org.nasdanika.models.plantuml.impl.PlantumlPackageImpl#getPlantUmlDiagram()
		 * @generated
		 */
		EClass PLANT_UML_DIAGRAM = eINSTANCE.getPlantUmlDiagram();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT_UML_DIAGRAM__KIND = eINSTANCE.getPlantUmlDiagram_Kind();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT_UML_DIAGRAM__SOURCE = eINSTANCE.getPlantUmlDiagram_Source();

		/**
		 * The meta object literal for the '<em><b>Block Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT_UML_DIAGRAM__BLOCK_NAME = eINSTANCE.getPlantUmlDiagram_BlockName();

		/**
		 * The meta object literal for the '<em><b>Parsed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT_UML_DIAGRAM__PARSED = eINSTANCE.getPlantUmlDiagram_Parsed();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.plantuml.DiagramKind <em>Diagram Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.plantuml.DiagramKind
		 * @see org.nasdanika.models.plantuml.impl.PlantumlPackageImpl#getDiagramKind()
		 * @generated
		 */
		EEnum DIAGRAM_KIND = eINSTANCE.getDiagramKind();

	}

} //PlantumlPackage
