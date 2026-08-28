/**
 */
package org.nasdanika.models.plantuml.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.plantuml.DiagramKind;
import org.nasdanika.models.plantuml.PlantUmlDiagram;
import org.nasdanika.models.plantuml.PlantumlPackage;

import org.nasdanika.models.presentation.impl.SlideImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plant Uml Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.plantuml.impl.PlantUmlDiagramImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.nasdanika.models.plantuml.impl.PlantUmlDiagramImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.plantuml.impl.PlantUmlDiagramImpl#getBlockName <em>Block Name</em>}</li>
 *   <li>{@link org.nasdanika.models.plantuml.impl.PlantUmlDiagramImpl#isParsed <em>Parsed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlantUmlDiagramImpl extends SlideImpl implements PlantUmlDiagram {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final DiagramKind KIND_EDEFAULT = DiagramKind.SEQUENCE;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBlockName() <em>Block Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockName()
	 * @generated
	 * @ordered
	 */
	protected static final String BLOCK_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isParsed() <em>Parsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParsed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PARSED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlantUmlDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlantumlPackage.Literals.PLANT_UML_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiagramKind getKind() {
		return (DiagramKind)eDynamicGet(PlantumlPackage.PLANT_UML_DIAGRAM__KIND, PlantumlPackage.Literals.PLANT_UML_DIAGRAM__KIND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(DiagramKind newKind) {
		eDynamicSet(PlantumlPackage.PLANT_UML_DIAGRAM__KIND, PlantumlPackage.Literals.PLANT_UML_DIAGRAM__KIND, newKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSource() {
		return (String)eDynamicGet(PlantumlPackage.PLANT_UML_DIAGRAM__SOURCE, PlantumlPackage.Literals.PLANT_UML_DIAGRAM__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(String newSource) {
		eDynamicSet(PlantumlPackage.PLANT_UML_DIAGRAM__SOURCE, PlantumlPackage.Literals.PLANT_UML_DIAGRAM__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBlockName() {
		return (String)eDynamicGet(PlantumlPackage.PLANT_UML_DIAGRAM__BLOCK_NAME, PlantumlPackage.Literals.PLANT_UML_DIAGRAM__BLOCK_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlockName(String newBlockName) {
		eDynamicSet(PlantumlPackage.PLANT_UML_DIAGRAM__BLOCK_NAME, PlantumlPackage.Literals.PLANT_UML_DIAGRAM__BLOCK_NAME, newBlockName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isParsed() {
		return (Boolean)eDynamicGet(PlantumlPackage.PLANT_UML_DIAGRAM__PARSED, PlantumlPackage.Literals.PLANT_UML_DIAGRAM__PARSED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParsed(boolean newParsed) {
		eDynamicSet(PlantumlPackage.PLANT_UML_DIAGRAM__PARSED, PlantumlPackage.Literals.PLANT_UML_DIAGRAM__PARSED, newParsed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlantumlPackage.PLANT_UML_DIAGRAM__KIND:
				return getKind();
			case PlantumlPackage.PLANT_UML_DIAGRAM__SOURCE:
				return getSource();
			case PlantumlPackage.PLANT_UML_DIAGRAM__BLOCK_NAME:
				return getBlockName();
			case PlantumlPackage.PLANT_UML_DIAGRAM__PARSED:
				return isParsed();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PlantumlPackage.PLANT_UML_DIAGRAM__KIND:
				setKind((DiagramKind)newValue);
				return;
			case PlantumlPackage.PLANT_UML_DIAGRAM__SOURCE:
				setSource((String)newValue);
				return;
			case PlantumlPackage.PLANT_UML_DIAGRAM__BLOCK_NAME:
				setBlockName((String)newValue);
				return;
			case PlantumlPackage.PLANT_UML_DIAGRAM__PARSED:
				setParsed((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PlantumlPackage.PLANT_UML_DIAGRAM__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case PlantumlPackage.PLANT_UML_DIAGRAM__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case PlantumlPackage.PLANT_UML_DIAGRAM__BLOCK_NAME:
				setBlockName(BLOCK_NAME_EDEFAULT);
				return;
			case PlantumlPackage.PLANT_UML_DIAGRAM__PARSED:
				setParsed(PARSED_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PlantumlPackage.PLANT_UML_DIAGRAM__KIND:
				return getKind() != KIND_EDEFAULT;
			case PlantumlPackage.PLANT_UML_DIAGRAM__SOURCE:
				return SOURCE_EDEFAULT == null ? getSource() != null : !SOURCE_EDEFAULT.equals(getSource());
			case PlantumlPackage.PLANT_UML_DIAGRAM__BLOCK_NAME:
				return BLOCK_NAME_EDEFAULT == null ? getBlockName() != null : !BLOCK_NAME_EDEFAULT.equals(getBlockName());
			case PlantumlPackage.PLANT_UML_DIAGRAM__PARSED:
				return isParsed() != PARSED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //PlantUmlDiagramImpl
