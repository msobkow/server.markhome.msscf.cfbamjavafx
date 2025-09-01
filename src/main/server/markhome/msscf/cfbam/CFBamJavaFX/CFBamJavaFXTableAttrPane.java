// Description: Java 11 JavaFX Attribute Pane implementation for Table.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBamJavaFX;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Control;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.Priority;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cflib.CFLib.JavaFX.*;
import org.msscf.msscf.cflib.CFLib.JavaFX.CFReferenceEditor.ICFReferenceCallback;
import org.apache.commons.codec.binary.Base64;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfbam.CFBam.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBamObj.*;
import server.markhome.msscf.cfsec.CFSecJavaFX.*;
import server.markhome.msscf.cfint.CFIntJavaFX.*;

/**
 *	CFBamJavaFXTableAttrPane JavaFX Attribute Pane implementation
 *	for Table.
 */
public class CFBamJavaFXTableAttrPane
extends CFGridPane
implements ICFBamJavaFXTablePaneCommon
{
	protected ICFFormManager cfFormManager = null;
	protected ICFBamJavaFXSchema javafxSchema = null;
	boolean javafxIsInitializing = true;

	protected ObservableList<String> observableListOfLoaderBehaviour =
		FXCollections.observableArrayList(
			"Insert",
			"Update",
			"Replace" );

	protected ObservableList<String> observableListOfSecScope =
		FXCollections.observableArrayList(
			"None",
			"System",
			"Cluster",
			"Tenant" );

	protected class DefSchemaCFLabel
		extends CFLabel
	{
		public DefSchemaCFLabel() {
			super();
			setText( "Defining Schema Definition" );
		}
	}

	protected class CallbackDefSchemaChosen
	implements ICFBamJavaFXSchemaDefChosen
	{
		public CallbackDefSchemaChosen() {
		}

		public void choseSchemaDef( ICFBamSchemaDefObj value ) {
			if( javafxReferenceLookupDefSchema != null ) {
				ICFBamTableObj cur = getJavaFXFocusAsTable();
				if( cur != null ) {
					ICFBamTableEditObj editObj = (ICFBamTableEditObj)cur.getEdit();
					if( null != editObj ) {
						CFPane.PaneMode curMode = getPaneMode();
						if( ( curMode == CFPane.PaneMode.Add ) || ( curMode == CFPane.PaneMode.Edit ) ) {
							javafxReferenceLookupDefSchema.setReferencedObject( value );
							editObj.setOptionalLookupDefSchema( value );
						}
					}
				}
			}
		}
	}

	protected class DefSchemaReferenceCallback
	implements ICFReferenceCallback
	{
		public void chose( ICFLibAnyObj value ) {
			final String S_ProcName = "chose";
			Node cont;
			ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
			ICFBamTableObj focus = getEffJavaFXFocus();
			ICFBamSchemaDefObj referencedObj = (ICFBamSchemaDefObj)javafxReferenceLookupDefSchema.getReferencedObject();
			java.util.List<ICFBamSchemaDefObj> listOfSchemaDef = null;
			Collection<ICFBamSchemaDefObj> cltn = null;
			CFBorderPane form = javafxSchema.getSchemaDefFactory().newPickerForm( cfFormManager, referencedObj, null, cltn, new CallbackDefSchemaChosen() );
			((ICFBamJavaFXSchemaDefPaneCommon)form).setPaneMode( CFPane.PaneMode.View );
			cfFormManager.pushForm( form );
		}

		public void view( ICFLibAnyObj value ) {
			final String S_ProcName = "actionPerformed";
			ICFBamTableObj focus = getEffJavaFXFocus();
			if( focus != null ) {
				ICFBamSchemaDefObj referencedObj = (ICFBamSchemaDefObj)javafxReferenceLookupDefSchema.getReferencedObject();
				CFBorderPane form = null;
				if( referencedObj != null ) {
					String classCode = referencedObj.getClassCode();
					if( "a802".equals( classCode ) ) {
						form = javafxSchema.getSchemaDefFactory().newAddForm( cfFormManager, referencedObj, null, true );
						ICFBamJavaFXSchemaDefPaneCommon spec = (ICFBamJavaFXSchemaDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else {
						throw new CFLibUnsupportedClassException( getClass(),
							S_ProcName,
							"javaFXFocus",
							focus,
							"ICFBamSchemaDefObj" );
					}
					cfFormManager.pushForm( form );
				}
			}
		}
	}

	protected class DefSchemaCFReferenceEditor
		extends CFReferenceEditor
	{
		public DefSchemaCFReferenceEditor() {
			super( new DefSchemaReferenceCallback() );
			setFieldName( "Defining Schema Definition" );
		}
	}

	protected class LookupIndexCFLabel
		extends CFLabel
	{
		public LookupIndexCFLabel() {
			super();
			setText( "Lookup Index" );
		}
	}

	protected class CallbackLookupIndexChosen
	implements ICFBamJavaFXIndexChosen
	{
		public CallbackLookupIndexChosen() {
		}

		public void choseIndex( ICFBamIndexObj value ) {
			if( javafxReferenceLookupLookupIndex != null ) {
				ICFBamTableObj cur = getJavaFXFocusAsTable();
				if( cur != null ) {
					ICFBamTableEditObj editObj = (ICFBamTableEditObj)cur.getEdit();
					if( null != editObj ) {
						CFPane.PaneMode curMode = getPaneMode();
						if( ( curMode == CFPane.PaneMode.Add ) || ( curMode == CFPane.PaneMode.Edit ) ) {
							javafxReferenceLookupLookupIndex.setReferencedObject( value );
							editObj.setOptionalLookupLookupIndex( value );
						}
					}
				}
			}
		}
	}

	protected class LookupIndexReferenceCallback
	implements ICFReferenceCallback
	{
		public void chose( ICFLibAnyObj value ) {
			final String S_ProcName = "chose";
			Node cont;
			ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
			ICFBamTableObj focus = getEffJavaFXFocus();
			ICFBamIndexObj referencedObj = (ICFBamIndexObj)javafxReferenceLookupLookupIndex.getReferencedObject();
			java.util.List<ICFBamIndexObj> listOfIndex = null;
			Collection<ICFBamIndexObj> cltn = null;
			CFBorderPane form = javafxSchema.getIndexFactory().newPickerForm( cfFormManager, referencedObj, null, cltn, new CallbackLookupIndexChosen() );
			((ICFBamJavaFXIndexPaneCommon)form).setPaneMode( CFPane.PaneMode.View );
			cfFormManager.pushForm( form );
		}

		public void view( ICFLibAnyObj value ) {
			final String S_ProcName = "actionPerformed";
			ICFBamTableObj focus = getEffJavaFXFocus();
			if( focus != null ) {
				ICFBamIndexObj referencedObj = (ICFBamIndexObj)javafxReferenceLookupLookupIndex.getReferencedObject();
				CFBorderPane form = null;
				if( referencedObj != null ) {
					String classCode = referencedObj.getClassCode();
					if( "a821".equals( classCode ) ) {
						form = javafxSchema.getIndexFactory().newAddForm( cfFormManager, referencedObj, null, true );
						ICFBamJavaFXIndexPaneCommon spec = (ICFBamJavaFXIndexPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else {
						throw new CFLibUnsupportedClassException( getClass(),
							S_ProcName,
							"javaFXFocus",
							focus,
							"ICFBamIndexObj" );
					}
					cfFormManager.pushForm( form );
				}
			}
		}
	}

	protected class LookupIndexCFReferenceEditor
		extends CFReferenceEditor
	{
		public LookupIndexCFReferenceEditor() {
			super( new LookupIndexReferenceCallback() );
			setFieldName( "Lookup Index" );
		}
	}

	protected class AltIndexCFLabel
		extends CFLabel
	{
		public AltIndexCFLabel() {
			super();
			setText( "Alt Index" );
		}
	}

	protected class CallbackAltIndexChosen
	implements ICFBamJavaFXIndexChosen
	{
		public CallbackAltIndexChosen() {
		}

		public void choseIndex( ICFBamIndexObj value ) {
			if( javafxReferenceLookupAltIndex != null ) {
				ICFBamTableObj cur = getJavaFXFocusAsTable();
				if( cur != null ) {
					ICFBamTableEditObj editObj = (ICFBamTableEditObj)cur.getEdit();
					if( null != editObj ) {
						CFPane.PaneMode curMode = getPaneMode();
						if( ( curMode == CFPane.PaneMode.Add ) || ( curMode == CFPane.PaneMode.Edit ) ) {
							javafxReferenceLookupAltIndex.setReferencedObject( value );
							editObj.setOptionalLookupAltIndex( value );
						}
					}
				}
			}
		}
	}

	protected class AltIndexReferenceCallback
	implements ICFReferenceCallback
	{
		public void chose( ICFLibAnyObj value ) {
			final String S_ProcName = "chose";
			Node cont;
			ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
			ICFBamTableObj focus = getEffJavaFXFocus();
			ICFBamIndexObj referencedObj = (ICFBamIndexObj)javafxReferenceLookupAltIndex.getReferencedObject();
			java.util.List<ICFBamIndexObj> listOfIndex = null;
			Collection<ICFBamIndexObj> cltn = null;
			CFBorderPane form = javafxSchema.getIndexFactory().newPickerForm( cfFormManager, referencedObj, null, cltn, new CallbackAltIndexChosen() );
			((ICFBamJavaFXIndexPaneCommon)form).setPaneMode( CFPane.PaneMode.View );
			cfFormManager.pushForm( form );
		}

		public void view( ICFLibAnyObj value ) {
			final String S_ProcName = "actionPerformed";
			ICFBamTableObj focus = getEffJavaFXFocus();
			if( focus != null ) {
				ICFBamIndexObj referencedObj = (ICFBamIndexObj)javafxReferenceLookupAltIndex.getReferencedObject();
				CFBorderPane form = null;
				if( referencedObj != null ) {
					String classCode = referencedObj.getClassCode();
					if( "a821".equals( classCode ) ) {
						form = javafxSchema.getIndexFactory().newAddForm( cfFormManager, referencedObj, null, true );
						ICFBamJavaFXIndexPaneCommon spec = (ICFBamJavaFXIndexPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else {
						throw new CFLibUnsupportedClassException( getClass(),
							S_ProcName,
							"javaFXFocus",
							focus,
							"ICFBamIndexObj" );
					}
					cfFormManager.pushForm( form );
				}
			}
		}
	}

	protected class AltIndexCFReferenceEditor
		extends CFReferenceEditor
	{
		public AltIndexCFReferenceEditor() {
			super( new AltIndexReferenceCallback() );
			setFieldName( "Alt Index" );
		}
	}

	protected class QualifyingTableCFLabel
		extends CFLabel
	{
		public QualifyingTableCFLabel() {
			super();
			setText( "Qualifying Table" );
		}
	}

	protected class CallbackQualifyingTableChosen
	implements ICFBamJavaFXTableChosen
	{
		public CallbackQualifyingTableChosen() {
		}

		public void choseTable( ICFBamTableObj value ) {
			if( javafxReferenceLookupQualTable != null ) {
				ICFBamTableObj cur = getJavaFXFocusAsTable();
				if( cur != null ) {
					ICFBamTableEditObj editObj = (ICFBamTableEditObj)cur.getEdit();
					if( null != editObj ) {
						CFPane.PaneMode curMode = getPaneMode();
						if( ( curMode == CFPane.PaneMode.Add ) || ( curMode == CFPane.PaneMode.Edit ) ) {
							javafxReferenceLookupQualTable.setReferencedObject( value );
							editObj.setOptionalLookupQualTable( value );
						}
					}
				}
			}
		}
	}

	protected class QualifyingTableReferenceCallback
	implements ICFReferenceCallback
	{
		public void chose( ICFLibAnyObj value ) {
			final String S_ProcName = "chose";
			Node cont;
			ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
			ICFBamTableObj focus = getEffJavaFXFocus();
			ICFBamTableObj referencedObj = (ICFBamTableObj)javafxReferenceLookupQualTable.getReferencedObject();
			java.util.List<ICFBamTableObj> listOfTable = null;
			Collection<ICFBamTableObj> cltn = null;
			CFBorderPane form = javafxSchema.getTableFactory().newPickerForm( cfFormManager, referencedObj, null, cltn, new CallbackQualifyingTableChosen() );
			((ICFBamJavaFXTablePaneCommon)form).setPaneMode( CFPane.PaneMode.View );
			cfFormManager.pushForm( form );
		}

		public void view( ICFLibAnyObj value ) {
			final String S_ProcName = "actionPerformed";
			ICFBamTableObj focus = getEffJavaFXFocus();
			if( focus != null ) {
				ICFBamTableObj referencedObj = (ICFBamTableObj)javafxReferenceLookupQualTable.getReferencedObject();
				CFBorderPane form = null;
				if( referencedObj != null ) {
					String classCode = referencedObj.getClassCode();
					if( "a808".equals( classCode ) ) {
						form = javafxSchema.getTableFactory().newAddForm( cfFormManager, referencedObj, null, true );
						ICFBamJavaFXTablePaneCommon spec = (ICFBamJavaFXTablePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else {
						throw new CFLibUnsupportedClassException( getClass(),
							S_ProcName,
							"javaFXFocus",
							focus,
							"ICFBamTableObj" );
					}
					cfFormManager.pushForm( form );
				}
			}
		}
	}

	protected class QualifyingTableCFReferenceEditor
		extends CFReferenceEditor
	{
		public QualifyingTableCFReferenceEditor() {
			super( new QualifyingTableReferenceCallback() );
			setFieldName( "Qualifying Table" );
		}
	}

	protected class PrimaryIndexCFLabel
		extends CFLabel
	{
		public PrimaryIndexCFLabel() {
			super();
			setText( "Primary Index" );
		}
	}

	protected class CallbackPrimaryIndexChosen
	implements ICFBamJavaFXIndexChosen
	{
		public CallbackPrimaryIndexChosen() {
		}

		public void choseIndex( ICFBamIndexObj value ) {
			if( javafxReferenceLookupPrimaryIndex != null ) {
				ICFBamTableObj cur = getJavaFXFocusAsTable();
				if( cur != null ) {
					ICFBamTableEditObj editObj = (ICFBamTableEditObj)cur.getEdit();
					if( null != editObj ) {
						CFPane.PaneMode curMode = getPaneMode();
						if( ( curMode == CFPane.PaneMode.Add ) || ( curMode == CFPane.PaneMode.Edit ) ) {
							javafxReferenceLookupPrimaryIndex.setReferencedObject( value );
							editObj.setOptionalLookupPrimaryIndex( value );
						}
					}
				}
			}
		}
	}

	protected class PrimaryIndexReferenceCallback
	implements ICFReferenceCallback
	{
		public void chose( ICFLibAnyObj value ) {
			final String S_ProcName = "chose";
			Node cont;
			ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
			ICFBamTableObj focus = getEffJavaFXFocus();
			ICFBamIndexObj referencedObj = (ICFBamIndexObj)javafxReferenceLookupPrimaryIndex.getReferencedObject();
			java.util.List<ICFBamIndexObj> listOfIndex = null;
			listOfIndex = focus.getOptionalComponentsIndex( javafxIsInitializing );
			if( listOfIndex == null ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"listOfIndex" );
			}
			Collection<ICFBamIndexObj> cltn = listOfIndex;
			CFBorderPane form = javafxSchema.getIndexFactory().newPickerForm( cfFormManager, referencedObj, null, cltn, new CallbackPrimaryIndexChosen() );
			((ICFBamJavaFXIndexPaneCommon)form).setPaneMode( CFPane.PaneMode.View );
			cfFormManager.pushForm( form );
		}

		public void view( ICFLibAnyObj value ) {
			final String S_ProcName = "actionPerformed";
			ICFBamTableObj focus = getEffJavaFXFocus();
			if( focus != null ) {
				ICFBamIndexObj referencedObj = (ICFBamIndexObj)javafxReferenceLookupPrimaryIndex.getReferencedObject();
				CFBorderPane form = null;
				if( referencedObj != null ) {
					String classCode = referencedObj.getClassCode();
					if( "a821".equals( classCode ) ) {
						form = javafxSchema.getIndexFactory().newAddForm( cfFormManager, referencedObj, null, true );
						ICFBamJavaFXIndexPaneCommon spec = (ICFBamJavaFXIndexPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else {
						throw new CFLibUnsupportedClassException( getClass(),
							S_ProcName,
							"javaFXFocus",
							focus,
							"ICFBamIndexObj" );
					}
					cfFormManager.pushForm( form );
				}
			}
		}
	}

	protected class PrimaryIndexCFReferenceEditor
		extends CFReferenceEditor
	{
		public PrimaryIndexCFReferenceEditor() {
			super( new PrimaryIndexReferenceCallback() );
			setFieldName( "Primary Index" );
		}
	}

	protected class IdCFLabel
		extends CFLabel
	{
		public IdCFLabel() {
			super();
			setText( "Id" );
		}
	}

	protected class IdEditor
		extends CFInt64Editor
	{
		public IdEditor() {
			super();
			setMinValue( CFBamScopeBuff.ID_MIN_VALUE );
			setFieldName( "Id" );
		}
	}

	protected class NameCFLabel
		extends CFLabel
	{
		public NameCFLabel() {
			super();
			setText( "Name" );
		}
	}

	protected class NameEditor
		extends CFStringEditor
	{
		public NameEditor() {
			super();
			setMaxLen( 192 );
			setFieldName( "Name" );
		}
	}

	protected class DbNameCFLabel
		extends CFLabel
	{
		public DbNameCFLabel() {
			super();
			setText( "Db Name" );
		}
	}

	protected class DbNameEditor
		extends CFStringEditor
	{
		public DbNameEditor() {
			super();
			setMaxLen( 32 );
			setFieldName( "Db Name" );
		}
	}

	protected class ShortNameCFLabel
		extends CFLabel
	{
		public ShortNameCFLabel() {
			super();
			setText( "Short Name" );
		}
	}

	protected class ShortNameEditor
		extends CFStringEditor
	{
		public ShortNameEditor() {
			super();
			setMaxLen( 16 );
			setFieldName( "Short Name" );
		}
	}

	protected class LabelCFLabel
		extends CFLabel
	{
		public LabelCFLabel() {
			super();
			setText( "Label" );
		}
	}

	protected class LabelEditor
		extends CFStringEditor
	{
		public LabelEditor() {
			super();
			setMaxLen( 64 );
			setFieldName( "Label" );
		}
	}

	protected class ShortDescriptionCFLabel
		extends CFLabel
	{
		public ShortDescriptionCFLabel() {
			super();
			setText( "Short Description" );
		}
	}

	protected class ShortDescriptionEditor
		extends CFStringEditor
	{
		public ShortDescriptionEditor() {
			super();
			setMaxLen( 50 );
			setFieldName( "Short Description" );
		}
	}

	protected class DescriptionCFLabel
		extends CFLabel
	{
		public DescriptionCFLabel() {
			super();
			setText( "Description" );
		}
	}

	protected class DescriptionEditor
		extends CFStringEditor
	{
		public DescriptionEditor() {
			super();
			setMaxLen( 100 );
			setFieldName( "Description" );
		}
	}

	protected class PageDataCFLabel
		extends CFLabel
	{
		public PageDataCFLabel() {
			super();
			setText( "PageData" );
		}
	}

	protected class PageDataEditor
		extends CFBoolEditor
	{
		public PageDataEditor() {
			super();
			setIsNullable( false );
			setFieldName( "PageData" );
		}
	}

	protected class TableClassCodeCFLabel
		extends CFLabel
	{
		public TableClassCodeCFLabel() {
			super();
			setText( "Table Class Code" );
		}
	}

	protected class TableClassCodeEditor
		extends CFStringEditor
	{
		public TableClassCodeEditor() {
			super();
			setMaxLen( 4 );
			setFieldName( "Table Class Code" );
		}
	}

	protected class IsInstantiableCFLabel
		extends CFLabel
	{
		public IsInstantiableCFLabel() {
			super();
			setText( "Is Instantiable" );
		}
	}

	protected class IsInstantiableEditor
		extends CFBoolEditor
	{
		public IsInstantiableEditor() {
			super();
			setIsNullable( false );
			setFieldName( "Is Instantiable" );
		}
	}

	protected class HasHistoryCFLabel
		extends CFLabel
	{
		public HasHistoryCFLabel() {
			super();
			setText( "Has History" );
		}
	}

	protected class HasHistoryEditor
		extends CFBoolEditor
	{
		public HasHistoryEditor() {
			super();
			setIsNullable( false );
			setFieldName( "Has History" );
		}
	}

	protected class HasAuditColumnsCFLabel
		extends CFLabel
	{
		public HasAuditColumnsCFLabel() {
			super();
			setText( "Has Audit Columns" );
		}
	}

	protected class HasAuditColumnsEditor
		extends CFBoolEditor
	{
		public HasAuditColumnsEditor() {
			super();
			setIsNullable( false );
			setFieldName( "Has Audit Columns" );
		}
	}

	protected class IsMutableCFLabel
		extends CFLabel
	{
		public IsMutableCFLabel() {
			super();
			setText( "Is Mutable" );
		}
	}

	protected class IsMutableEditor
		extends CFBoolEditor
	{
		public IsMutableEditor() {
			super();
			setIsNullable( false );
			setFieldName( "Is Mutable" );
		}
	}

	protected class IsServerOnlyCFLabel
		extends CFLabel
	{
		public IsServerOnlyCFLabel() {
			super();
			setText( "Is Server Table Only" );
		}
	}

	protected class IsServerOnlyEditor
		extends CFBoolEditor
	{
		public IsServerOnlyEditor() {
			super();
			setIsNullable( false );
			setFieldName( "Is Server Table Only" );
		}
	}

	protected class LoaderBehaviourCFLabel
		extends CFLabel
	{
		public LoaderBehaviourCFLabel() {
			super();
			setText( "Loader Behaviour" );
		}
	}

	protected class LoaderBehaviourEditor
		extends ComboBox<String>
	{
		public LoaderBehaviourEditor() {
			super();
			setItems( observableListOfLoaderBehaviour );
		}
	}

	protected class SecScopeCFLabel
		extends CFLabel
	{
		public SecScopeCFLabel() {
			super();
			setText( "Security Scope" );
		}
	}

	protected class SecScopeEditor
		extends ComboBox<String>
	{
		public SecScopeEditor() {
			super();
			setItems( observableListOfSecScope );
		}
	}

	protected class JObjMembersCFLabel
		extends CFLabel
	{
		public JObjMembersCFLabel() {
			super();
			setText( "JObjMembers" );
		}
	}

	protected class JObjMembersEditor
		extends CFTextEditor
	{
		public JObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JObjInterfaceCFLabel
		extends CFLabel
	{
		public JObjInterfaceCFLabel() {
			super();
			setText( "JObjInterface" );
		}
	}

	protected class JObjInterfaceEditor
		extends CFTextEditor
	{
		public JObjInterfaceEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JObjInterface" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JObjImportCFLabel
		extends CFLabel
	{
		public JObjImportCFLabel() {
			super();
			setText( "JObjImport" );
		}
	}

	protected class JObjImportEditor
		extends CFTextEditor
	{
		public JObjImportEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JObjImport" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JObjImplementationCFLabel
		extends CFLabel
	{
		public JObjImplementationCFLabel() {
			super();
			setText( "JObjImplementation" );
		}
	}

	protected class JObjImplementationEditor
		extends CFTextEditor
	{
		public JObjImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JObjImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JEditObjMembersCFLabel
		extends CFLabel
	{
		public JEditObjMembersCFLabel() {
			super();
			setText( "JEditObjMembers" );
		}
	}

	protected class JEditObjMembersEditor
		extends CFTextEditor
	{
		public JEditObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JEditObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JEditObjInterfaceCFLabel
		extends CFLabel
	{
		public JEditObjInterfaceCFLabel() {
			super();
			setText( "JEditObjInterface" );
		}
	}

	protected class JEditObjInterfaceEditor
		extends CFTextEditor
	{
		public JEditObjInterfaceEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JEditObjInterface" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JEditObjImportCFLabel
		extends CFLabel
	{
		public JEditObjImportCFLabel() {
			super();
			setText( "JEditObjImport" );
		}
	}

	protected class JEditObjImportEditor
		extends CFTextEditor
	{
		public JEditObjImportEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JEditObjImport" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JEditObjImplementationCFLabel
		extends CFLabel
	{
		public JEditObjImplementationCFLabel() {
			super();
			setText( "JEditObjImplementation" );
		}
	}

	protected class JEditObjImplementationEditor
		extends CFTextEditor
	{
		public JEditObjImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JEditObjImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JTableImportCFLabel
		extends CFLabel
	{
		public JTableImportCFLabel() {
			super();
			setText( "JTableImport" );
		}
	}

	protected class JTableImportEditor
		extends CFTextEditor
	{
		public JTableImportEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JTableImport" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JTableMembersCFLabel
		extends CFLabel
	{
		public JTableMembersCFLabel() {
			super();
			setText( "JTableMembers" );
		}
	}

	protected class JTableMembersEditor
		extends CFTextEditor
	{
		public JTableMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JTableMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JTableInterfaceCFLabel
		extends CFLabel
	{
		public JTableInterfaceCFLabel() {
			super();
			setText( "JTableInterface" );
		}
	}

	protected class JTableInterfaceEditor
		extends CFTextEditor
	{
		public JTableInterfaceEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JTableInterface" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JTableImplementationCFLabel
		extends CFLabel
	{
		public JTableImplementationCFLabel() {
			super();
			setText( "JTableImplementation" );
		}
	}

	protected class JTableImplementationEditor
		extends CFTextEditor
	{
		public JTableImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JTableImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JTableObjImportCFLabel
		extends CFLabel
	{
		public JTableObjImportCFLabel() {
			super();
			setText( "JTableObjImport" );
		}
	}

	protected class JTableObjImportEditor
		extends CFTextEditor
	{
		public JTableObjImportEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JTableObjImport" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JTableObjMembersCFLabel
		extends CFLabel
	{
		public JTableObjMembersCFLabel() {
			super();
			setText( "JTableObjMembers" );
		}
	}

	protected class JTableObjMembersEditor
		extends CFTextEditor
	{
		public JTableObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JTableObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JTableObjInterfaceCFLabel
		extends CFLabel
	{
		public JTableObjInterfaceCFLabel() {
			super();
			setText( "JTableObjInterface" );
		}
	}

	protected class JTableObjInterfaceEditor
		extends CFTextEditor
	{
		public JTableObjInterfaceEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JTableObjInterface" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JTableObjImplementationCFLabel
		extends CFLabel
	{
		public JTableObjImplementationCFLabel() {
			super();
			setText( "JTableObjImplementation" );
		}
	}

	protected class JTableObjImplementationEditor
		extends CFTextEditor
	{
		public JTableObjImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JTableObjImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JDb2LUWTableImportCFLabel
		extends CFLabel
	{
		public JDb2LUWTableImportCFLabel() {
			super();
			setText( "JDb2LUWTableImport" );
		}
	}

	protected class JDb2LUWTableImportEditor
		extends CFTextEditor
	{
		public JDb2LUWTableImportEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JDb2LUWTableImport" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JDb2LUWTableMembersCFLabel
		extends CFLabel
	{
		public JDb2LUWTableMembersCFLabel() {
			super();
			setText( "JDb2LUWTableMembers" );
		}
	}

	protected class JDb2LUWTableMembersEditor
		extends CFTextEditor
	{
		public JDb2LUWTableMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JDb2LUWTableMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JDb2LUWTableImplementationCFLabel
		extends CFLabel
	{
		public JDb2LUWTableImplementationCFLabel() {
			super();
			setText( "JDb2LUWTableImplementation" );
		}
	}

	protected class JDb2LUWTableImplementationEditor
		extends CFTextEditor
	{
		public JDb2LUWTableImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JDb2LUWTableImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JMSSqlTableImportCFLabel
		extends CFLabel
	{
		public JMSSqlTableImportCFLabel() {
			super();
			setText( "JMSSqlTableImport" );
		}
	}

	protected class JMSSqlTableImportEditor
		extends CFTextEditor
	{
		public JMSSqlTableImportEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JMSSqlTableImport" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JMSSqlTableMembersCFLabel
		extends CFLabel
	{
		public JMSSqlTableMembersCFLabel() {
			super();
			setText( "JMSSqlTableMembers" );
		}
	}

	protected class JMSSqlTableMembersEditor
		extends CFTextEditor
	{
		public JMSSqlTableMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JMSSqlTableMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JMSSqlTableImplementationCFLabel
		extends CFLabel
	{
		public JMSSqlTableImplementationCFLabel() {
			super();
			setText( "JMSSqlTableImplementation" );
		}
	}

	protected class JMSSqlTableImplementationEditor
		extends CFTextEditor
	{
		public JMSSqlTableImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JMSSqlTableImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JMySqlTableImportCFLabel
		extends CFLabel
	{
		public JMySqlTableImportCFLabel() {
			super();
			setText( "JMySqlTableImport" );
		}
	}

	protected class JMySqlTableImportEditor
		extends CFTextEditor
	{
		public JMySqlTableImportEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JMySqlTableImport" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JMySqlTableMembersCFLabel
		extends CFLabel
	{
		public JMySqlTableMembersCFLabel() {
			super();
			setText( "JMySqlTableMembers" );
		}
	}

	protected class JMySqlTableMembersEditor
		extends CFTextEditor
	{
		public JMySqlTableMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JMySqlTableMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JMySqlTableImplementationCFLabel
		extends CFLabel
	{
		public JMySqlTableImplementationCFLabel() {
			super();
			setText( "JMySqlTableImplementation" );
		}
	}

	protected class JMySqlTableImplementationEditor
		extends CFTextEditor
	{
		public JMySqlTableImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JMySqlTableImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JOracleTableImportCFLabel
		extends CFLabel
	{
		public JOracleTableImportCFLabel() {
			super();
			setText( "JOracleTableImport" );
		}
	}

	protected class JOracleTableImportEditor
		extends CFTextEditor
	{
		public JOracleTableImportEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JOracleTableImport" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JOracleTableMembersCFLabel
		extends CFLabel
	{
		public JOracleTableMembersCFLabel() {
			super();
			setText( "JOracleTableMembers" );
		}
	}

	protected class JOracleTableMembersEditor
		extends CFTextEditor
	{
		public JOracleTableMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JOracleTableMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JOracleTableImplementationCFLabel
		extends CFLabel
	{
		public JOracleTableImplementationCFLabel() {
			super();
			setText( "JOracleTableImplementation" );
		}
	}

	protected class JOracleTableImplementationEditor
		extends CFTextEditor
	{
		public JOracleTableImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JOracleTableImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JPgSqlTableImportCFLabel
		extends CFLabel
	{
		public JPgSqlTableImportCFLabel() {
			super();
			setText( "JPgSqlTableImport" );
		}
	}

	protected class JPgSqlTableImportEditor
		extends CFTextEditor
	{
		public JPgSqlTableImportEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JPgSqlTableImport" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JPgSqlTableMembersCFLabel
		extends CFLabel
	{
		public JPgSqlTableMembersCFLabel() {
			super();
			setText( "JPgSqlTableMembers" );
		}
	}

	protected class JPgSqlTableMembersEditor
		extends CFTextEditor
	{
		public JPgSqlTableMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JPgSqlTableMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JPgSqlTableImplementationCFLabel
		extends CFLabel
	{
		public JPgSqlTableImplementationCFLabel() {
			super();
			setText( "JPgSqlTableImplementation" );
		}
	}

	protected class JPgSqlTableImplementationEditor
		extends CFTextEditor
	{
		public JPgSqlTableImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JPgSqlTableImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JRamTableImportCFLabel
		extends CFLabel
	{
		public JRamTableImportCFLabel() {
			super();
			setText( "JRamTableImport" );
		}
	}

	protected class JRamTableImportEditor
		extends CFTextEditor
	{
		public JRamTableImportEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JRamTableImport" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JRamTableMembersCFLabel
		extends CFLabel
	{
		public JRamTableMembersCFLabel() {
			super();
			setText( "JRamTableMembers" );
		}
	}

	protected class JRamTableMembersEditor
		extends CFTextEditor
	{
		public JRamTableMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JRamTableMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JRamTableImplementationCFLabel
		extends CFLabel
	{
		public JRamTableImplementationCFLabel() {
			super();
			setText( "JRamTableImplementation" );
		}
	}

	protected class JRamTableImplementationEditor
		extends CFTextEditor
	{
		public JRamTableImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JRamTableImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JSaxLoaderImportCFLabel
		extends CFLabel
	{
		public JSaxLoaderImportCFLabel() {
			super();
			setText( "JSaxLoaderImport" );
		}
	}

	protected class JSaxLoaderImportEditor
		extends CFTextEditor
	{
		public JSaxLoaderImportEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JSaxLoaderImport" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JSaxLoaderStartElementCFLabel
		extends CFLabel
	{
		public JSaxLoaderStartElementCFLabel() {
			super();
			setText( "JSaxLoaderStartElement" );
		}
	}

	protected class JSaxLoaderStartElementEditor
		extends CFTextEditor
	{
		public JSaxLoaderStartElementEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JSaxLoaderStartElement" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JSaxLoaderEndElementCFLabel
		extends CFLabel
	{
		public JSaxLoaderEndElementCFLabel() {
			super();
			setText( "JSaxLoaderEndElement" );
		}
	}

	protected class JSaxLoaderEndElementEditor
		extends CFTextEditor
	{
		public JSaxLoaderEndElementEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JSaxLoaderEndElement" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JXMsgTableImportCFLabel
		extends CFLabel
	{
		public JXMsgTableImportCFLabel() {
			super();
			setText( "JXMsgTableImport" );
		}
	}

	protected class JXMsgTableImportEditor
		extends CFTextEditor
	{
		public JXMsgTableImportEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JXMsgTableImport" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JXMsgTableFormattersCFLabel
		extends CFLabel
	{
		public JXMsgTableFormattersCFLabel() {
			super();
			setText( "JXMsgTableFormatters" );
		}
	}

	protected class JXMsgTableFormattersEditor
		extends CFTextEditor
	{
		public JXMsgTableFormattersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JXMsgTableFormatters" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JXMsgRqstTableImportCFLabel
		extends CFLabel
	{
		public JXMsgRqstTableImportCFLabel() {
			super();
			setText( "JXMsgRqstTableImport" );
		}
	}

	protected class JXMsgRqstTableImportEditor
		extends CFTextEditor
	{
		public JXMsgRqstTableImportEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JXMsgRqstTableImport" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JXMsgRspnTableImportCFLabel
		extends CFLabel
	{
		public JXMsgRspnTableImportCFLabel() {
			super();
			setText( "JXMsgRspnTableImport" );
		}
	}

	protected class JXMsgRspnTableImportEditor
		extends CFTextEditor
	{
		public JXMsgRspnTableImportEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JXMsgRspnTableImport" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JXMsgClientTableImportCFLabel
		extends CFLabel
	{
		public JXMsgClientTableImportCFLabel() {
			super();
			setText( "JXMsgClientTableImport" );
		}
	}

	protected class JXMsgClientTableImportEditor
		extends CFTextEditor
	{
		public JXMsgClientTableImportEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JXMsgClientTableImport" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JXMsgRqstTableBodyCFLabel
		extends CFLabel
	{
		public JXMsgRqstTableBodyCFLabel() {
			super();
			setText( "JXMsgRqstTableBody" );
		}
	}

	protected class JXMsgRqstTableBodyEditor
		extends CFTextEditor
	{
		public JXMsgRqstTableBodyEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JXMsgRqstTableBody" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JXMsgRspnTableBodyCFLabel
		extends CFLabel
	{
		public JXMsgRspnTableBodyCFLabel() {
			super();
			setText( "JXMsgRspnTableBody" );
		}
	}

	protected class JXMsgRspnTableBodyEditor
		extends CFTextEditor
	{
		public JXMsgRspnTableBodyEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JXMsgRspnTableBody" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JXMsgClientTableBodyCFLabel
		extends CFLabel
	{
		public JXMsgClientTableBodyCFLabel() {
			super();
			setText( "JXMsgClientTableBody" );
		}
	}

	protected class JXMsgClientTableBodyEditor
		extends CFTextEditor
	{
		public JXMsgClientTableBodyEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JXMsgClientTableBody" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppObjMembersCFLabel
		extends CFLabel
	{
		public CppObjMembersCFLabel() {
			super();
			setText( "CppObjMembers" );
		}
	}

	protected class CppObjMembersEditor
		extends CFTextEditor
	{
		public CppObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppObjInterfaceCFLabel
		extends CFLabel
	{
		public CppObjInterfaceCFLabel() {
			super();
			setText( "CppObjInterface" );
		}
	}

	protected class CppObjInterfaceEditor
		extends CFTextEditor
	{
		public CppObjInterfaceEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppObjInterface" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppObjIncludeCFLabel
		extends CFLabel
	{
		public CppObjIncludeCFLabel() {
			super();
			setText( "CppObjInclude" );
		}
	}

	protected class CppObjIncludeEditor
		extends CFTextEditor
	{
		public CppObjIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppObjInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppObjImplementationCFLabel
		extends CFLabel
	{
		public CppObjImplementationCFLabel() {
			super();
			setText( "CppObjImplementation" );
		}
	}

	protected class CppObjImplementationEditor
		extends CFTextEditor
	{
		public CppObjImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppObjImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppEditObjMembersCFLabel
		extends CFLabel
	{
		public CppEditObjMembersCFLabel() {
			super();
			setText( "CppEditObjMembers" );
		}
	}

	protected class CppEditObjMembersEditor
		extends CFTextEditor
	{
		public CppEditObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppEditObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppEditObjInterfaceCFLabel
		extends CFLabel
	{
		public CppEditObjInterfaceCFLabel() {
			super();
			setText( "CppEditObjInterface" );
		}
	}

	protected class CppEditObjInterfaceEditor
		extends CFTextEditor
	{
		public CppEditObjInterfaceEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppEditObjInterface" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppEditObjIncludeCFLabel
		extends CFLabel
	{
		public CppEditObjIncludeCFLabel() {
			super();
			setText( "CppEditObjInclude" );
		}
	}

	protected class CppEditObjIncludeEditor
		extends CFTextEditor
	{
		public CppEditObjIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppEditObjInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppEditObjImplementationCFLabel
		extends CFLabel
	{
		public CppEditObjImplementationCFLabel() {
			super();
			setText( "CppEditObjImplementation" );
		}
	}

	protected class CppEditObjImplementationEditor
		extends CFTextEditor
	{
		public CppEditObjImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppEditObjImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppTableIncludeCFLabel
		extends CFLabel
	{
		public CppTableIncludeCFLabel() {
			super();
			setText( "CppTableInclude" );
		}
	}

	protected class CppTableIncludeEditor
		extends CFTextEditor
	{
		public CppTableIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppTableInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppTableMembersCFLabel
		extends CFLabel
	{
		public CppTableMembersCFLabel() {
			super();
			setText( "CppTableMembers" );
		}
	}

	protected class CppTableMembersEditor
		extends CFTextEditor
	{
		public CppTableMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppTableMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppTableInterfaceCFLabel
		extends CFLabel
	{
		public CppTableInterfaceCFLabel() {
			super();
			setText( "CppTableInterface" );
		}
	}

	protected class CppTableInterfaceEditor
		extends CFTextEditor
	{
		public CppTableInterfaceEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppTableInterface" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppTableImplementationCFLabel
		extends CFLabel
	{
		public CppTableImplementationCFLabel() {
			super();
			setText( "CppTableImplementation" );
		}
	}

	protected class CppTableImplementationEditor
		extends CFTextEditor
	{
		public CppTableImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppTableImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppTableObjIncludeCFLabel
		extends CFLabel
	{
		public CppTableObjIncludeCFLabel() {
			super();
			setText( "CppTableObjInclude" );
		}
	}

	protected class CppTableObjIncludeEditor
		extends CFTextEditor
	{
		public CppTableObjIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppTableObjInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppTableObjMembersCFLabel
		extends CFLabel
	{
		public CppTableObjMembersCFLabel() {
			super();
			setText( "CppTableObjMembers" );
		}
	}

	protected class CppTableObjMembersEditor
		extends CFTextEditor
	{
		public CppTableObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppTableObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppTableObjInterfaceCFLabel
		extends CFLabel
	{
		public CppTableObjInterfaceCFLabel() {
			super();
			setText( "CppTableObjInterface" );
		}
	}

	protected class CppTableObjInterfaceEditor
		extends CFTextEditor
	{
		public CppTableObjInterfaceEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppTableObjInterface" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppTableObjImplementationCFLabel
		extends CFLabel
	{
		public CppTableObjImplementationCFLabel() {
			super();
			setText( "CppTableObjImplementation" );
		}
	}

	protected class CppTableObjImplementationEditor
		extends CFTextEditor
	{
		public CppTableObjImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppTableObjImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppDb2LUWTableIncludeCFLabel
		extends CFLabel
	{
		public CppDb2LUWTableIncludeCFLabel() {
			super();
			setText( "CppDb2LUWTableInclude" );
		}
	}

	protected class CppDb2LUWTableIncludeEditor
		extends CFTextEditor
	{
		public CppDb2LUWTableIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppDb2LUWTableInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppDb2LUWTableMembersCFLabel
		extends CFLabel
	{
		public CppDb2LUWTableMembersCFLabel() {
			super();
			setText( "CppDb2LUWTableMembers" );
		}
	}

	protected class CppDb2LUWTableMembersEditor
		extends CFTextEditor
	{
		public CppDb2LUWTableMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppDb2LUWTableMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppDb2LUWTableImplementationCFLabel
		extends CFLabel
	{
		public CppDb2LUWTableImplementationCFLabel() {
			super();
			setText( "CppDb2LUWTableImplementation" );
		}
	}

	protected class CppDb2LUWTableImplementationEditor
		extends CFTextEditor
	{
		public CppDb2LUWTableImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppDb2LUWTableImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppMSSqlTableIncludeCFLabel
		extends CFLabel
	{
		public CppMSSqlTableIncludeCFLabel() {
			super();
			setText( "CppMSSqlTableInclude" );
		}
	}

	protected class CppMSSqlTableIncludeEditor
		extends CFTextEditor
	{
		public CppMSSqlTableIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppMSSqlTableInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppMSSqlTableMembersCFLabel
		extends CFLabel
	{
		public CppMSSqlTableMembersCFLabel() {
			super();
			setText( "CppMSSqlTableMembers" );
		}
	}

	protected class CppMSSqlTableMembersEditor
		extends CFTextEditor
	{
		public CppMSSqlTableMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppMSSqlTableMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppMSSqlTableImplementationCFLabel
		extends CFLabel
	{
		public CppMSSqlTableImplementationCFLabel() {
			super();
			setText( "CppMSSqlTableImplementation" );
		}
	}

	protected class CppMSSqlTableImplementationEditor
		extends CFTextEditor
	{
		public CppMSSqlTableImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppMSSqlTableImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppMySqlTableIncludeCFLabel
		extends CFLabel
	{
		public CppMySqlTableIncludeCFLabel() {
			super();
			setText( "CppMySqlTableInclude" );
		}
	}

	protected class CppMySqlTableIncludeEditor
		extends CFTextEditor
	{
		public CppMySqlTableIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppMySqlTableInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppMySqlTableMembersCFLabel
		extends CFLabel
	{
		public CppMySqlTableMembersCFLabel() {
			super();
			setText( "CppMySqlTableMembers" );
		}
	}

	protected class CppMySqlTableMembersEditor
		extends CFTextEditor
	{
		public CppMySqlTableMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppMySqlTableMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppMySqlTableImplementationCFLabel
		extends CFLabel
	{
		public CppMySqlTableImplementationCFLabel() {
			super();
			setText( "CppMySqlTableImplementation" );
		}
	}

	protected class CppMySqlTableImplementationEditor
		extends CFTextEditor
	{
		public CppMySqlTableImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppMySqlTableImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppOracleTableIncludeCFLabel
		extends CFLabel
	{
		public CppOracleTableIncludeCFLabel() {
			super();
			setText( "CppOracleTableInclude" );
		}
	}

	protected class CppOracleTableIncludeEditor
		extends CFTextEditor
	{
		public CppOracleTableIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppOracleTableInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppOracleTableMembersCFLabel
		extends CFLabel
	{
		public CppOracleTableMembersCFLabel() {
			super();
			setText( "CppOracleTableMembers" );
		}
	}

	protected class CppOracleTableMembersEditor
		extends CFTextEditor
	{
		public CppOracleTableMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppOracleTableMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppOracleTableImplementationCFLabel
		extends CFLabel
	{
		public CppOracleTableImplementationCFLabel() {
			super();
			setText( "CppOracleTableImplementation" );
		}
	}

	protected class CppOracleTableImplementationEditor
		extends CFTextEditor
	{
		public CppOracleTableImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppOracleTableImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppPgSqlTableIncludeCFLabel
		extends CFLabel
	{
		public CppPgSqlTableIncludeCFLabel() {
			super();
			setText( "CppPgSqlTableInclude" );
		}
	}

	protected class CppPgSqlTableIncludeEditor
		extends CFTextEditor
	{
		public CppPgSqlTableIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppPgSqlTableInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppPgSqlTableMembersCFLabel
		extends CFLabel
	{
		public CppPgSqlTableMembersCFLabel() {
			super();
			setText( "CppPgSqlTableMembers" );
		}
	}

	protected class CppPgSqlTableMembersEditor
		extends CFTextEditor
	{
		public CppPgSqlTableMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppPgSqlTableMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppPgSqlTableImplementationCFLabel
		extends CFLabel
	{
		public CppPgSqlTableImplementationCFLabel() {
			super();
			setText( "CppPgSqlTableImplementation" );
		}
	}

	protected class CppPgSqlTableImplementationEditor
		extends CFTextEditor
	{
		public CppPgSqlTableImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppPgSqlTableImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppRamTableIncludeCFLabel
		extends CFLabel
	{
		public CppRamTableIncludeCFLabel() {
			super();
			setText( "CppRamTableInclude" );
		}
	}

	protected class CppRamTableIncludeEditor
		extends CFTextEditor
	{
		public CppRamTableIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppRamTableInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppRamTableMembersCFLabel
		extends CFLabel
	{
		public CppRamTableMembersCFLabel() {
			super();
			setText( "CppRamTableMembers" );
		}
	}

	protected class CppRamTableMembersEditor
		extends CFTextEditor
	{
		public CppRamTableMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppRamTableMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppRamTableImplementationCFLabel
		extends CFLabel
	{
		public CppRamTableImplementationCFLabel() {
			super();
			setText( "CppRamTableImplementation" );
		}
	}

	protected class CppRamTableImplementationEditor
		extends CFTextEditor
	{
		public CppRamTableImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppRamTableImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppSaxLoaderIncludeCFLabel
		extends CFLabel
	{
		public CppSaxLoaderIncludeCFLabel() {
			super();
			setText( "CppSaxLoaderInclude" );
		}
	}

	protected class CppSaxLoaderIncludeEditor
		extends CFTextEditor
	{
		public CppSaxLoaderIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppSaxLoaderInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppSaxLoaderStartElementCFLabel
		extends CFLabel
	{
		public CppSaxLoaderStartElementCFLabel() {
			super();
			setText( "CppSaxLoaderStartElement" );
		}
	}

	protected class CppSaxLoaderStartElementEditor
		extends CFTextEditor
	{
		public CppSaxLoaderStartElementEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppSaxLoaderStartElement" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppSaxLoaderEndElementCFLabel
		extends CFLabel
	{
		public CppSaxLoaderEndElementCFLabel() {
			super();
			setText( "CppSaxLoaderEndElement" );
		}
	}

	protected class CppSaxLoaderEndElementEditor
		extends CFTextEditor
	{
		public CppSaxLoaderEndElementEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppSaxLoaderEndElement" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppXMsgTableIncludeCFLabel
		extends CFLabel
	{
		public CppXMsgTableIncludeCFLabel() {
			super();
			setText( "CppXMsgTableInclude" );
		}
	}

	protected class CppXMsgTableIncludeEditor
		extends CFTextEditor
	{
		public CppXMsgTableIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppXMsgTableInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppXMsgTableFormattersCFLabel
		extends CFLabel
	{
		public CppXMsgTableFormattersCFLabel() {
			super();
			setText( "CppXMsgTableFormatters" );
		}
	}

	protected class CppXMsgTableFormattersEditor
		extends CFTextEditor
	{
		public CppXMsgTableFormattersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppXMsgTableFormatters" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppXMsgRqstTableIncludeCFLabel
		extends CFLabel
	{
		public CppXMsgRqstTableIncludeCFLabel() {
			super();
			setText( "CppXMsgRqstTableInclude" );
		}
	}

	protected class CppXMsgRqstTableIncludeEditor
		extends CFTextEditor
	{
		public CppXMsgRqstTableIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppXMsgRqstTableInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppXMsgRspnTableIncludeCFLabel
		extends CFLabel
	{
		public CppXMsgRspnTableIncludeCFLabel() {
			super();
			setText( "CppXMsgRspnTableInclude" );
		}
	}

	protected class CppXMsgRspnTableIncludeEditor
		extends CFTextEditor
	{
		public CppXMsgRspnTableIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppXMsgRspnTableInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppXMsgClientTableIncludeCFLabel
		extends CFLabel
	{
		public CppXMsgClientTableIncludeCFLabel() {
			super();
			setText( "CppXMsgClientTableInclude" );
		}
	}

	protected class CppXMsgClientTableIncludeEditor
		extends CFTextEditor
	{
		public CppXMsgClientTableIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppXMsgClientTableInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppXMsgRqstTableBodyCFLabel
		extends CFLabel
	{
		public CppXMsgRqstTableBodyCFLabel() {
			super();
			setText( "CppXMsgRqstTableBody" );
		}
	}

	protected class CppXMsgRqstTableBodyEditor
		extends CFTextEditor
	{
		public CppXMsgRqstTableBodyEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppXMsgRqstTableBody" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppXMsgRspnTableBodyCFLabel
		extends CFLabel
	{
		public CppXMsgRspnTableBodyCFLabel() {
			super();
			setText( "CppXMsgRspnTableBody" );
		}
	}

	protected class CppXMsgRspnTableBodyEditor
		extends CFTextEditor
	{
		public CppXMsgRspnTableBodyEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppXMsgRspnTableBody" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppXMsgClientTableBodyCFLabel
		extends CFLabel
	{
		public CppXMsgClientTableBodyCFLabel() {
			super();
			setText( "CppXMsgClientTableBody" );
		}
	}

	protected class CppXMsgClientTableBodyEditor
		extends CFTextEditor
	{
		public CppXMsgClientTableBodyEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppXMsgClientTableBody" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppObjMembersCFLabel
		extends CFLabel
	{
		public HppObjMembersCFLabel() {
			super();
			setText( "HppObjMembers" );
		}
	}

	protected class HppObjMembersEditor
		extends CFTextEditor
	{
		public HppObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppObjInterfaceCFLabel
		extends CFLabel
	{
		public HppObjInterfaceCFLabel() {
			super();
			setText( "HppObjInterface" );
		}
	}

	protected class HppObjInterfaceEditor
		extends CFTextEditor
	{
		public HppObjInterfaceEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppObjInterface" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppObjIncludeCFLabel
		extends CFLabel
	{
		public HppObjIncludeCFLabel() {
			super();
			setText( "HppObjInclude" );
		}
	}

	protected class HppObjIncludeEditor
		extends CFTextEditor
	{
		public HppObjIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppObjInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppObjImplementationCFLabel
		extends CFLabel
	{
		public HppObjImplementationCFLabel() {
			super();
			setText( "HppObjImplementation" );
		}
	}

	protected class HppObjImplementationEditor
		extends CFTextEditor
	{
		public HppObjImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppObjImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppEditObjMembersCFLabel
		extends CFLabel
	{
		public HppEditObjMembersCFLabel() {
			super();
			setText( "HppEditObjMembers" );
		}
	}

	protected class HppEditObjMembersEditor
		extends CFTextEditor
	{
		public HppEditObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppEditObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppEditObjInterfaceCFLabel
		extends CFLabel
	{
		public HppEditObjInterfaceCFLabel() {
			super();
			setText( "HppEditObjInterface" );
		}
	}

	protected class HppEditObjInterfaceEditor
		extends CFTextEditor
	{
		public HppEditObjInterfaceEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppEditObjInterface" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppEditObjIncludeCFLabel
		extends CFLabel
	{
		public HppEditObjIncludeCFLabel() {
			super();
			setText( "HppEditObjInclude" );
		}
	}

	protected class HppEditObjIncludeEditor
		extends CFTextEditor
	{
		public HppEditObjIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppEditObjInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppEditObjImplementationCFLabel
		extends CFLabel
	{
		public HppEditObjImplementationCFLabel() {
			super();
			setText( "HppEditObjImplementation" );
		}
	}

	protected class HppEditObjImplementationEditor
		extends CFTextEditor
	{
		public HppEditObjImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppEditObjImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppTableIncludeCFLabel
		extends CFLabel
	{
		public HppTableIncludeCFLabel() {
			super();
			setText( "HppTableInclude" );
		}
	}

	protected class HppTableIncludeEditor
		extends CFTextEditor
	{
		public HppTableIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppTableInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppTableMembersCFLabel
		extends CFLabel
	{
		public HppTableMembersCFLabel() {
			super();
			setText( "HppTableMembers" );
		}
	}

	protected class HppTableMembersEditor
		extends CFTextEditor
	{
		public HppTableMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppTableMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppTableInterfaceCFLabel
		extends CFLabel
	{
		public HppTableInterfaceCFLabel() {
			super();
			setText( "HppTableInterface" );
		}
	}

	protected class HppTableInterfaceEditor
		extends CFTextEditor
	{
		public HppTableInterfaceEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppTableInterface" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppTableImplementationCFLabel
		extends CFLabel
	{
		public HppTableImplementationCFLabel() {
			super();
			setText( "HppTableImplementation" );
		}
	}

	protected class HppTableImplementationEditor
		extends CFTextEditor
	{
		public HppTableImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppTableImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppTableObjIncludeCFLabel
		extends CFLabel
	{
		public HppTableObjIncludeCFLabel() {
			super();
			setText( "HppTableObjInclude" );
		}
	}

	protected class HppTableObjIncludeEditor
		extends CFTextEditor
	{
		public HppTableObjIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppTableObjInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppTableObjMembersCFLabel
		extends CFLabel
	{
		public HppTableObjMembersCFLabel() {
			super();
			setText( "HppTableObjMembers" );
		}
	}

	protected class HppTableObjMembersEditor
		extends CFTextEditor
	{
		public HppTableObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppTableObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppTableObjInterfaceCFLabel
		extends CFLabel
	{
		public HppTableObjInterfaceCFLabel() {
			super();
			setText( "HppTableObjInterface" );
		}
	}

	protected class HppTableObjInterfaceEditor
		extends CFTextEditor
	{
		public HppTableObjInterfaceEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppTableObjInterface" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppTableObjImplementationCFLabel
		extends CFLabel
	{
		public HppTableObjImplementationCFLabel() {
			super();
			setText( "HppTableObjImplementation" );
		}
	}

	protected class HppTableObjImplementationEditor
		extends CFTextEditor
	{
		public HppTableObjImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppTableObjImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppDb2LUWTableIncludeCFLabel
		extends CFLabel
	{
		public HppDb2LUWTableIncludeCFLabel() {
			super();
			setText( "HppDb2LUWTableInclude" );
		}
	}

	protected class HppDb2LUWTableIncludeEditor
		extends CFTextEditor
	{
		public HppDb2LUWTableIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppDb2LUWTableInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppDb2LUWTableMembersCFLabel
		extends CFLabel
	{
		public HppDb2LUWTableMembersCFLabel() {
			super();
			setText( "HppDb2LUWTableMembers" );
		}
	}

	protected class HppDb2LUWTableMembersEditor
		extends CFTextEditor
	{
		public HppDb2LUWTableMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppDb2LUWTableMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppDb2LUWTableImplementationCFLabel
		extends CFLabel
	{
		public HppDb2LUWTableImplementationCFLabel() {
			super();
			setText( "HppDb2LUWTableImplementation" );
		}
	}

	protected class HppDb2LUWTableImplementationEditor
		extends CFTextEditor
	{
		public HppDb2LUWTableImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppDb2LUWTableImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppMSSqlTableIncludeCFLabel
		extends CFLabel
	{
		public HppMSSqlTableIncludeCFLabel() {
			super();
			setText( "HppMSSqlTableInclude" );
		}
	}

	protected class HppMSSqlTableIncludeEditor
		extends CFTextEditor
	{
		public HppMSSqlTableIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppMSSqlTableInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppMSSqlTableMembersCFLabel
		extends CFLabel
	{
		public HppMSSqlTableMembersCFLabel() {
			super();
			setText( "HppMSSqlTableMembers" );
		}
	}

	protected class HppMSSqlTableMembersEditor
		extends CFTextEditor
	{
		public HppMSSqlTableMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppMSSqlTableMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppMSSqlTableImplementationCFLabel
		extends CFLabel
	{
		public HppMSSqlTableImplementationCFLabel() {
			super();
			setText( "HppMSSqlTableImplementation" );
		}
	}

	protected class HppMSSqlTableImplementationEditor
		extends CFTextEditor
	{
		public HppMSSqlTableImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppMSSqlTableImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppMySqlTableIncludeCFLabel
		extends CFLabel
	{
		public HppMySqlTableIncludeCFLabel() {
			super();
			setText( "HppMySqlTableInclude" );
		}
	}

	protected class HppMySqlTableIncludeEditor
		extends CFTextEditor
	{
		public HppMySqlTableIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppMySqlTableInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppMySqlTableMembersCFLabel
		extends CFLabel
	{
		public HppMySqlTableMembersCFLabel() {
			super();
			setText( "HppMySqlTableMembers" );
		}
	}

	protected class HppMySqlTableMembersEditor
		extends CFTextEditor
	{
		public HppMySqlTableMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppMySqlTableMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppMySqlTableImplementationCFLabel
		extends CFLabel
	{
		public HppMySqlTableImplementationCFLabel() {
			super();
			setText( "HppMySqlTableImplementation" );
		}
	}

	protected class HppMySqlTableImplementationEditor
		extends CFTextEditor
	{
		public HppMySqlTableImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppMySqlTableImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppOracleTableIncludeCFLabel
		extends CFLabel
	{
		public HppOracleTableIncludeCFLabel() {
			super();
			setText( "HppOracleTableInclude" );
		}
	}

	protected class HppOracleTableIncludeEditor
		extends CFTextEditor
	{
		public HppOracleTableIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppOracleTableInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppOracleTableMembersCFLabel
		extends CFLabel
	{
		public HppOracleTableMembersCFLabel() {
			super();
			setText( "HppOracleTableMembers" );
		}
	}

	protected class HppOracleTableMembersEditor
		extends CFTextEditor
	{
		public HppOracleTableMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppOracleTableMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppOracleTableImplementationCFLabel
		extends CFLabel
	{
		public HppOracleTableImplementationCFLabel() {
			super();
			setText( "HppOracleTableImplementation" );
		}
	}

	protected class HppOracleTableImplementationEditor
		extends CFTextEditor
	{
		public HppOracleTableImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppOracleTableImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppPgSqlTableIncludeCFLabel
		extends CFLabel
	{
		public HppPgSqlTableIncludeCFLabel() {
			super();
			setText( "HppPgSqlTableInclude" );
		}
	}

	protected class HppPgSqlTableIncludeEditor
		extends CFTextEditor
	{
		public HppPgSqlTableIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppPgSqlTableInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppPgSqlTableMembersCFLabel
		extends CFLabel
	{
		public HppPgSqlTableMembersCFLabel() {
			super();
			setText( "HppPgSqlTableMembers" );
		}
	}

	protected class HppPgSqlTableMembersEditor
		extends CFTextEditor
	{
		public HppPgSqlTableMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppPgSqlTableMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppPgSqlTableImplementationCFLabel
		extends CFLabel
	{
		public HppPgSqlTableImplementationCFLabel() {
			super();
			setText( "HppPgSqlTableImplementation" );
		}
	}

	protected class HppPgSqlTableImplementationEditor
		extends CFTextEditor
	{
		public HppPgSqlTableImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppPgSqlTableImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppRamTableIncludeCFLabel
		extends CFLabel
	{
		public HppRamTableIncludeCFLabel() {
			super();
			setText( "HppRamTableInclude" );
		}
	}

	protected class HppRamTableIncludeEditor
		extends CFTextEditor
	{
		public HppRamTableIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppRamTableInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppRamTableMembersCFLabel
		extends CFLabel
	{
		public HppRamTableMembersCFLabel() {
			super();
			setText( "HppRamTableMembers" );
		}
	}

	protected class HppRamTableMembersEditor
		extends CFTextEditor
	{
		public HppRamTableMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppRamTableMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppRamTableImplementationCFLabel
		extends CFLabel
	{
		public HppRamTableImplementationCFLabel() {
			super();
			setText( "HppRamTableImplementation" );
		}
	}

	protected class HppRamTableImplementationEditor
		extends CFTextEditor
	{
		public HppRamTableImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppRamTableImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppSaxLoaderIncludeCFLabel
		extends CFLabel
	{
		public HppSaxLoaderIncludeCFLabel() {
			super();
			setText( "HppSaxLoaderInclude" );
		}
	}

	protected class HppSaxLoaderIncludeEditor
		extends CFTextEditor
	{
		public HppSaxLoaderIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppSaxLoaderInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppSaxLoaderStartElementCFLabel
		extends CFLabel
	{
		public HppSaxLoaderStartElementCFLabel() {
			super();
			setText( "HppSaxLoaderStartElement" );
		}
	}

	protected class HppSaxLoaderStartElementEditor
		extends CFTextEditor
	{
		public HppSaxLoaderStartElementEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppSaxLoaderStartElement" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppSaxLoaderEndElementCFLabel
		extends CFLabel
	{
		public HppSaxLoaderEndElementCFLabel() {
			super();
			setText( "HppSaxLoaderEndElement" );
		}
	}

	protected class HppSaxLoaderEndElementEditor
		extends CFTextEditor
	{
		public HppSaxLoaderEndElementEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppSaxLoaderEndElement" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppXMsgTableIncludeCFLabel
		extends CFLabel
	{
		public HppXMsgTableIncludeCFLabel() {
			super();
			setText( "HppXMsgTableInclude" );
		}
	}

	protected class HppXMsgTableIncludeEditor
		extends CFTextEditor
	{
		public HppXMsgTableIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppXMsgTableInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppXMsgTableFormattersCFLabel
		extends CFLabel
	{
		public HppXMsgTableFormattersCFLabel() {
			super();
			setText( "HppXMsgTableFormatters" );
		}
	}

	protected class HppXMsgTableFormattersEditor
		extends CFTextEditor
	{
		public HppXMsgTableFormattersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppXMsgTableFormatters" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppXMsgRqstTableIncludeCFLabel
		extends CFLabel
	{
		public HppXMsgRqstTableIncludeCFLabel() {
			super();
			setText( "HppXMsgRqstTableInclude" );
		}
	}

	protected class HppXMsgRqstTableIncludeEditor
		extends CFTextEditor
	{
		public HppXMsgRqstTableIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppXMsgRqstTableInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppXMsgRspnTableIncludeCFLabel
		extends CFLabel
	{
		public HppXMsgRspnTableIncludeCFLabel() {
			super();
			setText( "HppXMsgRspnTableInclude" );
		}
	}

	protected class HppXMsgRspnTableIncludeEditor
		extends CFTextEditor
	{
		public HppXMsgRspnTableIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppXMsgRspnTableInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppXMsgClientTableIncludeCFLabel
		extends CFLabel
	{
		public HppXMsgClientTableIncludeCFLabel() {
			super();
			setText( "HppXMsgClientTableInclude" );
		}
	}

	protected class HppXMsgClientTableIncludeEditor
		extends CFTextEditor
	{
		public HppXMsgClientTableIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppXMsgClientTableInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppXMsgRqstTableBodyCFLabel
		extends CFLabel
	{
		public HppXMsgRqstTableBodyCFLabel() {
			super();
			setText( "HppXMsgRqstTableBody" );
		}
	}

	protected class HppXMsgRqstTableBodyEditor
		extends CFTextEditor
	{
		public HppXMsgRqstTableBodyEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppXMsgRqstTableBody" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppXMsgRspnTableBodyCFLabel
		extends CFLabel
	{
		public HppXMsgRspnTableBodyCFLabel() {
			super();
			setText( "HppXMsgRspnTableBody" );
		}
	}

	protected class HppXMsgRspnTableBodyEditor
		extends CFTextEditor
	{
		public HppXMsgRspnTableBodyEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppXMsgRspnTableBody" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppXMsgClientTableBodyCFLabel
		extends CFLabel
	{
		public HppXMsgClientTableBodyCFLabel() {
			super();
			setText( "HppXMsgClientTableBody" );
		}
	}

	protected class HppXMsgClientTableBodyEditor
		extends CFTextEditor
	{
		public HppXMsgClientTableBodyEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppXMsgClientTableBody" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsObjMembersCFLabel
		extends CFLabel
	{
		public CsObjMembersCFLabel() {
			super();
			setText( "CsObjMembers" );
		}
	}

	protected class CsObjMembersEditor
		extends CFTextEditor
	{
		public CsObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsObjInterfaceCFLabel
		extends CFLabel
	{
		public CsObjInterfaceCFLabel() {
			super();
			setText( "CsObjInterface" );
		}
	}

	protected class CsObjInterfaceEditor
		extends CFTextEditor
	{
		public CsObjInterfaceEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsObjInterface" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsObjUsingCFLabel
		extends CFLabel
	{
		public CsObjUsingCFLabel() {
			super();
			setText( "CsObjUsing" );
		}
	}

	protected class CsObjUsingEditor
		extends CFTextEditor
	{
		public CsObjUsingEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsObjUsing" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsObjImplementationCFLabel
		extends CFLabel
	{
		public CsObjImplementationCFLabel() {
			super();
			setText( "CsObjImplementation" );
		}
	}

	protected class CsObjImplementationEditor
		extends CFTextEditor
	{
		public CsObjImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsObjImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsEditObjMembersCFLabel
		extends CFLabel
	{
		public CsEditObjMembersCFLabel() {
			super();
			setText( "CsEditObjMembers" );
		}
	}

	protected class CsEditObjMembersEditor
		extends CFTextEditor
	{
		public CsEditObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsEditObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsEditObjInterfaceCFLabel
		extends CFLabel
	{
		public CsEditObjInterfaceCFLabel() {
			super();
			setText( "CsEditObjInterface" );
		}
	}

	protected class CsEditObjInterfaceEditor
		extends CFTextEditor
	{
		public CsEditObjInterfaceEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsEditObjInterface" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsEditObjUsingCFLabel
		extends CFLabel
	{
		public CsEditObjUsingCFLabel() {
			super();
			setText( "CsEditObjUsing" );
		}
	}

	protected class CsEditObjUsingEditor
		extends CFTextEditor
	{
		public CsEditObjUsingEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsEditObjUsing" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsEditObjImplementationCFLabel
		extends CFLabel
	{
		public CsEditObjImplementationCFLabel() {
			super();
			setText( "CsEditObjImplementation" );
		}
	}

	protected class CsEditObjImplementationEditor
		extends CFTextEditor
	{
		public CsEditObjImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsEditObjImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsTableUsingCFLabel
		extends CFLabel
	{
		public CsTableUsingCFLabel() {
			super();
			setText( "CsTableUsing" );
		}
	}

	protected class CsTableUsingEditor
		extends CFTextEditor
	{
		public CsTableUsingEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsTableUsing" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsTableMembersCFLabel
		extends CFLabel
	{
		public CsTableMembersCFLabel() {
			super();
			setText( "CsTableMembers" );
		}
	}

	protected class CsTableMembersEditor
		extends CFTextEditor
	{
		public CsTableMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsTableMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsTableInterfaceCFLabel
		extends CFLabel
	{
		public CsTableInterfaceCFLabel() {
			super();
			setText( "CsTableInterface" );
		}
	}

	protected class CsTableInterfaceEditor
		extends CFTextEditor
	{
		public CsTableInterfaceEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsTableInterface" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsTableImplementationCFLabel
		extends CFLabel
	{
		public CsTableImplementationCFLabel() {
			super();
			setText( "CsTableImplementation" );
		}
	}

	protected class CsTableImplementationEditor
		extends CFTextEditor
	{
		public CsTableImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsTableImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsTableObjUsingCFLabel
		extends CFLabel
	{
		public CsTableObjUsingCFLabel() {
			super();
			setText( "CsTableObjUsing" );
		}
	}

	protected class CsTableObjUsingEditor
		extends CFTextEditor
	{
		public CsTableObjUsingEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsTableObjUsing" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsTableObjMembersCFLabel
		extends CFLabel
	{
		public CsTableObjMembersCFLabel() {
			super();
			setText( "CsTableObjMembers" );
		}
	}

	protected class CsTableObjMembersEditor
		extends CFTextEditor
	{
		public CsTableObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsTableObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsTableObjInterfaceCFLabel
		extends CFLabel
	{
		public CsTableObjInterfaceCFLabel() {
			super();
			setText( "CsTableObjInterface" );
		}
	}

	protected class CsTableObjInterfaceEditor
		extends CFTextEditor
	{
		public CsTableObjInterfaceEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsTableObjInterface" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsTableObjImplementationCFLabel
		extends CFLabel
	{
		public CsTableObjImplementationCFLabel() {
			super();
			setText( "CsTableObjImplementation" );
		}
	}

	protected class CsTableObjImplementationEditor
		extends CFTextEditor
	{
		public CsTableObjImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsTableObjImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsDb2LUWTableUsingCFLabel
		extends CFLabel
	{
		public CsDb2LUWTableUsingCFLabel() {
			super();
			setText( "CsDb2LUWTableUsing" );
		}
	}

	protected class CsDb2LUWTableUsingEditor
		extends CFTextEditor
	{
		public CsDb2LUWTableUsingEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsDb2LUWTableUsing" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsDb2LUWTableMembersCFLabel
		extends CFLabel
	{
		public CsDb2LUWTableMembersCFLabel() {
			super();
			setText( "CsDb2LUWTableMembers" );
		}
	}

	protected class CsDb2LUWTableMembersEditor
		extends CFTextEditor
	{
		public CsDb2LUWTableMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsDb2LUWTableMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsDb2LUWTableImplementationCFLabel
		extends CFLabel
	{
		public CsDb2LUWTableImplementationCFLabel() {
			super();
			setText( "CsDb2LUWTableImplementation" );
		}
	}

	protected class CsDb2LUWTableImplementationEditor
		extends CFTextEditor
	{
		public CsDb2LUWTableImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsDb2LUWTableImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsMSSqlTableUsingCFLabel
		extends CFLabel
	{
		public CsMSSqlTableUsingCFLabel() {
			super();
			setText( "CsMSSqlTableUsing" );
		}
	}

	protected class CsMSSqlTableUsingEditor
		extends CFTextEditor
	{
		public CsMSSqlTableUsingEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsMSSqlTableUsing" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsMSSqlTableMembersCFLabel
		extends CFLabel
	{
		public CsMSSqlTableMembersCFLabel() {
			super();
			setText( "CsMSSqlTableMembers" );
		}
	}

	protected class CsMSSqlTableMembersEditor
		extends CFTextEditor
	{
		public CsMSSqlTableMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsMSSqlTableMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsMSSqlTableImplementationCFLabel
		extends CFLabel
	{
		public CsMSSqlTableImplementationCFLabel() {
			super();
			setText( "CsMSSqlTableImplementation" );
		}
	}

	protected class CsMSSqlTableImplementationEditor
		extends CFTextEditor
	{
		public CsMSSqlTableImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsMSSqlTableImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsMySqlTableUsingCFLabel
		extends CFLabel
	{
		public CsMySqlTableUsingCFLabel() {
			super();
			setText( "CsMySqlTableUsing" );
		}
	}

	protected class CsMySqlTableUsingEditor
		extends CFTextEditor
	{
		public CsMySqlTableUsingEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsMySqlTableUsing" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsMySqlTableMembersCFLabel
		extends CFLabel
	{
		public CsMySqlTableMembersCFLabel() {
			super();
			setText( "CsMySqlTableMembers" );
		}
	}

	protected class CsMySqlTableMembersEditor
		extends CFTextEditor
	{
		public CsMySqlTableMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsMySqlTableMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsMySqlTableImplementationCFLabel
		extends CFLabel
	{
		public CsMySqlTableImplementationCFLabel() {
			super();
			setText( "CsMySqlTableImplementation" );
		}
	}

	protected class CsMySqlTableImplementationEditor
		extends CFTextEditor
	{
		public CsMySqlTableImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsMySqlTableImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsOracleTableUsingCFLabel
		extends CFLabel
	{
		public CsOracleTableUsingCFLabel() {
			super();
			setText( "CsOracleTableUsing" );
		}
	}

	protected class CsOracleTableUsingEditor
		extends CFTextEditor
	{
		public CsOracleTableUsingEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsOracleTableUsing" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsOracleTableMembersCFLabel
		extends CFLabel
	{
		public CsOracleTableMembersCFLabel() {
			super();
			setText( "CsOracleTableMembers" );
		}
	}

	protected class CsOracleTableMembersEditor
		extends CFTextEditor
	{
		public CsOracleTableMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsOracleTableMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsOracleTableImplementationCFLabel
		extends CFLabel
	{
		public CsOracleTableImplementationCFLabel() {
			super();
			setText( "CsOracleTableImplementation" );
		}
	}

	protected class CsOracleTableImplementationEditor
		extends CFTextEditor
	{
		public CsOracleTableImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsOracleTableImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsPgSqlTableUsingCFLabel
		extends CFLabel
	{
		public CsPgSqlTableUsingCFLabel() {
			super();
			setText( "CsPgSqlTableUsing" );
		}
	}

	protected class CsPgSqlTableUsingEditor
		extends CFTextEditor
	{
		public CsPgSqlTableUsingEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsPgSqlTableUsing" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsPgSqlTableMembersCFLabel
		extends CFLabel
	{
		public CsPgSqlTableMembersCFLabel() {
			super();
			setText( "CsPgSqlTableMembers" );
		}
	}

	protected class CsPgSqlTableMembersEditor
		extends CFTextEditor
	{
		public CsPgSqlTableMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsPgSqlTableMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsPgSqlTableImplementationCFLabel
		extends CFLabel
	{
		public CsPgSqlTableImplementationCFLabel() {
			super();
			setText( "CsPgSqlTableImplementation" );
		}
	}

	protected class CsPgSqlTableImplementationEditor
		extends CFTextEditor
	{
		public CsPgSqlTableImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsPgSqlTableImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsRamTableUsingCFLabel
		extends CFLabel
	{
		public CsRamTableUsingCFLabel() {
			super();
			setText( "CsRamTableUsing" );
		}
	}

	protected class CsRamTableUsingEditor
		extends CFTextEditor
	{
		public CsRamTableUsingEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsRamTableUsing" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsRamTableMembersCFLabel
		extends CFLabel
	{
		public CsRamTableMembersCFLabel() {
			super();
			setText( "CsRamTableMembers" );
		}
	}

	protected class CsRamTableMembersEditor
		extends CFTextEditor
	{
		public CsRamTableMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsRamTableMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsRamTableImplementationCFLabel
		extends CFLabel
	{
		public CsRamTableImplementationCFLabel() {
			super();
			setText( "CsRamTableImplementation" );
		}
	}

	protected class CsRamTableImplementationEditor
		extends CFTextEditor
	{
		public CsRamTableImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsRamTableImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsSaxLoaderUsingCFLabel
		extends CFLabel
	{
		public CsSaxLoaderUsingCFLabel() {
			super();
			setText( "CsSaxLoaderUsing" );
		}
	}

	protected class CsSaxLoaderUsingEditor
		extends CFTextEditor
	{
		public CsSaxLoaderUsingEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsSaxLoaderUsing" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsSaxLoaderStartElementCFLabel
		extends CFLabel
	{
		public CsSaxLoaderStartElementCFLabel() {
			super();
			setText( "CsSaxLoaderStartElement" );
		}
	}

	protected class CsSaxLoaderStartElementEditor
		extends CFTextEditor
	{
		public CsSaxLoaderStartElementEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsSaxLoaderStartElement" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsSaxLoaderEndElementCFLabel
		extends CFLabel
	{
		public CsSaxLoaderEndElementCFLabel() {
			super();
			setText( "CsSaxLoaderEndElement" );
		}
	}

	protected class CsSaxLoaderEndElementEditor
		extends CFTextEditor
	{
		public CsSaxLoaderEndElementEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsSaxLoaderEndElement" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsXMsgTableUsingCFLabel
		extends CFLabel
	{
		public CsXMsgTableUsingCFLabel() {
			super();
			setText( "CsXMsgTableUsing" );
		}
	}

	protected class CsXMsgTableUsingEditor
		extends CFTextEditor
	{
		public CsXMsgTableUsingEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsXMsgTableUsing" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsXMsgTableFormattersCFLabel
		extends CFLabel
	{
		public CsXMsgTableFormattersCFLabel() {
			super();
			setText( "CsXMsgTableFormatters" );
		}
	}

	protected class CsXMsgTableFormattersEditor
		extends CFTextEditor
	{
		public CsXMsgTableFormattersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsXMsgTableFormatters" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsXMsgRqstTableUsingCFLabel
		extends CFLabel
	{
		public CsXMsgRqstTableUsingCFLabel() {
			super();
			setText( "CsXMsgRqstTableUsing" );
		}
	}

	protected class CsXMsgRqstTableUsingEditor
		extends CFTextEditor
	{
		public CsXMsgRqstTableUsingEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsXMsgRqstTableUsing" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsXMsgRspnTableUsingCFLabel
		extends CFLabel
	{
		public CsXMsgRspnTableUsingCFLabel() {
			super();
			setText( "CsXMsgRspnTableUsing" );
		}
	}

	protected class CsXMsgRspnTableUsingEditor
		extends CFTextEditor
	{
		public CsXMsgRspnTableUsingEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsXMsgRspnTableUsing" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsXMsgClientTableUsingCFLabel
		extends CFLabel
	{
		public CsXMsgClientTableUsingCFLabel() {
			super();
			setText( "CsXMsgClientTableUsing" );
		}
	}

	protected class CsXMsgClientTableUsingEditor
		extends CFTextEditor
	{
		public CsXMsgClientTableUsingEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsXMsgClientTableUsing" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsXMsgRqstTableBodyCFLabel
		extends CFLabel
	{
		public CsXMsgRqstTableBodyCFLabel() {
			super();
			setText( "CsXMsgRqstTableBody" );
		}
	}

	protected class CsXMsgRqstTableBodyEditor
		extends CFTextEditor
	{
		public CsXMsgRqstTableBodyEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsXMsgRqstTableBody" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsXMsgRspnTableBodyCFLabel
		extends CFLabel
	{
		public CsXMsgRspnTableBodyCFLabel() {
			super();
			setText( "CsXMsgRspnTableBody" );
		}
	}

	protected class CsXMsgRspnTableBodyEditor
		extends CFTextEditor
	{
		public CsXMsgRspnTableBodyEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsXMsgRspnTableBody" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsXMsgClientTableBodyCFLabel
		extends CFLabel
	{
		public CsXMsgClientTableBodyCFLabel() {
			super();
			setText( "CsXMsgClientTableBody" );
		}
	}

	protected class CsXMsgClientTableBodyEditor
		extends CFTextEditor
	{
		public CsXMsgClientTableBodyEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsXMsgClientTableBody" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected ICFBamSchemaDefObj javafxLookupDefSchemaObj = null;
	protected DefSchemaCFLabel javafxLabelLookupDefSchema = null;
	protected DefSchemaCFReferenceEditor javafxReferenceLookupDefSchema = null;
	protected ICFBamIndexObj javafxLookupLookupIndexObj = null;
	protected LookupIndexCFLabel javafxLabelLookupLookupIndex = null;
	protected LookupIndexCFReferenceEditor javafxReferenceLookupLookupIndex = null;
	protected ICFBamIndexObj javafxLookupAltIndexObj = null;
	protected AltIndexCFLabel javafxLabelLookupAltIndex = null;
	protected AltIndexCFReferenceEditor javafxReferenceLookupAltIndex = null;
	protected ICFBamTableObj javafxLookupQualTableObj = null;
	protected QualifyingTableCFLabel javafxLabelLookupQualTable = null;
	protected QualifyingTableCFReferenceEditor javafxReferenceLookupQualTable = null;
	protected ICFBamIndexObj javafxLookupPrimaryIndexObj = null;
	protected PrimaryIndexCFLabel javafxLabelLookupPrimaryIndex = null;
	protected PrimaryIndexCFReferenceEditor javafxReferenceLookupPrimaryIndex = null;
	protected IdCFLabel javafxLabelId = null;
	protected IdEditor javafxEditorId = null;
	protected NameCFLabel javafxLabelName = null;
	protected NameEditor javafxEditorName = null;
	protected DbNameCFLabel javafxLabelDbName = null;
	protected DbNameEditor javafxEditorDbName = null;
	protected ShortNameCFLabel javafxLabelShortName = null;
	protected ShortNameEditor javafxEditorShortName = null;
	protected LabelCFLabel javafxLabelLabel = null;
	protected LabelEditor javafxEditorLabel = null;
	protected ShortDescriptionCFLabel javafxLabelShortDescription = null;
	protected ShortDescriptionEditor javafxEditorShortDescription = null;
	protected DescriptionCFLabel javafxLabelDescription = null;
	protected DescriptionEditor javafxEditorDescription = null;
	protected PageDataCFLabel javafxLabelPageData = null;
	protected PageDataEditor javafxEditorPageData = null;
	protected TableClassCodeCFLabel javafxLabelTableClassCode = null;
	protected TableClassCodeEditor javafxEditorTableClassCode = null;
	protected IsInstantiableCFLabel javafxLabelIsInstantiable = null;
	protected IsInstantiableEditor javafxEditorIsInstantiable = null;
	protected HasHistoryCFLabel javafxLabelHasHistory = null;
	protected HasHistoryEditor javafxEditorHasHistory = null;
	protected HasAuditColumnsCFLabel javafxLabelHasAuditColumns = null;
	protected HasAuditColumnsEditor javafxEditorHasAuditColumns = null;
	protected IsMutableCFLabel javafxLabelIsMutable = null;
	protected IsMutableEditor javafxEditorIsMutable = null;
	protected IsServerOnlyCFLabel javafxLabelIsServerOnly = null;
	protected IsServerOnlyEditor javafxEditorIsServerOnly = null;
	protected LoaderBehaviourCFLabel javafxLabelLoaderBehaviour = null;
	protected LoaderBehaviourEditor javafxEditorLoaderBehaviour = null;
	protected SecScopeCFLabel javafxLabelSecScope = null;
	protected SecScopeEditor javafxEditorSecScope = null;
	protected JObjMembersCFLabel javafxLabelJObjMembers = null;
	protected JObjMembersEditor javafxEditorJObjMembers = null;
	protected JObjInterfaceCFLabel javafxLabelJObjInterface = null;
	protected JObjInterfaceEditor javafxEditorJObjInterface = null;
	protected JObjImportCFLabel javafxLabelJObjImport = null;
	protected JObjImportEditor javafxEditorJObjImport = null;
	protected JObjImplementationCFLabel javafxLabelJObjImplementation = null;
	protected JObjImplementationEditor javafxEditorJObjImplementation = null;
	protected JEditObjMembersCFLabel javafxLabelJEditObjMembers = null;
	protected JEditObjMembersEditor javafxEditorJEditObjMembers = null;
	protected JEditObjInterfaceCFLabel javafxLabelJEditObjInterface = null;
	protected JEditObjInterfaceEditor javafxEditorJEditObjInterface = null;
	protected JEditObjImportCFLabel javafxLabelJEditObjImport = null;
	protected JEditObjImportEditor javafxEditorJEditObjImport = null;
	protected JEditObjImplementationCFLabel javafxLabelJEditObjImplementation = null;
	protected JEditObjImplementationEditor javafxEditorJEditObjImplementation = null;
	protected JTableImportCFLabel javafxLabelJTableImport = null;
	protected JTableImportEditor javafxEditorJTableImport = null;
	protected JTableMembersCFLabel javafxLabelJTableMembers = null;
	protected JTableMembersEditor javafxEditorJTableMembers = null;
	protected JTableInterfaceCFLabel javafxLabelJTableInterface = null;
	protected JTableInterfaceEditor javafxEditorJTableInterface = null;
	protected JTableImplementationCFLabel javafxLabelJTableImplementation = null;
	protected JTableImplementationEditor javafxEditorJTableImplementation = null;
	protected JTableObjImportCFLabel javafxLabelJTableObjImport = null;
	protected JTableObjImportEditor javafxEditorJTableObjImport = null;
	protected JTableObjMembersCFLabel javafxLabelJTableObjMembers = null;
	protected JTableObjMembersEditor javafxEditorJTableObjMembers = null;
	protected JTableObjInterfaceCFLabel javafxLabelJTableObjInterface = null;
	protected JTableObjInterfaceEditor javafxEditorJTableObjInterface = null;
	protected JTableObjImplementationCFLabel javafxLabelJTableObjImplementation = null;
	protected JTableObjImplementationEditor javafxEditorJTableObjImplementation = null;
	protected JDb2LUWTableImportCFLabel javafxLabelJDb2LUWTableImport = null;
	protected JDb2LUWTableImportEditor javafxEditorJDb2LUWTableImport = null;
	protected JDb2LUWTableMembersCFLabel javafxLabelJDb2LUWTableMembers = null;
	protected JDb2LUWTableMembersEditor javafxEditorJDb2LUWTableMembers = null;
	protected JDb2LUWTableImplementationCFLabel javafxLabelJDb2LUWTableImplementation = null;
	protected JDb2LUWTableImplementationEditor javafxEditorJDb2LUWTableImplementation = null;
	protected JMSSqlTableImportCFLabel javafxLabelJMSSqlTableImport = null;
	protected JMSSqlTableImportEditor javafxEditorJMSSqlTableImport = null;
	protected JMSSqlTableMembersCFLabel javafxLabelJMSSqlTableMembers = null;
	protected JMSSqlTableMembersEditor javafxEditorJMSSqlTableMembers = null;
	protected JMSSqlTableImplementationCFLabel javafxLabelJMSSqlTableImplementation = null;
	protected JMSSqlTableImplementationEditor javafxEditorJMSSqlTableImplementation = null;
	protected JMySqlTableImportCFLabel javafxLabelJMySqlTableImport = null;
	protected JMySqlTableImportEditor javafxEditorJMySqlTableImport = null;
	protected JMySqlTableMembersCFLabel javafxLabelJMySqlTableMembers = null;
	protected JMySqlTableMembersEditor javafxEditorJMySqlTableMembers = null;
	protected JMySqlTableImplementationCFLabel javafxLabelJMySqlTableImplementation = null;
	protected JMySqlTableImplementationEditor javafxEditorJMySqlTableImplementation = null;
	protected JOracleTableImportCFLabel javafxLabelJOracleTableImport = null;
	protected JOracleTableImportEditor javafxEditorJOracleTableImport = null;
	protected JOracleTableMembersCFLabel javafxLabelJOracleTableMembers = null;
	protected JOracleTableMembersEditor javafxEditorJOracleTableMembers = null;
	protected JOracleTableImplementationCFLabel javafxLabelJOracleTableImplementation = null;
	protected JOracleTableImplementationEditor javafxEditorJOracleTableImplementation = null;
	protected JPgSqlTableImportCFLabel javafxLabelJPgSqlTableImport = null;
	protected JPgSqlTableImportEditor javafxEditorJPgSqlTableImport = null;
	protected JPgSqlTableMembersCFLabel javafxLabelJPgSqlTableMembers = null;
	protected JPgSqlTableMembersEditor javafxEditorJPgSqlTableMembers = null;
	protected JPgSqlTableImplementationCFLabel javafxLabelJPgSqlTableImplementation = null;
	protected JPgSqlTableImplementationEditor javafxEditorJPgSqlTableImplementation = null;
	protected JRamTableImportCFLabel javafxLabelJRamTableImport = null;
	protected JRamTableImportEditor javafxEditorJRamTableImport = null;
	protected JRamTableMembersCFLabel javafxLabelJRamTableMembers = null;
	protected JRamTableMembersEditor javafxEditorJRamTableMembers = null;
	protected JRamTableImplementationCFLabel javafxLabelJRamTableImplementation = null;
	protected JRamTableImplementationEditor javafxEditorJRamTableImplementation = null;
	protected JSaxLoaderImportCFLabel javafxLabelJSaxLoaderImport = null;
	protected JSaxLoaderImportEditor javafxEditorJSaxLoaderImport = null;
	protected JSaxLoaderStartElementCFLabel javafxLabelJSaxLoaderStartElement = null;
	protected JSaxLoaderStartElementEditor javafxEditorJSaxLoaderStartElement = null;
	protected JSaxLoaderEndElementCFLabel javafxLabelJSaxLoaderEndElement = null;
	protected JSaxLoaderEndElementEditor javafxEditorJSaxLoaderEndElement = null;
	protected JXMsgTableImportCFLabel javafxLabelJXMsgTableImport = null;
	protected JXMsgTableImportEditor javafxEditorJXMsgTableImport = null;
	protected JXMsgTableFormattersCFLabel javafxLabelJXMsgTableFormatters = null;
	protected JXMsgTableFormattersEditor javafxEditorJXMsgTableFormatters = null;
	protected JXMsgRqstTableImportCFLabel javafxLabelJXMsgRqstTableImport = null;
	protected JXMsgRqstTableImportEditor javafxEditorJXMsgRqstTableImport = null;
	protected JXMsgRspnTableImportCFLabel javafxLabelJXMsgRspnTableImport = null;
	protected JXMsgRspnTableImportEditor javafxEditorJXMsgRspnTableImport = null;
	protected JXMsgClientTableImportCFLabel javafxLabelJXMsgClientTableImport = null;
	protected JXMsgClientTableImportEditor javafxEditorJXMsgClientTableImport = null;
	protected JXMsgRqstTableBodyCFLabel javafxLabelJXMsgRqstTableBody = null;
	protected JXMsgRqstTableBodyEditor javafxEditorJXMsgRqstTableBody = null;
	protected JXMsgRspnTableBodyCFLabel javafxLabelJXMsgRspnTableBody = null;
	protected JXMsgRspnTableBodyEditor javafxEditorJXMsgRspnTableBody = null;
	protected JXMsgClientTableBodyCFLabel javafxLabelJXMsgClientTableBody = null;
	protected JXMsgClientTableBodyEditor javafxEditorJXMsgClientTableBody = null;
	protected CppObjMembersCFLabel javafxLabelCppObjMembers = null;
	protected CppObjMembersEditor javafxEditorCppObjMembers = null;
	protected CppObjInterfaceCFLabel javafxLabelCppObjInterface = null;
	protected CppObjInterfaceEditor javafxEditorCppObjInterface = null;
	protected CppObjIncludeCFLabel javafxLabelCppObjInclude = null;
	protected CppObjIncludeEditor javafxEditorCppObjInclude = null;
	protected CppObjImplementationCFLabel javafxLabelCppObjImplementation = null;
	protected CppObjImplementationEditor javafxEditorCppObjImplementation = null;
	protected CppEditObjMembersCFLabel javafxLabelCppEditObjMembers = null;
	protected CppEditObjMembersEditor javafxEditorCppEditObjMembers = null;
	protected CppEditObjInterfaceCFLabel javafxLabelCppEditObjInterface = null;
	protected CppEditObjInterfaceEditor javafxEditorCppEditObjInterface = null;
	protected CppEditObjIncludeCFLabel javafxLabelCppEditObjInclude = null;
	protected CppEditObjIncludeEditor javafxEditorCppEditObjInclude = null;
	protected CppEditObjImplementationCFLabel javafxLabelCppEditObjImplementation = null;
	protected CppEditObjImplementationEditor javafxEditorCppEditObjImplementation = null;
	protected CppTableIncludeCFLabel javafxLabelCppTableInclude = null;
	protected CppTableIncludeEditor javafxEditorCppTableInclude = null;
	protected CppTableMembersCFLabel javafxLabelCppTableMembers = null;
	protected CppTableMembersEditor javafxEditorCppTableMembers = null;
	protected CppTableInterfaceCFLabel javafxLabelCppTableInterface = null;
	protected CppTableInterfaceEditor javafxEditorCppTableInterface = null;
	protected CppTableImplementationCFLabel javafxLabelCppTableImplementation = null;
	protected CppTableImplementationEditor javafxEditorCppTableImplementation = null;
	protected CppTableObjIncludeCFLabel javafxLabelCppTableObjInclude = null;
	protected CppTableObjIncludeEditor javafxEditorCppTableObjInclude = null;
	protected CppTableObjMembersCFLabel javafxLabelCppTableObjMembers = null;
	protected CppTableObjMembersEditor javafxEditorCppTableObjMembers = null;
	protected CppTableObjInterfaceCFLabel javafxLabelCppTableObjInterface = null;
	protected CppTableObjInterfaceEditor javafxEditorCppTableObjInterface = null;
	protected CppTableObjImplementationCFLabel javafxLabelCppTableObjImplementation = null;
	protected CppTableObjImplementationEditor javafxEditorCppTableObjImplementation = null;
	protected CppDb2LUWTableIncludeCFLabel javafxLabelCppDb2LUWTableInclude = null;
	protected CppDb2LUWTableIncludeEditor javafxEditorCppDb2LUWTableInclude = null;
	protected CppDb2LUWTableMembersCFLabel javafxLabelCppDb2LUWTableMembers = null;
	protected CppDb2LUWTableMembersEditor javafxEditorCppDb2LUWTableMembers = null;
	protected CppDb2LUWTableImplementationCFLabel javafxLabelCppDb2LUWTableImplementation = null;
	protected CppDb2LUWTableImplementationEditor javafxEditorCppDb2LUWTableImplementation = null;
	protected CppMSSqlTableIncludeCFLabel javafxLabelCppMSSqlTableInclude = null;
	protected CppMSSqlTableIncludeEditor javafxEditorCppMSSqlTableInclude = null;
	protected CppMSSqlTableMembersCFLabel javafxLabelCppMSSqlTableMembers = null;
	protected CppMSSqlTableMembersEditor javafxEditorCppMSSqlTableMembers = null;
	protected CppMSSqlTableImplementationCFLabel javafxLabelCppMSSqlTableImplementation = null;
	protected CppMSSqlTableImplementationEditor javafxEditorCppMSSqlTableImplementation = null;
	protected CppMySqlTableIncludeCFLabel javafxLabelCppMySqlTableInclude = null;
	protected CppMySqlTableIncludeEditor javafxEditorCppMySqlTableInclude = null;
	protected CppMySqlTableMembersCFLabel javafxLabelCppMySqlTableMembers = null;
	protected CppMySqlTableMembersEditor javafxEditorCppMySqlTableMembers = null;
	protected CppMySqlTableImplementationCFLabel javafxLabelCppMySqlTableImplementation = null;
	protected CppMySqlTableImplementationEditor javafxEditorCppMySqlTableImplementation = null;
	protected CppOracleTableIncludeCFLabel javafxLabelCppOracleTableInclude = null;
	protected CppOracleTableIncludeEditor javafxEditorCppOracleTableInclude = null;
	protected CppOracleTableMembersCFLabel javafxLabelCppOracleTableMembers = null;
	protected CppOracleTableMembersEditor javafxEditorCppOracleTableMembers = null;
	protected CppOracleTableImplementationCFLabel javafxLabelCppOracleTableImplementation = null;
	protected CppOracleTableImplementationEditor javafxEditorCppOracleTableImplementation = null;
	protected CppPgSqlTableIncludeCFLabel javafxLabelCppPgSqlTableInclude = null;
	protected CppPgSqlTableIncludeEditor javafxEditorCppPgSqlTableInclude = null;
	protected CppPgSqlTableMembersCFLabel javafxLabelCppPgSqlTableMembers = null;
	protected CppPgSqlTableMembersEditor javafxEditorCppPgSqlTableMembers = null;
	protected CppPgSqlTableImplementationCFLabel javafxLabelCppPgSqlTableImplementation = null;
	protected CppPgSqlTableImplementationEditor javafxEditorCppPgSqlTableImplementation = null;
	protected CppRamTableIncludeCFLabel javafxLabelCppRamTableInclude = null;
	protected CppRamTableIncludeEditor javafxEditorCppRamTableInclude = null;
	protected CppRamTableMembersCFLabel javafxLabelCppRamTableMembers = null;
	protected CppRamTableMembersEditor javafxEditorCppRamTableMembers = null;
	protected CppRamTableImplementationCFLabel javafxLabelCppRamTableImplementation = null;
	protected CppRamTableImplementationEditor javafxEditorCppRamTableImplementation = null;
	protected CppSaxLoaderIncludeCFLabel javafxLabelCppSaxLoaderInclude = null;
	protected CppSaxLoaderIncludeEditor javafxEditorCppSaxLoaderInclude = null;
	protected CppSaxLoaderStartElementCFLabel javafxLabelCppSaxLoaderStartElement = null;
	protected CppSaxLoaderStartElementEditor javafxEditorCppSaxLoaderStartElement = null;
	protected CppSaxLoaderEndElementCFLabel javafxLabelCppSaxLoaderEndElement = null;
	protected CppSaxLoaderEndElementEditor javafxEditorCppSaxLoaderEndElement = null;
	protected CppXMsgTableIncludeCFLabel javafxLabelCppXMsgTableInclude = null;
	protected CppXMsgTableIncludeEditor javafxEditorCppXMsgTableInclude = null;
	protected CppXMsgTableFormattersCFLabel javafxLabelCppXMsgTableFormatters = null;
	protected CppXMsgTableFormattersEditor javafxEditorCppXMsgTableFormatters = null;
	protected CppXMsgRqstTableIncludeCFLabel javafxLabelCppXMsgRqstTableInclude = null;
	protected CppXMsgRqstTableIncludeEditor javafxEditorCppXMsgRqstTableInclude = null;
	protected CppXMsgRspnTableIncludeCFLabel javafxLabelCppXMsgRspnTableInclude = null;
	protected CppXMsgRspnTableIncludeEditor javafxEditorCppXMsgRspnTableInclude = null;
	protected CppXMsgClientTableIncludeCFLabel javafxLabelCppXMsgClientTableInclude = null;
	protected CppXMsgClientTableIncludeEditor javafxEditorCppXMsgClientTableInclude = null;
	protected CppXMsgRqstTableBodyCFLabel javafxLabelCppXMsgRqstTableBody = null;
	protected CppXMsgRqstTableBodyEditor javafxEditorCppXMsgRqstTableBody = null;
	protected CppXMsgRspnTableBodyCFLabel javafxLabelCppXMsgRspnTableBody = null;
	protected CppXMsgRspnTableBodyEditor javafxEditorCppXMsgRspnTableBody = null;
	protected CppXMsgClientTableBodyCFLabel javafxLabelCppXMsgClientTableBody = null;
	protected CppXMsgClientTableBodyEditor javafxEditorCppXMsgClientTableBody = null;
	protected HppObjMembersCFLabel javafxLabelHppObjMembers = null;
	protected HppObjMembersEditor javafxEditorHppObjMembers = null;
	protected HppObjInterfaceCFLabel javafxLabelHppObjInterface = null;
	protected HppObjInterfaceEditor javafxEditorHppObjInterface = null;
	protected HppObjIncludeCFLabel javafxLabelHppObjInclude = null;
	protected HppObjIncludeEditor javafxEditorHppObjInclude = null;
	protected HppObjImplementationCFLabel javafxLabelHppObjImplementation = null;
	protected HppObjImplementationEditor javafxEditorHppObjImplementation = null;
	protected HppEditObjMembersCFLabel javafxLabelHppEditObjMembers = null;
	protected HppEditObjMembersEditor javafxEditorHppEditObjMembers = null;
	protected HppEditObjInterfaceCFLabel javafxLabelHppEditObjInterface = null;
	protected HppEditObjInterfaceEditor javafxEditorHppEditObjInterface = null;
	protected HppEditObjIncludeCFLabel javafxLabelHppEditObjInclude = null;
	protected HppEditObjIncludeEditor javafxEditorHppEditObjInclude = null;
	protected HppEditObjImplementationCFLabel javafxLabelHppEditObjImplementation = null;
	protected HppEditObjImplementationEditor javafxEditorHppEditObjImplementation = null;
	protected HppTableIncludeCFLabel javafxLabelHppTableInclude = null;
	protected HppTableIncludeEditor javafxEditorHppTableInclude = null;
	protected HppTableMembersCFLabel javafxLabelHppTableMembers = null;
	protected HppTableMembersEditor javafxEditorHppTableMembers = null;
	protected HppTableInterfaceCFLabel javafxLabelHppTableInterface = null;
	protected HppTableInterfaceEditor javafxEditorHppTableInterface = null;
	protected HppTableImplementationCFLabel javafxLabelHppTableImplementation = null;
	protected HppTableImplementationEditor javafxEditorHppTableImplementation = null;
	protected HppTableObjIncludeCFLabel javafxLabelHppTableObjInclude = null;
	protected HppTableObjIncludeEditor javafxEditorHppTableObjInclude = null;
	protected HppTableObjMembersCFLabel javafxLabelHppTableObjMembers = null;
	protected HppTableObjMembersEditor javafxEditorHppTableObjMembers = null;
	protected HppTableObjInterfaceCFLabel javafxLabelHppTableObjInterface = null;
	protected HppTableObjInterfaceEditor javafxEditorHppTableObjInterface = null;
	protected HppTableObjImplementationCFLabel javafxLabelHppTableObjImplementation = null;
	protected HppTableObjImplementationEditor javafxEditorHppTableObjImplementation = null;
	protected HppDb2LUWTableIncludeCFLabel javafxLabelHppDb2LUWTableInclude = null;
	protected HppDb2LUWTableIncludeEditor javafxEditorHppDb2LUWTableInclude = null;
	protected HppDb2LUWTableMembersCFLabel javafxLabelHppDb2LUWTableMembers = null;
	protected HppDb2LUWTableMembersEditor javafxEditorHppDb2LUWTableMembers = null;
	protected HppDb2LUWTableImplementationCFLabel javafxLabelHppDb2LUWTableImplementation = null;
	protected HppDb2LUWTableImplementationEditor javafxEditorHppDb2LUWTableImplementation = null;
	protected HppMSSqlTableIncludeCFLabel javafxLabelHppMSSqlTableInclude = null;
	protected HppMSSqlTableIncludeEditor javafxEditorHppMSSqlTableInclude = null;
	protected HppMSSqlTableMembersCFLabel javafxLabelHppMSSqlTableMembers = null;
	protected HppMSSqlTableMembersEditor javafxEditorHppMSSqlTableMembers = null;
	protected HppMSSqlTableImplementationCFLabel javafxLabelHppMSSqlTableImplementation = null;
	protected HppMSSqlTableImplementationEditor javafxEditorHppMSSqlTableImplementation = null;
	protected HppMySqlTableIncludeCFLabel javafxLabelHppMySqlTableInclude = null;
	protected HppMySqlTableIncludeEditor javafxEditorHppMySqlTableInclude = null;
	protected HppMySqlTableMembersCFLabel javafxLabelHppMySqlTableMembers = null;
	protected HppMySqlTableMembersEditor javafxEditorHppMySqlTableMembers = null;
	protected HppMySqlTableImplementationCFLabel javafxLabelHppMySqlTableImplementation = null;
	protected HppMySqlTableImplementationEditor javafxEditorHppMySqlTableImplementation = null;
	protected HppOracleTableIncludeCFLabel javafxLabelHppOracleTableInclude = null;
	protected HppOracleTableIncludeEditor javafxEditorHppOracleTableInclude = null;
	protected HppOracleTableMembersCFLabel javafxLabelHppOracleTableMembers = null;
	protected HppOracleTableMembersEditor javafxEditorHppOracleTableMembers = null;
	protected HppOracleTableImplementationCFLabel javafxLabelHppOracleTableImplementation = null;
	protected HppOracleTableImplementationEditor javafxEditorHppOracleTableImplementation = null;
	protected HppPgSqlTableIncludeCFLabel javafxLabelHppPgSqlTableInclude = null;
	protected HppPgSqlTableIncludeEditor javafxEditorHppPgSqlTableInclude = null;
	protected HppPgSqlTableMembersCFLabel javafxLabelHppPgSqlTableMembers = null;
	protected HppPgSqlTableMembersEditor javafxEditorHppPgSqlTableMembers = null;
	protected HppPgSqlTableImplementationCFLabel javafxLabelHppPgSqlTableImplementation = null;
	protected HppPgSqlTableImplementationEditor javafxEditorHppPgSqlTableImplementation = null;
	protected HppRamTableIncludeCFLabel javafxLabelHppRamTableInclude = null;
	protected HppRamTableIncludeEditor javafxEditorHppRamTableInclude = null;
	protected HppRamTableMembersCFLabel javafxLabelHppRamTableMembers = null;
	protected HppRamTableMembersEditor javafxEditorHppRamTableMembers = null;
	protected HppRamTableImplementationCFLabel javafxLabelHppRamTableImplementation = null;
	protected HppRamTableImplementationEditor javafxEditorHppRamTableImplementation = null;
	protected HppSaxLoaderIncludeCFLabel javafxLabelHppSaxLoaderInclude = null;
	protected HppSaxLoaderIncludeEditor javafxEditorHppSaxLoaderInclude = null;
	protected HppSaxLoaderStartElementCFLabel javafxLabelHppSaxLoaderStartElement = null;
	protected HppSaxLoaderStartElementEditor javafxEditorHppSaxLoaderStartElement = null;
	protected HppSaxLoaderEndElementCFLabel javafxLabelHppSaxLoaderEndElement = null;
	protected HppSaxLoaderEndElementEditor javafxEditorHppSaxLoaderEndElement = null;
	protected HppXMsgTableIncludeCFLabel javafxLabelHppXMsgTableInclude = null;
	protected HppXMsgTableIncludeEditor javafxEditorHppXMsgTableInclude = null;
	protected HppXMsgTableFormattersCFLabel javafxLabelHppXMsgTableFormatters = null;
	protected HppXMsgTableFormattersEditor javafxEditorHppXMsgTableFormatters = null;
	protected HppXMsgRqstTableIncludeCFLabel javafxLabelHppXMsgRqstTableInclude = null;
	protected HppXMsgRqstTableIncludeEditor javafxEditorHppXMsgRqstTableInclude = null;
	protected HppXMsgRspnTableIncludeCFLabel javafxLabelHppXMsgRspnTableInclude = null;
	protected HppXMsgRspnTableIncludeEditor javafxEditorHppXMsgRspnTableInclude = null;
	protected HppXMsgClientTableIncludeCFLabel javafxLabelHppXMsgClientTableInclude = null;
	protected HppXMsgClientTableIncludeEditor javafxEditorHppXMsgClientTableInclude = null;
	protected HppXMsgRqstTableBodyCFLabel javafxLabelHppXMsgRqstTableBody = null;
	protected HppXMsgRqstTableBodyEditor javafxEditorHppXMsgRqstTableBody = null;
	protected HppXMsgRspnTableBodyCFLabel javafxLabelHppXMsgRspnTableBody = null;
	protected HppXMsgRspnTableBodyEditor javafxEditorHppXMsgRspnTableBody = null;
	protected HppXMsgClientTableBodyCFLabel javafxLabelHppXMsgClientTableBody = null;
	protected HppXMsgClientTableBodyEditor javafxEditorHppXMsgClientTableBody = null;
	protected CsObjMembersCFLabel javafxLabelCsObjMembers = null;
	protected CsObjMembersEditor javafxEditorCsObjMembers = null;
	protected CsObjInterfaceCFLabel javafxLabelCsObjInterface = null;
	protected CsObjInterfaceEditor javafxEditorCsObjInterface = null;
	protected CsObjUsingCFLabel javafxLabelCsObjUsing = null;
	protected CsObjUsingEditor javafxEditorCsObjUsing = null;
	protected CsObjImplementationCFLabel javafxLabelCsObjImplementation = null;
	protected CsObjImplementationEditor javafxEditorCsObjImplementation = null;
	protected CsEditObjMembersCFLabel javafxLabelCsEditObjMembers = null;
	protected CsEditObjMembersEditor javafxEditorCsEditObjMembers = null;
	protected CsEditObjInterfaceCFLabel javafxLabelCsEditObjInterface = null;
	protected CsEditObjInterfaceEditor javafxEditorCsEditObjInterface = null;
	protected CsEditObjUsingCFLabel javafxLabelCsEditObjUsing = null;
	protected CsEditObjUsingEditor javafxEditorCsEditObjUsing = null;
	protected CsEditObjImplementationCFLabel javafxLabelCsEditObjImplementation = null;
	protected CsEditObjImplementationEditor javafxEditorCsEditObjImplementation = null;
	protected CsTableUsingCFLabel javafxLabelCsTableUsing = null;
	protected CsTableUsingEditor javafxEditorCsTableUsing = null;
	protected CsTableMembersCFLabel javafxLabelCsTableMembers = null;
	protected CsTableMembersEditor javafxEditorCsTableMembers = null;
	protected CsTableInterfaceCFLabel javafxLabelCsTableInterface = null;
	protected CsTableInterfaceEditor javafxEditorCsTableInterface = null;
	protected CsTableImplementationCFLabel javafxLabelCsTableImplementation = null;
	protected CsTableImplementationEditor javafxEditorCsTableImplementation = null;
	protected CsTableObjUsingCFLabel javafxLabelCsTableObjUsing = null;
	protected CsTableObjUsingEditor javafxEditorCsTableObjUsing = null;
	protected CsTableObjMembersCFLabel javafxLabelCsTableObjMembers = null;
	protected CsTableObjMembersEditor javafxEditorCsTableObjMembers = null;
	protected CsTableObjInterfaceCFLabel javafxLabelCsTableObjInterface = null;
	protected CsTableObjInterfaceEditor javafxEditorCsTableObjInterface = null;
	protected CsTableObjImplementationCFLabel javafxLabelCsTableObjImplementation = null;
	protected CsTableObjImplementationEditor javafxEditorCsTableObjImplementation = null;
	protected CsDb2LUWTableUsingCFLabel javafxLabelCsDb2LUWTableUsing = null;
	protected CsDb2LUWTableUsingEditor javafxEditorCsDb2LUWTableUsing = null;
	protected CsDb2LUWTableMembersCFLabel javafxLabelCsDb2LUWTableMembers = null;
	protected CsDb2LUWTableMembersEditor javafxEditorCsDb2LUWTableMembers = null;
	protected CsDb2LUWTableImplementationCFLabel javafxLabelCsDb2LUWTableImplementation = null;
	protected CsDb2LUWTableImplementationEditor javafxEditorCsDb2LUWTableImplementation = null;
	protected CsMSSqlTableUsingCFLabel javafxLabelCsMSSqlTableUsing = null;
	protected CsMSSqlTableUsingEditor javafxEditorCsMSSqlTableUsing = null;
	protected CsMSSqlTableMembersCFLabel javafxLabelCsMSSqlTableMembers = null;
	protected CsMSSqlTableMembersEditor javafxEditorCsMSSqlTableMembers = null;
	protected CsMSSqlTableImplementationCFLabel javafxLabelCsMSSqlTableImplementation = null;
	protected CsMSSqlTableImplementationEditor javafxEditorCsMSSqlTableImplementation = null;
	protected CsMySqlTableUsingCFLabel javafxLabelCsMySqlTableUsing = null;
	protected CsMySqlTableUsingEditor javafxEditorCsMySqlTableUsing = null;
	protected CsMySqlTableMembersCFLabel javafxLabelCsMySqlTableMembers = null;
	protected CsMySqlTableMembersEditor javafxEditorCsMySqlTableMembers = null;
	protected CsMySqlTableImplementationCFLabel javafxLabelCsMySqlTableImplementation = null;
	protected CsMySqlTableImplementationEditor javafxEditorCsMySqlTableImplementation = null;
	protected CsOracleTableUsingCFLabel javafxLabelCsOracleTableUsing = null;
	protected CsOracleTableUsingEditor javafxEditorCsOracleTableUsing = null;
	protected CsOracleTableMembersCFLabel javafxLabelCsOracleTableMembers = null;
	protected CsOracleTableMembersEditor javafxEditorCsOracleTableMembers = null;
	protected CsOracleTableImplementationCFLabel javafxLabelCsOracleTableImplementation = null;
	protected CsOracleTableImplementationEditor javafxEditorCsOracleTableImplementation = null;
	protected CsPgSqlTableUsingCFLabel javafxLabelCsPgSqlTableUsing = null;
	protected CsPgSqlTableUsingEditor javafxEditorCsPgSqlTableUsing = null;
	protected CsPgSqlTableMembersCFLabel javafxLabelCsPgSqlTableMembers = null;
	protected CsPgSqlTableMembersEditor javafxEditorCsPgSqlTableMembers = null;
	protected CsPgSqlTableImplementationCFLabel javafxLabelCsPgSqlTableImplementation = null;
	protected CsPgSqlTableImplementationEditor javafxEditorCsPgSqlTableImplementation = null;
	protected CsRamTableUsingCFLabel javafxLabelCsRamTableUsing = null;
	protected CsRamTableUsingEditor javafxEditorCsRamTableUsing = null;
	protected CsRamTableMembersCFLabel javafxLabelCsRamTableMembers = null;
	protected CsRamTableMembersEditor javafxEditorCsRamTableMembers = null;
	protected CsRamTableImplementationCFLabel javafxLabelCsRamTableImplementation = null;
	protected CsRamTableImplementationEditor javafxEditorCsRamTableImplementation = null;
	protected CsSaxLoaderUsingCFLabel javafxLabelCsSaxLoaderUsing = null;
	protected CsSaxLoaderUsingEditor javafxEditorCsSaxLoaderUsing = null;
	protected CsSaxLoaderStartElementCFLabel javafxLabelCsSaxLoaderStartElement = null;
	protected CsSaxLoaderStartElementEditor javafxEditorCsSaxLoaderStartElement = null;
	protected CsSaxLoaderEndElementCFLabel javafxLabelCsSaxLoaderEndElement = null;
	protected CsSaxLoaderEndElementEditor javafxEditorCsSaxLoaderEndElement = null;
	protected CsXMsgTableUsingCFLabel javafxLabelCsXMsgTableUsing = null;
	protected CsXMsgTableUsingEditor javafxEditorCsXMsgTableUsing = null;
	protected CsXMsgTableFormattersCFLabel javafxLabelCsXMsgTableFormatters = null;
	protected CsXMsgTableFormattersEditor javafxEditorCsXMsgTableFormatters = null;
	protected CsXMsgRqstTableUsingCFLabel javafxLabelCsXMsgRqstTableUsing = null;
	protected CsXMsgRqstTableUsingEditor javafxEditorCsXMsgRqstTableUsing = null;
	protected CsXMsgRspnTableUsingCFLabel javafxLabelCsXMsgRspnTableUsing = null;
	protected CsXMsgRspnTableUsingEditor javafxEditorCsXMsgRspnTableUsing = null;
	protected CsXMsgClientTableUsingCFLabel javafxLabelCsXMsgClientTableUsing = null;
	protected CsXMsgClientTableUsingEditor javafxEditorCsXMsgClientTableUsing = null;
	protected CsXMsgRqstTableBodyCFLabel javafxLabelCsXMsgRqstTableBody = null;
	protected CsXMsgRqstTableBodyEditor javafxEditorCsXMsgRqstTableBody = null;
	protected CsXMsgRspnTableBodyCFLabel javafxLabelCsXMsgRspnTableBody = null;
	protected CsXMsgRspnTableBodyEditor javafxEditorCsXMsgRspnTableBody = null;
	protected CsXMsgClientTableBodyCFLabel javafxLabelCsXMsgClientTableBody = null;
	protected CsXMsgClientTableBodyEditor javafxEditorCsXMsgClientTableBody = null;

	public CFBamJavaFXTableAttrPane( ICFFormManager formManager, ICFBamJavaFXSchema argSchema, ICFBamTableObj argFocus ) {
		super();
		Control ctrl;
		CFLabel label;
		CFReferenceEditor reference;
		final String S_ProcName = "construct-schema-focus";
		if( formManager == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"formManager" );
		}
		cfFormManager = formManager;
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				2,
				"argSchema" );
		}
		// argFocus is optional; focus may be set later during execution as
		// conditions of the runtime change.
		javafxSchema = argSchema;
		setJavaFXFocusAsTable( argFocus );
		setPadding( new Insets(5) );
		setHgap( 5 );
		setVgap( 5 );
		setAlignment( Pos.CENTER );
		ColumnConstraints column1 = new ColumnConstraints();
		column1.setPercentWidth( 100 );
		getColumnConstraints().addAll( column1 );
		int gridRow = 0;
		label = getJavaFXLabelLookupDefSchema();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		reference = getJavaFXReferenceLookupDefSchema();
		setHalignment( reference, HPos.LEFT );
		add( reference, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelLookupLookupIndex();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		reference = getJavaFXReferenceLookupLookupIndex();
		setHalignment( reference, HPos.LEFT );
		add( reference, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelLookupAltIndex();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		reference = getJavaFXReferenceLookupAltIndex();
		setHalignment( reference, HPos.LEFT );
		add( reference, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelLookupQualTable();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		reference = getJavaFXReferenceLookupQualTable();
		setHalignment( reference, HPos.LEFT );
		add( reference, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelLookupPrimaryIndex();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		reference = getJavaFXReferenceLookupPrimaryIndex();
		setHalignment( reference, HPos.LEFT );
		add( reference, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelId();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorId();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelName();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorName();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelDbName();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorDbName();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelShortName();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorShortName();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelLabel();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorLabel();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelShortDescription();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorShortDescription();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelDescription();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorDescription();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelPageData();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorPageData();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelTableClassCode();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorTableClassCode();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelIsInstantiable();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorIsInstantiable();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHasHistory();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHasHistory();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHasAuditColumns();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHasAuditColumns();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelIsMutable();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorIsMutable();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelIsServerOnly();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorIsServerOnly();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelLoaderBehaviour();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorLoaderBehaviour();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelSecScope();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorSecScope();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJObjInterface();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJObjInterface();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJObjImport();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJObjImport();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJObjImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJObjImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJEditObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJEditObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJEditObjInterface();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJEditObjInterface();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJEditObjImport();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJEditObjImport();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJEditObjImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJEditObjImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJTableImport();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJTableImport();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJTableMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJTableMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJTableInterface();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJTableInterface();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJTableImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJTableImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJTableObjImport();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJTableObjImport();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJTableObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJTableObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJTableObjInterface();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJTableObjInterface();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJTableObjImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJTableObjImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJDb2LUWTableImport();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJDb2LUWTableImport();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJDb2LUWTableMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJDb2LUWTableMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJDb2LUWTableImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJDb2LUWTableImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJMSSqlTableImport();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJMSSqlTableImport();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJMSSqlTableMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJMSSqlTableMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJMSSqlTableImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJMSSqlTableImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJMySqlTableImport();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJMySqlTableImport();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJMySqlTableMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJMySqlTableMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJMySqlTableImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJMySqlTableImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJOracleTableImport();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJOracleTableImport();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJOracleTableMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJOracleTableMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJOracleTableImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJOracleTableImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJPgSqlTableImport();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJPgSqlTableImport();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJPgSqlTableMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJPgSqlTableMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJPgSqlTableImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJPgSqlTableImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJRamTableImport();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJRamTableImport();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJRamTableMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJRamTableMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJRamTableImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJRamTableImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJSaxLoaderImport();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJSaxLoaderImport();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJSaxLoaderStartElement();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJSaxLoaderStartElement();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJSaxLoaderEndElement();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJSaxLoaderEndElement();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJXMsgTableImport();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJXMsgTableImport();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJXMsgTableFormatters();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJXMsgTableFormatters();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJXMsgRqstTableImport();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJXMsgRqstTableImport();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJXMsgRspnTableImport();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJXMsgRspnTableImport();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJXMsgClientTableImport();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJXMsgClientTableImport();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJXMsgRqstTableBody();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJXMsgRqstTableBody();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJXMsgRspnTableBody();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJXMsgRspnTableBody();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJXMsgClientTableBody();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJXMsgClientTableBody();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppObjInterface();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppObjInterface();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppObjInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppObjInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppObjImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppObjImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppEditObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppEditObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppEditObjInterface();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppEditObjInterface();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppEditObjInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppEditObjInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppEditObjImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppEditObjImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppTableInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppTableInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppTableMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppTableMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppTableInterface();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppTableInterface();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppTableImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppTableImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppTableObjInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppTableObjInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppTableObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppTableObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppTableObjInterface();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppTableObjInterface();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppTableObjImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppTableObjImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppDb2LUWTableInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppDb2LUWTableInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppDb2LUWTableMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppDb2LUWTableMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppDb2LUWTableImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppDb2LUWTableImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppMSSqlTableInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppMSSqlTableInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppMSSqlTableMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppMSSqlTableMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppMSSqlTableImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppMSSqlTableImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppMySqlTableInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppMySqlTableInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppMySqlTableMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppMySqlTableMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppMySqlTableImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppMySqlTableImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppOracleTableInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppOracleTableInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppOracleTableMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppOracleTableMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppOracleTableImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppOracleTableImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppPgSqlTableInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppPgSqlTableInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppPgSqlTableMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppPgSqlTableMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppPgSqlTableImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppPgSqlTableImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppRamTableInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppRamTableInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppRamTableMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppRamTableMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppRamTableImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppRamTableImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppSaxLoaderInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppSaxLoaderInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppSaxLoaderStartElement();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppSaxLoaderStartElement();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppSaxLoaderEndElement();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppSaxLoaderEndElement();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppXMsgTableInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppXMsgTableInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppXMsgTableFormatters();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppXMsgTableFormatters();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppXMsgRqstTableInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppXMsgRqstTableInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppXMsgRspnTableInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppXMsgRspnTableInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppXMsgClientTableInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppXMsgClientTableInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppXMsgRqstTableBody();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppXMsgRqstTableBody();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppXMsgRspnTableBody();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppXMsgRspnTableBody();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppXMsgClientTableBody();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppXMsgClientTableBody();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppObjInterface();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppObjInterface();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppObjInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppObjInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppObjImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppObjImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppEditObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppEditObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppEditObjInterface();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppEditObjInterface();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppEditObjInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppEditObjInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppEditObjImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppEditObjImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppTableInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppTableInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppTableMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppTableMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppTableInterface();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppTableInterface();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppTableImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppTableImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppTableObjInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppTableObjInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppTableObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppTableObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppTableObjInterface();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppTableObjInterface();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppTableObjImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppTableObjImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppDb2LUWTableInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppDb2LUWTableInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppDb2LUWTableMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppDb2LUWTableMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppDb2LUWTableImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppDb2LUWTableImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppMSSqlTableInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppMSSqlTableInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppMSSqlTableMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppMSSqlTableMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppMSSqlTableImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppMSSqlTableImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppMySqlTableInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppMySqlTableInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppMySqlTableMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppMySqlTableMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppMySqlTableImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppMySqlTableImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppOracleTableInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppOracleTableInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppOracleTableMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppOracleTableMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppOracleTableImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppOracleTableImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppPgSqlTableInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppPgSqlTableInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppPgSqlTableMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppPgSqlTableMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppPgSqlTableImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppPgSqlTableImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppRamTableInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppRamTableInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppRamTableMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppRamTableMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppRamTableImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppRamTableImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppSaxLoaderInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppSaxLoaderInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppSaxLoaderStartElement();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppSaxLoaderStartElement();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppSaxLoaderEndElement();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppSaxLoaderEndElement();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppXMsgTableInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppXMsgTableInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppXMsgTableFormatters();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppXMsgTableFormatters();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppXMsgRqstTableInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppXMsgRqstTableInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppXMsgRspnTableInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppXMsgRspnTableInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppXMsgClientTableInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppXMsgClientTableInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppXMsgRqstTableBody();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppXMsgRqstTableBody();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppXMsgRspnTableBody();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppXMsgRspnTableBody();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppXMsgClientTableBody();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppXMsgClientTableBody();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsObjInterface();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsObjInterface();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsObjUsing();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsObjUsing();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsObjImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsObjImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsEditObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsEditObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsEditObjInterface();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsEditObjInterface();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsEditObjUsing();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsEditObjUsing();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsEditObjImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsEditObjImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsTableUsing();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsTableUsing();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsTableMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsTableMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsTableInterface();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsTableInterface();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsTableImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsTableImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsTableObjUsing();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsTableObjUsing();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsTableObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsTableObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsTableObjInterface();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsTableObjInterface();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsTableObjImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsTableObjImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsDb2LUWTableUsing();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsDb2LUWTableUsing();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsDb2LUWTableMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsDb2LUWTableMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsDb2LUWTableImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsDb2LUWTableImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsMSSqlTableUsing();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsMSSqlTableUsing();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsMSSqlTableMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsMSSqlTableMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsMSSqlTableImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsMSSqlTableImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsMySqlTableUsing();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsMySqlTableUsing();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsMySqlTableMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsMySqlTableMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsMySqlTableImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsMySqlTableImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsOracleTableUsing();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsOracleTableUsing();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsOracleTableMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsOracleTableMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsOracleTableImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsOracleTableImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsPgSqlTableUsing();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsPgSqlTableUsing();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsPgSqlTableMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsPgSqlTableMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsPgSqlTableImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsPgSqlTableImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsRamTableUsing();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsRamTableUsing();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsRamTableMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsRamTableMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsRamTableImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsRamTableImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsSaxLoaderUsing();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsSaxLoaderUsing();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsSaxLoaderStartElement();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsSaxLoaderStartElement();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsSaxLoaderEndElement();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsSaxLoaderEndElement();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsXMsgTableUsing();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsXMsgTableUsing();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsXMsgTableFormatters();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsXMsgTableFormatters();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsXMsgRqstTableUsing();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsXMsgRqstTableUsing();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsXMsgRspnTableUsing();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsXMsgRspnTableUsing();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsXMsgClientTableUsing();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsXMsgClientTableUsing();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsXMsgRqstTableBody();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsXMsgRqstTableBody();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsXMsgRspnTableBody();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsXMsgRspnTableBody();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsXMsgClientTableBody();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsXMsgClientTableBody();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		populateFields();
		adjustComponentEnableStates();
		javafxIsInitializing = false;
	}

	public ICFFormManager getCFFormManager() {
		return( cfFormManager );
	}

	public void setCFFormManager( ICFFormManager value ) {
		final String S_ProcName = "setCFFormManager";
		if( value == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"value" );
		}
		cfFormManager = value;
	}

	public ICFBamJavaFXSchema getJavaFXSchema() {
		return( javafxSchema );
	}

	public void setJavaFXFocus( ICFLibAnyObj value ) {
		final String S_ProcName = "setJavaFXFocus";
		if( ( value == null ) || ( value instanceof ICFBamTableObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamTableObj" );
		}
		populateFields();
		adjustComponentEnableStates();
	}

	public ICFBamTableObj getJavaFXFocusAsTable() {
		return( (ICFBamTableObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsTable( ICFBamTableObj value ) {
		setJavaFXFocus( value );
	}

	public ICFBamTableObj getEffJavaFXFocus() {
		ICFBamTableObj eff = (ICFBamTableObj)getJavaFXFocus();
		if( eff != null ) {
			if( null != eff.getEdit() ) {
				eff = (ICFBamTableObj)eff.getEdit();
			}
		}
		return( eff );
	}

	public ICFBamSchemaDefObj getJavaFXLookupDefSchemaObj() {
		return( javafxLookupDefSchemaObj );
	}

	public void setJavaFXLookupDefSchemaObj( ICFBamSchemaDefObj value ) {
		javafxLookupDefSchemaObj = value;
	}

	public CFLabel getJavaFXLabelLookupDefSchema() {
		if( javafxLabelLookupDefSchema == null ) {
			javafxLabelLookupDefSchema = new DefSchemaCFLabel();
		}
		return( javafxLabelLookupDefSchema );
	}

	public CFReferenceEditor getJavaFXReferenceLookupDefSchema() {
		if( javafxReferenceLookupDefSchema == null ) {
			javafxReferenceLookupDefSchema = new DefSchemaCFReferenceEditor();
		}
		return( javafxReferenceLookupDefSchema );
	}

	public void setJavaFXReferenceLookupDefSchema( DefSchemaCFReferenceEditor value ) {
		javafxReferenceLookupDefSchema = value;
	}

	public ICFBamIndexObj getJavaFXLookupLookupIndexObj() {
		return( javafxLookupLookupIndexObj );
	}

	public void setJavaFXLookupLookupIndexObj( ICFBamIndexObj value ) {
		javafxLookupLookupIndexObj = value;
	}

	public CFLabel getJavaFXLabelLookupLookupIndex() {
		if( javafxLabelLookupLookupIndex == null ) {
			javafxLabelLookupLookupIndex = new LookupIndexCFLabel();
		}
		return( javafxLabelLookupLookupIndex );
	}

	public CFReferenceEditor getJavaFXReferenceLookupLookupIndex() {
		if( javafxReferenceLookupLookupIndex == null ) {
			javafxReferenceLookupLookupIndex = new LookupIndexCFReferenceEditor();
		}
		return( javafxReferenceLookupLookupIndex );
	}

	public void setJavaFXReferenceLookupLookupIndex( LookupIndexCFReferenceEditor value ) {
		javafxReferenceLookupLookupIndex = value;
	}

	public ICFBamIndexObj getJavaFXLookupAltIndexObj() {
		return( javafxLookupAltIndexObj );
	}

	public void setJavaFXLookupAltIndexObj( ICFBamIndexObj value ) {
		javafxLookupAltIndexObj = value;
	}

	public CFLabel getJavaFXLabelLookupAltIndex() {
		if( javafxLabelLookupAltIndex == null ) {
			javafxLabelLookupAltIndex = new AltIndexCFLabel();
		}
		return( javafxLabelLookupAltIndex );
	}

	public CFReferenceEditor getJavaFXReferenceLookupAltIndex() {
		if( javafxReferenceLookupAltIndex == null ) {
			javafxReferenceLookupAltIndex = new AltIndexCFReferenceEditor();
		}
		return( javafxReferenceLookupAltIndex );
	}

	public void setJavaFXReferenceLookupAltIndex( AltIndexCFReferenceEditor value ) {
		javafxReferenceLookupAltIndex = value;
	}

	public ICFBamTableObj getJavaFXLookupQualTableObj() {
		return( javafxLookupQualTableObj );
	}

	public void setJavaFXLookupQualTableObj( ICFBamTableObj value ) {
		javafxLookupQualTableObj = value;
	}

	public CFLabel getJavaFXLabelLookupQualTable() {
		if( javafxLabelLookupQualTable == null ) {
			javafxLabelLookupQualTable = new QualifyingTableCFLabel();
		}
		return( javafxLabelLookupQualTable );
	}

	public CFReferenceEditor getJavaFXReferenceLookupQualTable() {
		if( javafxReferenceLookupQualTable == null ) {
			javafxReferenceLookupQualTable = new QualifyingTableCFReferenceEditor();
		}
		return( javafxReferenceLookupQualTable );
	}

	public void setJavaFXReferenceLookupQualTable( QualifyingTableCFReferenceEditor value ) {
		javafxReferenceLookupQualTable = value;
	}

	public ICFBamIndexObj getJavaFXLookupPrimaryIndexObj() {
		return( javafxLookupPrimaryIndexObj );
	}

	public void setJavaFXLookupPrimaryIndexObj( ICFBamIndexObj value ) {
		javafxLookupPrimaryIndexObj = value;
	}

	public CFLabel getJavaFXLabelLookupPrimaryIndex() {
		if( javafxLabelLookupPrimaryIndex == null ) {
			javafxLabelLookupPrimaryIndex = new PrimaryIndexCFLabel();
		}
		return( javafxLabelLookupPrimaryIndex );
	}

	public CFReferenceEditor getJavaFXReferenceLookupPrimaryIndex() {
		if( javafxReferenceLookupPrimaryIndex == null ) {
			javafxReferenceLookupPrimaryIndex = new PrimaryIndexCFReferenceEditor();
		}
		return( javafxReferenceLookupPrimaryIndex );
	}

	public void setJavaFXReferenceLookupPrimaryIndex( PrimaryIndexCFReferenceEditor value ) {
		javafxReferenceLookupPrimaryIndex = value;
	}

	public IdCFLabel getJavaFXLabelId() {
		if( javafxLabelId == null ) {
			javafxLabelId = new IdCFLabel();
		}
		return( javafxLabelId );
	}

	public void setJavaFXLabelId( IdCFLabel value ) {
		javafxLabelId = value;
	}

	public IdEditor getJavaFXEditorId() {
		if( javafxEditorId == null ) {
			javafxEditorId = new IdEditor();
		}
		return( javafxEditorId );
	}

	public void setJavaFXEditorId( IdEditor value ) {
		javafxEditorId = value;
	}

	public NameCFLabel getJavaFXLabelName() {
		if( javafxLabelName == null ) {
			javafxLabelName = new NameCFLabel();
		}
		return( javafxLabelName );
	}

	public void setJavaFXLabelName( NameCFLabel value ) {
		javafxLabelName = value;
	}

	public NameEditor getJavaFXEditorName() {
		if( javafxEditorName == null ) {
			javafxEditorName = new NameEditor();
		}
		return( javafxEditorName );
	}

	public void setJavaFXEditorName( NameEditor value ) {
		javafxEditorName = value;
	}

	public DbNameCFLabel getJavaFXLabelDbName() {
		if( javafxLabelDbName == null ) {
			javafxLabelDbName = new DbNameCFLabel();
		}
		return( javafxLabelDbName );
	}

	public void setJavaFXLabelDbName( DbNameCFLabel value ) {
		javafxLabelDbName = value;
	}

	public DbNameEditor getJavaFXEditorDbName() {
		if( javafxEditorDbName == null ) {
			javafxEditorDbName = new DbNameEditor();
		}
		return( javafxEditorDbName );
	}

	public void setJavaFXEditorDbName( DbNameEditor value ) {
		javafxEditorDbName = value;
	}

	public ShortNameCFLabel getJavaFXLabelShortName() {
		if( javafxLabelShortName == null ) {
			javafxLabelShortName = new ShortNameCFLabel();
		}
		return( javafxLabelShortName );
	}

	public void setJavaFXLabelShortName( ShortNameCFLabel value ) {
		javafxLabelShortName = value;
	}

	public ShortNameEditor getJavaFXEditorShortName() {
		if( javafxEditorShortName == null ) {
			javafxEditorShortName = new ShortNameEditor();
		}
		return( javafxEditorShortName );
	}

	public void setJavaFXEditorShortName( ShortNameEditor value ) {
		javafxEditorShortName = value;
	}

	public LabelCFLabel getJavaFXLabelLabel() {
		if( javafxLabelLabel == null ) {
			javafxLabelLabel = new LabelCFLabel();
		}
		return( javafxLabelLabel );
	}

	public void setJavaFXLabelLabel( LabelCFLabel value ) {
		javafxLabelLabel = value;
	}

	public LabelEditor getJavaFXEditorLabel() {
		if( javafxEditorLabel == null ) {
			javafxEditorLabel = new LabelEditor();
		}
		return( javafxEditorLabel );
	}

	public void setJavaFXEditorLabel( LabelEditor value ) {
		javafxEditorLabel = value;
	}

	public ShortDescriptionCFLabel getJavaFXLabelShortDescription() {
		if( javafxLabelShortDescription == null ) {
			javafxLabelShortDescription = new ShortDescriptionCFLabel();
		}
		return( javafxLabelShortDescription );
	}

	public void setJavaFXLabelShortDescription( ShortDescriptionCFLabel value ) {
		javafxLabelShortDescription = value;
	}

	public ShortDescriptionEditor getJavaFXEditorShortDescription() {
		if( javafxEditorShortDescription == null ) {
			javafxEditorShortDescription = new ShortDescriptionEditor();
		}
		return( javafxEditorShortDescription );
	}

	public void setJavaFXEditorShortDescription( ShortDescriptionEditor value ) {
		javafxEditorShortDescription = value;
	}

	public DescriptionCFLabel getJavaFXLabelDescription() {
		if( javafxLabelDescription == null ) {
			javafxLabelDescription = new DescriptionCFLabel();
		}
		return( javafxLabelDescription );
	}

	public void setJavaFXLabelDescription( DescriptionCFLabel value ) {
		javafxLabelDescription = value;
	}

	public DescriptionEditor getJavaFXEditorDescription() {
		if( javafxEditorDescription == null ) {
			javafxEditorDescription = new DescriptionEditor();
		}
		return( javafxEditorDescription );
	}

	public void setJavaFXEditorDescription( DescriptionEditor value ) {
		javafxEditorDescription = value;
	}

	public PageDataCFLabel getJavaFXLabelPageData() {
		if( javafxLabelPageData == null ) {
			javafxLabelPageData = new PageDataCFLabel();
		}
		return( javafxLabelPageData );
	}

	public void setJavaFXLabelPageData( PageDataCFLabel value ) {
		javafxLabelPageData = value;
	}

	public PageDataEditor getJavaFXEditorPageData() {
		if( javafxEditorPageData == null ) {
			javafxEditorPageData = new PageDataEditor();
		}
		return( javafxEditorPageData );
	}

	public void setJavaFXEditorPageData( PageDataEditor value ) {
		javafxEditorPageData = value;
	}

	public TableClassCodeCFLabel getJavaFXLabelTableClassCode() {
		if( javafxLabelTableClassCode == null ) {
			javafxLabelTableClassCode = new TableClassCodeCFLabel();
		}
		return( javafxLabelTableClassCode );
	}

	public void setJavaFXLabelTableClassCode( TableClassCodeCFLabel value ) {
		javafxLabelTableClassCode = value;
	}

	public TableClassCodeEditor getJavaFXEditorTableClassCode() {
		if( javafxEditorTableClassCode == null ) {
			javafxEditorTableClassCode = new TableClassCodeEditor();
		}
		return( javafxEditorTableClassCode );
	}

	public void setJavaFXEditorTableClassCode( TableClassCodeEditor value ) {
		javafxEditorTableClassCode = value;
	}

	public IsInstantiableCFLabel getJavaFXLabelIsInstantiable() {
		if( javafxLabelIsInstantiable == null ) {
			javafxLabelIsInstantiable = new IsInstantiableCFLabel();
		}
		return( javafxLabelIsInstantiable );
	}

	public void setJavaFXLabelIsInstantiable( IsInstantiableCFLabel value ) {
		javafxLabelIsInstantiable = value;
	}

	public IsInstantiableEditor getJavaFXEditorIsInstantiable() {
		if( javafxEditorIsInstantiable == null ) {
			javafxEditorIsInstantiable = new IsInstantiableEditor();
		}
		return( javafxEditorIsInstantiable );
	}

	public void setJavaFXEditorIsInstantiable( IsInstantiableEditor value ) {
		javafxEditorIsInstantiable = value;
	}

	public HasHistoryCFLabel getJavaFXLabelHasHistory() {
		if( javafxLabelHasHistory == null ) {
			javafxLabelHasHistory = new HasHistoryCFLabel();
		}
		return( javafxLabelHasHistory );
	}

	public void setJavaFXLabelHasHistory( HasHistoryCFLabel value ) {
		javafxLabelHasHistory = value;
	}

	public HasHistoryEditor getJavaFXEditorHasHistory() {
		if( javafxEditorHasHistory == null ) {
			javafxEditorHasHistory = new HasHistoryEditor();
		}
		return( javafxEditorHasHistory );
	}

	public void setJavaFXEditorHasHistory( HasHistoryEditor value ) {
		javafxEditorHasHistory = value;
	}

	public HasAuditColumnsCFLabel getJavaFXLabelHasAuditColumns() {
		if( javafxLabelHasAuditColumns == null ) {
			javafxLabelHasAuditColumns = new HasAuditColumnsCFLabel();
		}
		return( javafxLabelHasAuditColumns );
	}

	public void setJavaFXLabelHasAuditColumns( HasAuditColumnsCFLabel value ) {
		javafxLabelHasAuditColumns = value;
	}

	public HasAuditColumnsEditor getJavaFXEditorHasAuditColumns() {
		if( javafxEditorHasAuditColumns == null ) {
			javafxEditorHasAuditColumns = new HasAuditColumnsEditor();
		}
		return( javafxEditorHasAuditColumns );
	}

	public void setJavaFXEditorHasAuditColumns( HasAuditColumnsEditor value ) {
		javafxEditorHasAuditColumns = value;
	}

	public IsMutableCFLabel getJavaFXLabelIsMutable() {
		if( javafxLabelIsMutable == null ) {
			javafxLabelIsMutable = new IsMutableCFLabel();
		}
		return( javafxLabelIsMutable );
	}

	public void setJavaFXLabelIsMutable( IsMutableCFLabel value ) {
		javafxLabelIsMutable = value;
	}

	public IsMutableEditor getJavaFXEditorIsMutable() {
		if( javafxEditorIsMutable == null ) {
			javafxEditorIsMutable = new IsMutableEditor();
		}
		return( javafxEditorIsMutable );
	}

	public void setJavaFXEditorIsMutable( IsMutableEditor value ) {
		javafxEditorIsMutable = value;
	}

	public IsServerOnlyCFLabel getJavaFXLabelIsServerOnly() {
		if( javafxLabelIsServerOnly == null ) {
			javafxLabelIsServerOnly = new IsServerOnlyCFLabel();
		}
		return( javafxLabelIsServerOnly );
	}

	public void setJavaFXLabelIsServerOnly( IsServerOnlyCFLabel value ) {
		javafxLabelIsServerOnly = value;
	}

	public IsServerOnlyEditor getJavaFXEditorIsServerOnly() {
		if( javafxEditorIsServerOnly == null ) {
			javafxEditorIsServerOnly = new IsServerOnlyEditor();
		}
		return( javafxEditorIsServerOnly );
	}

	public void setJavaFXEditorIsServerOnly( IsServerOnlyEditor value ) {
		javafxEditorIsServerOnly = value;
	}

	public LoaderBehaviourCFLabel getJavaFXLabelLoaderBehaviour() {
		if( javafxLabelLoaderBehaviour == null ) {
			javafxLabelLoaderBehaviour = new LoaderBehaviourCFLabel();
		}
		return( javafxLabelLoaderBehaviour );
	}

	public void setJavaFXLabelLoaderBehaviour( LoaderBehaviourCFLabel value ) {
		javafxLabelLoaderBehaviour = value;
	}

	public LoaderBehaviourEditor getJavaFXEditorLoaderBehaviour() {
		if( javafxEditorLoaderBehaviour == null ) {
			javafxEditorLoaderBehaviour = new LoaderBehaviourEditor();
		}
		return( javafxEditorLoaderBehaviour );
	}

	public void setJavaFXEditorLoaderBehaviour( LoaderBehaviourEditor value ) {
		javafxEditorLoaderBehaviour = value;
	}

	public SecScopeCFLabel getJavaFXLabelSecScope() {
		if( javafxLabelSecScope == null ) {
			javafxLabelSecScope = new SecScopeCFLabel();
		}
		return( javafxLabelSecScope );
	}

	public void setJavaFXLabelSecScope( SecScopeCFLabel value ) {
		javafxLabelSecScope = value;
	}

	public SecScopeEditor getJavaFXEditorSecScope() {
		if( javafxEditorSecScope == null ) {
			javafxEditorSecScope = new SecScopeEditor();
		}
		return( javafxEditorSecScope );
	}

	public void setJavaFXEditorSecScope( SecScopeEditor value ) {
		javafxEditorSecScope = value;
	}

	public JObjMembersCFLabel getJavaFXLabelJObjMembers() {
		if( javafxLabelJObjMembers == null ) {
			javafxLabelJObjMembers = new JObjMembersCFLabel();
		}
		return( javafxLabelJObjMembers );
	}

	public void setJavaFXLabelJObjMembers( JObjMembersCFLabel value ) {
		javafxLabelJObjMembers = value;
	}

	public JObjMembersEditor getJavaFXEditorJObjMembers() {
		if( javafxEditorJObjMembers == null ) {
			javafxEditorJObjMembers = new JObjMembersEditor();
		}
		return( javafxEditorJObjMembers );
	}

	public void setJavaFXEditorJObjMembers( JObjMembersEditor value ) {
		javafxEditorJObjMembers = value;
	}

	public JObjInterfaceCFLabel getJavaFXLabelJObjInterface() {
		if( javafxLabelJObjInterface == null ) {
			javafxLabelJObjInterface = new JObjInterfaceCFLabel();
		}
		return( javafxLabelJObjInterface );
	}

	public void setJavaFXLabelJObjInterface( JObjInterfaceCFLabel value ) {
		javafxLabelJObjInterface = value;
	}

	public JObjInterfaceEditor getJavaFXEditorJObjInterface() {
		if( javafxEditorJObjInterface == null ) {
			javafxEditorJObjInterface = new JObjInterfaceEditor();
		}
		return( javafxEditorJObjInterface );
	}

	public void setJavaFXEditorJObjInterface( JObjInterfaceEditor value ) {
		javafxEditorJObjInterface = value;
	}

	public JObjImportCFLabel getJavaFXLabelJObjImport() {
		if( javafxLabelJObjImport == null ) {
			javafxLabelJObjImport = new JObjImportCFLabel();
		}
		return( javafxLabelJObjImport );
	}

	public void setJavaFXLabelJObjImport( JObjImportCFLabel value ) {
		javafxLabelJObjImport = value;
	}

	public JObjImportEditor getJavaFXEditorJObjImport() {
		if( javafxEditorJObjImport == null ) {
			javafxEditorJObjImport = new JObjImportEditor();
		}
		return( javafxEditorJObjImport );
	}

	public void setJavaFXEditorJObjImport( JObjImportEditor value ) {
		javafxEditorJObjImport = value;
	}

	public JObjImplementationCFLabel getJavaFXLabelJObjImplementation() {
		if( javafxLabelJObjImplementation == null ) {
			javafxLabelJObjImplementation = new JObjImplementationCFLabel();
		}
		return( javafxLabelJObjImplementation );
	}

	public void setJavaFXLabelJObjImplementation( JObjImplementationCFLabel value ) {
		javafxLabelJObjImplementation = value;
	}

	public JObjImplementationEditor getJavaFXEditorJObjImplementation() {
		if( javafxEditorJObjImplementation == null ) {
			javafxEditorJObjImplementation = new JObjImplementationEditor();
		}
		return( javafxEditorJObjImplementation );
	}

	public void setJavaFXEditorJObjImplementation( JObjImplementationEditor value ) {
		javafxEditorJObjImplementation = value;
	}

	public JEditObjMembersCFLabel getJavaFXLabelJEditObjMembers() {
		if( javafxLabelJEditObjMembers == null ) {
			javafxLabelJEditObjMembers = new JEditObjMembersCFLabel();
		}
		return( javafxLabelJEditObjMembers );
	}

	public void setJavaFXLabelJEditObjMembers( JEditObjMembersCFLabel value ) {
		javafxLabelJEditObjMembers = value;
	}

	public JEditObjMembersEditor getJavaFXEditorJEditObjMembers() {
		if( javafxEditorJEditObjMembers == null ) {
			javafxEditorJEditObjMembers = new JEditObjMembersEditor();
		}
		return( javafxEditorJEditObjMembers );
	}

	public void setJavaFXEditorJEditObjMembers( JEditObjMembersEditor value ) {
		javafxEditorJEditObjMembers = value;
	}

	public JEditObjInterfaceCFLabel getJavaFXLabelJEditObjInterface() {
		if( javafxLabelJEditObjInterface == null ) {
			javafxLabelJEditObjInterface = new JEditObjInterfaceCFLabel();
		}
		return( javafxLabelJEditObjInterface );
	}

	public void setJavaFXLabelJEditObjInterface( JEditObjInterfaceCFLabel value ) {
		javafxLabelJEditObjInterface = value;
	}

	public JEditObjInterfaceEditor getJavaFXEditorJEditObjInterface() {
		if( javafxEditorJEditObjInterface == null ) {
			javafxEditorJEditObjInterface = new JEditObjInterfaceEditor();
		}
		return( javafxEditorJEditObjInterface );
	}

	public void setJavaFXEditorJEditObjInterface( JEditObjInterfaceEditor value ) {
		javafxEditorJEditObjInterface = value;
	}

	public JEditObjImportCFLabel getJavaFXLabelJEditObjImport() {
		if( javafxLabelJEditObjImport == null ) {
			javafxLabelJEditObjImport = new JEditObjImportCFLabel();
		}
		return( javafxLabelJEditObjImport );
	}

	public void setJavaFXLabelJEditObjImport( JEditObjImportCFLabel value ) {
		javafxLabelJEditObjImport = value;
	}

	public JEditObjImportEditor getJavaFXEditorJEditObjImport() {
		if( javafxEditorJEditObjImport == null ) {
			javafxEditorJEditObjImport = new JEditObjImportEditor();
		}
		return( javafxEditorJEditObjImport );
	}

	public void setJavaFXEditorJEditObjImport( JEditObjImportEditor value ) {
		javafxEditorJEditObjImport = value;
	}

	public JEditObjImplementationCFLabel getJavaFXLabelJEditObjImplementation() {
		if( javafxLabelJEditObjImplementation == null ) {
			javafxLabelJEditObjImplementation = new JEditObjImplementationCFLabel();
		}
		return( javafxLabelJEditObjImplementation );
	}

	public void setJavaFXLabelJEditObjImplementation( JEditObjImplementationCFLabel value ) {
		javafxLabelJEditObjImplementation = value;
	}

	public JEditObjImplementationEditor getJavaFXEditorJEditObjImplementation() {
		if( javafxEditorJEditObjImplementation == null ) {
			javafxEditorJEditObjImplementation = new JEditObjImplementationEditor();
		}
		return( javafxEditorJEditObjImplementation );
	}

	public void setJavaFXEditorJEditObjImplementation( JEditObjImplementationEditor value ) {
		javafxEditorJEditObjImplementation = value;
	}

	public JTableImportCFLabel getJavaFXLabelJTableImport() {
		if( javafxLabelJTableImport == null ) {
			javafxLabelJTableImport = new JTableImportCFLabel();
		}
		return( javafxLabelJTableImport );
	}

	public void setJavaFXLabelJTableImport( JTableImportCFLabel value ) {
		javafxLabelJTableImport = value;
	}

	public JTableImportEditor getJavaFXEditorJTableImport() {
		if( javafxEditorJTableImport == null ) {
			javafxEditorJTableImport = new JTableImportEditor();
		}
		return( javafxEditorJTableImport );
	}

	public void setJavaFXEditorJTableImport( JTableImportEditor value ) {
		javafxEditorJTableImport = value;
	}

	public JTableMembersCFLabel getJavaFXLabelJTableMembers() {
		if( javafxLabelJTableMembers == null ) {
			javafxLabelJTableMembers = new JTableMembersCFLabel();
		}
		return( javafxLabelJTableMembers );
	}

	public void setJavaFXLabelJTableMembers( JTableMembersCFLabel value ) {
		javafxLabelJTableMembers = value;
	}

	public JTableMembersEditor getJavaFXEditorJTableMembers() {
		if( javafxEditorJTableMembers == null ) {
			javafxEditorJTableMembers = new JTableMembersEditor();
		}
		return( javafxEditorJTableMembers );
	}

	public void setJavaFXEditorJTableMembers( JTableMembersEditor value ) {
		javafxEditorJTableMembers = value;
	}

	public JTableInterfaceCFLabel getJavaFXLabelJTableInterface() {
		if( javafxLabelJTableInterface == null ) {
			javafxLabelJTableInterface = new JTableInterfaceCFLabel();
		}
		return( javafxLabelJTableInterface );
	}

	public void setJavaFXLabelJTableInterface( JTableInterfaceCFLabel value ) {
		javafxLabelJTableInterface = value;
	}

	public JTableInterfaceEditor getJavaFXEditorJTableInterface() {
		if( javafxEditorJTableInterface == null ) {
			javafxEditorJTableInterface = new JTableInterfaceEditor();
		}
		return( javafxEditorJTableInterface );
	}

	public void setJavaFXEditorJTableInterface( JTableInterfaceEditor value ) {
		javafxEditorJTableInterface = value;
	}

	public JTableImplementationCFLabel getJavaFXLabelJTableImplementation() {
		if( javafxLabelJTableImplementation == null ) {
			javafxLabelJTableImplementation = new JTableImplementationCFLabel();
		}
		return( javafxLabelJTableImplementation );
	}

	public void setJavaFXLabelJTableImplementation( JTableImplementationCFLabel value ) {
		javafxLabelJTableImplementation = value;
	}

	public JTableImplementationEditor getJavaFXEditorJTableImplementation() {
		if( javafxEditorJTableImplementation == null ) {
			javafxEditorJTableImplementation = new JTableImplementationEditor();
		}
		return( javafxEditorJTableImplementation );
	}

	public void setJavaFXEditorJTableImplementation( JTableImplementationEditor value ) {
		javafxEditorJTableImplementation = value;
	}

	public JTableObjImportCFLabel getJavaFXLabelJTableObjImport() {
		if( javafxLabelJTableObjImport == null ) {
			javafxLabelJTableObjImport = new JTableObjImportCFLabel();
		}
		return( javafxLabelJTableObjImport );
	}

	public void setJavaFXLabelJTableObjImport( JTableObjImportCFLabel value ) {
		javafxLabelJTableObjImport = value;
	}

	public JTableObjImportEditor getJavaFXEditorJTableObjImport() {
		if( javafxEditorJTableObjImport == null ) {
			javafxEditorJTableObjImport = new JTableObjImportEditor();
		}
		return( javafxEditorJTableObjImport );
	}

	public void setJavaFXEditorJTableObjImport( JTableObjImportEditor value ) {
		javafxEditorJTableObjImport = value;
	}

	public JTableObjMembersCFLabel getJavaFXLabelJTableObjMembers() {
		if( javafxLabelJTableObjMembers == null ) {
			javafxLabelJTableObjMembers = new JTableObjMembersCFLabel();
		}
		return( javafxLabelJTableObjMembers );
	}

	public void setJavaFXLabelJTableObjMembers( JTableObjMembersCFLabel value ) {
		javafxLabelJTableObjMembers = value;
	}

	public JTableObjMembersEditor getJavaFXEditorJTableObjMembers() {
		if( javafxEditorJTableObjMembers == null ) {
			javafxEditorJTableObjMembers = new JTableObjMembersEditor();
		}
		return( javafxEditorJTableObjMembers );
	}

	public void setJavaFXEditorJTableObjMembers( JTableObjMembersEditor value ) {
		javafxEditorJTableObjMembers = value;
	}

	public JTableObjInterfaceCFLabel getJavaFXLabelJTableObjInterface() {
		if( javafxLabelJTableObjInterface == null ) {
			javafxLabelJTableObjInterface = new JTableObjInterfaceCFLabel();
		}
		return( javafxLabelJTableObjInterface );
	}

	public void setJavaFXLabelJTableObjInterface( JTableObjInterfaceCFLabel value ) {
		javafxLabelJTableObjInterface = value;
	}

	public JTableObjInterfaceEditor getJavaFXEditorJTableObjInterface() {
		if( javafxEditorJTableObjInterface == null ) {
			javafxEditorJTableObjInterface = new JTableObjInterfaceEditor();
		}
		return( javafxEditorJTableObjInterface );
	}

	public void setJavaFXEditorJTableObjInterface( JTableObjInterfaceEditor value ) {
		javafxEditorJTableObjInterface = value;
	}

	public JTableObjImplementationCFLabel getJavaFXLabelJTableObjImplementation() {
		if( javafxLabelJTableObjImplementation == null ) {
			javafxLabelJTableObjImplementation = new JTableObjImplementationCFLabel();
		}
		return( javafxLabelJTableObjImplementation );
	}

	public void setJavaFXLabelJTableObjImplementation( JTableObjImplementationCFLabel value ) {
		javafxLabelJTableObjImplementation = value;
	}

	public JTableObjImplementationEditor getJavaFXEditorJTableObjImplementation() {
		if( javafxEditorJTableObjImplementation == null ) {
			javafxEditorJTableObjImplementation = new JTableObjImplementationEditor();
		}
		return( javafxEditorJTableObjImplementation );
	}

	public void setJavaFXEditorJTableObjImplementation( JTableObjImplementationEditor value ) {
		javafxEditorJTableObjImplementation = value;
	}

	public JDb2LUWTableImportCFLabel getJavaFXLabelJDb2LUWTableImport() {
		if( javafxLabelJDb2LUWTableImport == null ) {
			javafxLabelJDb2LUWTableImport = new JDb2LUWTableImportCFLabel();
		}
		return( javafxLabelJDb2LUWTableImport );
	}

	public void setJavaFXLabelJDb2LUWTableImport( JDb2LUWTableImportCFLabel value ) {
		javafxLabelJDb2LUWTableImport = value;
	}

	public JDb2LUWTableImportEditor getJavaFXEditorJDb2LUWTableImport() {
		if( javafxEditorJDb2LUWTableImport == null ) {
			javafxEditorJDb2LUWTableImport = new JDb2LUWTableImportEditor();
		}
		return( javafxEditorJDb2LUWTableImport );
	}

	public void setJavaFXEditorJDb2LUWTableImport( JDb2LUWTableImportEditor value ) {
		javafxEditorJDb2LUWTableImport = value;
	}

	public JDb2LUWTableMembersCFLabel getJavaFXLabelJDb2LUWTableMembers() {
		if( javafxLabelJDb2LUWTableMembers == null ) {
			javafxLabelJDb2LUWTableMembers = new JDb2LUWTableMembersCFLabel();
		}
		return( javafxLabelJDb2LUWTableMembers );
	}

	public void setJavaFXLabelJDb2LUWTableMembers( JDb2LUWTableMembersCFLabel value ) {
		javafxLabelJDb2LUWTableMembers = value;
	}

	public JDb2LUWTableMembersEditor getJavaFXEditorJDb2LUWTableMembers() {
		if( javafxEditorJDb2LUWTableMembers == null ) {
			javafxEditorJDb2LUWTableMembers = new JDb2LUWTableMembersEditor();
		}
		return( javafxEditorJDb2LUWTableMembers );
	}

	public void setJavaFXEditorJDb2LUWTableMembers( JDb2LUWTableMembersEditor value ) {
		javafxEditorJDb2LUWTableMembers = value;
	}

	public JDb2LUWTableImplementationCFLabel getJavaFXLabelJDb2LUWTableImplementation() {
		if( javafxLabelJDb2LUWTableImplementation == null ) {
			javafxLabelJDb2LUWTableImplementation = new JDb2LUWTableImplementationCFLabel();
		}
		return( javafxLabelJDb2LUWTableImplementation );
	}

	public void setJavaFXLabelJDb2LUWTableImplementation( JDb2LUWTableImplementationCFLabel value ) {
		javafxLabelJDb2LUWTableImplementation = value;
	}

	public JDb2LUWTableImplementationEditor getJavaFXEditorJDb2LUWTableImplementation() {
		if( javafxEditorJDb2LUWTableImplementation == null ) {
			javafxEditorJDb2LUWTableImplementation = new JDb2LUWTableImplementationEditor();
		}
		return( javafxEditorJDb2LUWTableImplementation );
	}

	public void setJavaFXEditorJDb2LUWTableImplementation( JDb2LUWTableImplementationEditor value ) {
		javafxEditorJDb2LUWTableImplementation = value;
	}

	public JMSSqlTableImportCFLabel getJavaFXLabelJMSSqlTableImport() {
		if( javafxLabelJMSSqlTableImport == null ) {
			javafxLabelJMSSqlTableImport = new JMSSqlTableImportCFLabel();
		}
		return( javafxLabelJMSSqlTableImport );
	}

	public void setJavaFXLabelJMSSqlTableImport( JMSSqlTableImportCFLabel value ) {
		javafxLabelJMSSqlTableImport = value;
	}

	public JMSSqlTableImportEditor getJavaFXEditorJMSSqlTableImport() {
		if( javafxEditorJMSSqlTableImport == null ) {
			javafxEditorJMSSqlTableImport = new JMSSqlTableImportEditor();
		}
		return( javafxEditorJMSSqlTableImport );
	}

	public void setJavaFXEditorJMSSqlTableImport( JMSSqlTableImportEditor value ) {
		javafxEditorJMSSqlTableImport = value;
	}

	public JMSSqlTableMembersCFLabel getJavaFXLabelJMSSqlTableMembers() {
		if( javafxLabelJMSSqlTableMembers == null ) {
			javafxLabelJMSSqlTableMembers = new JMSSqlTableMembersCFLabel();
		}
		return( javafxLabelJMSSqlTableMembers );
	}

	public void setJavaFXLabelJMSSqlTableMembers( JMSSqlTableMembersCFLabel value ) {
		javafxLabelJMSSqlTableMembers = value;
	}

	public JMSSqlTableMembersEditor getJavaFXEditorJMSSqlTableMembers() {
		if( javafxEditorJMSSqlTableMembers == null ) {
			javafxEditorJMSSqlTableMembers = new JMSSqlTableMembersEditor();
		}
		return( javafxEditorJMSSqlTableMembers );
	}

	public void setJavaFXEditorJMSSqlTableMembers( JMSSqlTableMembersEditor value ) {
		javafxEditorJMSSqlTableMembers = value;
	}

	public JMSSqlTableImplementationCFLabel getJavaFXLabelJMSSqlTableImplementation() {
		if( javafxLabelJMSSqlTableImplementation == null ) {
			javafxLabelJMSSqlTableImplementation = new JMSSqlTableImplementationCFLabel();
		}
		return( javafxLabelJMSSqlTableImplementation );
	}

	public void setJavaFXLabelJMSSqlTableImplementation( JMSSqlTableImplementationCFLabel value ) {
		javafxLabelJMSSqlTableImplementation = value;
	}

	public JMSSqlTableImplementationEditor getJavaFXEditorJMSSqlTableImplementation() {
		if( javafxEditorJMSSqlTableImplementation == null ) {
			javafxEditorJMSSqlTableImplementation = new JMSSqlTableImplementationEditor();
		}
		return( javafxEditorJMSSqlTableImplementation );
	}

	public void setJavaFXEditorJMSSqlTableImplementation( JMSSqlTableImplementationEditor value ) {
		javafxEditorJMSSqlTableImplementation = value;
	}

	public JMySqlTableImportCFLabel getJavaFXLabelJMySqlTableImport() {
		if( javafxLabelJMySqlTableImport == null ) {
			javafxLabelJMySqlTableImport = new JMySqlTableImportCFLabel();
		}
		return( javafxLabelJMySqlTableImport );
	}

	public void setJavaFXLabelJMySqlTableImport( JMySqlTableImportCFLabel value ) {
		javafxLabelJMySqlTableImport = value;
	}

	public JMySqlTableImportEditor getJavaFXEditorJMySqlTableImport() {
		if( javafxEditorJMySqlTableImport == null ) {
			javafxEditorJMySqlTableImport = new JMySqlTableImportEditor();
		}
		return( javafxEditorJMySqlTableImport );
	}

	public void setJavaFXEditorJMySqlTableImport( JMySqlTableImportEditor value ) {
		javafxEditorJMySqlTableImport = value;
	}

	public JMySqlTableMembersCFLabel getJavaFXLabelJMySqlTableMembers() {
		if( javafxLabelJMySqlTableMembers == null ) {
			javafxLabelJMySqlTableMembers = new JMySqlTableMembersCFLabel();
		}
		return( javafxLabelJMySqlTableMembers );
	}

	public void setJavaFXLabelJMySqlTableMembers( JMySqlTableMembersCFLabel value ) {
		javafxLabelJMySqlTableMembers = value;
	}

	public JMySqlTableMembersEditor getJavaFXEditorJMySqlTableMembers() {
		if( javafxEditorJMySqlTableMembers == null ) {
			javafxEditorJMySqlTableMembers = new JMySqlTableMembersEditor();
		}
		return( javafxEditorJMySqlTableMembers );
	}

	public void setJavaFXEditorJMySqlTableMembers( JMySqlTableMembersEditor value ) {
		javafxEditorJMySqlTableMembers = value;
	}

	public JMySqlTableImplementationCFLabel getJavaFXLabelJMySqlTableImplementation() {
		if( javafxLabelJMySqlTableImplementation == null ) {
			javafxLabelJMySqlTableImplementation = new JMySqlTableImplementationCFLabel();
		}
		return( javafxLabelJMySqlTableImplementation );
	}

	public void setJavaFXLabelJMySqlTableImplementation( JMySqlTableImplementationCFLabel value ) {
		javafxLabelJMySqlTableImplementation = value;
	}

	public JMySqlTableImplementationEditor getJavaFXEditorJMySqlTableImplementation() {
		if( javafxEditorJMySqlTableImplementation == null ) {
			javafxEditorJMySqlTableImplementation = new JMySqlTableImplementationEditor();
		}
		return( javafxEditorJMySqlTableImplementation );
	}

	public void setJavaFXEditorJMySqlTableImplementation( JMySqlTableImplementationEditor value ) {
		javafxEditorJMySqlTableImplementation = value;
	}

	public JOracleTableImportCFLabel getJavaFXLabelJOracleTableImport() {
		if( javafxLabelJOracleTableImport == null ) {
			javafxLabelJOracleTableImport = new JOracleTableImportCFLabel();
		}
		return( javafxLabelJOracleTableImport );
	}

	public void setJavaFXLabelJOracleTableImport( JOracleTableImportCFLabel value ) {
		javafxLabelJOracleTableImport = value;
	}

	public JOracleTableImportEditor getJavaFXEditorJOracleTableImport() {
		if( javafxEditorJOracleTableImport == null ) {
			javafxEditorJOracleTableImport = new JOracleTableImportEditor();
		}
		return( javafxEditorJOracleTableImport );
	}

	public void setJavaFXEditorJOracleTableImport( JOracleTableImportEditor value ) {
		javafxEditorJOracleTableImport = value;
	}

	public JOracleTableMembersCFLabel getJavaFXLabelJOracleTableMembers() {
		if( javafxLabelJOracleTableMembers == null ) {
			javafxLabelJOracleTableMembers = new JOracleTableMembersCFLabel();
		}
		return( javafxLabelJOracleTableMembers );
	}

	public void setJavaFXLabelJOracleTableMembers( JOracleTableMembersCFLabel value ) {
		javafxLabelJOracleTableMembers = value;
	}

	public JOracleTableMembersEditor getJavaFXEditorJOracleTableMembers() {
		if( javafxEditorJOracleTableMembers == null ) {
			javafxEditorJOracleTableMembers = new JOracleTableMembersEditor();
		}
		return( javafxEditorJOracleTableMembers );
	}

	public void setJavaFXEditorJOracleTableMembers( JOracleTableMembersEditor value ) {
		javafxEditorJOracleTableMembers = value;
	}

	public JOracleTableImplementationCFLabel getJavaFXLabelJOracleTableImplementation() {
		if( javafxLabelJOracleTableImplementation == null ) {
			javafxLabelJOracleTableImplementation = new JOracleTableImplementationCFLabel();
		}
		return( javafxLabelJOracleTableImplementation );
	}

	public void setJavaFXLabelJOracleTableImplementation( JOracleTableImplementationCFLabel value ) {
		javafxLabelJOracleTableImplementation = value;
	}

	public JOracleTableImplementationEditor getJavaFXEditorJOracleTableImplementation() {
		if( javafxEditorJOracleTableImplementation == null ) {
			javafxEditorJOracleTableImplementation = new JOracleTableImplementationEditor();
		}
		return( javafxEditorJOracleTableImplementation );
	}

	public void setJavaFXEditorJOracleTableImplementation( JOracleTableImplementationEditor value ) {
		javafxEditorJOracleTableImplementation = value;
	}

	public JPgSqlTableImportCFLabel getJavaFXLabelJPgSqlTableImport() {
		if( javafxLabelJPgSqlTableImport == null ) {
			javafxLabelJPgSqlTableImport = new JPgSqlTableImportCFLabel();
		}
		return( javafxLabelJPgSqlTableImport );
	}

	public void setJavaFXLabelJPgSqlTableImport( JPgSqlTableImportCFLabel value ) {
		javafxLabelJPgSqlTableImport = value;
	}

	public JPgSqlTableImportEditor getJavaFXEditorJPgSqlTableImport() {
		if( javafxEditorJPgSqlTableImport == null ) {
			javafxEditorJPgSqlTableImport = new JPgSqlTableImportEditor();
		}
		return( javafxEditorJPgSqlTableImport );
	}

	public void setJavaFXEditorJPgSqlTableImport( JPgSqlTableImportEditor value ) {
		javafxEditorJPgSqlTableImport = value;
	}

	public JPgSqlTableMembersCFLabel getJavaFXLabelJPgSqlTableMembers() {
		if( javafxLabelJPgSqlTableMembers == null ) {
			javafxLabelJPgSqlTableMembers = new JPgSqlTableMembersCFLabel();
		}
		return( javafxLabelJPgSqlTableMembers );
	}

	public void setJavaFXLabelJPgSqlTableMembers( JPgSqlTableMembersCFLabel value ) {
		javafxLabelJPgSqlTableMembers = value;
	}

	public JPgSqlTableMembersEditor getJavaFXEditorJPgSqlTableMembers() {
		if( javafxEditorJPgSqlTableMembers == null ) {
			javafxEditorJPgSqlTableMembers = new JPgSqlTableMembersEditor();
		}
		return( javafxEditorJPgSqlTableMembers );
	}

	public void setJavaFXEditorJPgSqlTableMembers( JPgSqlTableMembersEditor value ) {
		javafxEditorJPgSqlTableMembers = value;
	}

	public JPgSqlTableImplementationCFLabel getJavaFXLabelJPgSqlTableImplementation() {
		if( javafxLabelJPgSqlTableImplementation == null ) {
			javafxLabelJPgSqlTableImplementation = new JPgSqlTableImplementationCFLabel();
		}
		return( javafxLabelJPgSqlTableImplementation );
	}

	public void setJavaFXLabelJPgSqlTableImplementation( JPgSqlTableImplementationCFLabel value ) {
		javafxLabelJPgSqlTableImplementation = value;
	}

	public JPgSqlTableImplementationEditor getJavaFXEditorJPgSqlTableImplementation() {
		if( javafxEditorJPgSqlTableImplementation == null ) {
			javafxEditorJPgSqlTableImplementation = new JPgSqlTableImplementationEditor();
		}
		return( javafxEditorJPgSqlTableImplementation );
	}

	public void setJavaFXEditorJPgSqlTableImplementation( JPgSqlTableImplementationEditor value ) {
		javafxEditorJPgSqlTableImplementation = value;
	}

	public JRamTableImportCFLabel getJavaFXLabelJRamTableImport() {
		if( javafxLabelJRamTableImport == null ) {
			javafxLabelJRamTableImport = new JRamTableImportCFLabel();
		}
		return( javafxLabelJRamTableImport );
	}

	public void setJavaFXLabelJRamTableImport( JRamTableImportCFLabel value ) {
		javafxLabelJRamTableImport = value;
	}

	public JRamTableImportEditor getJavaFXEditorJRamTableImport() {
		if( javafxEditorJRamTableImport == null ) {
			javafxEditorJRamTableImport = new JRamTableImportEditor();
		}
		return( javafxEditorJRamTableImport );
	}

	public void setJavaFXEditorJRamTableImport( JRamTableImportEditor value ) {
		javafxEditorJRamTableImport = value;
	}

	public JRamTableMembersCFLabel getJavaFXLabelJRamTableMembers() {
		if( javafxLabelJRamTableMembers == null ) {
			javafxLabelJRamTableMembers = new JRamTableMembersCFLabel();
		}
		return( javafxLabelJRamTableMembers );
	}

	public void setJavaFXLabelJRamTableMembers( JRamTableMembersCFLabel value ) {
		javafxLabelJRamTableMembers = value;
	}

	public JRamTableMembersEditor getJavaFXEditorJRamTableMembers() {
		if( javafxEditorJRamTableMembers == null ) {
			javafxEditorJRamTableMembers = new JRamTableMembersEditor();
		}
		return( javafxEditorJRamTableMembers );
	}

	public void setJavaFXEditorJRamTableMembers( JRamTableMembersEditor value ) {
		javafxEditorJRamTableMembers = value;
	}

	public JRamTableImplementationCFLabel getJavaFXLabelJRamTableImplementation() {
		if( javafxLabelJRamTableImplementation == null ) {
			javafxLabelJRamTableImplementation = new JRamTableImplementationCFLabel();
		}
		return( javafxLabelJRamTableImplementation );
	}

	public void setJavaFXLabelJRamTableImplementation( JRamTableImplementationCFLabel value ) {
		javafxLabelJRamTableImplementation = value;
	}

	public JRamTableImplementationEditor getJavaFXEditorJRamTableImplementation() {
		if( javafxEditorJRamTableImplementation == null ) {
			javafxEditorJRamTableImplementation = new JRamTableImplementationEditor();
		}
		return( javafxEditorJRamTableImplementation );
	}

	public void setJavaFXEditorJRamTableImplementation( JRamTableImplementationEditor value ) {
		javafxEditorJRamTableImplementation = value;
	}

	public JSaxLoaderImportCFLabel getJavaFXLabelJSaxLoaderImport() {
		if( javafxLabelJSaxLoaderImport == null ) {
			javafxLabelJSaxLoaderImport = new JSaxLoaderImportCFLabel();
		}
		return( javafxLabelJSaxLoaderImport );
	}

	public void setJavaFXLabelJSaxLoaderImport( JSaxLoaderImportCFLabel value ) {
		javafxLabelJSaxLoaderImport = value;
	}

	public JSaxLoaderImportEditor getJavaFXEditorJSaxLoaderImport() {
		if( javafxEditorJSaxLoaderImport == null ) {
			javafxEditorJSaxLoaderImport = new JSaxLoaderImportEditor();
		}
		return( javafxEditorJSaxLoaderImport );
	}

	public void setJavaFXEditorJSaxLoaderImport( JSaxLoaderImportEditor value ) {
		javafxEditorJSaxLoaderImport = value;
	}

	public JSaxLoaderStartElementCFLabel getJavaFXLabelJSaxLoaderStartElement() {
		if( javafxLabelJSaxLoaderStartElement == null ) {
			javafxLabelJSaxLoaderStartElement = new JSaxLoaderStartElementCFLabel();
		}
		return( javafxLabelJSaxLoaderStartElement );
	}

	public void setJavaFXLabelJSaxLoaderStartElement( JSaxLoaderStartElementCFLabel value ) {
		javafxLabelJSaxLoaderStartElement = value;
	}

	public JSaxLoaderStartElementEditor getJavaFXEditorJSaxLoaderStartElement() {
		if( javafxEditorJSaxLoaderStartElement == null ) {
			javafxEditorJSaxLoaderStartElement = new JSaxLoaderStartElementEditor();
		}
		return( javafxEditorJSaxLoaderStartElement );
	}

	public void setJavaFXEditorJSaxLoaderStartElement( JSaxLoaderStartElementEditor value ) {
		javafxEditorJSaxLoaderStartElement = value;
	}

	public JSaxLoaderEndElementCFLabel getJavaFXLabelJSaxLoaderEndElement() {
		if( javafxLabelJSaxLoaderEndElement == null ) {
			javafxLabelJSaxLoaderEndElement = new JSaxLoaderEndElementCFLabel();
		}
		return( javafxLabelJSaxLoaderEndElement );
	}

	public void setJavaFXLabelJSaxLoaderEndElement( JSaxLoaderEndElementCFLabel value ) {
		javafxLabelJSaxLoaderEndElement = value;
	}

	public JSaxLoaderEndElementEditor getJavaFXEditorJSaxLoaderEndElement() {
		if( javafxEditorJSaxLoaderEndElement == null ) {
			javafxEditorJSaxLoaderEndElement = new JSaxLoaderEndElementEditor();
		}
		return( javafxEditorJSaxLoaderEndElement );
	}

	public void setJavaFXEditorJSaxLoaderEndElement( JSaxLoaderEndElementEditor value ) {
		javafxEditorJSaxLoaderEndElement = value;
	}

	public JXMsgTableImportCFLabel getJavaFXLabelJXMsgTableImport() {
		if( javafxLabelJXMsgTableImport == null ) {
			javafxLabelJXMsgTableImport = new JXMsgTableImportCFLabel();
		}
		return( javafxLabelJXMsgTableImport );
	}

	public void setJavaFXLabelJXMsgTableImport( JXMsgTableImportCFLabel value ) {
		javafxLabelJXMsgTableImport = value;
	}

	public JXMsgTableImportEditor getJavaFXEditorJXMsgTableImport() {
		if( javafxEditorJXMsgTableImport == null ) {
			javafxEditorJXMsgTableImport = new JXMsgTableImportEditor();
		}
		return( javafxEditorJXMsgTableImport );
	}

	public void setJavaFXEditorJXMsgTableImport( JXMsgTableImportEditor value ) {
		javafxEditorJXMsgTableImport = value;
	}

	public JXMsgTableFormattersCFLabel getJavaFXLabelJXMsgTableFormatters() {
		if( javafxLabelJXMsgTableFormatters == null ) {
			javafxLabelJXMsgTableFormatters = new JXMsgTableFormattersCFLabel();
		}
		return( javafxLabelJXMsgTableFormatters );
	}

	public void setJavaFXLabelJXMsgTableFormatters( JXMsgTableFormattersCFLabel value ) {
		javafxLabelJXMsgTableFormatters = value;
	}

	public JXMsgTableFormattersEditor getJavaFXEditorJXMsgTableFormatters() {
		if( javafxEditorJXMsgTableFormatters == null ) {
			javafxEditorJXMsgTableFormatters = new JXMsgTableFormattersEditor();
		}
		return( javafxEditorJXMsgTableFormatters );
	}

	public void setJavaFXEditorJXMsgTableFormatters( JXMsgTableFormattersEditor value ) {
		javafxEditorJXMsgTableFormatters = value;
	}

	public JXMsgRqstTableImportCFLabel getJavaFXLabelJXMsgRqstTableImport() {
		if( javafxLabelJXMsgRqstTableImport == null ) {
			javafxLabelJXMsgRqstTableImport = new JXMsgRqstTableImportCFLabel();
		}
		return( javafxLabelJXMsgRqstTableImport );
	}

	public void setJavaFXLabelJXMsgRqstTableImport( JXMsgRqstTableImportCFLabel value ) {
		javafxLabelJXMsgRqstTableImport = value;
	}

	public JXMsgRqstTableImportEditor getJavaFXEditorJXMsgRqstTableImport() {
		if( javafxEditorJXMsgRqstTableImport == null ) {
			javafxEditorJXMsgRqstTableImport = new JXMsgRqstTableImportEditor();
		}
		return( javafxEditorJXMsgRqstTableImport );
	}

	public void setJavaFXEditorJXMsgRqstTableImport( JXMsgRqstTableImportEditor value ) {
		javafxEditorJXMsgRqstTableImport = value;
	}

	public JXMsgRspnTableImportCFLabel getJavaFXLabelJXMsgRspnTableImport() {
		if( javafxLabelJXMsgRspnTableImport == null ) {
			javafxLabelJXMsgRspnTableImport = new JXMsgRspnTableImportCFLabel();
		}
		return( javafxLabelJXMsgRspnTableImport );
	}

	public void setJavaFXLabelJXMsgRspnTableImport( JXMsgRspnTableImportCFLabel value ) {
		javafxLabelJXMsgRspnTableImport = value;
	}

	public JXMsgRspnTableImportEditor getJavaFXEditorJXMsgRspnTableImport() {
		if( javafxEditorJXMsgRspnTableImport == null ) {
			javafxEditorJXMsgRspnTableImport = new JXMsgRspnTableImportEditor();
		}
		return( javafxEditorJXMsgRspnTableImport );
	}

	public void setJavaFXEditorJXMsgRspnTableImport( JXMsgRspnTableImportEditor value ) {
		javafxEditorJXMsgRspnTableImport = value;
	}

	public JXMsgClientTableImportCFLabel getJavaFXLabelJXMsgClientTableImport() {
		if( javafxLabelJXMsgClientTableImport == null ) {
			javafxLabelJXMsgClientTableImport = new JXMsgClientTableImportCFLabel();
		}
		return( javafxLabelJXMsgClientTableImport );
	}

	public void setJavaFXLabelJXMsgClientTableImport( JXMsgClientTableImportCFLabel value ) {
		javafxLabelJXMsgClientTableImport = value;
	}

	public JXMsgClientTableImportEditor getJavaFXEditorJXMsgClientTableImport() {
		if( javafxEditorJXMsgClientTableImport == null ) {
			javafxEditorJXMsgClientTableImport = new JXMsgClientTableImportEditor();
		}
		return( javafxEditorJXMsgClientTableImport );
	}

	public void setJavaFXEditorJXMsgClientTableImport( JXMsgClientTableImportEditor value ) {
		javafxEditorJXMsgClientTableImport = value;
	}

	public JXMsgRqstTableBodyCFLabel getJavaFXLabelJXMsgRqstTableBody() {
		if( javafxLabelJXMsgRqstTableBody == null ) {
			javafxLabelJXMsgRqstTableBody = new JXMsgRqstTableBodyCFLabel();
		}
		return( javafxLabelJXMsgRqstTableBody );
	}

	public void setJavaFXLabelJXMsgRqstTableBody( JXMsgRqstTableBodyCFLabel value ) {
		javafxLabelJXMsgRqstTableBody = value;
	}

	public JXMsgRqstTableBodyEditor getJavaFXEditorJXMsgRqstTableBody() {
		if( javafxEditorJXMsgRqstTableBody == null ) {
			javafxEditorJXMsgRqstTableBody = new JXMsgRqstTableBodyEditor();
		}
		return( javafxEditorJXMsgRqstTableBody );
	}

	public void setJavaFXEditorJXMsgRqstTableBody( JXMsgRqstTableBodyEditor value ) {
		javafxEditorJXMsgRqstTableBody = value;
	}

	public JXMsgRspnTableBodyCFLabel getJavaFXLabelJXMsgRspnTableBody() {
		if( javafxLabelJXMsgRspnTableBody == null ) {
			javafxLabelJXMsgRspnTableBody = new JXMsgRspnTableBodyCFLabel();
		}
		return( javafxLabelJXMsgRspnTableBody );
	}

	public void setJavaFXLabelJXMsgRspnTableBody( JXMsgRspnTableBodyCFLabel value ) {
		javafxLabelJXMsgRspnTableBody = value;
	}

	public JXMsgRspnTableBodyEditor getJavaFXEditorJXMsgRspnTableBody() {
		if( javafxEditorJXMsgRspnTableBody == null ) {
			javafxEditorJXMsgRspnTableBody = new JXMsgRspnTableBodyEditor();
		}
		return( javafxEditorJXMsgRspnTableBody );
	}

	public void setJavaFXEditorJXMsgRspnTableBody( JXMsgRspnTableBodyEditor value ) {
		javafxEditorJXMsgRspnTableBody = value;
	}

	public JXMsgClientTableBodyCFLabel getJavaFXLabelJXMsgClientTableBody() {
		if( javafxLabelJXMsgClientTableBody == null ) {
			javafxLabelJXMsgClientTableBody = new JXMsgClientTableBodyCFLabel();
		}
		return( javafxLabelJXMsgClientTableBody );
	}

	public void setJavaFXLabelJXMsgClientTableBody( JXMsgClientTableBodyCFLabel value ) {
		javafxLabelJXMsgClientTableBody = value;
	}

	public JXMsgClientTableBodyEditor getJavaFXEditorJXMsgClientTableBody() {
		if( javafxEditorJXMsgClientTableBody == null ) {
			javafxEditorJXMsgClientTableBody = new JXMsgClientTableBodyEditor();
		}
		return( javafxEditorJXMsgClientTableBody );
	}

	public void setJavaFXEditorJXMsgClientTableBody( JXMsgClientTableBodyEditor value ) {
		javafxEditorJXMsgClientTableBody = value;
	}

	public CppObjMembersCFLabel getJavaFXLabelCppObjMembers() {
		if( javafxLabelCppObjMembers == null ) {
			javafxLabelCppObjMembers = new CppObjMembersCFLabel();
		}
		return( javafxLabelCppObjMembers );
	}

	public void setJavaFXLabelCppObjMembers( CppObjMembersCFLabel value ) {
		javafxLabelCppObjMembers = value;
	}

	public CppObjMembersEditor getJavaFXEditorCppObjMembers() {
		if( javafxEditorCppObjMembers == null ) {
			javafxEditorCppObjMembers = new CppObjMembersEditor();
		}
		return( javafxEditorCppObjMembers );
	}

	public void setJavaFXEditorCppObjMembers( CppObjMembersEditor value ) {
		javafxEditorCppObjMembers = value;
	}

	public CppObjInterfaceCFLabel getJavaFXLabelCppObjInterface() {
		if( javafxLabelCppObjInterface == null ) {
			javafxLabelCppObjInterface = new CppObjInterfaceCFLabel();
		}
		return( javafxLabelCppObjInterface );
	}

	public void setJavaFXLabelCppObjInterface( CppObjInterfaceCFLabel value ) {
		javafxLabelCppObjInterface = value;
	}

	public CppObjInterfaceEditor getJavaFXEditorCppObjInterface() {
		if( javafxEditorCppObjInterface == null ) {
			javafxEditorCppObjInterface = new CppObjInterfaceEditor();
		}
		return( javafxEditorCppObjInterface );
	}

	public void setJavaFXEditorCppObjInterface( CppObjInterfaceEditor value ) {
		javafxEditorCppObjInterface = value;
	}

	public CppObjIncludeCFLabel getJavaFXLabelCppObjInclude() {
		if( javafxLabelCppObjInclude == null ) {
			javafxLabelCppObjInclude = new CppObjIncludeCFLabel();
		}
		return( javafxLabelCppObjInclude );
	}

	public void setJavaFXLabelCppObjInclude( CppObjIncludeCFLabel value ) {
		javafxLabelCppObjInclude = value;
	}

	public CppObjIncludeEditor getJavaFXEditorCppObjInclude() {
		if( javafxEditorCppObjInclude == null ) {
			javafxEditorCppObjInclude = new CppObjIncludeEditor();
		}
		return( javafxEditorCppObjInclude );
	}

	public void setJavaFXEditorCppObjInclude( CppObjIncludeEditor value ) {
		javafxEditorCppObjInclude = value;
	}

	public CppObjImplementationCFLabel getJavaFXLabelCppObjImplementation() {
		if( javafxLabelCppObjImplementation == null ) {
			javafxLabelCppObjImplementation = new CppObjImplementationCFLabel();
		}
		return( javafxLabelCppObjImplementation );
	}

	public void setJavaFXLabelCppObjImplementation( CppObjImplementationCFLabel value ) {
		javafxLabelCppObjImplementation = value;
	}

	public CppObjImplementationEditor getJavaFXEditorCppObjImplementation() {
		if( javafxEditorCppObjImplementation == null ) {
			javafxEditorCppObjImplementation = new CppObjImplementationEditor();
		}
		return( javafxEditorCppObjImplementation );
	}

	public void setJavaFXEditorCppObjImplementation( CppObjImplementationEditor value ) {
		javafxEditorCppObjImplementation = value;
	}

	public CppEditObjMembersCFLabel getJavaFXLabelCppEditObjMembers() {
		if( javafxLabelCppEditObjMembers == null ) {
			javafxLabelCppEditObjMembers = new CppEditObjMembersCFLabel();
		}
		return( javafxLabelCppEditObjMembers );
	}

	public void setJavaFXLabelCppEditObjMembers( CppEditObjMembersCFLabel value ) {
		javafxLabelCppEditObjMembers = value;
	}

	public CppEditObjMembersEditor getJavaFXEditorCppEditObjMembers() {
		if( javafxEditorCppEditObjMembers == null ) {
			javafxEditorCppEditObjMembers = new CppEditObjMembersEditor();
		}
		return( javafxEditorCppEditObjMembers );
	}

	public void setJavaFXEditorCppEditObjMembers( CppEditObjMembersEditor value ) {
		javafxEditorCppEditObjMembers = value;
	}

	public CppEditObjInterfaceCFLabel getJavaFXLabelCppEditObjInterface() {
		if( javafxLabelCppEditObjInterface == null ) {
			javafxLabelCppEditObjInterface = new CppEditObjInterfaceCFLabel();
		}
		return( javafxLabelCppEditObjInterface );
	}

	public void setJavaFXLabelCppEditObjInterface( CppEditObjInterfaceCFLabel value ) {
		javafxLabelCppEditObjInterface = value;
	}

	public CppEditObjInterfaceEditor getJavaFXEditorCppEditObjInterface() {
		if( javafxEditorCppEditObjInterface == null ) {
			javafxEditorCppEditObjInterface = new CppEditObjInterfaceEditor();
		}
		return( javafxEditorCppEditObjInterface );
	}

	public void setJavaFXEditorCppEditObjInterface( CppEditObjInterfaceEditor value ) {
		javafxEditorCppEditObjInterface = value;
	}

	public CppEditObjIncludeCFLabel getJavaFXLabelCppEditObjInclude() {
		if( javafxLabelCppEditObjInclude == null ) {
			javafxLabelCppEditObjInclude = new CppEditObjIncludeCFLabel();
		}
		return( javafxLabelCppEditObjInclude );
	}

	public void setJavaFXLabelCppEditObjInclude( CppEditObjIncludeCFLabel value ) {
		javafxLabelCppEditObjInclude = value;
	}

	public CppEditObjIncludeEditor getJavaFXEditorCppEditObjInclude() {
		if( javafxEditorCppEditObjInclude == null ) {
			javafxEditorCppEditObjInclude = new CppEditObjIncludeEditor();
		}
		return( javafxEditorCppEditObjInclude );
	}

	public void setJavaFXEditorCppEditObjInclude( CppEditObjIncludeEditor value ) {
		javafxEditorCppEditObjInclude = value;
	}

	public CppEditObjImplementationCFLabel getJavaFXLabelCppEditObjImplementation() {
		if( javafxLabelCppEditObjImplementation == null ) {
			javafxLabelCppEditObjImplementation = new CppEditObjImplementationCFLabel();
		}
		return( javafxLabelCppEditObjImplementation );
	}

	public void setJavaFXLabelCppEditObjImplementation( CppEditObjImplementationCFLabel value ) {
		javafxLabelCppEditObjImplementation = value;
	}

	public CppEditObjImplementationEditor getJavaFXEditorCppEditObjImplementation() {
		if( javafxEditorCppEditObjImplementation == null ) {
			javafxEditorCppEditObjImplementation = new CppEditObjImplementationEditor();
		}
		return( javafxEditorCppEditObjImplementation );
	}

	public void setJavaFXEditorCppEditObjImplementation( CppEditObjImplementationEditor value ) {
		javafxEditorCppEditObjImplementation = value;
	}

	public CppTableIncludeCFLabel getJavaFXLabelCppTableInclude() {
		if( javafxLabelCppTableInclude == null ) {
			javafxLabelCppTableInclude = new CppTableIncludeCFLabel();
		}
		return( javafxLabelCppTableInclude );
	}

	public void setJavaFXLabelCppTableInclude( CppTableIncludeCFLabel value ) {
		javafxLabelCppTableInclude = value;
	}

	public CppTableIncludeEditor getJavaFXEditorCppTableInclude() {
		if( javafxEditorCppTableInclude == null ) {
			javafxEditorCppTableInclude = new CppTableIncludeEditor();
		}
		return( javafxEditorCppTableInclude );
	}

	public void setJavaFXEditorCppTableInclude( CppTableIncludeEditor value ) {
		javafxEditorCppTableInclude = value;
	}

	public CppTableMembersCFLabel getJavaFXLabelCppTableMembers() {
		if( javafxLabelCppTableMembers == null ) {
			javafxLabelCppTableMembers = new CppTableMembersCFLabel();
		}
		return( javafxLabelCppTableMembers );
	}

	public void setJavaFXLabelCppTableMembers( CppTableMembersCFLabel value ) {
		javafxLabelCppTableMembers = value;
	}

	public CppTableMembersEditor getJavaFXEditorCppTableMembers() {
		if( javafxEditorCppTableMembers == null ) {
			javafxEditorCppTableMembers = new CppTableMembersEditor();
		}
		return( javafxEditorCppTableMembers );
	}

	public void setJavaFXEditorCppTableMembers( CppTableMembersEditor value ) {
		javafxEditorCppTableMembers = value;
	}

	public CppTableInterfaceCFLabel getJavaFXLabelCppTableInterface() {
		if( javafxLabelCppTableInterface == null ) {
			javafxLabelCppTableInterface = new CppTableInterfaceCFLabel();
		}
		return( javafxLabelCppTableInterface );
	}

	public void setJavaFXLabelCppTableInterface( CppTableInterfaceCFLabel value ) {
		javafxLabelCppTableInterface = value;
	}

	public CppTableInterfaceEditor getJavaFXEditorCppTableInterface() {
		if( javafxEditorCppTableInterface == null ) {
			javafxEditorCppTableInterface = new CppTableInterfaceEditor();
		}
		return( javafxEditorCppTableInterface );
	}

	public void setJavaFXEditorCppTableInterface( CppTableInterfaceEditor value ) {
		javafxEditorCppTableInterface = value;
	}

	public CppTableImplementationCFLabel getJavaFXLabelCppTableImplementation() {
		if( javafxLabelCppTableImplementation == null ) {
			javafxLabelCppTableImplementation = new CppTableImplementationCFLabel();
		}
		return( javafxLabelCppTableImplementation );
	}

	public void setJavaFXLabelCppTableImplementation( CppTableImplementationCFLabel value ) {
		javafxLabelCppTableImplementation = value;
	}

	public CppTableImplementationEditor getJavaFXEditorCppTableImplementation() {
		if( javafxEditorCppTableImplementation == null ) {
			javafxEditorCppTableImplementation = new CppTableImplementationEditor();
		}
		return( javafxEditorCppTableImplementation );
	}

	public void setJavaFXEditorCppTableImplementation( CppTableImplementationEditor value ) {
		javafxEditorCppTableImplementation = value;
	}

	public CppTableObjIncludeCFLabel getJavaFXLabelCppTableObjInclude() {
		if( javafxLabelCppTableObjInclude == null ) {
			javafxLabelCppTableObjInclude = new CppTableObjIncludeCFLabel();
		}
		return( javafxLabelCppTableObjInclude );
	}

	public void setJavaFXLabelCppTableObjInclude( CppTableObjIncludeCFLabel value ) {
		javafxLabelCppTableObjInclude = value;
	}

	public CppTableObjIncludeEditor getJavaFXEditorCppTableObjInclude() {
		if( javafxEditorCppTableObjInclude == null ) {
			javafxEditorCppTableObjInclude = new CppTableObjIncludeEditor();
		}
		return( javafxEditorCppTableObjInclude );
	}

	public void setJavaFXEditorCppTableObjInclude( CppTableObjIncludeEditor value ) {
		javafxEditorCppTableObjInclude = value;
	}

	public CppTableObjMembersCFLabel getJavaFXLabelCppTableObjMembers() {
		if( javafxLabelCppTableObjMembers == null ) {
			javafxLabelCppTableObjMembers = new CppTableObjMembersCFLabel();
		}
		return( javafxLabelCppTableObjMembers );
	}

	public void setJavaFXLabelCppTableObjMembers( CppTableObjMembersCFLabel value ) {
		javafxLabelCppTableObjMembers = value;
	}

	public CppTableObjMembersEditor getJavaFXEditorCppTableObjMembers() {
		if( javafxEditorCppTableObjMembers == null ) {
			javafxEditorCppTableObjMembers = new CppTableObjMembersEditor();
		}
		return( javafxEditorCppTableObjMembers );
	}

	public void setJavaFXEditorCppTableObjMembers( CppTableObjMembersEditor value ) {
		javafxEditorCppTableObjMembers = value;
	}

	public CppTableObjInterfaceCFLabel getJavaFXLabelCppTableObjInterface() {
		if( javafxLabelCppTableObjInterface == null ) {
			javafxLabelCppTableObjInterface = new CppTableObjInterfaceCFLabel();
		}
		return( javafxLabelCppTableObjInterface );
	}

	public void setJavaFXLabelCppTableObjInterface( CppTableObjInterfaceCFLabel value ) {
		javafxLabelCppTableObjInterface = value;
	}

	public CppTableObjInterfaceEditor getJavaFXEditorCppTableObjInterface() {
		if( javafxEditorCppTableObjInterface == null ) {
			javafxEditorCppTableObjInterface = new CppTableObjInterfaceEditor();
		}
		return( javafxEditorCppTableObjInterface );
	}

	public void setJavaFXEditorCppTableObjInterface( CppTableObjInterfaceEditor value ) {
		javafxEditorCppTableObjInterface = value;
	}

	public CppTableObjImplementationCFLabel getJavaFXLabelCppTableObjImplementation() {
		if( javafxLabelCppTableObjImplementation == null ) {
			javafxLabelCppTableObjImplementation = new CppTableObjImplementationCFLabel();
		}
		return( javafxLabelCppTableObjImplementation );
	}

	public void setJavaFXLabelCppTableObjImplementation( CppTableObjImplementationCFLabel value ) {
		javafxLabelCppTableObjImplementation = value;
	}

	public CppTableObjImplementationEditor getJavaFXEditorCppTableObjImplementation() {
		if( javafxEditorCppTableObjImplementation == null ) {
			javafxEditorCppTableObjImplementation = new CppTableObjImplementationEditor();
		}
		return( javafxEditorCppTableObjImplementation );
	}

	public void setJavaFXEditorCppTableObjImplementation( CppTableObjImplementationEditor value ) {
		javafxEditorCppTableObjImplementation = value;
	}

	public CppDb2LUWTableIncludeCFLabel getJavaFXLabelCppDb2LUWTableInclude() {
		if( javafxLabelCppDb2LUWTableInclude == null ) {
			javafxLabelCppDb2LUWTableInclude = new CppDb2LUWTableIncludeCFLabel();
		}
		return( javafxLabelCppDb2LUWTableInclude );
	}

	public void setJavaFXLabelCppDb2LUWTableInclude( CppDb2LUWTableIncludeCFLabel value ) {
		javafxLabelCppDb2LUWTableInclude = value;
	}

	public CppDb2LUWTableIncludeEditor getJavaFXEditorCppDb2LUWTableInclude() {
		if( javafxEditorCppDb2LUWTableInclude == null ) {
			javafxEditorCppDb2LUWTableInclude = new CppDb2LUWTableIncludeEditor();
		}
		return( javafxEditorCppDb2LUWTableInclude );
	}

	public void setJavaFXEditorCppDb2LUWTableInclude( CppDb2LUWTableIncludeEditor value ) {
		javafxEditorCppDb2LUWTableInclude = value;
	}

	public CppDb2LUWTableMembersCFLabel getJavaFXLabelCppDb2LUWTableMembers() {
		if( javafxLabelCppDb2LUWTableMembers == null ) {
			javafxLabelCppDb2LUWTableMembers = new CppDb2LUWTableMembersCFLabel();
		}
		return( javafxLabelCppDb2LUWTableMembers );
	}

	public void setJavaFXLabelCppDb2LUWTableMembers( CppDb2LUWTableMembersCFLabel value ) {
		javafxLabelCppDb2LUWTableMembers = value;
	}

	public CppDb2LUWTableMembersEditor getJavaFXEditorCppDb2LUWTableMembers() {
		if( javafxEditorCppDb2LUWTableMembers == null ) {
			javafxEditorCppDb2LUWTableMembers = new CppDb2LUWTableMembersEditor();
		}
		return( javafxEditorCppDb2LUWTableMembers );
	}

	public void setJavaFXEditorCppDb2LUWTableMembers( CppDb2LUWTableMembersEditor value ) {
		javafxEditorCppDb2LUWTableMembers = value;
	}

	public CppDb2LUWTableImplementationCFLabel getJavaFXLabelCppDb2LUWTableImplementation() {
		if( javafxLabelCppDb2LUWTableImplementation == null ) {
			javafxLabelCppDb2LUWTableImplementation = new CppDb2LUWTableImplementationCFLabel();
		}
		return( javafxLabelCppDb2LUWTableImplementation );
	}

	public void setJavaFXLabelCppDb2LUWTableImplementation( CppDb2LUWTableImplementationCFLabel value ) {
		javafxLabelCppDb2LUWTableImplementation = value;
	}

	public CppDb2LUWTableImplementationEditor getJavaFXEditorCppDb2LUWTableImplementation() {
		if( javafxEditorCppDb2LUWTableImplementation == null ) {
			javafxEditorCppDb2LUWTableImplementation = new CppDb2LUWTableImplementationEditor();
		}
		return( javafxEditorCppDb2LUWTableImplementation );
	}

	public void setJavaFXEditorCppDb2LUWTableImplementation( CppDb2LUWTableImplementationEditor value ) {
		javafxEditorCppDb2LUWTableImplementation = value;
	}

	public CppMSSqlTableIncludeCFLabel getJavaFXLabelCppMSSqlTableInclude() {
		if( javafxLabelCppMSSqlTableInclude == null ) {
			javafxLabelCppMSSqlTableInclude = new CppMSSqlTableIncludeCFLabel();
		}
		return( javafxLabelCppMSSqlTableInclude );
	}

	public void setJavaFXLabelCppMSSqlTableInclude( CppMSSqlTableIncludeCFLabel value ) {
		javafxLabelCppMSSqlTableInclude = value;
	}

	public CppMSSqlTableIncludeEditor getJavaFXEditorCppMSSqlTableInclude() {
		if( javafxEditorCppMSSqlTableInclude == null ) {
			javafxEditorCppMSSqlTableInclude = new CppMSSqlTableIncludeEditor();
		}
		return( javafxEditorCppMSSqlTableInclude );
	}

	public void setJavaFXEditorCppMSSqlTableInclude( CppMSSqlTableIncludeEditor value ) {
		javafxEditorCppMSSqlTableInclude = value;
	}

	public CppMSSqlTableMembersCFLabel getJavaFXLabelCppMSSqlTableMembers() {
		if( javafxLabelCppMSSqlTableMembers == null ) {
			javafxLabelCppMSSqlTableMembers = new CppMSSqlTableMembersCFLabel();
		}
		return( javafxLabelCppMSSqlTableMembers );
	}

	public void setJavaFXLabelCppMSSqlTableMembers( CppMSSqlTableMembersCFLabel value ) {
		javafxLabelCppMSSqlTableMembers = value;
	}

	public CppMSSqlTableMembersEditor getJavaFXEditorCppMSSqlTableMembers() {
		if( javafxEditorCppMSSqlTableMembers == null ) {
			javafxEditorCppMSSqlTableMembers = new CppMSSqlTableMembersEditor();
		}
		return( javafxEditorCppMSSqlTableMembers );
	}

	public void setJavaFXEditorCppMSSqlTableMembers( CppMSSqlTableMembersEditor value ) {
		javafxEditorCppMSSqlTableMembers = value;
	}

	public CppMSSqlTableImplementationCFLabel getJavaFXLabelCppMSSqlTableImplementation() {
		if( javafxLabelCppMSSqlTableImplementation == null ) {
			javafxLabelCppMSSqlTableImplementation = new CppMSSqlTableImplementationCFLabel();
		}
		return( javafxLabelCppMSSqlTableImplementation );
	}

	public void setJavaFXLabelCppMSSqlTableImplementation( CppMSSqlTableImplementationCFLabel value ) {
		javafxLabelCppMSSqlTableImplementation = value;
	}

	public CppMSSqlTableImplementationEditor getJavaFXEditorCppMSSqlTableImplementation() {
		if( javafxEditorCppMSSqlTableImplementation == null ) {
			javafxEditorCppMSSqlTableImplementation = new CppMSSqlTableImplementationEditor();
		}
		return( javafxEditorCppMSSqlTableImplementation );
	}

	public void setJavaFXEditorCppMSSqlTableImplementation( CppMSSqlTableImplementationEditor value ) {
		javafxEditorCppMSSqlTableImplementation = value;
	}

	public CppMySqlTableIncludeCFLabel getJavaFXLabelCppMySqlTableInclude() {
		if( javafxLabelCppMySqlTableInclude == null ) {
			javafxLabelCppMySqlTableInclude = new CppMySqlTableIncludeCFLabel();
		}
		return( javafxLabelCppMySqlTableInclude );
	}

	public void setJavaFXLabelCppMySqlTableInclude( CppMySqlTableIncludeCFLabel value ) {
		javafxLabelCppMySqlTableInclude = value;
	}

	public CppMySqlTableIncludeEditor getJavaFXEditorCppMySqlTableInclude() {
		if( javafxEditorCppMySqlTableInclude == null ) {
			javafxEditorCppMySqlTableInclude = new CppMySqlTableIncludeEditor();
		}
		return( javafxEditorCppMySqlTableInclude );
	}

	public void setJavaFXEditorCppMySqlTableInclude( CppMySqlTableIncludeEditor value ) {
		javafxEditorCppMySqlTableInclude = value;
	}

	public CppMySqlTableMembersCFLabel getJavaFXLabelCppMySqlTableMembers() {
		if( javafxLabelCppMySqlTableMembers == null ) {
			javafxLabelCppMySqlTableMembers = new CppMySqlTableMembersCFLabel();
		}
		return( javafxLabelCppMySqlTableMembers );
	}

	public void setJavaFXLabelCppMySqlTableMembers( CppMySqlTableMembersCFLabel value ) {
		javafxLabelCppMySqlTableMembers = value;
	}

	public CppMySqlTableMembersEditor getJavaFXEditorCppMySqlTableMembers() {
		if( javafxEditorCppMySqlTableMembers == null ) {
			javafxEditorCppMySqlTableMembers = new CppMySqlTableMembersEditor();
		}
		return( javafxEditorCppMySqlTableMembers );
	}

	public void setJavaFXEditorCppMySqlTableMembers( CppMySqlTableMembersEditor value ) {
		javafxEditorCppMySqlTableMembers = value;
	}

	public CppMySqlTableImplementationCFLabel getJavaFXLabelCppMySqlTableImplementation() {
		if( javafxLabelCppMySqlTableImplementation == null ) {
			javafxLabelCppMySqlTableImplementation = new CppMySqlTableImplementationCFLabel();
		}
		return( javafxLabelCppMySqlTableImplementation );
	}

	public void setJavaFXLabelCppMySqlTableImplementation( CppMySqlTableImplementationCFLabel value ) {
		javafxLabelCppMySqlTableImplementation = value;
	}

	public CppMySqlTableImplementationEditor getJavaFXEditorCppMySqlTableImplementation() {
		if( javafxEditorCppMySqlTableImplementation == null ) {
			javafxEditorCppMySqlTableImplementation = new CppMySqlTableImplementationEditor();
		}
		return( javafxEditorCppMySqlTableImplementation );
	}

	public void setJavaFXEditorCppMySqlTableImplementation( CppMySqlTableImplementationEditor value ) {
		javafxEditorCppMySqlTableImplementation = value;
	}

	public CppOracleTableIncludeCFLabel getJavaFXLabelCppOracleTableInclude() {
		if( javafxLabelCppOracleTableInclude == null ) {
			javafxLabelCppOracleTableInclude = new CppOracleTableIncludeCFLabel();
		}
		return( javafxLabelCppOracleTableInclude );
	}

	public void setJavaFXLabelCppOracleTableInclude( CppOracleTableIncludeCFLabel value ) {
		javafxLabelCppOracleTableInclude = value;
	}

	public CppOracleTableIncludeEditor getJavaFXEditorCppOracleTableInclude() {
		if( javafxEditorCppOracleTableInclude == null ) {
			javafxEditorCppOracleTableInclude = new CppOracleTableIncludeEditor();
		}
		return( javafxEditorCppOracleTableInclude );
	}

	public void setJavaFXEditorCppOracleTableInclude( CppOracleTableIncludeEditor value ) {
		javafxEditorCppOracleTableInclude = value;
	}

	public CppOracleTableMembersCFLabel getJavaFXLabelCppOracleTableMembers() {
		if( javafxLabelCppOracleTableMembers == null ) {
			javafxLabelCppOracleTableMembers = new CppOracleTableMembersCFLabel();
		}
		return( javafxLabelCppOracleTableMembers );
	}

	public void setJavaFXLabelCppOracleTableMembers( CppOracleTableMembersCFLabel value ) {
		javafxLabelCppOracleTableMembers = value;
	}

	public CppOracleTableMembersEditor getJavaFXEditorCppOracleTableMembers() {
		if( javafxEditorCppOracleTableMembers == null ) {
			javafxEditorCppOracleTableMembers = new CppOracleTableMembersEditor();
		}
		return( javafxEditorCppOracleTableMembers );
	}

	public void setJavaFXEditorCppOracleTableMembers( CppOracleTableMembersEditor value ) {
		javafxEditorCppOracleTableMembers = value;
	}

	public CppOracleTableImplementationCFLabel getJavaFXLabelCppOracleTableImplementation() {
		if( javafxLabelCppOracleTableImplementation == null ) {
			javafxLabelCppOracleTableImplementation = new CppOracleTableImplementationCFLabel();
		}
		return( javafxLabelCppOracleTableImplementation );
	}

	public void setJavaFXLabelCppOracleTableImplementation( CppOracleTableImplementationCFLabel value ) {
		javafxLabelCppOracleTableImplementation = value;
	}

	public CppOracleTableImplementationEditor getJavaFXEditorCppOracleTableImplementation() {
		if( javafxEditorCppOracleTableImplementation == null ) {
			javafxEditorCppOracleTableImplementation = new CppOracleTableImplementationEditor();
		}
		return( javafxEditorCppOracleTableImplementation );
	}

	public void setJavaFXEditorCppOracleTableImplementation( CppOracleTableImplementationEditor value ) {
		javafxEditorCppOracleTableImplementation = value;
	}

	public CppPgSqlTableIncludeCFLabel getJavaFXLabelCppPgSqlTableInclude() {
		if( javafxLabelCppPgSqlTableInclude == null ) {
			javafxLabelCppPgSqlTableInclude = new CppPgSqlTableIncludeCFLabel();
		}
		return( javafxLabelCppPgSqlTableInclude );
	}

	public void setJavaFXLabelCppPgSqlTableInclude( CppPgSqlTableIncludeCFLabel value ) {
		javafxLabelCppPgSqlTableInclude = value;
	}

	public CppPgSqlTableIncludeEditor getJavaFXEditorCppPgSqlTableInclude() {
		if( javafxEditorCppPgSqlTableInclude == null ) {
			javafxEditorCppPgSqlTableInclude = new CppPgSqlTableIncludeEditor();
		}
		return( javafxEditorCppPgSqlTableInclude );
	}

	public void setJavaFXEditorCppPgSqlTableInclude( CppPgSqlTableIncludeEditor value ) {
		javafxEditorCppPgSqlTableInclude = value;
	}

	public CppPgSqlTableMembersCFLabel getJavaFXLabelCppPgSqlTableMembers() {
		if( javafxLabelCppPgSqlTableMembers == null ) {
			javafxLabelCppPgSqlTableMembers = new CppPgSqlTableMembersCFLabel();
		}
		return( javafxLabelCppPgSqlTableMembers );
	}

	public void setJavaFXLabelCppPgSqlTableMembers( CppPgSqlTableMembersCFLabel value ) {
		javafxLabelCppPgSqlTableMembers = value;
	}

	public CppPgSqlTableMembersEditor getJavaFXEditorCppPgSqlTableMembers() {
		if( javafxEditorCppPgSqlTableMembers == null ) {
			javafxEditorCppPgSqlTableMembers = new CppPgSqlTableMembersEditor();
		}
		return( javafxEditorCppPgSqlTableMembers );
	}

	public void setJavaFXEditorCppPgSqlTableMembers( CppPgSqlTableMembersEditor value ) {
		javafxEditorCppPgSqlTableMembers = value;
	}

	public CppPgSqlTableImplementationCFLabel getJavaFXLabelCppPgSqlTableImplementation() {
		if( javafxLabelCppPgSqlTableImplementation == null ) {
			javafxLabelCppPgSqlTableImplementation = new CppPgSqlTableImplementationCFLabel();
		}
		return( javafxLabelCppPgSqlTableImplementation );
	}

	public void setJavaFXLabelCppPgSqlTableImplementation( CppPgSqlTableImplementationCFLabel value ) {
		javafxLabelCppPgSqlTableImplementation = value;
	}

	public CppPgSqlTableImplementationEditor getJavaFXEditorCppPgSqlTableImplementation() {
		if( javafxEditorCppPgSqlTableImplementation == null ) {
			javafxEditorCppPgSqlTableImplementation = new CppPgSqlTableImplementationEditor();
		}
		return( javafxEditorCppPgSqlTableImplementation );
	}

	public void setJavaFXEditorCppPgSqlTableImplementation( CppPgSqlTableImplementationEditor value ) {
		javafxEditorCppPgSqlTableImplementation = value;
	}

	public CppRamTableIncludeCFLabel getJavaFXLabelCppRamTableInclude() {
		if( javafxLabelCppRamTableInclude == null ) {
			javafxLabelCppRamTableInclude = new CppRamTableIncludeCFLabel();
		}
		return( javafxLabelCppRamTableInclude );
	}

	public void setJavaFXLabelCppRamTableInclude( CppRamTableIncludeCFLabel value ) {
		javafxLabelCppRamTableInclude = value;
	}

	public CppRamTableIncludeEditor getJavaFXEditorCppRamTableInclude() {
		if( javafxEditorCppRamTableInclude == null ) {
			javafxEditorCppRamTableInclude = new CppRamTableIncludeEditor();
		}
		return( javafxEditorCppRamTableInclude );
	}

	public void setJavaFXEditorCppRamTableInclude( CppRamTableIncludeEditor value ) {
		javafxEditorCppRamTableInclude = value;
	}

	public CppRamTableMembersCFLabel getJavaFXLabelCppRamTableMembers() {
		if( javafxLabelCppRamTableMembers == null ) {
			javafxLabelCppRamTableMembers = new CppRamTableMembersCFLabel();
		}
		return( javafxLabelCppRamTableMembers );
	}

	public void setJavaFXLabelCppRamTableMembers( CppRamTableMembersCFLabel value ) {
		javafxLabelCppRamTableMembers = value;
	}

	public CppRamTableMembersEditor getJavaFXEditorCppRamTableMembers() {
		if( javafxEditorCppRamTableMembers == null ) {
			javafxEditorCppRamTableMembers = new CppRamTableMembersEditor();
		}
		return( javafxEditorCppRamTableMembers );
	}

	public void setJavaFXEditorCppRamTableMembers( CppRamTableMembersEditor value ) {
		javafxEditorCppRamTableMembers = value;
	}

	public CppRamTableImplementationCFLabel getJavaFXLabelCppRamTableImplementation() {
		if( javafxLabelCppRamTableImplementation == null ) {
			javafxLabelCppRamTableImplementation = new CppRamTableImplementationCFLabel();
		}
		return( javafxLabelCppRamTableImplementation );
	}

	public void setJavaFXLabelCppRamTableImplementation( CppRamTableImplementationCFLabel value ) {
		javafxLabelCppRamTableImplementation = value;
	}

	public CppRamTableImplementationEditor getJavaFXEditorCppRamTableImplementation() {
		if( javafxEditorCppRamTableImplementation == null ) {
			javafxEditorCppRamTableImplementation = new CppRamTableImplementationEditor();
		}
		return( javafxEditorCppRamTableImplementation );
	}

	public void setJavaFXEditorCppRamTableImplementation( CppRamTableImplementationEditor value ) {
		javafxEditorCppRamTableImplementation = value;
	}

	public CppSaxLoaderIncludeCFLabel getJavaFXLabelCppSaxLoaderInclude() {
		if( javafxLabelCppSaxLoaderInclude == null ) {
			javafxLabelCppSaxLoaderInclude = new CppSaxLoaderIncludeCFLabel();
		}
		return( javafxLabelCppSaxLoaderInclude );
	}

	public void setJavaFXLabelCppSaxLoaderInclude( CppSaxLoaderIncludeCFLabel value ) {
		javafxLabelCppSaxLoaderInclude = value;
	}

	public CppSaxLoaderIncludeEditor getJavaFXEditorCppSaxLoaderInclude() {
		if( javafxEditorCppSaxLoaderInclude == null ) {
			javafxEditorCppSaxLoaderInclude = new CppSaxLoaderIncludeEditor();
		}
		return( javafxEditorCppSaxLoaderInclude );
	}

	public void setJavaFXEditorCppSaxLoaderInclude( CppSaxLoaderIncludeEditor value ) {
		javafxEditorCppSaxLoaderInclude = value;
	}

	public CppSaxLoaderStartElementCFLabel getJavaFXLabelCppSaxLoaderStartElement() {
		if( javafxLabelCppSaxLoaderStartElement == null ) {
			javafxLabelCppSaxLoaderStartElement = new CppSaxLoaderStartElementCFLabel();
		}
		return( javafxLabelCppSaxLoaderStartElement );
	}

	public void setJavaFXLabelCppSaxLoaderStartElement( CppSaxLoaderStartElementCFLabel value ) {
		javafxLabelCppSaxLoaderStartElement = value;
	}

	public CppSaxLoaderStartElementEditor getJavaFXEditorCppSaxLoaderStartElement() {
		if( javafxEditorCppSaxLoaderStartElement == null ) {
			javafxEditorCppSaxLoaderStartElement = new CppSaxLoaderStartElementEditor();
		}
		return( javafxEditorCppSaxLoaderStartElement );
	}

	public void setJavaFXEditorCppSaxLoaderStartElement( CppSaxLoaderStartElementEditor value ) {
		javafxEditorCppSaxLoaderStartElement = value;
	}

	public CppSaxLoaderEndElementCFLabel getJavaFXLabelCppSaxLoaderEndElement() {
		if( javafxLabelCppSaxLoaderEndElement == null ) {
			javafxLabelCppSaxLoaderEndElement = new CppSaxLoaderEndElementCFLabel();
		}
		return( javafxLabelCppSaxLoaderEndElement );
	}

	public void setJavaFXLabelCppSaxLoaderEndElement( CppSaxLoaderEndElementCFLabel value ) {
		javafxLabelCppSaxLoaderEndElement = value;
	}

	public CppSaxLoaderEndElementEditor getJavaFXEditorCppSaxLoaderEndElement() {
		if( javafxEditorCppSaxLoaderEndElement == null ) {
			javafxEditorCppSaxLoaderEndElement = new CppSaxLoaderEndElementEditor();
		}
		return( javafxEditorCppSaxLoaderEndElement );
	}

	public void setJavaFXEditorCppSaxLoaderEndElement( CppSaxLoaderEndElementEditor value ) {
		javafxEditorCppSaxLoaderEndElement = value;
	}

	public CppXMsgTableIncludeCFLabel getJavaFXLabelCppXMsgTableInclude() {
		if( javafxLabelCppXMsgTableInclude == null ) {
			javafxLabelCppXMsgTableInclude = new CppXMsgTableIncludeCFLabel();
		}
		return( javafxLabelCppXMsgTableInclude );
	}

	public void setJavaFXLabelCppXMsgTableInclude( CppXMsgTableIncludeCFLabel value ) {
		javafxLabelCppXMsgTableInclude = value;
	}

	public CppXMsgTableIncludeEditor getJavaFXEditorCppXMsgTableInclude() {
		if( javafxEditorCppXMsgTableInclude == null ) {
			javafxEditorCppXMsgTableInclude = new CppXMsgTableIncludeEditor();
		}
		return( javafxEditorCppXMsgTableInclude );
	}

	public void setJavaFXEditorCppXMsgTableInclude( CppXMsgTableIncludeEditor value ) {
		javafxEditorCppXMsgTableInclude = value;
	}

	public CppXMsgTableFormattersCFLabel getJavaFXLabelCppXMsgTableFormatters() {
		if( javafxLabelCppXMsgTableFormatters == null ) {
			javafxLabelCppXMsgTableFormatters = new CppXMsgTableFormattersCFLabel();
		}
		return( javafxLabelCppXMsgTableFormatters );
	}

	public void setJavaFXLabelCppXMsgTableFormatters( CppXMsgTableFormattersCFLabel value ) {
		javafxLabelCppXMsgTableFormatters = value;
	}

	public CppXMsgTableFormattersEditor getJavaFXEditorCppXMsgTableFormatters() {
		if( javafxEditorCppXMsgTableFormatters == null ) {
			javafxEditorCppXMsgTableFormatters = new CppXMsgTableFormattersEditor();
		}
		return( javafxEditorCppXMsgTableFormatters );
	}

	public void setJavaFXEditorCppXMsgTableFormatters( CppXMsgTableFormattersEditor value ) {
		javafxEditorCppXMsgTableFormatters = value;
	}

	public CppXMsgRqstTableIncludeCFLabel getJavaFXLabelCppXMsgRqstTableInclude() {
		if( javafxLabelCppXMsgRqstTableInclude == null ) {
			javafxLabelCppXMsgRqstTableInclude = new CppXMsgRqstTableIncludeCFLabel();
		}
		return( javafxLabelCppXMsgRqstTableInclude );
	}

	public void setJavaFXLabelCppXMsgRqstTableInclude( CppXMsgRqstTableIncludeCFLabel value ) {
		javafxLabelCppXMsgRqstTableInclude = value;
	}

	public CppXMsgRqstTableIncludeEditor getJavaFXEditorCppXMsgRqstTableInclude() {
		if( javafxEditorCppXMsgRqstTableInclude == null ) {
			javafxEditorCppXMsgRqstTableInclude = new CppXMsgRqstTableIncludeEditor();
		}
		return( javafxEditorCppXMsgRqstTableInclude );
	}

	public void setJavaFXEditorCppXMsgRqstTableInclude( CppXMsgRqstTableIncludeEditor value ) {
		javafxEditorCppXMsgRqstTableInclude = value;
	}

	public CppXMsgRspnTableIncludeCFLabel getJavaFXLabelCppXMsgRspnTableInclude() {
		if( javafxLabelCppXMsgRspnTableInclude == null ) {
			javafxLabelCppXMsgRspnTableInclude = new CppXMsgRspnTableIncludeCFLabel();
		}
		return( javafxLabelCppXMsgRspnTableInclude );
	}

	public void setJavaFXLabelCppXMsgRspnTableInclude( CppXMsgRspnTableIncludeCFLabel value ) {
		javafxLabelCppXMsgRspnTableInclude = value;
	}

	public CppXMsgRspnTableIncludeEditor getJavaFXEditorCppXMsgRspnTableInclude() {
		if( javafxEditorCppXMsgRspnTableInclude == null ) {
			javafxEditorCppXMsgRspnTableInclude = new CppXMsgRspnTableIncludeEditor();
		}
		return( javafxEditorCppXMsgRspnTableInclude );
	}

	public void setJavaFXEditorCppXMsgRspnTableInclude( CppXMsgRspnTableIncludeEditor value ) {
		javafxEditorCppXMsgRspnTableInclude = value;
	}

	public CppXMsgClientTableIncludeCFLabel getJavaFXLabelCppXMsgClientTableInclude() {
		if( javafxLabelCppXMsgClientTableInclude == null ) {
			javafxLabelCppXMsgClientTableInclude = new CppXMsgClientTableIncludeCFLabel();
		}
		return( javafxLabelCppXMsgClientTableInclude );
	}

	public void setJavaFXLabelCppXMsgClientTableInclude( CppXMsgClientTableIncludeCFLabel value ) {
		javafxLabelCppXMsgClientTableInclude = value;
	}

	public CppXMsgClientTableIncludeEditor getJavaFXEditorCppXMsgClientTableInclude() {
		if( javafxEditorCppXMsgClientTableInclude == null ) {
			javafxEditorCppXMsgClientTableInclude = new CppXMsgClientTableIncludeEditor();
		}
		return( javafxEditorCppXMsgClientTableInclude );
	}

	public void setJavaFXEditorCppXMsgClientTableInclude( CppXMsgClientTableIncludeEditor value ) {
		javafxEditorCppXMsgClientTableInclude = value;
	}

	public CppXMsgRqstTableBodyCFLabel getJavaFXLabelCppXMsgRqstTableBody() {
		if( javafxLabelCppXMsgRqstTableBody == null ) {
			javafxLabelCppXMsgRqstTableBody = new CppXMsgRqstTableBodyCFLabel();
		}
		return( javafxLabelCppXMsgRqstTableBody );
	}

	public void setJavaFXLabelCppXMsgRqstTableBody( CppXMsgRqstTableBodyCFLabel value ) {
		javafxLabelCppXMsgRqstTableBody = value;
	}

	public CppXMsgRqstTableBodyEditor getJavaFXEditorCppXMsgRqstTableBody() {
		if( javafxEditorCppXMsgRqstTableBody == null ) {
			javafxEditorCppXMsgRqstTableBody = new CppXMsgRqstTableBodyEditor();
		}
		return( javafxEditorCppXMsgRqstTableBody );
	}

	public void setJavaFXEditorCppXMsgRqstTableBody( CppXMsgRqstTableBodyEditor value ) {
		javafxEditorCppXMsgRqstTableBody = value;
	}

	public CppXMsgRspnTableBodyCFLabel getJavaFXLabelCppXMsgRspnTableBody() {
		if( javafxLabelCppXMsgRspnTableBody == null ) {
			javafxLabelCppXMsgRspnTableBody = new CppXMsgRspnTableBodyCFLabel();
		}
		return( javafxLabelCppXMsgRspnTableBody );
	}

	public void setJavaFXLabelCppXMsgRspnTableBody( CppXMsgRspnTableBodyCFLabel value ) {
		javafxLabelCppXMsgRspnTableBody = value;
	}

	public CppXMsgRspnTableBodyEditor getJavaFXEditorCppXMsgRspnTableBody() {
		if( javafxEditorCppXMsgRspnTableBody == null ) {
			javafxEditorCppXMsgRspnTableBody = new CppXMsgRspnTableBodyEditor();
		}
		return( javafxEditorCppXMsgRspnTableBody );
	}

	public void setJavaFXEditorCppXMsgRspnTableBody( CppXMsgRspnTableBodyEditor value ) {
		javafxEditorCppXMsgRspnTableBody = value;
	}

	public CppXMsgClientTableBodyCFLabel getJavaFXLabelCppXMsgClientTableBody() {
		if( javafxLabelCppXMsgClientTableBody == null ) {
			javafxLabelCppXMsgClientTableBody = new CppXMsgClientTableBodyCFLabel();
		}
		return( javafxLabelCppXMsgClientTableBody );
	}

	public void setJavaFXLabelCppXMsgClientTableBody( CppXMsgClientTableBodyCFLabel value ) {
		javafxLabelCppXMsgClientTableBody = value;
	}

	public CppXMsgClientTableBodyEditor getJavaFXEditorCppXMsgClientTableBody() {
		if( javafxEditorCppXMsgClientTableBody == null ) {
			javafxEditorCppXMsgClientTableBody = new CppXMsgClientTableBodyEditor();
		}
		return( javafxEditorCppXMsgClientTableBody );
	}

	public void setJavaFXEditorCppXMsgClientTableBody( CppXMsgClientTableBodyEditor value ) {
		javafxEditorCppXMsgClientTableBody = value;
	}

	public HppObjMembersCFLabel getJavaFXLabelHppObjMembers() {
		if( javafxLabelHppObjMembers == null ) {
			javafxLabelHppObjMembers = new HppObjMembersCFLabel();
		}
		return( javafxLabelHppObjMembers );
	}

	public void setJavaFXLabelHppObjMembers( HppObjMembersCFLabel value ) {
		javafxLabelHppObjMembers = value;
	}

	public HppObjMembersEditor getJavaFXEditorHppObjMembers() {
		if( javafxEditorHppObjMembers == null ) {
			javafxEditorHppObjMembers = new HppObjMembersEditor();
		}
		return( javafxEditorHppObjMembers );
	}

	public void setJavaFXEditorHppObjMembers( HppObjMembersEditor value ) {
		javafxEditorHppObjMembers = value;
	}

	public HppObjInterfaceCFLabel getJavaFXLabelHppObjInterface() {
		if( javafxLabelHppObjInterface == null ) {
			javafxLabelHppObjInterface = new HppObjInterfaceCFLabel();
		}
		return( javafxLabelHppObjInterface );
	}

	public void setJavaFXLabelHppObjInterface( HppObjInterfaceCFLabel value ) {
		javafxLabelHppObjInterface = value;
	}

	public HppObjInterfaceEditor getJavaFXEditorHppObjInterface() {
		if( javafxEditorHppObjInterface == null ) {
			javafxEditorHppObjInterface = new HppObjInterfaceEditor();
		}
		return( javafxEditorHppObjInterface );
	}

	public void setJavaFXEditorHppObjInterface( HppObjInterfaceEditor value ) {
		javafxEditorHppObjInterface = value;
	}

	public HppObjIncludeCFLabel getJavaFXLabelHppObjInclude() {
		if( javafxLabelHppObjInclude == null ) {
			javafxLabelHppObjInclude = new HppObjIncludeCFLabel();
		}
		return( javafxLabelHppObjInclude );
	}

	public void setJavaFXLabelHppObjInclude( HppObjIncludeCFLabel value ) {
		javafxLabelHppObjInclude = value;
	}

	public HppObjIncludeEditor getJavaFXEditorHppObjInclude() {
		if( javafxEditorHppObjInclude == null ) {
			javafxEditorHppObjInclude = new HppObjIncludeEditor();
		}
		return( javafxEditorHppObjInclude );
	}

	public void setJavaFXEditorHppObjInclude( HppObjIncludeEditor value ) {
		javafxEditorHppObjInclude = value;
	}

	public HppObjImplementationCFLabel getJavaFXLabelHppObjImplementation() {
		if( javafxLabelHppObjImplementation == null ) {
			javafxLabelHppObjImplementation = new HppObjImplementationCFLabel();
		}
		return( javafxLabelHppObjImplementation );
	}

	public void setJavaFXLabelHppObjImplementation( HppObjImplementationCFLabel value ) {
		javafxLabelHppObjImplementation = value;
	}

	public HppObjImplementationEditor getJavaFXEditorHppObjImplementation() {
		if( javafxEditorHppObjImplementation == null ) {
			javafxEditorHppObjImplementation = new HppObjImplementationEditor();
		}
		return( javafxEditorHppObjImplementation );
	}

	public void setJavaFXEditorHppObjImplementation( HppObjImplementationEditor value ) {
		javafxEditorHppObjImplementation = value;
	}

	public HppEditObjMembersCFLabel getJavaFXLabelHppEditObjMembers() {
		if( javafxLabelHppEditObjMembers == null ) {
			javafxLabelHppEditObjMembers = new HppEditObjMembersCFLabel();
		}
		return( javafxLabelHppEditObjMembers );
	}

	public void setJavaFXLabelHppEditObjMembers( HppEditObjMembersCFLabel value ) {
		javafxLabelHppEditObjMembers = value;
	}

	public HppEditObjMembersEditor getJavaFXEditorHppEditObjMembers() {
		if( javafxEditorHppEditObjMembers == null ) {
			javafxEditorHppEditObjMembers = new HppEditObjMembersEditor();
		}
		return( javafxEditorHppEditObjMembers );
	}

	public void setJavaFXEditorHppEditObjMembers( HppEditObjMembersEditor value ) {
		javafxEditorHppEditObjMembers = value;
	}

	public HppEditObjInterfaceCFLabel getJavaFXLabelHppEditObjInterface() {
		if( javafxLabelHppEditObjInterface == null ) {
			javafxLabelHppEditObjInterface = new HppEditObjInterfaceCFLabel();
		}
		return( javafxLabelHppEditObjInterface );
	}

	public void setJavaFXLabelHppEditObjInterface( HppEditObjInterfaceCFLabel value ) {
		javafxLabelHppEditObjInterface = value;
	}

	public HppEditObjInterfaceEditor getJavaFXEditorHppEditObjInterface() {
		if( javafxEditorHppEditObjInterface == null ) {
			javafxEditorHppEditObjInterface = new HppEditObjInterfaceEditor();
		}
		return( javafxEditorHppEditObjInterface );
	}

	public void setJavaFXEditorHppEditObjInterface( HppEditObjInterfaceEditor value ) {
		javafxEditorHppEditObjInterface = value;
	}

	public HppEditObjIncludeCFLabel getJavaFXLabelHppEditObjInclude() {
		if( javafxLabelHppEditObjInclude == null ) {
			javafxLabelHppEditObjInclude = new HppEditObjIncludeCFLabel();
		}
		return( javafxLabelHppEditObjInclude );
	}

	public void setJavaFXLabelHppEditObjInclude( HppEditObjIncludeCFLabel value ) {
		javafxLabelHppEditObjInclude = value;
	}

	public HppEditObjIncludeEditor getJavaFXEditorHppEditObjInclude() {
		if( javafxEditorHppEditObjInclude == null ) {
			javafxEditorHppEditObjInclude = new HppEditObjIncludeEditor();
		}
		return( javafxEditorHppEditObjInclude );
	}

	public void setJavaFXEditorHppEditObjInclude( HppEditObjIncludeEditor value ) {
		javafxEditorHppEditObjInclude = value;
	}

	public HppEditObjImplementationCFLabel getJavaFXLabelHppEditObjImplementation() {
		if( javafxLabelHppEditObjImplementation == null ) {
			javafxLabelHppEditObjImplementation = new HppEditObjImplementationCFLabel();
		}
		return( javafxLabelHppEditObjImplementation );
	}

	public void setJavaFXLabelHppEditObjImplementation( HppEditObjImplementationCFLabel value ) {
		javafxLabelHppEditObjImplementation = value;
	}

	public HppEditObjImplementationEditor getJavaFXEditorHppEditObjImplementation() {
		if( javafxEditorHppEditObjImplementation == null ) {
			javafxEditorHppEditObjImplementation = new HppEditObjImplementationEditor();
		}
		return( javafxEditorHppEditObjImplementation );
	}

	public void setJavaFXEditorHppEditObjImplementation( HppEditObjImplementationEditor value ) {
		javafxEditorHppEditObjImplementation = value;
	}

	public HppTableIncludeCFLabel getJavaFXLabelHppTableInclude() {
		if( javafxLabelHppTableInclude == null ) {
			javafxLabelHppTableInclude = new HppTableIncludeCFLabel();
		}
		return( javafxLabelHppTableInclude );
	}

	public void setJavaFXLabelHppTableInclude( HppTableIncludeCFLabel value ) {
		javafxLabelHppTableInclude = value;
	}

	public HppTableIncludeEditor getJavaFXEditorHppTableInclude() {
		if( javafxEditorHppTableInclude == null ) {
			javafxEditorHppTableInclude = new HppTableIncludeEditor();
		}
		return( javafxEditorHppTableInclude );
	}

	public void setJavaFXEditorHppTableInclude( HppTableIncludeEditor value ) {
		javafxEditorHppTableInclude = value;
	}

	public HppTableMembersCFLabel getJavaFXLabelHppTableMembers() {
		if( javafxLabelHppTableMembers == null ) {
			javafxLabelHppTableMembers = new HppTableMembersCFLabel();
		}
		return( javafxLabelHppTableMembers );
	}

	public void setJavaFXLabelHppTableMembers( HppTableMembersCFLabel value ) {
		javafxLabelHppTableMembers = value;
	}

	public HppTableMembersEditor getJavaFXEditorHppTableMembers() {
		if( javafxEditorHppTableMembers == null ) {
			javafxEditorHppTableMembers = new HppTableMembersEditor();
		}
		return( javafxEditorHppTableMembers );
	}

	public void setJavaFXEditorHppTableMembers( HppTableMembersEditor value ) {
		javafxEditorHppTableMembers = value;
	}

	public HppTableInterfaceCFLabel getJavaFXLabelHppTableInterface() {
		if( javafxLabelHppTableInterface == null ) {
			javafxLabelHppTableInterface = new HppTableInterfaceCFLabel();
		}
		return( javafxLabelHppTableInterface );
	}

	public void setJavaFXLabelHppTableInterface( HppTableInterfaceCFLabel value ) {
		javafxLabelHppTableInterface = value;
	}

	public HppTableInterfaceEditor getJavaFXEditorHppTableInterface() {
		if( javafxEditorHppTableInterface == null ) {
			javafxEditorHppTableInterface = new HppTableInterfaceEditor();
		}
		return( javafxEditorHppTableInterface );
	}

	public void setJavaFXEditorHppTableInterface( HppTableInterfaceEditor value ) {
		javafxEditorHppTableInterface = value;
	}

	public HppTableImplementationCFLabel getJavaFXLabelHppTableImplementation() {
		if( javafxLabelHppTableImplementation == null ) {
			javafxLabelHppTableImplementation = new HppTableImplementationCFLabel();
		}
		return( javafxLabelHppTableImplementation );
	}

	public void setJavaFXLabelHppTableImplementation( HppTableImplementationCFLabel value ) {
		javafxLabelHppTableImplementation = value;
	}

	public HppTableImplementationEditor getJavaFXEditorHppTableImplementation() {
		if( javafxEditorHppTableImplementation == null ) {
			javafxEditorHppTableImplementation = new HppTableImplementationEditor();
		}
		return( javafxEditorHppTableImplementation );
	}

	public void setJavaFXEditorHppTableImplementation( HppTableImplementationEditor value ) {
		javafxEditorHppTableImplementation = value;
	}

	public HppTableObjIncludeCFLabel getJavaFXLabelHppTableObjInclude() {
		if( javafxLabelHppTableObjInclude == null ) {
			javafxLabelHppTableObjInclude = new HppTableObjIncludeCFLabel();
		}
		return( javafxLabelHppTableObjInclude );
	}

	public void setJavaFXLabelHppTableObjInclude( HppTableObjIncludeCFLabel value ) {
		javafxLabelHppTableObjInclude = value;
	}

	public HppTableObjIncludeEditor getJavaFXEditorHppTableObjInclude() {
		if( javafxEditorHppTableObjInclude == null ) {
			javafxEditorHppTableObjInclude = new HppTableObjIncludeEditor();
		}
		return( javafxEditorHppTableObjInclude );
	}

	public void setJavaFXEditorHppTableObjInclude( HppTableObjIncludeEditor value ) {
		javafxEditorHppTableObjInclude = value;
	}

	public HppTableObjMembersCFLabel getJavaFXLabelHppTableObjMembers() {
		if( javafxLabelHppTableObjMembers == null ) {
			javafxLabelHppTableObjMembers = new HppTableObjMembersCFLabel();
		}
		return( javafxLabelHppTableObjMembers );
	}

	public void setJavaFXLabelHppTableObjMembers( HppTableObjMembersCFLabel value ) {
		javafxLabelHppTableObjMembers = value;
	}

	public HppTableObjMembersEditor getJavaFXEditorHppTableObjMembers() {
		if( javafxEditorHppTableObjMembers == null ) {
			javafxEditorHppTableObjMembers = new HppTableObjMembersEditor();
		}
		return( javafxEditorHppTableObjMembers );
	}

	public void setJavaFXEditorHppTableObjMembers( HppTableObjMembersEditor value ) {
		javafxEditorHppTableObjMembers = value;
	}

	public HppTableObjInterfaceCFLabel getJavaFXLabelHppTableObjInterface() {
		if( javafxLabelHppTableObjInterface == null ) {
			javafxLabelHppTableObjInterface = new HppTableObjInterfaceCFLabel();
		}
		return( javafxLabelHppTableObjInterface );
	}

	public void setJavaFXLabelHppTableObjInterface( HppTableObjInterfaceCFLabel value ) {
		javafxLabelHppTableObjInterface = value;
	}

	public HppTableObjInterfaceEditor getJavaFXEditorHppTableObjInterface() {
		if( javafxEditorHppTableObjInterface == null ) {
			javafxEditorHppTableObjInterface = new HppTableObjInterfaceEditor();
		}
		return( javafxEditorHppTableObjInterface );
	}

	public void setJavaFXEditorHppTableObjInterface( HppTableObjInterfaceEditor value ) {
		javafxEditorHppTableObjInterface = value;
	}

	public HppTableObjImplementationCFLabel getJavaFXLabelHppTableObjImplementation() {
		if( javafxLabelHppTableObjImplementation == null ) {
			javafxLabelHppTableObjImplementation = new HppTableObjImplementationCFLabel();
		}
		return( javafxLabelHppTableObjImplementation );
	}

	public void setJavaFXLabelHppTableObjImplementation( HppTableObjImplementationCFLabel value ) {
		javafxLabelHppTableObjImplementation = value;
	}

	public HppTableObjImplementationEditor getJavaFXEditorHppTableObjImplementation() {
		if( javafxEditorHppTableObjImplementation == null ) {
			javafxEditorHppTableObjImplementation = new HppTableObjImplementationEditor();
		}
		return( javafxEditorHppTableObjImplementation );
	}

	public void setJavaFXEditorHppTableObjImplementation( HppTableObjImplementationEditor value ) {
		javafxEditorHppTableObjImplementation = value;
	}

	public HppDb2LUWTableIncludeCFLabel getJavaFXLabelHppDb2LUWTableInclude() {
		if( javafxLabelHppDb2LUWTableInclude == null ) {
			javafxLabelHppDb2LUWTableInclude = new HppDb2LUWTableIncludeCFLabel();
		}
		return( javafxLabelHppDb2LUWTableInclude );
	}

	public void setJavaFXLabelHppDb2LUWTableInclude( HppDb2LUWTableIncludeCFLabel value ) {
		javafxLabelHppDb2LUWTableInclude = value;
	}

	public HppDb2LUWTableIncludeEditor getJavaFXEditorHppDb2LUWTableInclude() {
		if( javafxEditorHppDb2LUWTableInclude == null ) {
			javafxEditorHppDb2LUWTableInclude = new HppDb2LUWTableIncludeEditor();
		}
		return( javafxEditorHppDb2LUWTableInclude );
	}

	public void setJavaFXEditorHppDb2LUWTableInclude( HppDb2LUWTableIncludeEditor value ) {
		javafxEditorHppDb2LUWTableInclude = value;
	}

	public HppDb2LUWTableMembersCFLabel getJavaFXLabelHppDb2LUWTableMembers() {
		if( javafxLabelHppDb2LUWTableMembers == null ) {
			javafxLabelHppDb2LUWTableMembers = new HppDb2LUWTableMembersCFLabel();
		}
		return( javafxLabelHppDb2LUWTableMembers );
	}

	public void setJavaFXLabelHppDb2LUWTableMembers( HppDb2LUWTableMembersCFLabel value ) {
		javafxLabelHppDb2LUWTableMembers = value;
	}

	public HppDb2LUWTableMembersEditor getJavaFXEditorHppDb2LUWTableMembers() {
		if( javafxEditorHppDb2LUWTableMembers == null ) {
			javafxEditorHppDb2LUWTableMembers = new HppDb2LUWTableMembersEditor();
		}
		return( javafxEditorHppDb2LUWTableMembers );
	}

	public void setJavaFXEditorHppDb2LUWTableMembers( HppDb2LUWTableMembersEditor value ) {
		javafxEditorHppDb2LUWTableMembers = value;
	}

	public HppDb2LUWTableImplementationCFLabel getJavaFXLabelHppDb2LUWTableImplementation() {
		if( javafxLabelHppDb2LUWTableImplementation == null ) {
			javafxLabelHppDb2LUWTableImplementation = new HppDb2LUWTableImplementationCFLabel();
		}
		return( javafxLabelHppDb2LUWTableImplementation );
	}

	public void setJavaFXLabelHppDb2LUWTableImplementation( HppDb2LUWTableImplementationCFLabel value ) {
		javafxLabelHppDb2LUWTableImplementation = value;
	}

	public HppDb2LUWTableImplementationEditor getJavaFXEditorHppDb2LUWTableImplementation() {
		if( javafxEditorHppDb2LUWTableImplementation == null ) {
			javafxEditorHppDb2LUWTableImplementation = new HppDb2LUWTableImplementationEditor();
		}
		return( javafxEditorHppDb2LUWTableImplementation );
	}

	public void setJavaFXEditorHppDb2LUWTableImplementation( HppDb2LUWTableImplementationEditor value ) {
		javafxEditorHppDb2LUWTableImplementation = value;
	}

	public HppMSSqlTableIncludeCFLabel getJavaFXLabelHppMSSqlTableInclude() {
		if( javafxLabelHppMSSqlTableInclude == null ) {
			javafxLabelHppMSSqlTableInclude = new HppMSSqlTableIncludeCFLabel();
		}
		return( javafxLabelHppMSSqlTableInclude );
	}

	public void setJavaFXLabelHppMSSqlTableInclude( HppMSSqlTableIncludeCFLabel value ) {
		javafxLabelHppMSSqlTableInclude = value;
	}

	public HppMSSqlTableIncludeEditor getJavaFXEditorHppMSSqlTableInclude() {
		if( javafxEditorHppMSSqlTableInclude == null ) {
			javafxEditorHppMSSqlTableInclude = new HppMSSqlTableIncludeEditor();
		}
		return( javafxEditorHppMSSqlTableInclude );
	}

	public void setJavaFXEditorHppMSSqlTableInclude( HppMSSqlTableIncludeEditor value ) {
		javafxEditorHppMSSqlTableInclude = value;
	}

	public HppMSSqlTableMembersCFLabel getJavaFXLabelHppMSSqlTableMembers() {
		if( javafxLabelHppMSSqlTableMembers == null ) {
			javafxLabelHppMSSqlTableMembers = new HppMSSqlTableMembersCFLabel();
		}
		return( javafxLabelHppMSSqlTableMembers );
	}

	public void setJavaFXLabelHppMSSqlTableMembers( HppMSSqlTableMembersCFLabel value ) {
		javafxLabelHppMSSqlTableMembers = value;
	}

	public HppMSSqlTableMembersEditor getJavaFXEditorHppMSSqlTableMembers() {
		if( javafxEditorHppMSSqlTableMembers == null ) {
			javafxEditorHppMSSqlTableMembers = new HppMSSqlTableMembersEditor();
		}
		return( javafxEditorHppMSSqlTableMembers );
	}

	public void setJavaFXEditorHppMSSqlTableMembers( HppMSSqlTableMembersEditor value ) {
		javafxEditorHppMSSqlTableMembers = value;
	}

	public HppMSSqlTableImplementationCFLabel getJavaFXLabelHppMSSqlTableImplementation() {
		if( javafxLabelHppMSSqlTableImplementation == null ) {
			javafxLabelHppMSSqlTableImplementation = new HppMSSqlTableImplementationCFLabel();
		}
		return( javafxLabelHppMSSqlTableImplementation );
	}

	public void setJavaFXLabelHppMSSqlTableImplementation( HppMSSqlTableImplementationCFLabel value ) {
		javafxLabelHppMSSqlTableImplementation = value;
	}

	public HppMSSqlTableImplementationEditor getJavaFXEditorHppMSSqlTableImplementation() {
		if( javafxEditorHppMSSqlTableImplementation == null ) {
			javafxEditorHppMSSqlTableImplementation = new HppMSSqlTableImplementationEditor();
		}
		return( javafxEditorHppMSSqlTableImplementation );
	}

	public void setJavaFXEditorHppMSSqlTableImplementation( HppMSSqlTableImplementationEditor value ) {
		javafxEditorHppMSSqlTableImplementation = value;
	}

	public HppMySqlTableIncludeCFLabel getJavaFXLabelHppMySqlTableInclude() {
		if( javafxLabelHppMySqlTableInclude == null ) {
			javafxLabelHppMySqlTableInclude = new HppMySqlTableIncludeCFLabel();
		}
		return( javafxLabelHppMySqlTableInclude );
	}

	public void setJavaFXLabelHppMySqlTableInclude( HppMySqlTableIncludeCFLabel value ) {
		javafxLabelHppMySqlTableInclude = value;
	}

	public HppMySqlTableIncludeEditor getJavaFXEditorHppMySqlTableInclude() {
		if( javafxEditorHppMySqlTableInclude == null ) {
			javafxEditorHppMySqlTableInclude = new HppMySqlTableIncludeEditor();
		}
		return( javafxEditorHppMySqlTableInclude );
	}

	public void setJavaFXEditorHppMySqlTableInclude( HppMySqlTableIncludeEditor value ) {
		javafxEditorHppMySqlTableInclude = value;
	}

	public HppMySqlTableMembersCFLabel getJavaFXLabelHppMySqlTableMembers() {
		if( javafxLabelHppMySqlTableMembers == null ) {
			javafxLabelHppMySqlTableMembers = new HppMySqlTableMembersCFLabel();
		}
		return( javafxLabelHppMySqlTableMembers );
	}

	public void setJavaFXLabelHppMySqlTableMembers( HppMySqlTableMembersCFLabel value ) {
		javafxLabelHppMySqlTableMembers = value;
	}

	public HppMySqlTableMembersEditor getJavaFXEditorHppMySqlTableMembers() {
		if( javafxEditorHppMySqlTableMembers == null ) {
			javafxEditorHppMySqlTableMembers = new HppMySqlTableMembersEditor();
		}
		return( javafxEditorHppMySqlTableMembers );
	}

	public void setJavaFXEditorHppMySqlTableMembers( HppMySqlTableMembersEditor value ) {
		javafxEditorHppMySqlTableMembers = value;
	}

	public HppMySqlTableImplementationCFLabel getJavaFXLabelHppMySqlTableImplementation() {
		if( javafxLabelHppMySqlTableImplementation == null ) {
			javafxLabelHppMySqlTableImplementation = new HppMySqlTableImplementationCFLabel();
		}
		return( javafxLabelHppMySqlTableImplementation );
	}

	public void setJavaFXLabelHppMySqlTableImplementation( HppMySqlTableImplementationCFLabel value ) {
		javafxLabelHppMySqlTableImplementation = value;
	}

	public HppMySqlTableImplementationEditor getJavaFXEditorHppMySqlTableImplementation() {
		if( javafxEditorHppMySqlTableImplementation == null ) {
			javafxEditorHppMySqlTableImplementation = new HppMySqlTableImplementationEditor();
		}
		return( javafxEditorHppMySqlTableImplementation );
	}

	public void setJavaFXEditorHppMySqlTableImplementation( HppMySqlTableImplementationEditor value ) {
		javafxEditorHppMySqlTableImplementation = value;
	}

	public HppOracleTableIncludeCFLabel getJavaFXLabelHppOracleTableInclude() {
		if( javafxLabelHppOracleTableInclude == null ) {
			javafxLabelHppOracleTableInclude = new HppOracleTableIncludeCFLabel();
		}
		return( javafxLabelHppOracleTableInclude );
	}

	public void setJavaFXLabelHppOracleTableInclude( HppOracleTableIncludeCFLabel value ) {
		javafxLabelHppOracleTableInclude = value;
	}

	public HppOracleTableIncludeEditor getJavaFXEditorHppOracleTableInclude() {
		if( javafxEditorHppOracleTableInclude == null ) {
			javafxEditorHppOracleTableInclude = new HppOracleTableIncludeEditor();
		}
		return( javafxEditorHppOracleTableInclude );
	}

	public void setJavaFXEditorHppOracleTableInclude( HppOracleTableIncludeEditor value ) {
		javafxEditorHppOracleTableInclude = value;
	}

	public HppOracleTableMembersCFLabel getJavaFXLabelHppOracleTableMembers() {
		if( javafxLabelHppOracleTableMembers == null ) {
			javafxLabelHppOracleTableMembers = new HppOracleTableMembersCFLabel();
		}
		return( javafxLabelHppOracleTableMembers );
	}

	public void setJavaFXLabelHppOracleTableMembers( HppOracleTableMembersCFLabel value ) {
		javafxLabelHppOracleTableMembers = value;
	}

	public HppOracleTableMembersEditor getJavaFXEditorHppOracleTableMembers() {
		if( javafxEditorHppOracleTableMembers == null ) {
			javafxEditorHppOracleTableMembers = new HppOracleTableMembersEditor();
		}
		return( javafxEditorHppOracleTableMembers );
	}

	public void setJavaFXEditorHppOracleTableMembers( HppOracleTableMembersEditor value ) {
		javafxEditorHppOracleTableMembers = value;
	}

	public HppOracleTableImplementationCFLabel getJavaFXLabelHppOracleTableImplementation() {
		if( javafxLabelHppOracleTableImplementation == null ) {
			javafxLabelHppOracleTableImplementation = new HppOracleTableImplementationCFLabel();
		}
		return( javafxLabelHppOracleTableImplementation );
	}

	public void setJavaFXLabelHppOracleTableImplementation( HppOracleTableImplementationCFLabel value ) {
		javafxLabelHppOracleTableImplementation = value;
	}

	public HppOracleTableImplementationEditor getJavaFXEditorHppOracleTableImplementation() {
		if( javafxEditorHppOracleTableImplementation == null ) {
			javafxEditorHppOracleTableImplementation = new HppOracleTableImplementationEditor();
		}
		return( javafxEditorHppOracleTableImplementation );
	}

	public void setJavaFXEditorHppOracleTableImplementation( HppOracleTableImplementationEditor value ) {
		javafxEditorHppOracleTableImplementation = value;
	}

	public HppPgSqlTableIncludeCFLabel getJavaFXLabelHppPgSqlTableInclude() {
		if( javafxLabelHppPgSqlTableInclude == null ) {
			javafxLabelHppPgSqlTableInclude = new HppPgSqlTableIncludeCFLabel();
		}
		return( javafxLabelHppPgSqlTableInclude );
	}

	public void setJavaFXLabelHppPgSqlTableInclude( HppPgSqlTableIncludeCFLabel value ) {
		javafxLabelHppPgSqlTableInclude = value;
	}

	public HppPgSqlTableIncludeEditor getJavaFXEditorHppPgSqlTableInclude() {
		if( javafxEditorHppPgSqlTableInclude == null ) {
			javafxEditorHppPgSqlTableInclude = new HppPgSqlTableIncludeEditor();
		}
		return( javafxEditorHppPgSqlTableInclude );
	}

	public void setJavaFXEditorHppPgSqlTableInclude( HppPgSqlTableIncludeEditor value ) {
		javafxEditorHppPgSqlTableInclude = value;
	}

	public HppPgSqlTableMembersCFLabel getJavaFXLabelHppPgSqlTableMembers() {
		if( javafxLabelHppPgSqlTableMembers == null ) {
			javafxLabelHppPgSqlTableMembers = new HppPgSqlTableMembersCFLabel();
		}
		return( javafxLabelHppPgSqlTableMembers );
	}

	public void setJavaFXLabelHppPgSqlTableMembers( HppPgSqlTableMembersCFLabel value ) {
		javafxLabelHppPgSqlTableMembers = value;
	}

	public HppPgSqlTableMembersEditor getJavaFXEditorHppPgSqlTableMembers() {
		if( javafxEditorHppPgSqlTableMembers == null ) {
			javafxEditorHppPgSqlTableMembers = new HppPgSqlTableMembersEditor();
		}
		return( javafxEditorHppPgSqlTableMembers );
	}

	public void setJavaFXEditorHppPgSqlTableMembers( HppPgSqlTableMembersEditor value ) {
		javafxEditorHppPgSqlTableMembers = value;
	}

	public HppPgSqlTableImplementationCFLabel getJavaFXLabelHppPgSqlTableImplementation() {
		if( javafxLabelHppPgSqlTableImplementation == null ) {
			javafxLabelHppPgSqlTableImplementation = new HppPgSqlTableImplementationCFLabel();
		}
		return( javafxLabelHppPgSqlTableImplementation );
	}

	public void setJavaFXLabelHppPgSqlTableImplementation( HppPgSqlTableImplementationCFLabel value ) {
		javafxLabelHppPgSqlTableImplementation = value;
	}

	public HppPgSqlTableImplementationEditor getJavaFXEditorHppPgSqlTableImplementation() {
		if( javafxEditorHppPgSqlTableImplementation == null ) {
			javafxEditorHppPgSqlTableImplementation = new HppPgSqlTableImplementationEditor();
		}
		return( javafxEditorHppPgSqlTableImplementation );
	}

	public void setJavaFXEditorHppPgSqlTableImplementation( HppPgSqlTableImplementationEditor value ) {
		javafxEditorHppPgSqlTableImplementation = value;
	}

	public HppRamTableIncludeCFLabel getJavaFXLabelHppRamTableInclude() {
		if( javafxLabelHppRamTableInclude == null ) {
			javafxLabelHppRamTableInclude = new HppRamTableIncludeCFLabel();
		}
		return( javafxLabelHppRamTableInclude );
	}

	public void setJavaFXLabelHppRamTableInclude( HppRamTableIncludeCFLabel value ) {
		javafxLabelHppRamTableInclude = value;
	}

	public HppRamTableIncludeEditor getJavaFXEditorHppRamTableInclude() {
		if( javafxEditorHppRamTableInclude == null ) {
			javafxEditorHppRamTableInclude = new HppRamTableIncludeEditor();
		}
		return( javafxEditorHppRamTableInclude );
	}

	public void setJavaFXEditorHppRamTableInclude( HppRamTableIncludeEditor value ) {
		javafxEditorHppRamTableInclude = value;
	}

	public HppRamTableMembersCFLabel getJavaFXLabelHppRamTableMembers() {
		if( javafxLabelHppRamTableMembers == null ) {
			javafxLabelHppRamTableMembers = new HppRamTableMembersCFLabel();
		}
		return( javafxLabelHppRamTableMembers );
	}

	public void setJavaFXLabelHppRamTableMembers( HppRamTableMembersCFLabel value ) {
		javafxLabelHppRamTableMembers = value;
	}

	public HppRamTableMembersEditor getJavaFXEditorHppRamTableMembers() {
		if( javafxEditorHppRamTableMembers == null ) {
			javafxEditorHppRamTableMembers = new HppRamTableMembersEditor();
		}
		return( javafxEditorHppRamTableMembers );
	}

	public void setJavaFXEditorHppRamTableMembers( HppRamTableMembersEditor value ) {
		javafxEditorHppRamTableMembers = value;
	}

	public HppRamTableImplementationCFLabel getJavaFXLabelHppRamTableImplementation() {
		if( javafxLabelHppRamTableImplementation == null ) {
			javafxLabelHppRamTableImplementation = new HppRamTableImplementationCFLabel();
		}
		return( javafxLabelHppRamTableImplementation );
	}

	public void setJavaFXLabelHppRamTableImplementation( HppRamTableImplementationCFLabel value ) {
		javafxLabelHppRamTableImplementation = value;
	}

	public HppRamTableImplementationEditor getJavaFXEditorHppRamTableImplementation() {
		if( javafxEditorHppRamTableImplementation == null ) {
			javafxEditorHppRamTableImplementation = new HppRamTableImplementationEditor();
		}
		return( javafxEditorHppRamTableImplementation );
	}

	public void setJavaFXEditorHppRamTableImplementation( HppRamTableImplementationEditor value ) {
		javafxEditorHppRamTableImplementation = value;
	}

	public HppSaxLoaderIncludeCFLabel getJavaFXLabelHppSaxLoaderInclude() {
		if( javafxLabelHppSaxLoaderInclude == null ) {
			javafxLabelHppSaxLoaderInclude = new HppSaxLoaderIncludeCFLabel();
		}
		return( javafxLabelHppSaxLoaderInclude );
	}

	public void setJavaFXLabelHppSaxLoaderInclude( HppSaxLoaderIncludeCFLabel value ) {
		javafxLabelHppSaxLoaderInclude = value;
	}

	public HppSaxLoaderIncludeEditor getJavaFXEditorHppSaxLoaderInclude() {
		if( javafxEditorHppSaxLoaderInclude == null ) {
			javafxEditorHppSaxLoaderInclude = new HppSaxLoaderIncludeEditor();
		}
		return( javafxEditorHppSaxLoaderInclude );
	}

	public void setJavaFXEditorHppSaxLoaderInclude( HppSaxLoaderIncludeEditor value ) {
		javafxEditorHppSaxLoaderInclude = value;
	}

	public HppSaxLoaderStartElementCFLabel getJavaFXLabelHppSaxLoaderStartElement() {
		if( javafxLabelHppSaxLoaderStartElement == null ) {
			javafxLabelHppSaxLoaderStartElement = new HppSaxLoaderStartElementCFLabel();
		}
		return( javafxLabelHppSaxLoaderStartElement );
	}

	public void setJavaFXLabelHppSaxLoaderStartElement( HppSaxLoaderStartElementCFLabel value ) {
		javafxLabelHppSaxLoaderStartElement = value;
	}

	public HppSaxLoaderStartElementEditor getJavaFXEditorHppSaxLoaderStartElement() {
		if( javafxEditorHppSaxLoaderStartElement == null ) {
			javafxEditorHppSaxLoaderStartElement = new HppSaxLoaderStartElementEditor();
		}
		return( javafxEditorHppSaxLoaderStartElement );
	}

	public void setJavaFXEditorHppSaxLoaderStartElement( HppSaxLoaderStartElementEditor value ) {
		javafxEditorHppSaxLoaderStartElement = value;
	}

	public HppSaxLoaderEndElementCFLabel getJavaFXLabelHppSaxLoaderEndElement() {
		if( javafxLabelHppSaxLoaderEndElement == null ) {
			javafxLabelHppSaxLoaderEndElement = new HppSaxLoaderEndElementCFLabel();
		}
		return( javafxLabelHppSaxLoaderEndElement );
	}

	public void setJavaFXLabelHppSaxLoaderEndElement( HppSaxLoaderEndElementCFLabel value ) {
		javafxLabelHppSaxLoaderEndElement = value;
	}

	public HppSaxLoaderEndElementEditor getJavaFXEditorHppSaxLoaderEndElement() {
		if( javafxEditorHppSaxLoaderEndElement == null ) {
			javafxEditorHppSaxLoaderEndElement = new HppSaxLoaderEndElementEditor();
		}
		return( javafxEditorHppSaxLoaderEndElement );
	}

	public void setJavaFXEditorHppSaxLoaderEndElement( HppSaxLoaderEndElementEditor value ) {
		javafxEditorHppSaxLoaderEndElement = value;
	}

	public HppXMsgTableIncludeCFLabel getJavaFXLabelHppXMsgTableInclude() {
		if( javafxLabelHppXMsgTableInclude == null ) {
			javafxLabelHppXMsgTableInclude = new HppXMsgTableIncludeCFLabel();
		}
		return( javafxLabelHppXMsgTableInclude );
	}

	public void setJavaFXLabelHppXMsgTableInclude( HppXMsgTableIncludeCFLabel value ) {
		javafxLabelHppXMsgTableInclude = value;
	}

	public HppXMsgTableIncludeEditor getJavaFXEditorHppXMsgTableInclude() {
		if( javafxEditorHppXMsgTableInclude == null ) {
			javafxEditorHppXMsgTableInclude = new HppXMsgTableIncludeEditor();
		}
		return( javafxEditorHppXMsgTableInclude );
	}

	public void setJavaFXEditorHppXMsgTableInclude( HppXMsgTableIncludeEditor value ) {
		javafxEditorHppXMsgTableInclude = value;
	}

	public HppXMsgTableFormattersCFLabel getJavaFXLabelHppXMsgTableFormatters() {
		if( javafxLabelHppXMsgTableFormatters == null ) {
			javafxLabelHppXMsgTableFormatters = new HppXMsgTableFormattersCFLabel();
		}
		return( javafxLabelHppXMsgTableFormatters );
	}

	public void setJavaFXLabelHppXMsgTableFormatters( HppXMsgTableFormattersCFLabel value ) {
		javafxLabelHppXMsgTableFormatters = value;
	}

	public HppXMsgTableFormattersEditor getJavaFXEditorHppXMsgTableFormatters() {
		if( javafxEditorHppXMsgTableFormatters == null ) {
			javafxEditorHppXMsgTableFormatters = new HppXMsgTableFormattersEditor();
		}
		return( javafxEditorHppXMsgTableFormatters );
	}

	public void setJavaFXEditorHppXMsgTableFormatters( HppXMsgTableFormattersEditor value ) {
		javafxEditorHppXMsgTableFormatters = value;
	}

	public HppXMsgRqstTableIncludeCFLabel getJavaFXLabelHppXMsgRqstTableInclude() {
		if( javafxLabelHppXMsgRqstTableInclude == null ) {
			javafxLabelHppXMsgRqstTableInclude = new HppXMsgRqstTableIncludeCFLabel();
		}
		return( javafxLabelHppXMsgRqstTableInclude );
	}

	public void setJavaFXLabelHppXMsgRqstTableInclude( HppXMsgRqstTableIncludeCFLabel value ) {
		javafxLabelHppXMsgRqstTableInclude = value;
	}

	public HppXMsgRqstTableIncludeEditor getJavaFXEditorHppXMsgRqstTableInclude() {
		if( javafxEditorHppXMsgRqstTableInclude == null ) {
			javafxEditorHppXMsgRqstTableInclude = new HppXMsgRqstTableIncludeEditor();
		}
		return( javafxEditorHppXMsgRqstTableInclude );
	}

	public void setJavaFXEditorHppXMsgRqstTableInclude( HppXMsgRqstTableIncludeEditor value ) {
		javafxEditorHppXMsgRqstTableInclude = value;
	}

	public HppXMsgRspnTableIncludeCFLabel getJavaFXLabelHppXMsgRspnTableInclude() {
		if( javafxLabelHppXMsgRspnTableInclude == null ) {
			javafxLabelHppXMsgRspnTableInclude = new HppXMsgRspnTableIncludeCFLabel();
		}
		return( javafxLabelHppXMsgRspnTableInclude );
	}

	public void setJavaFXLabelHppXMsgRspnTableInclude( HppXMsgRspnTableIncludeCFLabel value ) {
		javafxLabelHppXMsgRspnTableInclude = value;
	}

	public HppXMsgRspnTableIncludeEditor getJavaFXEditorHppXMsgRspnTableInclude() {
		if( javafxEditorHppXMsgRspnTableInclude == null ) {
			javafxEditorHppXMsgRspnTableInclude = new HppXMsgRspnTableIncludeEditor();
		}
		return( javafxEditorHppXMsgRspnTableInclude );
	}

	public void setJavaFXEditorHppXMsgRspnTableInclude( HppXMsgRspnTableIncludeEditor value ) {
		javafxEditorHppXMsgRspnTableInclude = value;
	}

	public HppXMsgClientTableIncludeCFLabel getJavaFXLabelHppXMsgClientTableInclude() {
		if( javafxLabelHppXMsgClientTableInclude == null ) {
			javafxLabelHppXMsgClientTableInclude = new HppXMsgClientTableIncludeCFLabel();
		}
		return( javafxLabelHppXMsgClientTableInclude );
	}

	public void setJavaFXLabelHppXMsgClientTableInclude( HppXMsgClientTableIncludeCFLabel value ) {
		javafxLabelHppXMsgClientTableInclude = value;
	}

	public HppXMsgClientTableIncludeEditor getJavaFXEditorHppXMsgClientTableInclude() {
		if( javafxEditorHppXMsgClientTableInclude == null ) {
			javafxEditorHppXMsgClientTableInclude = new HppXMsgClientTableIncludeEditor();
		}
		return( javafxEditorHppXMsgClientTableInclude );
	}

	public void setJavaFXEditorHppXMsgClientTableInclude( HppXMsgClientTableIncludeEditor value ) {
		javafxEditorHppXMsgClientTableInclude = value;
	}

	public HppXMsgRqstTableBodyCFLabel getJavaFXLabelHppXMsgRqstTableBody() {
		if( javafxLabelHppXMsgRqstTableBody == null ) {
			javafxLabelHppXMsgRqstTableBody = new HppXMsgRqstTableBodyCFLabel();
		}
		return( javafxLabelHppXMsgRqstTableBody );
	}

	public void setJavaFXLabelHppXMsgRqstTableBody( HppXMsgRqstTableBodyCFLabel value ) {
		javafxLabelHppXMsgRqstTableBody = value;
	}

	public HppXMsgRqstTableBodyEditor getJavaFXEditorHppXMsgRqstTableBody() {
		if( javafxEditorHppXMsgRqstTableBody == null ) {
			javafxEditorHppXMsgRqstTableBody = new HppXMsgRqstTableBodyEditor();
		}
		return( javafxEditorHppXMsgRqstTableBody );
	}

	public void setJavaFXEditorHppXMsgRqstTableBody( HppXMsgRqstTableBodyEditor value ) {
		javafxEditorHppXMsgRqstTableBody = value;
	}

	public HppXMsgRspnTableBodyCFLabel getJavaFXLabelHppXMsgRspnTableBody() {
		if( javafxLabelHppXMsgRspnTableBody == null ) {
			javafxLabelHppXMsgRspnTableBody = new HppXMsgRspnTableBodyCFLabel();
		}
		return( javafxLabelHppXMsgRspnTableBody );
	}

	public void setJavaFXLabelHppXMsgRspnTableBody( HppXMsgRspnTableBodyCFLabel value ) {
		javafxLabelHppXMsgRspnTableBody = value;
	}

	public HppXMsgRspnTableBodyEditor getJavaFXEditorHppXMsgRspnTableBody() {
		if( javafxEditorHppXMsgRspnTableBody == null ) {
			javafxEditorHppXMsgRspnTableBody = new HppXMsgRspnTableBodyEditor();
		}
		return( javafxEditorHppXMsgRspnTableBody );
	}

	public void setJavaFXEditorHppXMsgRspnTableBody( HppXMsgRspnTableBodyEditor value ) {
		javafxEditorHppXMsgRspnTableBody = value;
	}

	public HppXMsgClientTableBodyCFLabel getJavaFXLabelHppXMsgClientTableBody() {
		if( javafxLabelHppXMsgClientTableBody == null ) {
			javafxLabelHppXMsgClientTableBody = new HppXMsgClientTableBodyCFLabel();
		}
		return( javafxLabelHppXMsgClientTableBody );
	}

	public void setJavaFXLabelHppXMsgClientTableBody( HppXMsgClientTableBodyCFLabel value ) {
		javafxLabelHppXMsgClientTableBody = value;
	}

	public HppXMsgClientTableBodyEditor getJavaFXEditorHppXMsgClientTableBody() {
		if( javafxEditorHppXMsgClientTableBody == null ) {
			javafxEditorHppXMsgClientTableBody = new HppXMsgClientTableBodyEditor();
		}
		return( javafxEditorHppXMsgClientTableBody );
	}

	public void setJavaFXEditorHppXMsgClientTableBody( HppXMsgClientTableBodyEditor value ) {
		javafxEditorHppXMsgClientTableBody = value;
	}

	public CsObjMembersCFLabel getJavaFXLabelCsObjMembers() {
		if( javafxLabelCsObjMembers == null ) {
			javafxLabelCsObjMembers = new CsObjMembersCFLabel();
		}
		return( javafxLabelCsObjMembers );
	}

	public void setJavaFXLabelCsObjMembers( CsObjMembersCFLabel value ) {
		javafxLabelCsObjMembers = value;
	}

	public CsObjMembersEditor getJavaFXEditorCsObjMembers() {
		if( javafxEditorCsObjMembers == null ) {
			javafxEditorCsObjMembers = new CsObjMembersEditor();
		}
		return( javafxEditorCsObjMembers );
	}

	public void setJavaFXEditorCsObjMembers( CsObjMembersEditor value ) {
		javafxEditorCsObjMembers = value;
	}

	public CsObjInterfaceCFLabel getJavaFXLabelCsObjInterface() {
		if( javafxLabelCsObjInterface == null ) {
			javafxLabelCsObjInterface = new CsObjInterfaceCFLabel();
		}
		return( javafxLabelCsObjInterface );
	}

	public void setJavaFXLabelCsObjInterface( CsObjInterfaceCFLabel value ) {
		javafxLabelCsObjInterface = value;
	}

	public CsObjInterfaceEditor getJavaFXEditorCsObjInterface() {
		if( javafxEditorCsObjInterface == null ) {
			javafxEditorCsObjInterface = new CsObjInterfaceEditor();
		}
		return( javafxEditorCsObjInterface );
	}

	public void setJavaFXEditorCsObjInterface( CsObjInterfaceEditor value ) {
		javafxEditorCsObjInterface = value;
	}

	public CsObjUsingCFLabel getJavaFXLabelCsObjUsing() {
		if( javafxLabelCsObjUsing == null ) {
			javafxLabelCsObjUsing = new CsObjUsingCFLabel();
		}
		return( javafxLabelCsObjUsing );
	}

	public void setJavaFXLabelCsObjUsing( CsObjUsingCFLabel value ) {
		javafxLabelCsObjUsing = value;
	}

	public CsObjUsingEditor getJavaFXEditorCsObjUsing() {
		if( javafxEditorCsObjUsing == null ) {
			javafxEditorCsObjUsing = new CsObjUsingEditor();
		}
		return( javafxEditorCsObjUsing );
	}

	public void setJavaFXEditorCsObjUsing( CsObjUsingEditor value ) {
		javafxEditorCsObjUsing = value;
	}

	public CsObjImplementationCFLabel getJavaFXLabelCsObjImplementation() {
		if( javafxLabelCsObjImplementation == null ) {
			javafxLabelCsObjImplementation = new CsObjImplementationCFLabel();
		}
		return( javafxLabelCsObjImplementation );
	}

	public void setJavaFXLabelCsObjImplementation( CsObjImplementationCFLabel value ) {
		javafxLabelCsObjImplementation = value;
	}

	public CsObjImplementationEditor getJavaFXEditorCsObjImplementation() {
		if( javafxEditorCsObjImplementation == null ) {
			javafxEditorCsObjImplementation = new CsObjImplementationEditor();
		}
		return( javafxEditorCsObjImplementation );
	}

	public void setJavaFXEditorCsObjImplementation( CsObjImplementationEditor value ) {
		javafxEditorCsObjImplementation = value;
	}

	public CsEditObjMembersCFLabel getJavaFXLabelCsEditObjMembers() {
		if( javafxLabelCsEditObjMembers == null ) {
			javafxLabelCsEditObjMembers = new CsEditObjMembersCFLabel();
		}
		return( javafxLabelCsEditObjMembers );
	}

	public void setJavaFXLabelCsEditObjMembers( CsEditObjMembersCFLabel value ) {
		javafxLabelCsEditObjMembers = value;
	}

	public CsEditObjMembersEditor getJavaFXEditorCsEditObjMembers() {
		if( javafxEditorCsEditObjMembers == null ) {
			javafxEditorCsEditObjMembers = new CsEditObjMembersEditor();
		}
		return( javafxEditorCsEditObjMembers );
	}

	public void setJavaFXEditorCsEditObjMembers( CsEditObjMembersEditor value ) {
		javafxEditorCsEditObjMembers = value;
	}

	public CsEditObjInterfaceCFLabel getJavaFXLabelCsEditObjInterface() {
		if( javafxLabelCsEditObjInterface == null ) {
			javafxLabelCsEditObjInterface = new CsEditObjInterfaceCFLabel();
		}
		return( javafxLabelCsEditObjInterface );
	}

	public void setJavaFXLabelCsEditObjInterface( CsEditObjInterfaceCFLabel value ) {
		javafxLabelCsEditObjInterface = value;
	}

	public CsEditObjInterfaceEditor getJavaFXEditorCsEditObjInterface() {
		if( javafxEditorCsEditObjInterface == null ) {
			javafxEditorCsEditObjInterface = new CsEditObjInterfaceEditor();
		}
		return( javafxEditorCsEditObjInterface );
	}

	public void setJavaFXEditorCsEditObjInterface( CsEditObjInterfaceEditor value ) {
		javafxEditorCsEditObjInterface = value;
	}

	public CsEditObjUsingCFLabel getJavaFXLabelCsEditObjUsing() {
		if( javafxLabelCsEditObjUsing == null ) {
			javafxLabelCsEditObjUsing = new CsEditObjUsingCFLabel();
		}
		return( javafxLabelCsEditObjUsing );
	}

	public void setJavaFXLabelCsEditObjUsing( CsEditObjUsingCFLabel value ) {
		javafxLabelCsEditObjUsing = value;
	}

	public CsEditObjUsingEditor getJavaFXEditorCsEditObjUsing() {
		if( javafxEditorCsEditObjUsing == null ) {
			javafxEditorCsEditObjUsing = new CsEditObjUsingEditor();
		}
		return( javafxEditorCsEditObjUsing );
	}

	public void setJavaFXEditorCsEditObjUsing( CsEditObjUsingEditor value ) {
		javafxEditorCsEditObjUsing = value;
	}

	public CsEditObjImplementationCFLabel getJavaFXLabelCsEditObjImplementation() {
		if( javafxLabelCsEditObjImplementation == null ) {
			javafxLabelCsEditObjImplementation = new CsEditObjImplementationCFLabel();
		}
		return( javafxLabelCsEditObjImplementation );
	}

	public void setJavaFXLabelCsEditObjImplementation( CsEditObjImplementationCFLabel value ) {
		javafxLabelCsEditObjImplementation = value;
	}

	public CsEditObjImplementationEditor getJavaFXEditorCsEditObjImplementation() {
		if( javafxEditorCsEditObjImplementation == null ) {
			javafxEditorCsEditObjImplementation = new CsEditObjImplementationEditor();
		}
		return( javafxEditorCsEditObjImplementation );
	}

	public void setJavaFXEditorCsEditObjImplementation( CsEditObjImplementationEditor value ) {
		javafxEditorCsEditObjImplementation = value;
	}

	public CsTableUsingCFLabel getJavaFXLabelCsTableUsing() {
		if( javafxLabelCsTableUsing == null ) {
			javafxLabelCsTableUsing = new CsTableUsingCFLabel();
		}
		return( javafxLabelCsTableUsing );
	}

	public void setJavaFXLabelCsTableUsing( CsTableUsingCFLabel value ) {
		javafxLabelCsTableUsing = value;
	}

	public CsTableUsingEditor getJavaFXEditorCsTableUsing() {
		if( javafxEditorCsTableUsing == null ) {
			javafxEditorCsTableUsing = new CsTableUsingEditor();
		}
		return( javafxEditorCsTableUsing );
	}

	public void setJavaFXEditorCsTableUsing( CsTableUsingEditor value ) {
		javafxEditorCsTableUsing = value;
	}

	public CsTableMembersCFLabel getJavaFXLabelCsTableMembers() {
		if( javafxLabelCsTableMembers == null ) {
			javafxLabelCsTableMembers = new CsTableMembersCFLabel();
		}
		return( javafxLabelCsTableMembers );
	}

	public void setJavaFXLabelCsTableMembers( CsTableMembersCFLabel value ) {
		javafxLabelCsTableMembers = value;
	}

	public CsTableMembersEditor getJavaFXEditorCsTableMembers() {
		if( javafxEditorCsTableMembers == null ) {
			javafxEditorCsTableMembers = new CsTableMembersEditor();
		}
		return( javafxEditorCsTableMembers );
	}

	public void setJavaFXEditorCsTableMembers( CsTableMembersEditor value ) {
		javafxEditorCsTableMembers = value;
	}

	public CsTableInterfaceCFLabel getJavaFXLabelCsTableInterface() {
		if( javafxLabelCsTableInterface == null ) {
			javafxLabelCsTableInterface = new CsTableInterfaceCFLabel();
		}
		return( javafxLabelCsTableInterface );
	}

	public void setJavaFXLabelCsTableInterface( CsTableInterfaceCFLabel value ) {
		javafxLabelCsTableInterface = value;
	}

	public CsTableInterfaceEditor getJavaFXEditorCsTableInterface() {
		if( javafxEditorCsTableInterface == null ) {
			javafxEditorCsTableInterface = new CsTableInterfaceEditor();
		}
		return( javafxEditorCsTableInterface );
	}

	public void setJavaFXEditorCsTableInterface( CsTableInterfaceEditor value ) {
		javafxEditorCsTableInterface = value;
	}

	public CsTableImplementationCFLabel getJavaFXLabelCsTableImplementation() {
		if( javafxLabelCsTableImplementation == null ) {
			javafxLabelCsTableImplementation = new CsTableImplementationCFLabel();
		}
		return( javafxLabelCsTableImplementation );
	}

	public void setJavaFXLabelCsTableImplementation( CsTableImplementationCFLabel value ) {
		javafxLabelCsTableImplementation = value;
	}

	public CsTableImplementationEditor getJavaFXEditorCsTableImplementation() {
		if( javafxEditorCsTableImplementation == null ) {
			javafxEditorCsTableImplementation = new CsTableImplementationEditor();
		}
		return( javafxEditorCsTableImplementation );
	}

	public void setJavaFXEditorCsTableImplementation( CsTableImplementationEditor value ) {
		javafxEditorCsTableImplementation = value;
	}

	public CsTableObjUsingCFLabel getJavaFXLabelCsTableObjUsing() {
		if( javafxLabelCsTableObjUsing == null ) {
			javafxLabelCsTableObjUsing = new CsTableObjUsingCFLabel();
		}
		return( javafxLabelCsTableObjUsing );
	}

	public void setJavaFXLabelCsTableObjUsing( CsTableObjUsingCFLabel value ) {
		javafxLabelCsTableObjUsing = value;
	}

	public CsTableObjUsingEditor getJavaFXEditorCsTableObjUsing() {
		if( javafxEditorCsTableObjUsing == null ) {
			javafxEditorCsTableObjUsing = new CsTableObjUsingEditor();
		}
		return( javafxEditorCsTableObjUsing );
	}

	public void setJavaFXEditorCsTableObjUsing( CsTableObjUsingEditor value ) {
		javafxEditorCsTableObjUsing = value;
	}

	public CsTableObjMembersCFLabel getJavaFXLabelCsTableObjMembers() {
		if( javafxLabelCsTableObjMembers == null ) {
			javafxLabelCsTableObjMembers = new CsTableObjMembersCFLabel();
		}
		return( javafxLabelCsTableObjMembers );
	}

	public void setJavaFXLabelCsTableObjMembers( CsTableObjMembersCFLabel value ) {
		javafxLabelCsTableObjMembers = value;
	}

	public CsTableObjMembersEditor getJavaFXEditorCsTableObjMembers() {
		if( javafxEditorCsTableObjMembers == null ) {
			javafxEditorCsTableObjMembers = new CsTableObjMembersEditor();
		}
		return( javafxEditorCsTableObjMembers );
	}

	public void setJavaFXEditorCsTableObjMembers( CsTableObjMembersEditor value ) {
		javafxEditorCsTableObjMembers = value;
	}

	public CsTableObjInterfaceCFLabel getJavaFXLabelCsTableObjInterface() {
		if( javafxLabelCsTableObjInterface == null ) {
			javafxLabelCsTableObjInterface = new CsTableObjInterfaceCFLabel();
		}
		return( javafxLabelCsTableObjInterface );
	}

	public void setJavaFXLabelCsTableObjInterface( CsTableObjInterfaceCFLabel value ) {
		javafxLabelCsTableObjInterface = value;
	}

	public CsTableObjInterfaceEditor getJavaFXEditorCsTableObjInterface() {
		if( javafxEditorCsTableObjInterface == null ) {
			javafxEditorCsTableObjInterface = new CsTableObjInterfaceEditor();
		}
		return( javafxEditorCsTableObjInterface );
	}

	public void setJavaFXEditorCsTableObjInterface( CsTableObjInterfaceEditor value ) {
		javafxEditorCsTableObjInterface = value;
	}

	public CsTableObjImplementationCFLabel getJavaFXLabelCsTableObjImplementation() {
		if( javafxLabelCsTableObjImplementation == null ) {
			javafxLabelCsTableObjImplementation = new CsTableObjImplementationCFLabel();
		}
		return( javafxLabelCsTableObjImplementation );
	}

	public void setJavaFXLabelCsTableObjImplementation( CsTableObjImplementationCFLabel value ) {
		javafxLabelCsTableObjImplementation = value;
	}

	public CsTableObjImplementationEditor getJavaFXEditorCsTableObjImplementation() {
		if( javafxEditorCsTableObjImplementation == null ) {
			javafxEditorCsTableObjImplementation = new CsTableObjImplementationEditor();
		}
		return( javafxEditorCsTableObjImplementation );
	}

	public void setJavaFXEditorCsTableObjImplementation( CsTableObjImplementationEditor value ) {
		javafxEditorCsTableObjImplementation = value;
	}

	public CsDb2LUWTableUsingCFLabel getJavaFXLabelCsDb2LUWTableUsing() {
		if( javafxLabelCsDb2LUWTableUsing == null ) {
			javafxLabelCsDb2LUWTableUsing = new CsDb2LUWTableUsingCFLabel();
		}
		return( javafxLabelCsDb2LUWTableUsing );
	}

	public void setJavaFXLabelCsDb2LUWTableUsing( CsDb2LUWTableUsingCFLabel value ) {
		javafxLabelCsDb2LUWTableUsing = value;
	}

	public CsDb2LUWTableUsingEditor getJavaFXEditorCsDb2LUWTableUsing() {
		if( javafxEditorCsDb2LUWTableUsing == null ) {
			javafxEditorCsDb2LUWTableUsing = new CsDb2LUWTableUsingEditor();
		}
		return( javafxEditorCsDb2LUWTableUsing );
	}

	public void setJavaFXEditorCsDb2LUWTableUsing( CsDb2LUWTableUsingEditor value ) {
		javafxEditorCsDb2LUWTableUsing = value;
	}

	public CsDb2LUWTableMembersCFLabel getJavaFXLabelCsDb2LUWTableMembers() {
		if( javafxLabelCsDb2LUWTableMembers == null ) {
			javafxLabelCsDb2LUWTableMembers = new CsDb2LUWTableMembersCFLabel();
		}
		return( javafxLabelCsDb2LUWTableMembers );
	}

	public void setJavaFXLabelCsDb2LUWTableMembers( CsDb2LUWTableMembersCFLabel value ) {
		javafxLabelCsDb2LUWTableMembers = value;
	}

	public CsDb2LUWTableMembersEditor getJavaFXEditorCsDb2LUWTableMembers() {
		if( javafxEditorCsDb2LUWTableMembers == null ) {
			javafxEditorCsDb2LUWTableMembers = new CsDb2LUWTableMembersEditor();
		}
		return( javafxEditorCsDb2LUWTableMembers );
	}

	public void setJavaFXEditorCsDb2LUWTableMembers( CsDb2LUWTableMembersEditor value ) {
		javafxEditorCsDb2LUWTableMembers = value;
	}

	public CsDb2LUWTableImplementationCFLabel getJavaFXLabelCsDb2LUWTableImplementation() {
		if( javafxLabelCsDb2LUWTableImplementation == null ) {
			javafxLabelCsDb2LUWTableImplementation = new CsDb2LUWTableImplementationCFLabel();
		}
		return( javafxLabelCsDb2LUWTableImplementation );
	}

	public void setJavaFXLabelCsDb2LUWTableImplementation( CsDb2LUWTableImplementationCFLabel value ) {
		javafxLabelCsDb2LUWTableImplementation = value;
	}

	public CsDb2LUWTableImplementationEditor getJavaFXEditorCsDb2LUWTableImplementation() {
		if( javafxEditorCsDb2LUWTableImplementation == null ) {
			javafxEditorCsDb2LUWTableImplementation = new CsDb2LUWTableImplementationEditor();
		}
		return( javafxEditorCsDb2LUWTableImplementation );
	}

	public void setJavaFXEditorCsDb2LUWTableImplementation( CsDb2LUWTableImplementationEditor value ) {
		javafxEditorCsDb2LUWTableImplementation = value;
	}

	public CsMSSqlTableUsingCFLabel getJavaFXLabelCsMSSqlTableUsing() {
		if( javafxLabelCsMSSqlTableUsing == null ) {
			javafxLabelCsMSSqlTableUsing = new CsMSSqlTableUsingCFLabel();
		}
		return( javafxLabelCsMSSqlTableUsing );
	}

	public void setJavaFXLabelCsMSSqlTableUsing( CsMSSqlTableUsingCFLabel value ) {
		javafxLabelCsMSSqlTableUsing = value;
	}

	public CsMSSqlTableUsingEditor getJavaFXEditorCsMSSqlTableUsing() {
		if( javafxEditorCsMSSqlTableUsing == null ) {
			javafxEditorCsMSSqlTableUsing = new CsMSSqlTableUsingEditor();
		}
		return( javafxEditorCsMSSqlTableUsing );
	}

	public void setJavaFXEditorCsMSSqlTableUsing( CsMSSqlTableUsingEditor value ) {
		javafxEditorCsMSSqlTableUsing = value;
	}

	public CsMSSqlTableMembersCFLabel getJavaFXLabelCsMSSqlTableMembers() {
		if( javafxLabelCsMSSqlTableMembers == null ) {
			javafxLabelCsMSSqlTableMembers = new CsMSSqlTableMembersCFLabel();
		}
		return( javafxLabelCsMSSqlTableMembers );
	}

	public void setJavaFXLabelCsMSSqlTableMembers( CsMSSqlTableMembersCFLabel value ) {
		javafxLabelCsMSSqlTableMembers = value;
	}

	public CsMSSqlTableMembersEditor getJavaFXEditorCsMSSqlTableMembers() {
		if( javafxEditorCsMSSqlTableMembers == null ) {
			javafxEditorCsMSSqlTableMembers = new CsMSSqlTableMembersEditor();
		}
		return( javafxEditorCsMSSqlTableMembers );
	}

	public void setJavaFXEditorCsMSSqlTableMembers( CsMSSqlTableMembersEditor value ) {
		javafxEditorCsMSSqlTableMembers = value;
	}

	public CsMSSqlTableImplementationCFLabel getJavaFXLabelCsMSSqlTableImplementation() {
		if( javafxLabelCsMSSqlTableImplementation == null ) {
			javafxLabelCsMSSqlTableImplementation = new CsMSSqlTableImplementationCFLabel();
		}
		return( javafxLabelCsMSSqlTableImplementation );
	}

	public void setJavaFXLabelCsMSSqlTableImplementation( CsMSSqlTableImplementationCFLabel value ) {
		javafxLabelCsMSSqlTableImplementation = value;
	}

	public CsMSSqlTableImplementationEditor getJavaFXEditorCsMSSqlTableImplementation() {
		if( javafxEditorCsMSSqlTableImplementation == null ) {
			javafxEditorCsMSSqlTableImplementation = new CsMSSqlTableImplementationEditor();
		}
		return( javafxEditorCsMSSqlTableImplementation );
	}

	public void setJavaFXEditorCsMSSqlTableImplementation( CsMSSqlTableImplementationEditor value ) {
		javafxEditorCsMSSqlTableImplementation = value;
	}

	public CsMySqlTableUsingCFLabel getJavaFXLabelCsMySqlTableUsing() {
		if( javafxLabelCsMySqlTableUsing == null ) {
			javafxLabelCsMySqlTableUsing = new CsMySqlTableUsingCFLabel();
		}
		return( javafxLabelCsMySqlTableUsing );
	}

	public void setJavaFXLabelCsMySqlTableUsing( CsMySqlTableUsingCFLabel value ) {
		javafxLabelCsMySqlTableUsing = value;
	}

	public CsMySqlTableUsingEditor getJavaFXEditorCsMySqlTableUsing() {
		if( javafxEditorCsMySqlTableUsing == null ) {
			javafxEditorCsMySqlTableUsing = new CsMySqlTableUsingEditor();
		}
		return( javafxEditorCsMySqlTableUsing );
	}

	public void setJavaFXEditorCsMySqlTableUsing( CsMySqlTableUsingEditor value ) {
		javafxEditorCsMySqlTableUsing = value;
	}

	public CsMySqlTableMembersCFLabel getJavaFXLabelCsMySqlTableMembers() {
		if( javafxLabelCsMySqlTableMembers == null ) {
			javafxLabelCsMySqlTableMembers = new CsMySqlTableMembersCFLabel();
		}
		return( javafxLabelCsMySqlTableMembers );
	}

	public void setJavaFXLabelCsMySqlTableMembers( CsMySqlTableMembersCFLabel value ) {
		javafxLabelCsMySqlTableMembers = value;
	}

	public CsMySqlTableMembersEditor getJavaFXEditorCsMySqlTableMembers() {
		if( javafxEditorCsMySqlTableMembers == null ) {
			javafxEditorCsMySqlTableMembers = new CsMySqlTableMembersEditor();
		}
		return( javafxEditorCsMySqlTableMembers );
	}

	public void setJavaFXEditorCsMySqlTableMembers( CsMySqlTableMembersEditor value ) {
		javafxEditorCsMySqlTableMembers = value;
	}

	public CsMySqlTableImplementationCFLabel getJavaFXLabelCsMySqlTableImplementation() {
		if( javafxLabelCsMySqlTableImplementation == null ) {
			javafxLabelCsMySqlTableImplementation = new CsMySqlTableImplementationCFLabel();
		}
		return( javafxLabelCsMySqlTableImplementation );
	}

	public void setJavaFXLabelCsMySqlTableImplementation( CsMySqlTableImplementationCFLabel value ) {
		javafxLabelCsMySqlTableImplementation = value;
	}

	public CsMySqlTableImplementationEditor getJavaFXEditorCsMySqlTableImplementation() {
		if( javafxEditorCsMySqlTableImplementation == null ) {
			javafxEditorCsMySqlTableImplementation = new CsMySqlTableImplementationEditor();
		}
		return( javafxEditorCsMySqlTableImplementation );
	}

	public void setJavaFXEditorCsMySqlTableImplementation( CsMySqlTableImplementationEditor value ) {
		javafxEditorCsMySqlTableImplementation = value;
	}

	public CsOracleTableUsingCFLabel getJavaFXLabelCsOracleTableUsing() {
		if( javafxLabelCsOracleTableUsing == null ) {
			javafxLabelCsOracleTableUsing = new CsOracleTableUsingCFLabel();
		}
		return( javafxLabelCsOracleTableUsing );
	}

	public void setJavaFXLabelCsOracleTableUsing( CsOracleTableUsingCFLabel value ) {
		javafxLabelCsOracleTableUsing = value;
	}

	public CsOracleTableUsingEditor getJavaFXEditorCsOracleTableUsing() {
		if( javafxEditorCsOracleTableUsing == null ) {
			javafxEditorCsOracleTableUsing = new CsOracleTableUsingEditor();
		}
		return( javafxEditorCsOracleTableUsing );
	}

	public void setJavaFXEditorCsOracleTableUsing( CsOracleTableUsingEditor value ) {
		javafxEditorCsOracleTableUsing = value;
	}

	public CsOracleTableMembersCFLabel getJavaFXLabelCsOracleTableMembers() {
		if( javafxLabelCsOracleTableMembers == null ) {
			javafxLabelCsOracleTableMembers = new CsOracleTableMembersCFLabel();
		}
		return( javafxLabelCsOracleTableMembers );
	}

	public void setJavaFXLabelCsOracleTableMembers( CsOracleTableMembersCFLabel value ) {
		javafxLabelCsOracleTableMembers = value;
	}

	public CsOracleTableMembersEditor getJavaFXEditorCsOracleTableMembers() {
		if( javafxEditorCsOracleTableMembers == null ) {
			javafxEditorCsOracleTableMembers = new CsOracleTableMembersEditor();
		}
		return( javafxEditorCsOracleTableMembers );
	}

	public void setJavaFXEditorCsOracleTableMembers( CsOracleTableMembersEditor value ) {
		javafxEditorCsOracleTableMembers = value;
	}

	public CsOracleTableImplementationCFLabel getJavaFXLabelCsOracleTableImplementation() {
		if( javafxLabelCsOracleTableImplementation == null ) {
			javafxLabelCsOracleTableImplementation = new CsOracleTableImplementationCFLabel();
		}
		return( javafxLabelCsOracleTableImplementation );
	}

	public void setJavaFXLabelCsOracleTableImplementation( CsOracleTableImplementationCFLabel value ) {
		javafxLabelCsOracleTableImplementation = value;
	}

	public CsOracleTableImplementationEditor getJavaFXEditorCsOracleTableImplementation() {
		if( javafxEditorCsOracleTableImplementation == null ) {
			javafxEditorCsOracleTableImplementation = new CsOracleTableImplementationEditor();
		}
		return( javafxEditorCsOracleTableImplementation );
	}

	public void setJavaFXEditorCsOracleTableImplementation( CsOracleTableImplementationEditor value ) {
		javafxEditorCsOracleTableImplementation = value;
	}

	public CsPgSqlTableUsingCFLabel getJavaFXLabelCsPgSqlTableUsing() {
		if( javafxLabelCsPgSqlTableUsing == null ) {
			javafxLabelCsPgSqlTableUsing = new CsPgSqlTableUsingCFLabel();
		}
		return( javafxLabelCsPgSqlTableUsing );
	}

	public void setJavaFXLabelCsPgSqlTableUsing( CsPgSqlTableUsingCFLabel value ) {
		javafxLabelCsPgSqlTableUsing = value;
	}

	public CsPgSqlTableUsingEditor getJavaFXEditorCsPgSqlTableUsing() {
		if( javafxEditorCsPgSqlTableUsing == null ) {
			javafxEditorCsPgSqlTableUsing = new CsPgSqlTableUsingEditor();
		}
		return( javafxEditorCsPgSqlTableUsing );
	}

	public void setJavaFXEditorCsPgSqlTableUsing( CsPgSqlTableUsingEditor value ) {
		javafxEditorCsPgSqlTableUsing = value;
	}

	public CsPgSqlTableMembersCFLabel getJavaFXLabelCsPgSqlTableMembers() {
		if( javafxLabelCsPgSqlTableMembers == null ) {
			javafxLabelCsPgSqlTableMembers = new CsPgSqlTableMembersCFLabel();
		}
		return( javafxLabelCsPgSqlTableMembers );
	}

	public void setJavaFXLabelCsPgSqlTableMembers( CsPgSqlTableMembersCFLabel value ) {
		javafxLabelCsPgSqlTableMembers = value;
	}

	public CsPgSqlTableMembersEditor getJavaFXEditorCsPgSqlTableMembers() {
		if( javafxEditorCsPgSqlTableMembers == null ) {
			javafxEditorCsPgSqlTableMembers = new CsPgSqlTableMembersEditor();
		}
		return( javafxEditorCsPgSqlTableMembers );
	}

	public void setJavaFXEditorCsPgSqlTableMembers( CsPgSqlTableMembersEditor value ) {
		javafxEditorCsPgSqlTableMembers = value;
	}

	public CsPgSqlTableImplementationCFLabel getJavaFXLabelCsPgSqlTableImplementation() {
		if( javafxLabelCsPgSqlTableImplementation == null ) {
			javafxLabelCsPgSqlTableImplementation = new CsPgSqlTableImplementationCFLabel();
		}
		return( javafxLabelCsPgSqlTableImplementation );
	}

	public void setJavaFXLabelCsPgSqlTableImplementation( CsPgSqlTableImplementationCFLabel value ) {
		javafxLabelCsPgSqlTableImplementation = value;
	}

	public CsPgSqlTableImplementationEditor getJavaFXEditorCsPgSqlTableImplementation() {
		if( javafxEditorCsPgSqlTableImplementation == null ) {
			javafxEditorCsPgSqlTableImplementation = new CsPgSqlTableImplementationEditor();
		}
		return( javafxEditorCsPgSqlTableImplementation );
	}

	public void setJavaFXEditorCsPgSqlTableImplementation( CsPgSqlTableImplementationEditor value ) {
		javafxEditorCsPgSqlTableImplementation = value;
	}

	public CsRamTableUsingCFLabel getJavaFXLabelCsRamTableUsing() {
		if( javafxLabelCsRamTableUsing == null ) {
			javafxLabelCsRamTableUsing = new CsRamTableUsingCFLabel();
		}
		return( javafxLabelCsRamTableUsing );
	}

	public void setJavaFXLabelCsRamTableUsing( CsRamTableUsingCFLabel value ) {
		javafxLabelCsRamTableUsing = value;
	}

	public CsRamTableUsingEditor getJavaFXEditorCsRamTableUsing() {
		if( javafxEditorCsRamTableUsing == null ) {
			javafxEditorCsRamTableUsing = new CsRamTableUsingEditor();
		}
		return( javafxEditorCsRamTableUsing );
	}

	public void setJavaFXEditorCsRamTableUsing( CsRamTableUsingEditor value ) {
		javafxEditorCsRamTableUsing = value;
	}

	public CsRamTableMembersCFLabel getJavaFXLabelCsRamTableMembers() {
		if( javafxLabelCsRamTableMembers == null ) {
			javafxLabelCsRamTableMembers = new CsRamTableMembersCFLabel();
		}
		return( javafxLabelCsRamTableMembers );
	}

	public void setJavaFXLabelCsRamTableMembers( CsRamTableMembersCFLabel value ) {
		javafxLabelCsRamTableMembers = value;
	}

	public CsRamTableMembersEditor getJavaFXEditorCsRamTableMembers() {
		if( javafxEditorCsRamTableMembers == null ) {
			javafxEditorCsRamTableMembers = new CsRamTableMembersEditor();
		}
		return( javafxEditorCsRamTableMembers );
	}

	public void setJavaFXEditorCsRamTableMembers( CsRamTableMembersEditor value ) {
		javafxEditorCsRamTableMembers = value;
	}

	public CsRamTableImplementationCFLabel getJavaFXLabelCsRamTableImplementation() {
		if( javafxLabelCsRamTableImplementation == null ) {
			javafxLabelCsRamTableImplementation = new CsRamTableImplementationCFLabel();
		}
		return( javafxLabelCsRamTableImplementation );
	}

	public void setJavaFXLabelCsRamTableImplementation( CsRamTableImplementationCFLabel value ) {
		javafxLabelCsRamTableImplementation = value;
	}

	public CsRamTableImplementationEditor getJavaFXEditorCsRamTableImplementation() {
		if( javafxEditorCsRamTableImplementation == null ) {
			javafxEditorCsRamTableImplementation = new CsRamTableImplementationEditor();
		}
		return( javafxEditorCsRamTableImplementation );
	}

	public void setJavaFXEditorCsRamTableImplementation( CsRamTableImplementationEditor value ) {
		javafxEditorCsRamTableImplementation = value;
	}

	public CsSaxLoaderUsingCFLabel getJavaFXLabelCsSaxLoaderUsing() {
		if( javafxLabelCsSaxLoaderUsing == null ) {
			javafxLabelCsSaxLoaderUsing = new CsSaxLoaderUsingCFLabel();
		}
		return( javafxLabelCsSaxLoaderUsing );
	}

	public void setJavaFXLabelCsSaxLoaderUsing( CsSaxLoaderUsingCFLabel value ) {
		javafxLabelCsSaxLoaderUsing = value;
	}

	public CsSaxLoaderUsingEditor getJavaFXEditorCsSaxLoaderUsing() {
		if( javafxEditorCsSaxLoaderUsing == null ) {
			javafxEditorCsSaxLoaderUsing = new CsSaxLoaderUsingEditor();
		}
		return( javafxEditorCsSaxLoaderUsing );
	}

	public void setJavaFXEditorCsSaxLoaderUsing( CsSaxLoaderUsingEditor value ) {
		javafxEditorCsSaxLoaderUsing = value;
	}

	public CsSaxLoaderStartElementCFLabel getJavaFXLabelCsSaxLoaderStartElement() {
		if( javafxLabelCsSaxLoaderStartElement == null ) {
			javafxLabelCsSaxLoaderStartElement = new CsSaxLoaderStartElementCFLabel();
		}
		return( javafxLabelCsSaxLoaderStartElement );
	}

	public void setJavaFXLabelCsSaxLoaderStartElement( CsSaxLoaderStartElementCFLabel value ) {
		javafxLabelCsSaxLoaderStartElement = value;
	}

	public CsSaxLoaderStartElementEditor getJavaFXEditorCsSaxLoaderStartElement() {
		if( javafxEditorCsSaxLoaderStartElement == null ) {
			javafxEditorCsSaxLoaderStartElement = new CsSaxLoaderStartElementEditor();
		}
		return( javafxEditorCsSaxLoaderStartElement );
	}

	public void setJavaFXEditorCsSaxLoaderStartElement( CsSaxLoaderStartElementEditor value ) {
		javafxEditorCsSaxLoaderStartElement = value;
	}

	public CsSaxLoaderEndElementCFLabel getJavaFXLabelCsSaxLoaderEndElement() {
		if( javafxLabelCsSaxLoaderEndElement == null ) {
			javafxLabelCsSaxLoaderEndElement = new CsSaxLoaderEndElementCFLabel();
		}
		return( javafxLabelCsSaxLoaderEndElement );
	}

	public void setJavaFXLabelCsSaxLoaderEndElement( CsSaxLoaderEndElementCFLabel value ) {
		javafxLabelCsSaxLoaderEndElement = value;
	}

	public CsSaxLoaderEndElementEditor getJavaFXEditorCsSaxLoaderEndElement() {
		if( javafxEditorCsSaxLoaderEndElement == null ) {
			javafxEditorCsSaxLoaderEndElement = new CsSaxLoaderEndElementEditor();
		}
		return( javafxEditorCsSaxLoaderEndElement );
	}

	public void setJavaFXEditorCsSaxLoaderEndElement( CsSaxLoaderEndElementEditor value ) {
		javafxEditorCsSaxLoaderEndElement = value;
	}

	public CsXMsgTableUsingCFLabel getJavaFXLabelCsXMsgTableUsing() {
		if( javafxLabelCsXMsgTableUsing == null ) {
			javafxLabelCsXMsgTableUsing = new CsXMsgTableUsingCFLabel();
		}
		return( javafxLabelCsXMsgTableUsing );
	}

	public void setJavaFXLabelCsXMsgTableUsing( CsXMsgTableUsingCFLabel value ) {
		javafxLabelCsXMsgTableUsing = value;
	}

	public CsXMsgTableUsingEditor getJavaFXEditorCsXMsgTableUsing() {
		if( javafxEditorCsXMsgTableUsing == null ) {
			javafxEditorCsXMsgTableUsing = new CsXMsgTableUsingEditor();
		}
		return( javafxEditorCsXMsgTableUsing );
	}

	public void setJavaFXEditorCsXMsgTableUsing( CsXMsgTableUsingEditor value ) {
		javafxEditorCsXMsgTableUsing = value;
	}

	public CsXMsgTableFormattersCFLabel getJavaFXLabelCsXMsgTableFormatters() {
		if( javafxLabelCsXMsgTableFormatters == null ) {
			javafxLabelCsXMsgTableFormatters = new CsXMsgTableFormattersCFLabel();
		}
		return( javafxLabelCsXMsgTableFormatters );
	}

	public void setJavaFXLabelCsXMsgTableFormatters( CsXMsgTableFormattersCFLabel value ) {
		javafxLabelCsXMsgTableFormatters = value;
	}

	public CsXMsgTableFormattersEditor getJavaFXEditorCsXMsgTableFormatters() {
		if( javafxEditorCsXMsgTableFormatters == null ) {
			javafxEditorCsXMsgTableFormatters = new CsXMsgTableFormattersEditor();
		}
		return( javafxEditorCsXMsgTableFormatters );
	}

	public void setJavaFXEditorCsXMsgTableFormatters( CsXMsgTableFormattersEditor value ) {
		javafxEditorCsXMsgTableFormatters = value;
	}

	public CsXMsgRqstTableUsingCFLabel getJavaFXLabelCsXMsgRqstTableUsing() {
		if( javafxLabelCsXMsgRqstTableUsing == null ) {
			javafxLabelCsXMsgRqstTableUsing = new CsXMsgRqstTableUsingCFLabel();
		}
		return( javafxLabelCsXMsgRqstTableUsing );
	}

	public void setJavaFXLabelCsXMsgRqstTableUsing( CsXMsgRqstTableUsingCFLabel value ) {
		javafxLabelCsXMsgRqstTableUsing = value;
	}

	public CsXMsgRqstTableUsingEditor getJavaFXEditorCsXMsgRqstTableUsing() {
		if( javafxEditorCsXMsgRqstTableUsing == null ) {
			javafxEditorCsXMsgRqstTableUsing = new CsXMsgRqstTableUsingEditor();
		}
		return( javafxEditorCsXMsgRqstTableUsing );
	}

	public void setJavaFXEditorCsXMsgRqstTableUsing( CsXMsgRqstTableUsingEditor value ) {
		javafxEditorCsXMsgRqstTableUsing = value;
	}

	public CsXMsgRspnTableUsingCFLabel getJavaFXLabelCsXMsgRspnTableUsing() {
		if( javafxLabelCsXMsgRspnTableUsing == null ) {
			javafxLabelCsXMsgRspnTableUsing = new CsXMsgRspnTableUsingCFLabel();
		}
		return( javafxLabelCsXMsgRspnTableUsing );
	}

	public void setJavaFXLabelCsXMsgRspnTableUsing( CsXMsgRspnTableUsingCFLabel value ) {
		javafxLabelCsXMsgRspnTableUsing = value;
	}

	public CsXMsgRspnTableUsingEditor getJavaFXEditorCsXMsgRspnTableUsing() {
		if( javafxEditorCsXMsgRspnTableUsing == null ) {
			javafxEditorCsXMsgRspnTableUsing = new CsXMsgRspnTableUsingEditor();
		}
		return( javafxEditorCsXMsgRspnTableUsing );
	}

	public void setJavaFXEditorCsXMsgRspnTableUsing( CsXMsgRspnTableUsingEditor value ) {
		javafxEditorCsXMsgRspnTableUsing = value;
	}

	public CsXMsgClientTableUsingCFLabel getJavaFXLabelCsXMsgClientTableUsing() {
		if( javafxLabelCsXMsgClientTableUsing == null ) {
			javafxLabelCsXMsgClientTableUsing = new CsXMsgClientTableUsingCFLabel();
		}
		return( javafxLabelCsXMsgClientTableUsing );
	}

	public void setJavaFXLabelCsXMsgClientTableUsing( CsXMsgClientTableUsingCFLabel value ) {
		javafxLabelCsXMsgClientTableUsing = value;
	}

	public CsXMsgClientTableUsingEditor getJavaFXEditorCsXMsgClientTableUsing() {
		if( javafxEditorCsXMsgClientTableUsing == null ) {
			javafxEditorCsXMsgClientTableUsing = new CsXMsgClientTableUsingEditor();
		}
		return( javafxEditorCsXMsgClientTableUsing );
	}

	public void setJavaFXEditorCsXMsgClientTableUsing( CsXMsgClientTableUsingEditor value ) {
		javafxEditorCsXMsgClientTableUsing = value;
	}

	public CsXMsgRqstTableBodyCFLabel getJavaFXLabelCsXMsgRqstTableBody() {
		if( javafxLabelCsXMsgRqstTableBody == null ) {
			javafxLabelCsXMsgRqstTableBody = new CsXMsgRqstTableBodyCFLabel();
		}
		return( javafxLabelCsXMsgRqstTableBody );
	}

	public void setJavaFXLabelCsXMsgRqstTableBody( CsXMsgRqstTableBodyCFLabel value ) {
		javafxLabelCsXMsgRqstTableBody = value;
	}

	public CsXMsgRqstTableBodyEditor getJavaFXEditorCsXMsgRqstTableBody() {
		if( javafxEditorCsXMsgRqstTableBody == null ) {
			javafxEditorCsXMsgRqstTableBody = new CsXMsgRqstTableBodyEditor();
		}
		return( javafxEditorCsXMsgRqstTableBody );
	}

	public void setJavaFXEditorCsXMsgRqstTableBody( CsXMsgRqstTableBodyEditor value ) {
		javafxEditorCsXMsgRqstTableBody = value;
	}

	public CsXMsgRspnTableBodyCFLabel getJavaFXLabelCsXMsgRspnTableBody() {
		if( javafxLabelCsXMsgRspnTableBody == null ) {
			javafxLabelCsXMsgRspnTableBody = new CsXMsgRspnTableBodyCFLabel();
		}
		return( javafxLabelCsXMsgRspnTableBody );
	}

	public void setJavaFXLabelCsXMsgRspnTableBody( CsXMsgRspnTableBodyCFLabel value ) {
		javafxLabelCsXMsgRspnTableBody = value;
	}

	public CsXMsgRspnTableBodyEditor getJavaFXEditorCsXMsgRspnTableBody() {
		if( javafxEditorCsXMsgRspnTableBody == null ) {
			javafxEditorCsXMsgRspnTableBody = new CsXMsgRspnTableBodyEditor();
		}
		return( javafxEditorCsXMsgRspnTableBody );
	}

	public void setJavaFXEditorCsXMsgRspnTableBody( CsXMsgRspnTableBodyEditor value ) {
		javafxEditorCsXMsgRspnTableBody = value;
	}

	public CsXMsgClientTableBodyCFLabel getJavaFXLabelCsXMsgClientTableBody() {
		if( javafxLabelCsXMsgClientTableBody == null ) {
			javafxLabelCsXMsgClientTableBody = new CsXMsgClientTableBodyCFLabel();
		}
		return( javafxLabelCsXMsgClientTableBody );
	}

	public void setJavaFXLabelCsXMsgClientTableBody( CsXMsgClientTableBodyCFLabel value ) {
		javafxLabelCsXMsgClientTableBody = value;
	}

	public CsXMsgClientTableBodyEditor getJavaFXEditorCsXMsgClientTableBody() {
		if( javafxEditorCsXMsgClientTableBody == null ) {
			javafxEditorCsXMsgClientTableBody = new CsXMsgClientTableBodyEditor();
		}
		return( javafxEditorCsXMsgClientTableBody );
	}

	public void setJavaFXEditorCsXMsgClientTableBody( CsXMsgClientTableBodyEditor value ) {
		javafxEditorCsXMsgClientTableBody = value;
	}

	public void populateFields()
	{
		ICFBamTableObj popObj = getEffJavaFXFocus();
		if( getPaneMode() == CFPane.PaneMode.Unknown ) {
			popObj = null;
		}
		if( popObj == null ) {
			javafxLookupDefSchemaObj = null;
		}
		else {
			javafxLookupDefSchemaObj = (ICFBamSchemaDefObj)popObj.getOptionalLookupDefSchema( javafxIsInitializing );
		}
		if( javafxReferenceLookupDefSchema != null ) {
			javafxReferenceLookupDefSchema.setReferencedObject( javafxLookupDefSchemaObj );
		}

		if( popObj == null ) {
			javafxLookupLookupIndexObj = null;
		}
		else {
			javafxLookupLookupIndexObj = (ICFBamIndexObj)popObj.getOptionalLookupLookupIndex( javafxIsInitializing );
		}
		if( javafxReferenceLookupLookupIndex != null ) {
			javafxReferenceLookupLookupIndex.setReferencedObject( javafxLookupLookupIndexObj );
		}

		if( popObj == null ) {
			javafxLookupAltIndexObj = null;
		}
		else {
			javafxLookupAltIndexObj = (ICFBamIndexObj)popObj.getOptionalLookupAltIndex( javafxIsInitializing );
		}
		if( javafxReferenceLookupAltIndex != null ) {
			javafxReferenceLookupAltIndex.setReferencedObject( javafxLookupAltIndexObj );
		}

		if( popObj == null ) {
			javafxLookupQualTableObj = null;
		}
		else {
			javafxLookupQualTableObj = (ICFBamTableObj)popObj.getOptionalLookupQualTable( javafxIsInitializing );
		}
		if( javafxReferenceLookupQualTable != null ) {
			javafxReferenceLookupQualTable.setReferencedObject( javafxLookupQualTableObj );
		}

		if( popObj == null ) {
			javafxLookupPrimaryIndexObj = null;
		}
		else {
			javafxLookupPrimaryIndexObj = (ICFBamIndexObj)popObj.getOptionalLookupPrimaryIndex( javafxIsInitializing );
		}
		if( javafxReferenceLookupPrimaryIndex != null ) {
			javafxReferenceLookupPrimaryIndex.setReferencedObject( javafxLookupPrimaryIndexObj );
		}

		if( popObj == null ) {
			getJavaFXEditorId().setInt64Value( null );
		}
		else {
			getJavaFXEditorId().setInt64Value( popObj.getRequiredId() );
		}

		if( popObj == null ) {
			getJavaFXEditorName().setStringValue( null );
		}
		else {
			getJavaFXEditorName().setStringValue( popObj.getRequiredName() );
		}

		if( popObj == null ) {
			getJavaFXEditorDbName().setStringValue( null );
		}
		else {
			getJavaFXEditorDbName().setStringValue( popObj.getOptionalDbName() );
		}

		if( popObj == null ) {
			getJavaFXEditorShortName().setStringValue( null );
		}
		else {
			getJavaFXEditorShortName().setStringValue( popObj.getOptionalShortName() );
		}

		if( popObj == null ) {
			getJavaFXEditorLabel().setStringValue( null );
		}
		else {
			getJavaFXEditorLabel().setStringValue( popObj.getOptionalLabel() );
		}

		if( popObj == null ) {
			getJavaFXEditorShortDescription().setStringValue( null );
		}
		else {
			getJavaFXEditorShortDescription().setStringValue( popObj.getOptionalShortDescription() );
		}

		if( popObj == null ) {
			getJavaFXEditorDescription().setStringValue( null );
		}
		else {
			getJavaFXEditorDescription().setStringValue( popObj.getOptionalDescription() );
		}

		if( popObj == null ) {
			getJavaFXEditorPageData().setBooleanValue( null );
		}
		else {
			getJavaFXEditorPageData().setBooleanValue( popObj.getRequiredPageData() );
		}

		if( popObj == null ) {
			getJavaFXEditorTableClassCode().setStringValue( null );
		}
		else {
			getJavaFXEditorTableClassCode().setStringValue( popObj.getRequiredTableClassCode() );
		}

		if( popObj == null ) {
			getJavaFXEditorIsInstantiable().setBooleanValue( null );
		}
		else {
			getJavaFXEditorIsInstantiable().setBooleanValue( popObj.getRequiredIsInstantiable() );
		}

		if( popObj == null ) {
			getJavaFXEditorHasHistory().setBooleanValue( null );
		}
		else {
			getJavaFXEditorHasHistory().setBooleanValue( popObj.getRequiredHasHistory() );
		}

		if( popObj == null ) {
			getJavaFXEditorHasAuditColumns().setBooleanValue( null );
		}
		else {
			getJavaFXEditorHasAuditColumns().setBooleanValue( popObj.getRequiredHasAuditColumns() );
		}

		if( popObj == null ) {
			getJavaFXEditorIsMutable().setBooleanValue( null );
		}
		else {
			getJavaFXEditorIsMutable().setBooleanValue( popObj.getRequiredIsMutable() );
		}

		if( popObj == null ) {
			getJavaFXEditorIsServerOnly().setBooleanValue( null );
		}
		else {
			getJavaFXEditorIsServerOnly().setBooleanValue( popObj.getRequiredIsServerOnly() );
		}

		if( popObj == null ) {
			getJavaFXEditorLoaderBehaviour().setValue( null );
		}
		else {
			getJavaFXEditorLoaderBehaviour().setValue(
				( popObj.getRequiredLoaderBehaviour() == null )
					? null
					: popObj.getRequiredLoaderBehaviour().toString() );
		}

		if( popObj == null ) {
			getJavaFXEditorSecScope().setValue( null );
		}
		else {
			getJavaFXEditorSecScope().setValue(
				( popObj.getRequiredSecScope() == null )
					? null
					: popObj.getRequiredSecScope().toString() );
		}

		if( popObj == null ) {
			getJavaFXEditorJObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorJObjMembers().setTextValue( popObj.getOptionalJObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorJObjInterface().setTextValue( null );
		}
		else {
			getJavaFXEditorJObjInterface().setTextValue( popObj.getOptionalJObjInterface() );
		}

		if( popObj == null ) {
			getJavaFXEditorJObjImport().setTextValue( null );
		}
		else {
			getJavaFXEditorJObjImport().setTextValue( popObj.getOptionalJObjImport() );
		}

		if( popObj == null ) {
			getJavaFXEditorJObjImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorJObjImplementation().setTextValue( popObj.getOptionalJObjImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorJEditObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorJEditObjMembers().setTextValue( popObj.getOptionalJEditObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorJEditObjInterface().setTextValue( null );
		}
		else {
			getJavaFXEditorJEditObjInterface().setTextValue( popObj.getOptionalJEditObjInterface() );
		}

		if( popObj == null ) {
			getJavaFXEditorJEditObjImport().setTextValue( null );
		}
		else {
			getJavaFXEditorJEditObjImport().setTextValue( popObj.getOptionalJEditObjImport() );
		}

		if( popObj == null ) {
			getJavaFXEditorJEditObjImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorJEditObjImplementation().setTextValue( popObj.getOptionalJEditObjImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorJTableImport().setTextValue( null );
		}
		else {
			getJavaFXEditorJTableImport().setTextValue( popObj.getOptionalJTableImport() );
		}

		if( popObj == null ) {
			getJavaFXEditorJTableMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorJTableMembers().setTextValue( popObj.getOptionalJTableMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorJTableInterface().setTextValue( null );
		}
		else {
			getJavaFXEditorJTableInterface().setTextValue( popObj.getOptionalJTableInterface() );
		}

		if( popObj == null ) {
			getJavaFXEditorJTableImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorJTableImplementation().setTextValue( popObj.getOptionalJTableImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorJTableObjImport().setTextValue( null );
		}
		else {
			getJavaFXEditorJTableObjImport().setTextValue( popObj.getOptionalJTableObjImport() );
		}

		if( popObj == null ) {
			getJavaFXEditorJTableObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorJTableObjMembers().setTextValue( popObj.getOptionalJTableObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorJTableObjInterface().setTextValue( null );
		}
		else {
			getJavaFXEditorJTableObjInterface().setTextValue( popObj.getOptionalJTableObjInterface() );
		}

		if( popObj == null ) {
			getJavaFXEditorJTableObjImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorJTableObjImplementation().setTextValue( popObj.getOptionalJTableObjImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorJDb2LUWTableImport().setTextValue( null );
		}
		else {
			getJavaFXEditorJDb2LUWTableImport().setTextValue( popObj.getOptionalJDb2LUWTableImport() );
		}

		if( popObj == null ) {
			getJavaFXEditorJDb2LUWTableMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorJDb2LUWTableMembers().setTextValue( popObj.getOptionalJDb2LUWTableMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorJDb2LUWTableImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorJDb2LUWTableImplementation().setTextValue( popObj.getOptionalJDb2LUWTableImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorJMSSqlTableImport().setTextValue( null );
		}
		else {
			getJavaFXEditorJMSSqlTableImport().setTextValue( popObj.getOptionalJMSSqlTableImport() );
		}

		if( popObj == null ) {
			getJavaFXEditorJMSSqlTableMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorJMSSqlTableMembers().setTextValue( popObj.getOptionalJMSSqlTableMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorJMSSqlTableImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorJMSSqlTableImplementation().setTextValue( popObj.getOptionalJMSSqlTableImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorJMySqlTableImport().setTextValue( null );
		}
		else {
			getJavaFXEditorJMySqlTableImport().setTextValue( popObj.getOptionalJMySqlTableImport() );
		}

		if( popObj == null ) {
			getJavaFXEditorJMySqlTableMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorJMySqlTableMembers().setTextValue( popObj.getOptionalJMySqlTableMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorJMySqlTableImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorJMySqlTableImplementation().setTextValue( popObj.getOptionalJMySqlTableImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorJOracleTableImport().setTextValue( null );
		}
		else {
			getJavaFXEditorJOracleTableImport().setTextValue( popObj.getOptionalJOracleTableImport() );
		}

		if( popObj == null ) {
			getJavaFXEditorJOracleTableMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorJOracleTableMembers().setTextValue( popObj.getOptionalJOracleTableMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorJOracleTableImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorJOracleTableImplementation().setTextValue( popObj.getOptionalJOracleTableImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorJPgSqlTableImport().setTextValue( null );
		}
		else {
			getJavaFXEditorJPgSqlTableImport().setTextValue( popObj.getOptionalJPgSqlTableImport() );
		}

		if( popObj == null ) {
			getJavaFXEditorJPgSqlTableMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorJPgSqlTableMembers().setTextValue( popObj.getOptionalJPgSqlTableMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorJPgSqlTableImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorJPgSqlTableImplementation().setTextValue( popObj.getOptionalJPgSqlTableImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorJRamTableImport().setTextValue( null );
		}
		else {
			getJavaFXEditorJRamTableImport().setTextValue( popObj.getOptionalJRamTableImport() );
		}

		if( popObj == null ) {
			getJavaFXEditorJRamTableMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorJRamTableMembers().setTextValue( popObj.getOptionalJRamTableMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorJRamTableImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorJRamTableImplementation().setTextValue( popObj.getOptionalJRamTableImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorJSaxLoaderImport().setTextValue( null );
		}
		else {
			getJavaFXEditorJSaxLoaderImport().setTextValue( popObj.getOptionalJSaxLoaderImport() );
		}

		if( popObj == null ) {
			getJavaFXEditorJSaxLoaderStartElement().setTextValue( null );
		}
		else {
			getJavaFXEditorJSaxLoaderStartElement().setTextValue( popObj.getOptionalJSaxLoaderStartElement() );
		}

		if( popObj == null ) {
			getJavaFXEditorJSaxLoaderEndElement().setTextValue( null );
		}
		else {
			getJavaFXEditorJSaxLoaderEndElement().setTextValue( popObj.getOptionalJSaxLoaderEndElement() );
		}

		if( popObj == null ) {
			getJavaFXEditorJXMsgTableImport().setTextValue( null );
		}
		else {
			getJavaFXEditorJXMsgTableImport().setTextValue( popObj.getOptionalJXMsgTableImport() );
		}

		if( popObj == null ) {
			getJavaFXEditorJXMsgTableFormatters().setTextValue( null );
		}
		else {
			getJavaFXEditorJXMsgTableFormatters().setTextValue( popObj.getOptionalJXMsgTableFormatters() );
		}

		if( popObj == null ) {
			getJavaFXEditorJXMsgRqstTableImport().setTextValue( null );
		}
		else {
			getJavaFXEditorJXMsgRqstTableImport().setTextValue( popObj.getOptionalJXMsgRqstTableImport() );
		}

		if( popObj == null ) {
			getJavaFXEditorJXMsgRspnTableImport().setTextValue( null );
		}
		else {
			getJavaFXEditorJXMsgRspnTableImport().setTextValue( popObj.getOptionalJXMsgRspnTableImport() );
		}

		if( popObj == null ) {
			getJavaFXEditorJXMsgClientTableImport().setTextValue( null );
		}
		else {
			getJavaFXEditorJXMsgClientTableImport().setTextValue( popObj.getOptionalJXMsgClientTableImport() );
		}

		if( popObj == null ) {
			getJavaFXEditorJXMsgRqstTableBody().setTextValue( null );
		}
		else {
			getJavaFXEditorJXMsgRqstTableBody().setTextValue( popObj.getOptionalJXMsgRqstTableBody() );
		}

		if( popObj == null ) {
			getJavaFXEditorJXMsgRspnTableBody().setTextValue( null );
		}
		else {
			getJavaFXEditorJXMsgRspnTableBody().setTextValue( popObj.getOptionalJXMsgRspnTableBody() );
		}

		if( popObj == null ) {
			getJavaFXEditorJXMsgClientTableBody().setTextValue( null );
		}
		else {
			getJavaFXEditorJXMsgClientTableBody().setTextValue( popObj.getOptionalJXMsgClientTableBody() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorCppObjMembers().setTextValue( popObj.getOptionalCppObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppObjInterface().setTextValue( null );
		}
		else {
			getJavaFXEditorCppObjInterface().setTextValue( popObj.getOptionalCppObjInterface() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppObjInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorCppObjInclude().setTextValue( popObj.getOptionalCppObjInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppObjImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorCppObjImplementation().setTextValue( popObj.getOptionalCppObjImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppEditObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorCppEditObjMembers().setTextValue( popObj.getOptionalCppEditObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppEditObjInterface().setTextValue( null );
		}
		else {
			getJavaFXEditorCppEditObjInterface().setTextValue( popObj.getOptionalCppEditObjInterface() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppEditObjInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorCppEditObjInclude().setTextValue( popObj.getOptionalCppEditObjInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppEditObjImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorCppEditObjImplementation().setTextValue( popObj.getOptionalCppEditObjImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppTableInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorCppTableInclude().setTextValue( popObj.getOptionalCppTableInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppTableMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorCppTableMembers().setTextValue( popObj.getOptionalCppTableMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppTableInterface().setTextValue( null );
		}
		else {
			getJavaFXEditorCppTableInterface().setTextValue( popObj.getOptionalCppTableInterface() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppTableImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorCppTableImplementation().setTextValue( popObj.getOptionalCppTableImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppTableObjInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorCppTableObjInclude().setTextValue( popObj.getOptionalCppTableObjInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppTableObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorCppTableObjMembers().setTextValue( popObj.getOptionalCppTableObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppTableObjInterface().setTextValue( null );
		}
		else {
			getJavaFXEditorCppTableObjInterface().setTextValue( popObj.getOptionalCppTableObjInterface() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppTableObjImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorCppTableObjImplementation().setTextValue( popObj.getOptionalCppTableObjImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppDb2LUWTableInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorCppDb2LUWTableInclude().setTextValue( popObj.getOptionalCppDb2LUWTableInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppDb2LUWTableMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorCppDb2LUWTableMembers().setTextValue( popObj.getOptionalCppDb2LUWTableMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppDb2LUWTableImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorCppDb2LUWTableImplementation().setTextValue( popObj.getOptionalCppDb2LUWTableImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppMSSqlTableInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorCppMSSqlTableInclude().setTextValue( popObj.getOptionalCppMSSqlTableInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppMSSqlTableMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorCppMSSqlTableMembers().setTextValue( popObj.getOptionalCppMSSqlTableMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppMSSqlTableImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorCppMSSqlTableImplementation().setTextValue( popObj.getOptionalCppMSSqlTableImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppMySqlTableInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorCppMySqlTableInclude().setTextValue( popObj.getOptionalCppMySqlTableInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppMySqlTableMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorCppMySqlTableMembers().setTextValue( popObj.getOptionalCppMySqlTableMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppMySqlTableImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorCppMySqlTableImplementation().setTextValue( popObj.getOptionalCppMySqlTableImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppOracleTableInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorCppOracleTableInclude().setTextValue( popObj.getOptionalCppOracleTableInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppOracleTableMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorCppOracleTableMembers().setTextValue( popObj.getOptionalCppOracleTableMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppOracleTableImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorCppOracleTableImplementation().setTextValue( popObj.getOptionalCppOracleTableImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppPgSqlTableInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorCppPgSqlTableInclude().setTextValue( popObj.getOptionalCppPgSqlTableInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppPgSqlTableMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorCppPgSqlTableMembers().setTextValue( popObj.getOptionalCppPgSqlTableMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppPgSqlTableImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorCppPgSqlTableImplementation().setTextValue( popObj.getOptionalCppPgSqlTableImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppRamTableInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorCppRamTableInclude().setTextValue( popObj.getOptionalCppRamTableInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppRamTableMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorCppRamTableMembers().setTextValue( popObj.getOptionalCppRamTableMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppRamTableImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorCppRamTableImplementation().setTextValue( popObj.getOptionalCppRamTableImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppSaxLoaderInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorCppSaxLoaderInclude().setTextValue( popObj.getOptionalCppSaxLoaderInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppSaxLoaderStartElement().setTextValue( null );
		}
		else {
			getJavaFXEditorCppSaxLoaderStartElement().setTextValue( popObj.getOptionalCppSaxLoaderStartElement() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppSaxLoaderEndElement().setTextValue( null );
		}
		else {
			getJavaFXEditorCppSaxLoaderEndElement().setTextValue( popObj.getOptionalCppSaxLoaderEndElement() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppXMsgTableInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorCppXMsgTableInclude().setTextValue( popObj.getOptionalCppXMsgTableInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppXMsgTableFormatters().setTextValue( null );
		}
		else {
			getJavaFXEditorCppXMsgTableFormatters().setTextValue( popObj.getOptionalCppXMsgTableFormatters() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppXMsgRqstTableInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorCppXMsgRqstTableInclude().setTextValue( popObj.getOptionalCppXMsgRqstTableInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppXMsgRspnTableInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorCppXMsgRspnTableInclude().setTextValue( popObj.getOptionalCppXMsgRspnTableInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppXMsgClientTableInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorCppXMsgClientTableInclude().setTextValue( popObj.getOptionalCppXMsgClientTableInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppXMsgRqstTableBody().setTextValue( null );
		}
		else {
			getJavaFXEditorCppXMsgRqstTableBody().setTextValue( popObj.getOptionalCppXMsgRqstTableBody() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppXMsgRspnTableBody().setTextValue( null );
		}
		else {
			getJavaFXEditorCppXMsgRspnTableBody().setTextValue( popObj.getOptionalCppXMsgRspnTableBody() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppXMsgClientTableBody().setTextValue( null );
		}
		else {
			getJavaFXEditorCppXMsgClientTableBody().setTextValue( popObj.getOptionalCppXMsgClientTableBody() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorHppObjMembers().setTextValue( popObj.getOptionalHppObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppObjInterface().setTextValue( null );
		}
		else {
			getJavaFXEditorHppObjInterface().setTextValue( popObj.getOptionalHppObjInterface() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppObjInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorHppObjInclude().setTextValue( popObj.getOptionalHppObjInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppObjImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorHppObjImplementation().setTextValue( popObj.getOptionalHppObjImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppEditObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorHppEditObjMembers().setTextValue( popObj.getOptionalHppEditObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppEditObjInterface().setTextValue( null );
		}
		else {
			getJavaFXEditorHppEditObjInterface().setTextValue( popObj.getOptionalHppEditObjInterface() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppEditObjInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorHppEditObjInclude().setTextValue( popObj.getOptionalHppEditObjInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppEditObjImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorHppEditObjImplementation().setTextValue( popObj.getOptionalHppEditObjImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppTableInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorHppTableInclude().setTextValue( popObj.getOptionalHppTableInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppTableMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorHppTableMembers().setTextValue( popObj.getOptionalHppTableMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppTableInterface().setTextValue( null );
		}
		else {
			getJavaFXEditorHppTableInterface().setTextValue( popObj.getOptionalHppTableInterface() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppTableImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorHppTableImplementation().setTextValue( popObj.getOptionalHppTableImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppTableObjInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorHppTableObjInclude().setTextValue( popObj.getOptionalHppTableObjInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppTableObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorHppTableObjMembers().setTextValue( popObj.getOptionalHppTableObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppTableObjInterface().setTextValue( null );
		}
		else {
			getJavaFXEditorHppTableObjInterface().setTextValue( popObj.getOptionalHppTableObjInterface() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppTableObjImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorHppTableObjImplementation().setTextValue( popObj.getOptionalHppTableObjImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppDb2LUWTableInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorHppDb2LUWTableInclude().setTextValue( popObj.getOptionalHppDb2LUWTableInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppDb2LUWTableMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorHppDb2LUWTableMembers().setTextValue( popObj.getOptionalHppDb2LUWTableMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppDb2LUWTableImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorHppDb2LUWTableImplementation().setTextValue( popObj.getOptionalHppDb2LUWTableImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppMSSqlTableInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorHppMSSqlTableInclude().setTextValue( popObj.getOptionalHppMSSqlTableInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppMSSqlTableMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorHppMSSqlTableMembers().setTextValue( popObj.getOptionalHppMSSqlTableMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppMSSqlTableImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorHppMSSqlTableImplementation().setTextValue( popObj.getOptionalHppMSSqlTableImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppMySqlTableInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorHppMySqlTableInclude().setTextValue( popObj.getOptionalHppMySqlTableInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppMySqlTableMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorHppMySqlTableMembers().setTextValue( popObj.getOptionalHppMySqlTableMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppMySqlTableImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorHppMySqlTableImplementation().setTextValue( popObj.getOptionalHppMySqlTableImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppOracleTableInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorHppOracleTableInclude().setTextValue( popObj.getOptionalHppOracleTableInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppOracleTableMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorHppOracleTableMembers().setTextValue( popObj.getOptionalHppOracleTableMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppOracleTableImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorHppOracleTableImplementation().setTextValue( popObj.getOptionalHppOracleTableImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppPgSqlTableInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorHppPgSqlTableInclude().setTextValue( popObj.getOptionalHppPgSqlTableInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppPgSqlTableMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorHppPgSqlTableMembers().setTextValue( popObj.getOptionalHppPgSqlTableMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppPgSqlTableImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorHppPgSqlTableImplementation().setTextValue( popObj.getOptionalHppPgSqlTableImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppRamTableInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorHppRamTableInclude().setTextValue( popObj.getOptionalHppRamTableInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppRamTableMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorHppRamTableMembers().setTextValue( popObj.getOptionalHppRamTableMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppRamTableImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorHppRamTableImplementation().setTextValue( popObj.getOptionalHppRamTableImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppSaxLoaderInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorHppSaxLoaderInclude().setTextValue( popObj.getOptionalHppSaxLoaderInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppSaxLoaderStartElement().setTextValue( null );
		}
		else {
			getJavaFXEditorHppSaxLoaderStartElement().setTextValue( popObj.getOptionalHppSaxLoaderStartElement() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppSaxLoaderEndElement().setTextValue( null );
		}
		else {
			getJavaFXEditorHppSaxLoaderEndElement().setTextValue( popObj.getOptionalHppSaxLoaderEndElement() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppXMsgTableInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorHppXMsgTableInclude().setTextValue( popObj.getOptionalHppXMsgTableInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppXMsgTableFormatters().setTextValue( null );
		}
		else {
			getJavaFXEditorHppXMsgTableFormatters().setTextValue( popObj.getOptionalHppXMsgTableFormatters() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppXMsgRqstTableInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorHppXMsgRqstTableInclude().setTextValue( popObj.getOptionalHppXMsgRqstTableInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppXMsgRspnTableInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorHppXMsgRspnTableInclude().setTextValue( popObj.getOptionalHppXMsgRspnTableInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppXMsgClientTableInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorHppXMsgClientTableInclude().setTextValue( popObj.getOptionalHppXMsgClientTableInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppXMsgRqstTableBody().setTextValue( null );
		}
		else {
			getJavaFXEditorHppXMsgRqstTableBody().setTextValue( popObj.getOptionalHppXMsgRqstTableBody() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppXMsgRspnTableBody().setTextValue( null );
		}
		else {
			getJavaFXEditorHppXMsgRspnTableBody().setTextValue( popObj.getOptionalHppXMsgRspnTableBody() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppXMsgClientTableBody().setTextValue( null );
		}
		else {
			getJavaFXEditorHppXMsgClientTableBody().setTextValue( popObj.getOptionalHppXMsgClientTableBody() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorCsObjMembers().setTextValue( popObj.getOptionalCsObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsObjInterface().setTextValue( null );
		}
		else {
			getJavaFXEditorCsObjInterface().setTextValue( popObj.getOptionalCsObjInterface() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsObjUsing().setTextValue( null );
		}
		else {
			getJavaFXEditorCsObjUsing().setTextValue( popObj.getOptionalCsObjUsing() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsObjImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorCsObjImplementation().setTextValue( popObj.getOptionalCsObjImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsEditObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorCsEditObjMembers().setTextValue( popObj.getOptionalCsEditObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsEditObjInterface().setTextValue( null );
		}
		else {
			getJavaFXEditorCsEditObjInterface().setTextValue( popObj.getOptionalCsEditObjInterface() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsEditObjUsing().setTextValue( null );
		}
		else {
			getJavaFXEditorCsEditObjUsing().setTextValue( popObj.getOptionalCsEditObjUsing() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsEditObjImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorCsEditObjImplementation().setTextValue( popObj.getOptionalCsEditObjImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsTableUsing().setTextValue( null );
		}
		else {
			getJavaFXEditorCsTableUsing().setTextValue( popObj.getOptionalCsTableUsing() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsTableMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorCsTableMembers().setTextValue( popObj.getOptionalCsTableMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsTableInterface().setTextValue( null );
		}
		else {
			getJavaFXEditorCsTableInterface().setTextValue( popObj.getOptionalCsTableInterface() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsTableImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorCsTableImplementation().setTextValue( popObj.getOptionalCsTableImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsTableObjUsing().setTextValue( null );
		}
		else {
			getJavaFXEditorCsTableObjUsing().setTextValue( popObj.getOptionalCsTableObjUsing() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsTableObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorCsTableObjMembers().setTextValue( popObj.getOptionalCsTableObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsTableObjInterface().setTextValue( null );
		}
		else {
			getJavaFXEditorCsTableObjInterface().setTextValue( popObj.getOptionalCsTableObjInterface() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsTableObjImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorCsTableObjImplementation().setTextValue( popObj.getOptionalCsTableObjImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsDb2LUWTableUsing().setTextValue( null );
		}
		else {
			getJavaFXEditorCsDb2LUWTableUsing().setTextValue( popObj.getOptionalCsDb2LUWTableUsing() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsDb2LUWTableMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorCsDb2LUWTableMembers().setTextValue( popObj.getOptionalCsDb2LUWTableMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsDb2LUWTableImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorCsDb2LUWTableImplementation().setTextValue( popObj.getOptionalCsDb2LUWTableImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsMSSqlTableUsing().setTextValue( null );
		}
		else {
			getJavaFXEditorCsMSSqlTableUsing().setTextValue( popObj.getOptionalCsMSSqlTableUsing() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsMSSqlTableMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorCsMSSqlTableMembers().setTextValue( popObj.getOptionalCsMSSqlTableMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsMSSqlTableImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorCsMSSqlTableImplementation().setTextValue( popObj.getOptionalCsMSSqlTableImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsMySqlTableUsing().setTextValue( null );
		}
		else {
			getJavaFXEditorCsMySqlTableUsing().setTextValue( popObj.getOptionalCsMySqlTableUsing() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsMySqlTableMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorCsMySqlTableMembers().setTextValue( popObj.getOptionalCsMySqlTableMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsMySqlTableImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorCsMySqlTableImplementation().setTextValue( popObj.getOptionalCsMySqlTableImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsOracleTableUsing().setTextValue( null );
		}
		else {
			getJavaFXEditorCsOracleTableUsing().setTextValue( popObj.getOptionalCsOracleTableUsing() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsOracleTableMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorCsOracleTableMembers().setTextValue( popObj.getOptionalCsOracleTableMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsOracleTableImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorCsOracleTableImplementation().setTextValue( popObj.getOptionalCsOracleTableImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsPgSqlTableUsing().setTextValue( null );
		}
		else {
			getJavaFXEditorCsPgSqlTableUsing().setTextValue( popObj.getOptionalCsPgSqlTableUsing() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsPgSqlTableMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorCsPgSqlTableMembers().setTextValue( popObj.getOptionalCsPgSqlTableMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsPgSqlTableImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorCsPgSqlTableImplementation().setTextValue( popObj.getOptionalCsPgSqlTableImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsRamTableUsing().setTextValue( null );
		}
		else {
			getJavaFXEditorCsRamTableUsing().setTextValue( popObj.getOptionalCsRamTableUsing() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsRamTableMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorCsRamTableMembers().setTextValue( popObj.getOptionalCsRamTableMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsRamTableImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorCsRamTableImplementation().setTextValue( popObj.getOptionalCsRamTableImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsSaxLoaderUsing().setTextValue( null );
		}
		else {
			getJavaFXEditorCsSaxLoaderUsing().setTextValue( popObj.getOptionalCsSaxLoaderUsing() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsSaxLoaderStartElement().setTextValue( null );
		}
		else {
			getJavaFXEditorCsSaxLoaderStartElement().setTextValue( popObj.getOptionalCsSaxLoaderStartElement() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsSaxLoaderEndElement().setTextValue( null );
		}
		else {
			getJavaFXEditorCsSaxLoaderEndElement().setTextValue( popObj.getOptionalCsSaxLoaderEndElement() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsXMsgTableUsing().setTextValue( null );
		}
		else {
			getJavaFXEditorCsXMsgTableUsing().setTextValue( popObj.getOptionalCsXMsgTableUsing() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsXMsgTableFormatters().setTextValue( null );
		}
		else {
			getJavaFXEditorCsXMsgTableFormatters().setTextValue( popObj.getOptionalCsXMsgTableFormatters() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsXMsgRqstTableUsing().setTextValue( null );
		}
		else {
			getJavaFXEditorCsXMsgRqstTableUsing().setTextValue( popObj.getOptionalCsXMsgRqstTableUsing() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsXMsgRspnTableUsing().setTextValue( null );
		}
		else {
			getJavaFXEditorCsXMsgRspnTableUsing().setTextValue( popObj.getOptionalCsXMsgRspnTableUsing() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsXMsgClientTableUsing().setTextValue( null );
		}
		else {
			getJavaFXEditorCsXMsgClientTableUsing().setTextValue( popObj.getOptionalCsXMsgClientTableUsing() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsXMsgRqstTableBody().setTextValue( null );
		}
		else {
			getJavaFXEditorCsXMsgRqstTableBody().setTextValue( popObj.getOptionalCsXMsgRqstTableBody() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsXMsgRspnTableBody().setTextValue( null );
		}
		else {
			getJavaFXEditorCsXMsgRspnTableBody().setTextValue( popObj.getOptionalCsXMsgRspnTableBody() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsXMsgClientTableBody().setTextValue( null );
		}
		else {
			getJavaFXEditorCsXMsgClientTableBody().setTextValue( popObj.getOptionalCsXMsgClientTableBody() );
		}
	}

	public void postFields()
	{
		final String S_ProcName = "postFields";
		ICFBamTableObj focus = getJavaFXFocusAsTable();
		ICFBamTableEditObj editObj;
		if( focus != null ) {
			editObj = (ICFBamTableEditObj)(focus.getEdit());
		}
		else {
			editObj = null;
		}
		if( editObj == null ) {
			throw new CFLibUsageException( getClass(),
				S_ProcName,
				"Pane is unfocused or is not editing the focus object" );
		}

		javafxLookupDefSchemaObj = (ICFBamSchemaDefObj)( javafxReferenceLookupDefSchema.getReferencedObject() );
		editObj.setOptionalLookupDefSchema( javafxLookupDefSchemaObj );

		javafxLookupLookupIndexObj = (ICFBamIndexObj)( javafxReferenceLookupLookupIndex.getReferencedObject() );
		editObj.setOptionalLookupLookupIndex( javafxLookupLookupIndexObj );

		javafxLookupAltIndexObj = (ICFBamIndexObj)( javafxReferenceLookupAltIndex.getReferencedObject() );
		editObj.setOptionalLookupAltIndex( javafxLookupAltIndexObj );

		javafxLookupQualTableObj = (ICFBamTableObj)( javafxReferenceLookupQualTable.getReferencedObject() );
		editObj.setOptionalLookupQualTable( javafxLookupQualTableObj );

		javafxLookupPrimaryIndexObj = (ICFBamIndexObj)( javafxReferenceLookupPrimaryIndex.getReferencedObject() );
		editObj.setOptionalLookupPrimaryIndex( javafxLookupPrimaryIndexObj );

		if( getJavaFXEditorName().getStringValue() == null ) {
			editObj.setRequiredName( "" );
		}
		else {
			editObj.setRequiredName( getJavaFXEditorName().getStringValue() );
		}

		if( ( getJavaFXEditorDbName().getStringValue() != null ) && ( getJavaFXEditorDbName().getStringValue().length() <= 0 ) ) {
			editObj.setOptionalDbName( null );
		}
		else {
			editObj.setOptionalDbName( getJavaFXEditorDbName().getStringValue() );
		}

		if( ( getJavaFXEditorShortName().getStringValue() != null ) && ( getJavaFXEditorShortName().getStringValue().length() <= 0 ) ) {
			editObj.setOptionalShortName( null );
		}
		else {
			editObj.setOptionalShortName( getJavaFXEditorShortName().getStringValue() );
		}

		if( ( getJavaFXEditorLabel().getStringValue() != null ) && ( getJavaFXEditorLabel().getStringValue().length() <= 0 ) ) {
			editObj.setOptionalLabel( null );
		}
		else {
			editObj.setOptionalLabel( getJavaFXEditorLabel().getStringValue() );
		}

		if( ( getJavaFXEditorShortDescription().getStringValue() != null ) && ( getJavaFXEditorShortDescription().getStringValue().length() <= 0 ) ) {
			editObj.setOptionalShortDescription( null );
		}
		else {
			editObj.setOptionalShortDescription( getJavaFXEditorShortDescription().getStringValue() );
		}

		if( ( getJavaFXEditorDescription().getStringValue() != null ) && ( getJavaFXEditorDescription().getStringValue().length() <= 0 ) ) {
			editObj.setOptionalDescription( null );
		}
		else {
			editObj.setOptionalDescription( getJavaFXEditorDescription().getStringValue() );
		}

		editObj.setRequiredPageData( getJavaFXEditorPageData().getBooleanValue() );

		if( getJavaFXEditorTableClassCode().getStringValue() == null ) {
			editObj.setRequiredTableClassCode( "" );
		}
		else {
			editObj.setRequiredTableClassCode( getJavaFXEditorTableClassCode().getStringValue() );
		}

		editObj.setRequiredIsInstantiable( getJavaFXEditorIsInstantiable().getBooleanValue() );

		editObj.setRequiredHasHistory( getJavaFXEditorHasHistory().getBooleanValue() );

		editObj.setRequiredHasAuditColumns( getJavaFXEditorHasAuditColumns().getBooleanValue() );

		editObj.setRequiredIsMutable( getJavaFXEditorIsMutable().getBooleanValue() );

		editObj.setRequiredIsServerOnly( getJavaFXEditorIsServerOnly().getBooleanValue() );

		String strloaderbehaviour = getJavaFXEditorLoaderBehaviour().getValue();
		ICFBamSchema.LoaderBehaviourEnum curloaderbehaviour = CFBamSchema.parseLoaderBehaviourEnum( "LoaderBehaviour", strloaderbehaviour );
		editObj.setRequiredLoaderBehaviour( curloaderbehaviour );

		String strsecscope = getJavaFXEditorSecScope().getValue();
		ICFBamSchema.SecScopeEnum cursecscope = CFBamSchema.parseSecScopeEnum( "SecScope", strsecscope );
		editObj.setRequiredSecScope( cursecscope );

		if( ( getJavaFXEditorJObjMembers().getTextValue() != null ) && ( getJavaFXEditorJObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJObjMembers( null );
		}
		else {
			editObj.setOptionalJObjMembers( getJavaFXEditorJObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorJObjInterface().getTextValue() != null ) && ( getJavaFXEditorJObjInterface().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJObjInterface( null );
		}
		else {
			editObj.setOptionalJObjInterface( getJavaFXEditorJObjInterface().getTextValue() );
		}

		if( ( getJavaFXEditorJObjImport().getTextValue() != null ) && ( getJavaFXEditorJObjImport().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJObjImport( null );
		}
		else {
			editObj.setOptionalJObjImport( getJavaFXEditorJObjImport().getTextValue() );
		}

		if( ( getJavaFXEditorJObjImplementation().getTextValue() != null ) && ( getJavaFXEditorJObjImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJObjImplementation( null );
		}
		else {
			editObj.setOptionalJObjImplementation( getJavaFXEditorJObjImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorJEditObjMembers().getTextValue() != null ) && ( getJavaFXEditorJEditObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJEditObjMembers( null );
		}
		else {
			editObj.setOptionalJEditObjMembers( getJavaFXEditorJEditObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorJEditObjInterface().getTextValue() != null ) && ( getJavaFXEditorJEditObjInterface().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJEditObjInterface( null );
		}
		else {
			editObj.setOptionalJEditObjInterface( getJavaFXEditorJEditObjInterface().getTextValue() );
		}

		if( ( getJavaFXEditorJEditObjImport().getTextValue() != null ) && ( getJavaFXEditorJEditObjImport().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJEditObjImport( null );
		}
		else {
			editObj.setOptionalJEditObjImport( getJavaFXEditorJEditObjImport().getTextValue() );
		}

		if( ( getJavaFXEditorJEditObjImplementation().getTextValue() != null ) && ( getJavaFXEditorJEditObjImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJEditObjImplementation( null );
		}
		else {
			editObj.setOptionalJEditObjImplementation( getJavaFXEditorJEditObjImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorJTableImport().getTextValue() != null ) && ( getJavaFXEditorJTableImport().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJTableImport( null );
		}
		else {
			editObj.setOptionalJTableImport( getJavaFXEditorJTableImport().getTextValue() );
		}

		if( ( getJavaFXEditorJTableMembers().getTextValue() != null ) && ( getJavaFXEditorJTableMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJTableMembers( null );
		}
		else {
			editObj.setOptionalJTableMembers( getJavaFXEditorJTableMembers().getTextValue() );
		}

		if( ( getJavaFXEditorJTableInterface().getTextValue() != null ) && ( getJavaFXEditorJTableInterface().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJTableInterface( null );
		}
		else {
			editObj.setOptionalJTableInterface( getJavaFXEditorJTableInterface().getTextValue() );
		}

		if( ( getJavaFXEditorJTableImplementation().getTextValue() != null ) && ( getJavaFXEditorJTableImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJTableImplementation( null );
		}
		else {
			editObj.setOptionalJTableImplementation( getJavaFXEditorJTableImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorJTableObjImport().getTextValue() != null ) && ( getJavaFXEditorJTableObjImport().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJTableObjImport( null );
		}
		else {
			editObj.setOptionalJTableObjImport( getJavaFXEditorJTableObjImport().getTextValue() );
		}

		if( ( getJavaFXEditorJTableObjMembers().getTextValue() != null ) && ( getJavaFXEditorJTableObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJTableObjMembers( null );
		}
		else {
			editObj.setOptionalJTableObjMembers( getJavaFXEditorJTableObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorJTableObjInterface().getTextValue() != null ) && ( getJavaFXEditorJTableObjInterface().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJTableObjInterface( null );
		}
		else {
			editObj.setOptionalJTableObjInterface( getJavaFXEditorJTableObjInterface().getTextValue() );
		}

		if( ( getJavaFXEditorJTableObjImplementation().getTextValue() != null ) && ( getJavaFXEditorJTableObjImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJTableObjImplementation( null );
		}
		else {
			editObj.setOptionalJTableObjImplementation( getJavaFXEditorJTableObjImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorJDb2LUWTableImport().getTextValue() != null ) && ( getJavaFXEditorJDb2LUWTableImport().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJDb2LUWTableImport( null );
		}
		else {
			editObj.setOptionalJDb2LUWTableImport( getJavaFXEditorJDb2LUWTableImport().getTextValue() );
		}

		if( ( getJavaFXEditorJDb2LUWTableMembers().getTextValue() != null ) && ( getJavaFXEditorJDb2LUWTableMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJDb2LUWTableMembers( null );
		}
		else {
			editObj.setOptionalJDb2LUWTableMembers( getJavaFXEditorJDb2LUWTableMembers().getTextValue() );
		}

		if( ( getJavaFXEditorJDb2LUWTableImplementation().getTextValue() != null ) && ( getJavaFXEditorJDb2LUWTableImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJDb2LUWTableImplementation( null );
		}
		else {
			editObj.setOptionalJDb2LUWTableImplementation( getJavaFXEditorJDb2LUWTableImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorJMSSqlTableImport().getTextValue() != null ) && ( getJavaFXEditorJMSSqlTableImport().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJMSSqlTableImport( null );
		}
		else {
			editObj.setOptionalJMSSqlTableImport( getJavaFXEditorJMSSqlTableImport().getTextValue() );
		}

		if( ( getJavaFXEditorJMSSqlTableMembers().getTextValue() != null ) && ( getJavaFXEditorJMSSqlTableMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJMSSqlTableMembers( null );
		}
		else {
			editObj.setOptionalJMSSqlTableMembers( getJavaFXEditorJMSSqlTableMembers().getTextValue() );
		}

		if( ( getJavaFXEditorJMSSqlTableImplementation().getTextValue() != null ) && ( getJavaFXEditorJMSSqlTableImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJMSSqlTableImplementation( null );
		}
		else {
			editObj.setOptionalJMSSqlTableImplementation( getJavaFXEditorJMSSqlTableImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorJMySqlTableImport().getTextValue() != null ) && ( getJavaFXEditorJMySqlTableImport().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJMySqlTableImport( null );
		}
		else {
			editObj.setOptionalJMySqlTableImport( getJavaFXEditorJMySqlTableImport().getTextValue() );
		}

		if( ( getJavaFXEditorJMySqlTableMembers().getTextValue() != null ) && ( getJavaFXEditorJMySqlTableMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJMySqlTableMembers( null );
		}
		else {
			editObj.setOptionalJMySqlTableMembers( getJavaFXEditorJMySqlTableMembers().getTextValue() );
		}

		if( ( getJavaFXEditorJMySqlTableImplementation().getTextValue() != null ) && ( getJavaFXEditorJMySqlTableImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJMySqlTableImplementation( null );
		}
		else {
			editObj.setOptionalJMySqlTableImplementation( getJavaFXEditorJMySqlTableImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorJOracleTableImport().getTextValue() != null ) && ( getJavaFXEditorJOracleTableImport().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJOracleTableImport( null );
		}
		else {
			editObj.setOptionalJOracleTableImport( getJavaFXEditorJOracleTableImport().getTextValue() );
		}

		if( ( getJavaFXEditorJOracleTableMembers().getTextValue() != null ) && ( getJavaFXEditorJOracleTableMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJOracleTableMembers( null );
		}
		else {
			editObj.setOptionalJOracleTableMembers( getJavaFXEditorJOracleTableMembers().getTextValue() );
		}

		if( ( getJavaFXEditorJOracleTableImplementation().getTextValue() != null ) && ( getJavaFXEditorJOracleTableImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJOracleTableImplementation( null );
		}
		else {
			editObj.setOptionalJOracleTableImplementation( getJavaFXEditorJOracleTableImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorJPgSqlTableImport().getTextValue() != null ) && ( getJavaFXEditorJPgSqlTableImport().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJPgSqlTableImport( null );
		}
		else {
			editObj.setOptionalJPgSqlTableImport( getJavaFXEditorJPgSqlTableImport().getTextValue() );
		}

		if( ( getJavaFXEditorJPgSqlTableMembers().getTextValue() != null ) && ( getJavaFXEditorJPgSqlTableMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJPgSqlTableMembers( null );
		}
		else {
			editObj.setOptionalJPgSqlTableMembers( getJavaFXEditorJPgSqlTableMembers().getTextValue() );
		}

		if( ( getJavaFXEditorJPgSqlTableImplementation().getTextValue() != null ) && ( getJavaFXEditorJPgSqlTableImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJPgSqlTableImplementation( null );
		}
		else {
			editObj.setOptionalJPgSqlTableImplementation( getJavaFXEditorJPgSqlTableImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorJRamTableImport().getTextValue() != null ) && ( getJavaFXEditorJRamTableImport().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJRamTableImport( null );
		}
		else {
			editObj.setOptionalJRamTableImport( getJavaFXEditorJRamTableImport().getTextValue() );
		}

		if( ( getJavaFXEditorJRamTableMembers().getTextValue() != null ) && ( getJavaFXEditorJRamTableMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJRamTableMembers( null );
		}
		else {
			editObj.setOptionalJRamTableMembers( getJavaFXEditorJRamTableMembers().getTextValue() );
		}

		if( ( getJavaFXEditorJRamTableImplementation().getTextValue() != null ) && ( getJavaFXEditorJRamTableImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJRamTableImplementation( null );
		}
		else {
			editObj.setOptionalJRamTableImplementation( getJavaFXEditorJRamTableImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorJSaxLoaderImport().getTextValue() != null ) && ( getJavaFXEditorJSaxLoaderImport().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJSaxLoaderImport( null );
		}
		else {
			editObj.setOptionalJSaxLoaderImport( getJavaFXEditorJSaxLoaderImport().getTextValue() );
		}

		if( ( getJavaFXEditorJSaxLoaderStartElement().getTextValue() != null ) && ( getJavaFXEditorJSaxLoaderStartElement().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJSaxLoaderStartElement( null );
		}
		else {
			editObj.setOptionalJSaxLoaderStartElement( getJavaFXEditorJSaxLoaderStartElement().getTextValue() );
		}

		if( ( getJavaFXEditorJSaxLoaderEndElement().getTextValue() != null ) && ( getJavaFXEditorJSaxLoaderEndElement().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJSaxLoaderEndElement( null );
		}
		else {
			editObj.setOptionalJSaxLoaderEndElement( getJavaFXEditorJSaxLoaderEndElement().getTextValue() );
		}

		if( ( getJavaFXEditorJXMsgTableImport().getTextValue() != null ) && ( getJavaFXEditorJXMsgTableImport().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJXMsgTableImport( null );
		}
		else {
			editObj.setOptionalJXMsgTableImport( getJavaFXEditorJXMsgTableImport().getTextValue() );
		}

		if( ( getJavaFXEditorJXMsgTableFormatters().getTextValue() != null ) && ( getJavaFXEditorJXMsgTableFormatters().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJXMsgTableFormatters( null );
		}
		else {
			editObj.setOptionalJXMsgTableFormatters( getJavaFXEditorJXMsgTableFormatters().getTextValue() );
		}

		if( ( getJavaFXEditorJXMsgRqstTableImport().getTextValue() != null ) && ( getJavaFXEditorJXMsgRqstTableImport().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJXMsgRqstTableImport( null );
		}
		else {
			editObj.setOptionalJXMsgRqstTableImport( getJavaFXEditorJXMsgRqstTableImport().getTextValue() );
		}

		if( ( getJavaFXEditorJXMsgRspnTableImport().getTextValue() != null ) && ( getJavaFXEditorJXMsgRspnTableImport().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJXMsgRspnTableImport( null );
		}
		else {
			editObj.setOptionalJXMsgRspnTableImport( getJavaFXEditorJXMsgRspnTableImport().getTextValue() );
		}

		if( ( getJavaFXEditorJXMsgClientTableImport().getTextValue() != null ) && ( getJavaFXEditorJXMsgClientTableImport().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJXMsgClientTableImport( null );
		}
		else {
			editObj.setOptionalJXMsgClientTableImport( getJavaFXEditorJXMsgClientTableImport().getTextValue() );
		}

		if( ( getJavaFXEditorJXMsgRqstTableBody().getTextValue() != null ) && ( getJavaFXEditorJXMsgRqstTableBody().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJXMsgRqstTableBody( null );
		}
		else {
			editObj.setOptionalJXMsgRqstTableBody( getJavaFXEditorJXMsgRqstTableBody().getTextValue() );
		}

		if( ( getJavaFXEditorJXMsgRspnTableBody().getTextValue() != null ) && ( getJavaFXEditorJXMsgRspnTableBody().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJXMsgRspnTableBody( null );
		}
		else {
			editObj.setOptionalJXMsgRspnTableBody( getJavaFXEditorJXMsgRspnTableBody().getTextValue() );
		}

		if( ( getJavaFXEditorJXMsgClientTableBody().getTextValue() != null ) && ( getJavaFXEditorJXMsgClientTableBody().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJXMsgClientTableBody( null );
		}
		else {
			editObj.setOptionalJXMsgClientTableBody( getJavaFXEditorJXMsgClientTableBody().getTextValue() );
		}

		if( ( getJavaFXEditorCppObjMembers().getTextValue() != null ) && ( getJavaFXEditorCppObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppObjMembers( null );
		}
		else {
			editObj.setOptionalCppObjMembers( getJavaFXEditorCppObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorCppObjInterface().getTextValue() != null ) && ( getJavaFXEditorCppObjInterface().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppObjInterface( null );
		}
		else {
			editObj.setOptionalCppObjInterface( getJavaFXEditorCppObjInterface().getTextValue() );
		}

		if( ( getJavaFXEditorCppObjInclude().getTextValue() != null ) && ( getJavaFXEditorCppObjInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppObjInclude( null );
		}
		else {
			editObj.setOptionalCppObjInclude( getJavaFXEditorCppObjInclude().getTextValue() );
		}

		if( ( getJavaFXEditorCppObjImplementation().getTextValue() != null ) && ( getJavaFXEditorCppObjImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppObjImplementation( null );
		}
		else {
			editObj.setOptionalCppObjImplementation( getJavaFXEditorCppObjImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorCppEditObjMembers().getTextValue() != null ) && ( getJavaFXEditorCppEditObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppEditObjMembers( null );
		}
		else {
			editObj.setOptionalCppEditObjMembers( getJavaFXEditorCppEditObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorCppEditObjInterface().getTextValue() != null ) && ( getJavaFXEditorCppEditObjInterface().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppEditObjInterface( null );
		}
		else {
			editObj.setOptionalCppEditObjInterface( getJavaFXEditorCppEditObjInterface().getTextValue() );
		}

		if( ( getJavaFXEditorCppEditObjInclude().getTextValue() != null ) && ( getJavaFXEditorCppEditObjInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppEditObjInclude( null );
		}
		else {
			editObj.setOptionalCppEditObjInclude( getJavaFXEditorCppEditObjInclude().getTextValue() );
		}

		if( ( getJavaFXEditorCppEditObjImplementation().getTextValue() != null ) && ( getJavaFXEditorCppEditObjImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppEditObjImplementation( null );
		}
		else {
			editObj.setOptionalCppEditObjImplementation( getJavaFXEditorCppEditObjImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorCppTableInclude().getTextValue() != null ) && ( getJavaFXEditorCppTableInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppTableInclude( null );
		}
		else {
			editObj.setOptionalCppTableInclude( getJavaFXEditorCppTableInclude().getTextValue() );
		}

		if( ( getJavaFXEditorCppTableMembers().getTextValue() != null ) && ( getJavaFXEditorCppTableMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppTableMembers( null );
		}
		else {
			editObj.setOptionalCppTableMembers( getJavaFXEditorCppTableMembers().getTextValue() );
		}

		if( ( getJavaFXEditorCppTableInterface().getTextValue() != null ) && ( getJavaFXEditorCppTableInterface().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppTableInterface( null );
		}
		else {
			editObj.setOptionalCppTableInterface( getJavaFXEditorCppTableInterface().getTextValue() );
		}

		if( ( getJavaFXEditorCppTableImplementation().getTextValue() != null ) && ( getJavaFXEditorCppTableImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppTableImplementation( null );
		}
		else {
			editObj.setOptionalCppTableImplementation( getJavaFXEditorCppTableImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorCppTableObjInclude().getTextValue() != null ) && ( getJavaFXEditorCppTableObjInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppTableObjInclude( null );
		}
		else {
			editObj.setOptionalCppTableObjInclude( getJavaFXEditorCppTableObjInclude().getTextValue() );
		}

		if( ( getJavaFXEditorCppTableObjMembers().getTextValue() != null ) && ( getJavaFXEditorCppTableObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppTableObjMembers( null );
		}
		else {
			editObj.setOptionalCppTableObjMembers( getJavaFXEditorCppTableObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorCppTableObjInterface().getTextValue() != null ) && ( getJavaFXEditorCppTableObjInterface().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppTableObjInterface( null );
		}
		else {
			editObj.setOptionalCppTableObjInterface( getJavaFXEditorCppTableObjInterface().getTextValue() );
		}

		if( ( getJavaFXEditorCppTableObjImplementation().getTextValue() != null ) && ( getJavaFXEditorCppTableObjImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppTableObjImplementation( null );
		}
		else {
			editObj.setOptionalCppTableObjImplementation( getJavaFXEditorCppTableObjImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorCppDb2LUWTableInclude().getTextValue() != null ) && ( getJavaFXEditorCppDb2LUWTableInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppDb2LUWTableInclude( null );
		}
		else {
			editObj.setOptionalCppDb2LUWTableInclude( getJavaFXEditorCppDb2LUWTableInclude().getTextValue() );
		}

		if( ( getJavaFXEditorCppDb2LUWTableMembers().getTextValue() != null ) && ( getJavaFXEditorCppDb2LUWTableMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppDb2LUWTableMembers( null );
		}
		else {
			editObj.setOptionalCppDb2LUWTableMembers( getJavaFXEditorCppDb2LUWTableMembers().getTextValue() );
		}

		if( ( getJavaFXEditorCppDb2LUWTableImplementation().getTextValue() != null ) && ( getJavaFXEditorCppDb2LUWTableImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppDb2LUWTableImplementation( null );
		}
		else {
			editObj.setOptionalCppDb2LUWTableImplementation( getJavaFXEditorCppDb2LUWTableImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorCppMSSqlTableInclude().getTextValue() != null ) && ( getJavaFXEditorCppMSSqlTableInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppMSSqlTableInclude( null );
		}
		else {
			editObj.setOptionalCppMSSqlTableInclude( getJavaFXEditorCppMSSqlTableInclude().getTextValue() );
		}

		if( ( getJavaFXEditorCppMSSqlTableMembers().getTextValue() != null ) && ( getJavaFXEditorCppMSSqlTableMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppMSSqlTableMembers( null );
		}
		else {
			editObj.setOptionalCppMSSqlTableMembers( getJavaFXEditorCppMSSqlTableMembers().getTextValue() );
		}

		if( ( getJavaFXEditorCppMSSqlTableImplementation().getTextValue() != null ) && ( getJavaFXEditorCppMSSqlTableImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppMSSqlTableImplementation( null );
		}
		else {
			editObj.setOptionalCppMSSqlTableImplementation( getJavaFXEditorCppMSSqlTableImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorCppMySqlTableInclude().getTextValue() != null ) && ( getJavaFXEditorCppMySqlTableInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppMySqlTableInclude( null );
		}
		else {
			editObj.setOptionalCppMySqlTableInclude( getJavaFXEditorCppMySqlTableInclude().getTextValue() );
		}

		if( ( getJavaFXEditorCppMySqlTableMembers().getTextValue() != null ) && ( getJavaFXEditorCppMySqlTableMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppMySqlTableMembers( null );
		}
		else {
			editObj.setOptionalCppMySqlTableMembers( getJavaFXEditorCppMySqlTableMembers().getTextValue() );
		}

		if( ( getJavaFXEditorCppMySqlTableImplementation().getTextValue() != null ) && ( getJavaFXEditorCppMySqlTableImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppMySqlTableImplementation( null );
		}
		else {
			editObj.setOptionalCppMySqlTableImplementation( getJavaFXEditorCppMySqlTableImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorCppOracleTableInclude().getTextValue() != null ) && ( getJavaFXEditorCppOracleTableInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppOracleTableInclude( null );
		}
		else {
			editObj.setOptionalCppOracleTableInclude( getJavaFXEditorCppOracleTableInclude().getTextValue() );
		}

		if( ( getJavaFXEditorCppOracleTableMembers().getTextValue() != null ) && ( getJavaFXEditorCppOracleTableMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppOracleTableMembers( null );
		}
		else {
			editObj.setOptionalCppOracleTableMembers( getJavaFXEditorCppOracleTableMembers().getTextValue() );
		}

		if( ( getJavaFXEditorCppOracleTableImplementation().getTextValue() != null ) && ( getJavaFXEditorCppOracleTableImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppOracleTableImplementation( null );
		}
		else {
			editObj.setOptionalCppOracleTableImplementation( getJavaFXEditorCppOracleTableImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorCppPgSqlTableInclude().getTextValue() != null ) && ( getJavaFXEditorCppPgSqlTableInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppPgSqlTableInclude( null );
		}
		else {
			editObj.setOptionalCppPgSqlTableInclude( getJavaFXEditorCppPgSqlTableInclude().getTextValue() );
		}

		if( ( getJavaFXEditorCppPgSqlTableMembers().getTextValue() != null ) && ( getJavaFXEditorCppPgSqlTableMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppPgSqlTableMembers( null );
		}
		else {
			editObj.setOptionalCppPgSqlTableMembers( getJavaFXEditorCppPgSqlTableMembers().getTextValue() );
		}

		if( ( getJavaFXEditorCppPgSqlTableImplementation().getTextValue() != null ) && ( getJavaFXEditorCppPgSqlTableImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppPgSqlTableImplementation( null );
		}
		else {
			editObj.setOptionalCppPgSqlTableImplementation( getJavaFXEditorCppPgSqlTableImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorCppRamTableInclude().getTextValue() != null ) && ( getJavaFXEditorCppRamTableInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppRamTableInclude( null );
		}
		else {
			editObj.setOptionalCppRamTableInclude( getJavaFXEditorCppRamTableInclude().getTextValue() );
		}

		if( ( getJavaFXEditorCppRamTableMembers().getTextValue() != null ) && ( getJavaFXEditorCppRamTableMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppRamTableMembers( null );
		}
		else {
			editObj.setOptionalCppRamTableMembers( getJavaFXEditorCppRamTableMembers().getTextValue() );
		}

		if( ( getJavaFXEditorCppRamTableImplementation().getTextValue() != null ) && ( getJavaFXEditorCppRamTableImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppRamTableImplementation( null );
		}
		else {
			editObj.setOptionalCppRamTableImplementation( getJavaFXEditorCppRamTableImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorCppSaxLoaderInclude().getTextValue() != null ) && ( getJavaFXEditorCppSaxLoaderInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppSaxLoaderInclude( null );
		}
		else {
			editObj.setOptionalCppSaxLoaderInclude( getJavaFXEditorCppSaxLoaderInclude().getTextValue() );
		}

		if( ( getJavaFXEditorCppSaxLoaderStartElement().getTextValue() != null ) && ( getJavaFXEditorCppSaxLoaderStartElement().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppSaxLoaderStartElement( null );
		}
		else {
			editObj.setOptionalCppSaxLoaderStartElement( getJavaFXEditorCppSaxLoaderStartElement().getTextValue() );
		}

		if( ( getJavaFXEditorCppSaxLoaderEndElement().getTextValue() != null ) && ( getJavaFXEditorCppSaxLoaderEndElement().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppSaxLoaderEndElement( null );
		}
		else {
			editObj.setOptionalCppSaxLoaderEndElement( getJavaFXEditorCppSaxLoaderEndElement().getTextValue() );
		}

		if( ( getJavaFXEditorCppXMsgTableInclude().getTextValue() != null ) && ( getJavaFXEditorCppXMsgTableInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppXMsgTableInclude( null );
		}
		else {
			editObj.setOptionalCppXMsgTableInclude( getJavaFXEditorCppXMsgTableInclude().getTextValue() );
		}

		if( ( getJavaFXEditorCppXMsgTableFormatters().getTextValue() != null ) && ( getJavaFXEditorCppXMsgTableFormatters().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppXMsgTableFormatters( null );
		}
		else {
			editObj.setOptionalCppXMsgTableFormatters( getJavaFXEditorCppXMsgTableFormatters().getTextValue() );
		}

		if( ( getJavaFXEditorCppXMsgRqstTableInclude().getTextValue() != null ) && ( getJavaFXEditorCppXMsgRqstTableInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppXMsgRqstTableInclude( null );
		}
		else {
			editObj.setOptionalCppXMsgRqstTableInclude( getJavaFXEditorCppXMsgRqstTableInclude().getTextValue() );
		}

		if( ( getJavaFXEditorCppXMsgRspnTableInclude().getTextValue() != null ) && ( getJavaFXEditorCppXMsgRspnTableInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppXMsgRspnTableInclude( null );
		}
		else {
			editObj.setOptionalCppXMsgRspnTableInclude( getJavaFXEditorCppXMsgRspnTableInclude().getTextValue() );
		}

		if( ( getJavaFXEditorCppXMsgClientTableInclude().getTextValue() != null ) && ( getJavaFXEditorCppXMsgClientTableInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppXMsgClientTableInclude( null );
		}
		else {
			editObj.setOptionalCppXMsgClientTableInclude( getJavaFXEditorCppXMsgClientTableInclude().getTextValue() );
		}

		if( ( getJavaFXEditorCppXMsgRqstTableBody().getTextValue() != null ) && ( getJavaFXEditorCppXMsgRqstTableBody().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppXMsgRqstTableBody( null );
		}
		else {
			editObj.setOptionalCppXMsgRqstTableBody( getJavaFXEditorCppXMsgRqstTableBody().getTextValue() );
		}

		if( ( getJavaFXEditorCppXMsgRspnTableBody().getTextValue() != null ) && ( getJavaFXEditorCppXMsgRspnTableBody().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppXMsgRspnTableBody( null );
		}
		else {
			editObj.setOptionalCppXMsgRspnTableBody( getJavaFXEditorCppXMsgRspnTableBody().getTextValue() );
		}

		if( ( getJavaFXEditorCppXMsgClientTableBody().getTextValue() != null ) && ( getJavaFXEditorCppXMsgClientTableBody().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppXMsgClientTableBody( null );
		}
		else {
			editObj.setOptionalCppXMsgClientTableBody( getJavaFXEditorCppXMsgClientTableBody().getTextValue() );
		}

		if( ( getJavaFXEditorHppObjMembers().getTextValue() != null ) && ( getJavaFXEditorHppObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppObjMembers( null );
		}
		else {
			editObj.setOptionalHppObjMembers( getJavaFXEditorHppObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorHppObjInterface().getTextValue() != null ) && ( getJavaFXEditorHppObjInterface().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppObjInterface( null );
		}
		else {
			editObj.setOptionalHppObjInterface( getJavaFXEditorHppObjInterface().getTextValue() );
		}

		if( ( getJavaFXEditorHppObjInclude().getTextValue() != null ) && ( getJavaFXEditorHppObjInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppObjInclude( null );
		}
		else {
			editObj.setOptionalHppObjInclude( getJavaFXEditorHppObjInclude().getTextValue() );
		}

		if( ( getJavaFXEditorHppObjImplementation().getTextValue() != null ) && ( getJavaFXEditorHppObjImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppObjImplementation( null );
		}
		else {
			editObj.setOptionalHppObjImplementation( getJavaFXEditorHppObjImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorHppEditObjMembers().getTextValue() != null ) && ( getJavaFXEditorHppEditObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppEditObjMembers( null );
		}
		else {
			editObj.setOptionalHppEditObjMembers( getJavaFXEditorHppEditObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorHppEditObjInterface().getTextValue() != null ) && ( getJavaFXEditorHppEditObjInterface().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppEditObjInterface( null );
		}
		else {
			editObj.setOptionalHppEditObjInterface( getJavaFXEditorHppEditObjInterface().getTextValue() );
		}

		if( ( getJavaFXEditorHppEditObjInclude().getTextValue() != null ) && ( getJavaFXEditorHppEditObjInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppEditObjInclude( null );
		}
		else {
			editObj.setOptionalHppEditObjInclude( getJavaFXEditorHppEditObjInclude().getTextValue() );
		}

		if( ( getJavaFXEditorHppEditObjImplementation().getTextValue() != null ) && ( getJavaFXEditorHppEditObjImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppEditObjImplementation( null );
		}
		else {
			editObj.setOptionalHppEditObjImplementation( getJavaFXEditorHppEditObjImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorHppTableInclude().getTextValue() != null ) && ( getJavaFXEditorHppTableInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppTableInclude( null );
		}
		else {
			editObj.setOptionalHppTableInclude( getJavaFXEditorHppTableInclude().getTextValue() );
		}

		if( ( getJavaFXEditorHppTableMembers().getTextValue() != null ) && ( getJavaFXEditorHppTableMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppTableMembers( null );
		}
		else {
			editObj.setOptionalHppTableMembers( getJavaFXEditorHppTableMembers().getTextValue() );
		}

		if( ( getJavaFXEditorHppTableInterface().getTextValue() != null ) && ( getJavaFXEditorHppTableInterface().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppTableInterface( null );
		}
		else {
			editObj.setOptionalHppTableInterface( getJavaFXEditorHppTableInterface().getTextValue() );
		}

		if( ( getJavaFXEditorHppTableImplementation().getTextValue() != null ) && ( getJavaFXEditorHppTableImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppTableImplementation( null );
		}
		else {
			editObj.setOptionalHppTableImplementation( getJavaFXEditorHppTableImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorHppTableObjInclude().getTextValue() != null ) && ( getJavaFXEditorHppTableObjInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppTableObjInclude( null );
		}
		else {
			editObj.setOptionalHppTableObjInclude( getJavaFXEditorHppTableObjInclude().getTextValue() );
		}

		if( ( getJavaFXEditorHppTableObjMembers().getTextValue() != null ) && ( getJavaFXEditorHppTableObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppTableObjMembers( null );
		}
		else {
			editObj.setOptionalHppTableObjMembers( getJavaFXEditorHppTableObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorHppTableObjInterface().getTextValue() != null ) && ( getJavaFXEditorHppTableObjInterface().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppTableObjInterface( null );
		}
		else {
			editObj.setOptionalHppTableObjInterface( getJavaFXEditorHppTableObjInterface().getTextValue() );
		}

		if( ( getJavaFXEditorHppTableObjImplementation().getTextValue() != null ) && ( getJavaFXEditorHppTableObjImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppTableObjImplementation( null );
		}
		else {
			editObj.setOptionalHppTableObjImplementation( getJavaFXEditorHppTableObjImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorHppDb2LUWTableInclude().getTextValue() != null ) && ( getJavaFXEditorHppDb2LUWTableInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppDb2LUWTableInclude( null );
		}
		else {
			editObj.setOptionalHppDb2LUWTableInclude( getJavaFXEditorHppDb2LUWTableInclude().getTextValue() );
		}

		if( ( getJavaFXEditorHppDb2LUWTableMembers().getTextValue() != null ) && ( getJavaFXEditorHppDb2LUWTableMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppDb2LUWTableMembers( null );
		}
		else {
			editObj.setOptionalHppDb2LUWTableMembers( getJavaFXEditorHppDb2LUWTableMembers().getTextValue() );
		}

		if( ( getJavaFXEditorHppDb2LUWTableImplementation().getTextValue() != null ) && ( getJavaFXEditorHppDb2LUWTableImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppDb2LUWTableImplementation( null );
		}
		else {
			editObj.setOptionalHppDb2LUWTableImplementation( getJavaFXEditorHppDb2LUWTableImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorHppMSSqlTableInclude().getTextValue() != null ) && ( getJavaFXEditorHppMSSqlTableInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppMSSqlTableInclude( null );
		}
		else {
			editObj.setOptionalHppMSSqlTableInclude( getJavaFXEditorHppMSSqlTableInclude().getTextValue() );
		}

		if( ( getJavaFXEditorHppMSSqlTableMembers().getTextValue() != null ) && ( getJavaFXEditorHppMSSqlTableMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppMSSqlTableMembers( null );
		}
		else {
			editObj.setOptionalHppMSSqlTableMembers( getJavaFXEditorHppMSSqlTableMembers().getTextValue() );
		}

		if( ( getJavaFXEditorHppMSSqlTableImplementation().getTextValue() != null ) && ( getJavaFXEditorHppMSSqlTableImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppMSSqlTableImplementation( null );
		}
		else {
			editObj.setOptionalHppMSSqlTableImplementation( getJavaFXEditorHppMSSqlTableImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorHppMySqlTableInclude().getTextValue() != null ) && ( getJavaFXEditorHppMySqlTableInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppMySqlTableInclude( null );
		}
		else {
			editObj.setOptionalHppMySqlTableInclude( getJavaFXEditorHppMySqlTableInclude().getTextValue() );
		}

		if( ( getJavaFXEditorHppMySqlTableMembers().getTextValue() != null ) && ( getJavaFXEditorHppMySqlTableMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppMySqlTableMembers( null );
		}
		else {
			editObj.setOptionalHppMySqlTableMembers( getJavaFXEditorHppMySqlTableMembers().getTextValue() );
		}

		if( ( getJavaFXEditorHppMySqlTableImplementation().getTextValue() != null ) && ( getJavaFXEditorHppMySqlTableImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppMySqlTableImplementation( null );
		}
		else {
			editObj.setOptionalHppMySqlTableImplementation( getJavaFXEditorHppMySqlTableImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorHppOracleTableInclude().getTextValue() != null ) && ( getJavaFXEditorHppOracleTableInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppOracleTableInclude( null );
		}
		else {
			editObj.setOptionalHppOracleTableInclude( getJavaFXEditorHppOracleTableInclude().getTextValue() );
		}

		if( ( getJavaFXEditorHppOracleTableMembers().getTextValue() != null ) && ( getJavaFXEditorHppOracleTableMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppOracleTableMembers( null );
		}
		else {
			editObj.setOptionalHppOracleTableMembers( getJavaFXEditorHppOracleTableMembers().getTextValue() );
		}

		if( ( getJavaFXEditorHppOracleTableImplementation().getTextValue() != null ) && ( getJavaFXEditorHppOracleTableImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppOracleTableImplementation( null );
		}
		else {
			editObj.setOptionalHppOracleTableImplementation( getJavaFXEditorHppOracleTableImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorHppPgSqlTableInclude().getTextValue() != null ) && ( getJavaFXEditorHppPgSqlTableInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppPgSqlTableInclude( null );
		}
		else {
			editObj.setOptionalHppPgSqlTableInclude( getJavaFXEditorHppPgSqlTableInclude().getTextValue() );
		}

		if( ( getJavaFXEditorHppPgSqlTableMembers().getTextValue() != null ) && ( getJavaFXEditorHppPgSqlTableMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppPgSqlTableMembers( null );
		}
		else {
			editObj.setOptionalHppPgSqlTableMembers( getJavaFXEditorHppPgSqlTableMembers().getTextValue() );
		}

		if( ( getJavaFXEditorHppPgSqlTableImplementation().getTextValue() != null ) && ( getJavaFXEditorHppPgSqlTableImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppPgSqlTableImplementation( null );
		}
		else {
			editObj.setOptionalHppPgSqlTableImplementation( getJavaFXEditorHppPgSqlTableImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorHppRamTableInclude().getTextValue() != null ) && ( getJavaFXEditorHppRamTableInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppRamTableInclude( null );
		}
		else {
			editObj.setOptionalHppRamTableInclude( getJavaFXEditorHppRamTableInclude().getTextValue() );
		}

		if( ( getJavaFXEditorHppRamTableMembers().getTextValue() != null ) && ( getJavaFXEditorHppRamTableMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppRamTableMembers( null );
		}
		else {
			editObj.setOptionalHppRamTableMembers( getJavaFXEditorHppRamTableMembers().getTextValue() );
		}

		if( ( getJavaFXEditorHppRamTableImplementation().getTextValue() != null ) && ( getJavaFXEditorHppRamTableImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppRamTableImplementation( null );
		}
		else {
			editObj.setOptionalHppRamTableImplementation( getJavaFXEditorHppRamTableImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorHppSaxLoaderInclude().getTextValue() != null ) && ( getJavaFXEditorHppSaxLoaderInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppSaxLoaderInclude( null );
		}
		else {
			editObj.setOptionalHppSaxLoaderInclude( getJavaFXEditorHppSaxLoaderInclude().getTextValue() );
		}

		if( ( getJavaFXEditorHppSaxLoaderStartElement().getTextValue() != null ) && ( getJavaFXEditorHppSaxLoaderStartElement().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppSaxLoaderStartElement( null );
		}
		else {
			editObj.setOptionalHppSaxLoaderStartElement( getJavaFXEditorHppSaxLoaderStartElement().getTextValue() );
		}

		if( ( getJavaFXEditorHppSaxLoaderEndElement().getTextValue() != null ) && ( getJavaFXEditorHppSaxLoaderEndElement().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppSaxLoaderEndElement( null );
		}
		else {
			editObj.setOptionalHppSaxLoaderEndElement( getJavaFXEditorHppSaxLoaderEndElement().getTextValue() );
		}

		if( ( getJavaFXEditorHppXMsgTableInclude().getTextValue() != null ) && ( getJavaFXEditorHppXMsgTableInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppXMsgTableInclude( null );
		}
		else {
			editObj.setOptionalHppXMsgTableInclude( getJavaFXEditorHppXMsgTableInclude().getTextValue() );
		}

		if( ( getJavaFXEditorHppXMsgTableFormatters().getTextValue() != null ) && ( getJavaFXEditorHppXMsgTableFormatters().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppXMsgTableFormatters( null );
		}
		else {
			editObj.setOptionalHppXMsgTableFormatters( getJavaFXEditorHppXMsgTableFormatters().getTextValue() );
		}

		if( ( getJavaFXEditorHppXMsgRqstTableInclude().getTextValue() != null ) && ( getJavaFXEditorHppXMsgRqstTableInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppXMsgRqstTableInclude( null );
		}
		else {
			editObj.setOptionalHppXMsgRqstTableInclude( getJavaFXEditorHppXMsgRqstTableInclude().getTextValue() );
		}

		if( ( getJavaFXEditorHppXMsgRspnTableInclude().getTextValue() != null ) && ( getJavaFXEditorHppXMsgRspnTableInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppXMsgRspnTableInclude( null );
		}
		else {
			editObj.setOptionalHppXMsgRspnTableInclude( getJavaFXEditorHppXMsgRspnTableInclude().getTextValue() );
		}

		if( ( getJavaFXEditorHppXMsgClientTableInclude().getTextValue() != null ) && ( getJavaFXEditorHppXMsgClientTableInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppXMsgClientTableInclude( null );
		}
		else {
			editObj.setOptionalHppXMsgClientTableInclude( getJavaFXEditorHppXMsgClientTableInclude().getTextValue() );
		}

		if( ( getJavaFXEditorHppXMsgRqstTableBody().getTextValue() != null ) && ( getJavaFXEditorHppXMsgRqstTableBody().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppXMsgRqstTableBody( null );
		}
		else {
			editObj.setOptionalHppXMsgRqstTableBody( getJavaFXEditorHppXMsgRqstTableBody().getTextValue() );
		}

		if( ( getJavaFXEditorHppXMsgRspnTableBody().getTextValue() != null ) && ( getJavaFXEditorHppXMsgRspnTableBody().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppXMsgRspnTableBody( null );
		}
		else {
			editObj.setOptionalHppXMsgRspnTableBody( getJavaFXEditorHppXMsgRspnTableBody().getTextValue() );
		}

		if( ( getJavaFXEditorHppXMsgClientTableBody().getTextValue() != null ) && ( getJavaFXEditorHppXMsgClientTableBody().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppXMsgClientTableBody( null );
		}
		else {
			editObj.setOptionalHppXMsgClientTableBody( getJavaFXEditorHppXMsgClientTableBody().getTextValue() );
		}

		if( ( getJavaFXEditorCsObjMembers().getTextValue() != null ) && ( getJavaFXEditorCsObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsObjMembers( null );
		}
		else {
			editObj.setOptionalCsObjMembers( getJavaFXEditorCsObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorCsObjInterface().getTextValue() != null ) && ( getJavaFXEditorCsObjInterface().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsObjInterface( null );
		}
		else {
			editObj.setOptionalCsObjInterface( getJavaFXEditorCsObjInterface().getTextValue() );
		}

		if( ( getJavaFXEditorCsObjUsing().getTextValue() != null ) && ( getJavaFXEditorCsObjUsing().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsObjUsing( null );
		}
		else {
			editObj.setOptionalCsObjUsing( getJavaFXEditorCsObjUsing().getTextValue() );
		}

		if( ( getJavaFXEditorCsObjImplementation().getTextValue() != null ) && ( getJavaFXEditorCsObjImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsObjImplementation( null );
		}
		else {
			editObj.setOptionalCsObjImplementation( getJavaFXEditorCsObjImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorCsEditObjMembers().getTextValue() != null ) && ( getJavaFXEditorCsEditObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsEditObjMembers( null );
		}
		else {
			editObj.setOptionalCsEditObjMembers( getJavaFXEditorCsEditObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorCsEditObjInterface().getTextValue() != null ) && ( getJavaFXEditorCsEditObjInterface().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsEditObjInterface( null );
		}
		else {
			editObj.setOptionalCsEditObjInterface( getJavaFXEditorCsEditObjInterface().getTextValue() );
		}

		if( ( getJavaFXEditorCsEditObjUsing().getTextValue() != null ) && ( getJavaFXEditorCsEditObjUsing().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsEditObjUsing( null );
		}
		else {
			editObj.setOptionalCsEditObjUsing( getJavaFXEditorCsEditObjUsing().getTextValue() );
		}

		if( ( getJavaFXEditorCsEditObjImplementation().getTextValue() != null ) && ( getJavaFXEditorCsEditObjImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsEditObjImplementation( null );
		}
		else {
			editObj.setOptionalCsEditObjImplementation( getJavaFXEditorCsEditObjImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorCsTableUsing().getTextValue() != null ) && ( getJavaFXEditorCsTableUsing().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsTableUsing( null );
		}
		else {
			editObj.setOptionalCsTableUsing( getJavaFXEditorCsTableUsing().getTextValue() );
		}

		if( ( getJavaFXEditorCsTableMembers().getTextValue() != null ) && ( getJavaFXEditorCsTableMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsTableMembers( null );
		}
		else {
			editObj.setOptionalCsTableMembers( getJavaFXEditorCsTableMembers().getTextValue() );
		}

		if( ( getJavaFXEditorCsTableInterface().getTextValue() != null ) && ( getJavaFXEditorCsTableInterface().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsTableInterface( null );
		}
		else {
			editObj.setOptionalCsTableInterface( getJavaFXEditorCsTableInterface().getTextValue() );
		}

		if( ( getJavaFXEditorCsTableImplementation().getTextValue() != null ) && ( getJavaFXEditorCsTableImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsTableImplementation( null );
		}
		else {
			editObj.setOptionalCsTableImplementation( getJavaFXEditorCsTableImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorCsTableObjUsing().getTextValue() != null ) && ( getJavaFXEditorCsTableObjUsing().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsTableObjUsing( null );
		}
		else {
			editObj.setOptionalCsTableObjUsing( getJavaFXEditorCsTableObjUsing().getTextValue() );
		}

		if( ( getJavaFXEditorCsTableObjMembers().getTextValue() != null ) && ( getJavaFXEditorCsTableObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsTableObjMembers( null );
		}
		else {
			editObj.setOptionalCsTableObjMembers( getJavaFXEditorCsTableObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorCsTableObjInterface().getTextValue() != null ) && ( getJavaFXEditorCsTableObjInterface().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsTableObjInterface( null );
		}
		else {
			editObj.setOptionalCsTableObjInterface( getJavaFXEditorCsTableObjInterface().getTextValue() );
		}

		if( ( getJavaFXEditorCsTableObjImplementation().getTextValue() != null ) && ( getJavaFXEditorCsTableObjImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsTableObjImplementation( null );
		}
		else {
			editObj.setOptionalCsTableObjImplementation( getJavaFXEditorCsTableObjImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorCsDb2LUWTableUsing().getTextValue() != null ) && ( getJavaFXEditorCsDb2LUWTableUsing().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsDb2LUWTableUsing( null );
		}
		else {
			editObj.setOptionalCsDb2LUWTableUsing( getJavaFXEditorCsDb2LUWTableUsing().getTextValue() );
		}

		if( ( getJavaFXEditorCsDb2LUWTableMembers().getTextValue() != null ) && ( getJavaFXEditorCsDb2LUWTableMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsDb2LUWTableMembers( null );
		}
		else {
			editObj.setOptionalCsDb2LUWTableMembers( getJavaFXEditorCsDb2LUWTableMembers().getTextValue() );
		}

		if( ( getJavaFXEditorCsDb2LUWTableImplementation().getTextValue() != null ) && ( getJavaFXEditorCsDb2LUWTableImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsDb2LUWTableImplementation( null );
		}
		else {
			editObj.setOptionalCsDb2LUWTableImplementation( getJavaFXEditorCsDb2LUWTableImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorCsMSSqlTableUsing().getTextValue() != null ) && ( getJavaFXEditorCsMSSqlTableUsing().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsMSSqlTableUsing( null );
		}
		else {
			editObj.setOptionalCsMSSqlTableUsing( getJavaFXEditorCsMSSqlTableUsing().getTextValue() );
		}

		if( ( getJavaFXEditorCsMSSqlTableMembers().getTextValue() != null ) && ( getJavaFXEditorCsMSSqlTableMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsMSSqlTableMembers( null );
		}
		else {
			editObj.setOptionalCsMSSqlTableMembers( getJavaFXEditorCsMSSqlTableMembers().getTextValue() );
		}

		if( ( getJavaFXEditorCsMSSqlTableImplementation().getTextValue() != null ) && ( getJavaFXEditorCsMSSqlTableImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsMSSqlTableImplementation( null );
		}
		else {
			editObj.setOptionalCsMSSqlTableImplementation( getJavaFXEditorCsMSSqlTableImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorCsMySqlTableUsing().getTextValue() != null ) && ( getJavaFXEditorCsMySqlTableUsing().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsMySqlTableUsing( null );
		}
		else {
			editObj.setOptionalCsMySqlTableUsing( getJavaFXEditorCsMySqlTableUsing().getTextValue() );
		}

		if( ( getJavaFXEditorCsMySqlTableMembers().getTextValue() != null ) && ( getJavaFXEditorCsMySqlTableMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsMySqlTableMembers( null );
		}
		else {
			editObj.setOptionalCsMySqlTableMembers( getJavaFXEditorCsMySqlTableMembers().getTextValue() );
		}

		if( ( getJavaFXEditorCsMySqlTableImplementation().getTextValue() != null ) && ( getJavaFXEditorCsMySqlTableImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsMySqlTableImplementation( null );
		}
		else {
			editObj.setOptionalCsMySqlTableImplementation( getJavaFXEditorCsMySqlTableImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorCsOracleTableUsing().getTextValue() != null ) && ( getJavaFXEditorCsOracleTableUsing().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsOracleTableUsing( null );
		}
		else {
			editObj.setOptionalCsOracleTableUsing( getJavaFXEditorCsOracleTableUsing().getTextValue() );
		}

		if( ( getJavaFXEditorCsOracleTableMembers().getTextValue() != null ) && ( getJavaFXEditorCsOracleTableMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsOracleTableMembers( null );
		}
		else {
			editObj.setOptionalCsOracleTableMembers( getJavaFXEditorCsOracleTableMembers().getTextValue() );
		}

		if( ( getJavaFXEditorCsOracleTableImplementation().getTextValue() != null ) && ( getJavaFXEditorCsOracleTableImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsOracleTableImplementation( null );
		}
		else {
			editObj.setOptionalCsOracleTableImplementation( getJavaFXEditorCsOracleTableImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorCsPgSqlTableUsing().getTextValue() != null ) && ( getJavaFXEditorCsPgSqlTableUsing().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsPgSqlTableUsing( null );
		}
		else {
			editObj.setOptionalCsPgSqlTableUsing( getJavaFXEditorCsPgSqlTableUsing().getTextValue() );
		}

		if( ( getJavaFXEditorCsPgSqlTableMembers().getTextValue() != null ) && ( getJavaFXEditorCsPgSqlTableMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsPgSqlTableMembers( null );
		}
		else {
			editObj.setOptionalCsPgSqlTableMembers( getJavaFXEditorCsPgSqlTableMembers().getTextValue() );
		}

		if( ( getJavaFXEditorCsPgSqlTableImplementation().getTextValue() != null ) && ( getJavaFXEditorCsPgSqlTableImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsPgSqlTableImplementation( null );
		}
		else {
			editObj.setOptionalCsPgSqlTableImplementation( getJavaFXEditorCsPgSqlTableImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorCsRamTableUsing().getTextValue() != null ) && ( getJavaFXEditorCsRamTableUsing().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsRamTableUsing( null );
		}
		else {
			editObj.setOptionalCsRamTableUsing( getJavaFXEditorCsRamTableUsing().getTextValue() );
		}

		if( ( getJavaFXEditorCsRamTableMembers().getTextValue() != null ) && ( getJavaFXEditorCsRamTableMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsRamTableMembers( null );
		}
		else {
			editObj.setOptionalCsRamTableMembers( getJavaFXEditorCsRamTableMembers().getTextValue() );
		}

		if( ( getJavaFXEditorCsRamTableImplementation().getTextValue() != null ) && ( getJavaFXEditorCsRamTableImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsRamTableImplementation( null );
		}
		else {
			editObj.setOptionalCsRamTableImplementation( getJavaFXEditorCsRamTableImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorCsSaxLoaderUsing().getTextValue() != null ) && ( getJavaFXEditorCsSaxLoaderUsing().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsSaxLoaderUsing( null );
		}
		else {
			editObj.setOptionalCsSaxLoaderUsing( getJavaFXEditorCsSaxLoaderUsing().getTextValue() );
		}

		if( ( getJavaFXEditorCsSaxLoaderStartElement().getTextValue() != null ) && ( getJavaFXEditorCsSaxLoaderStartElement().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsSaxLoaderStartElement( null );
		}
		else {
			editObj.setOptionalCsSaxLoaderStartElement( getJavaFXEditorCsSaxLoaderStartElement().getTextValue() );
		}

		if( ( getJavaFXEditorCsSaxLoaderEndElement().getTextValue() != null ) && ( getJavaFXEditorCsSaxLoaderEndElement().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsSaxLoaderEndElement( null );
		}
		else {
			editObj.setOptionalCsSaxLoaderEndElement( getJavaFXEditorCsSaxLoaderEndElement().getTextValue() );
		}

		if( ( getJavaFXEditorCsXMsgTableUsing().getTextValue() != null ) && ( getJavaFXEditorCsXMsgTableUsing().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsXMsgTableUsing( null );
		}
		else {
			editObj.setOptionalCsXMsgTableUsing( getJavaFXEditorCsXMsgTableUsing().getTextValue() );
		}

		if( ( getJavaFXEditorCsXMsgTableFormatters().getTextValue() != null ) && ( getJavaFXEditorCsXMsgTableFormatters().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsXMsgTableFormatters( null );
		}
		else {
			editObj.setOptionalCsXMsgTableFormatters( getJavaFXEditorCsXMsgTableFormatters().getTextValue() );
		}

		if( ( getJavaFXEditorCsXMsgRqstTableUsing().getTextValue() != null ) && ( getJavaFXEditorCsXMsgRqstTableUsing().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsXMsgRqstTableUsing( null );
		}
		else {
			editObj.setOptionalCsXMsgRqstTableUsing( getJavaFXEditorCsXMsgRqstTableUsing().getTextValue() );
		}

		if( ( getJavaFXEditorCsXMsgRspnTableUsing().getTextValue() != null ) && ( getJavaFXEditorCsXMsgRspnTableUsing().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsXMsgRspnTableUsing( null );
		}
		else {
			editObj.setOptionalCsXMsgRspnTableUsing( getJavaFXEditorCsXMsgRspnTableUsing().getTextValue() );
		}

		if( ( getJavaFXEditorCsXMsgClientTableUsing().getTextValue() != null ) && ( getJavaFXEditorCsXMsgClientTableUsing().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsXMsgClientTableUsing( null );
		}
		else {
			editObj.setOptionalCsXMsgClientTableUsing( getJavaFXEditorCsXMsgClientTableUsing().getTextValue() );
		}

		if( ( getJavaFXEditorCsXMsgRqstTableBody().getTextValue() != null ) && ( getJavaFXEditorCsXMsgRqstTableBody().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsXMsgRqstTableBody( null );
		}
		else {
			editObj.setOptionalCsXMsgRqstTableBody( getJavaFXEditorCsXMsgRqstTableBody().getTextValue() );
		}

		if( ( getJavaFXEditorCsXMsgRspnTableBody().getTextValue() != null ) && ( getJavaFXEditorCsXMsgRspnTableBody().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsXMsgRspnTableBody( null );
		}
		else {
			editObj.setOptionalCsXMsgRspnTableBody( getJavaFXEditorCsXMsgRspnTableBody().getTextValue() );
		}

		if( ( getJavaFXEditorCsXMsgClientTableBody().getTextValue() != null ) && ( getJavaFXEditorCsXMsgClientTableBody().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsXMsgClientTableBody( null );
		}
		else {
			editObj.setOptionalCsXMsgClientTableBody( getJavaFXEditorCsXMsgClientTableBody().getTextValue() );
		}
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		final String S_ProcName = "setPaneMode";
		CFPane.PaneMode oldValue = getPaneMode();
		if( oldValue == value ) {
			return;
		}
		ICFBamTableObj focus = getJavaFXFocusAsTable();
		if( ( value != CFPane.PaneMode.Unknown ) && ( value != CFPane.PaneMode.View ) ) {
			if( focus == null ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"javaFXFocus" );
			}
		}
		ICFBamTableEditObj editObj;
		if( focus != null ) {
			editObj  = (ICFBamTableEditObj)focus.getEdit();
		}
		else {
			editObj = null;
		}
		switch( value ) {
			case Unknown:
				switch( oldValue ) {
					case Unknown:
						break;
					default:
						if( editObj != null ) {
							editObj.endEdit();
							editObj = null;
						}
						break;
				}
				break;
			case Add:
				switch( oldValue ) {
					case Unknown:
					case Add:
					case View:
						if( editObj == null ) {
							if( focus != null ) {
								if( ! focus.getIsNew() ) {
									throw new CFLibUsageException( getClass(),
										S_ProcName,
										"Transitioning to PaneMode Add requires Focus.getIsNew() to be true" );
								}
								editObj = (ICFBamTableEditObj)focus.beginEdit();
								if( editObj == null ) {
									throw new CFLibUsageException( getClass(),
										S_ProcName,
										"Expected beginEdit() to return a new edition of the focus object" );
								}
							}
							else {
								throw new CFLibNullArgumentException( getClass(),
									S_ProcName,
									0,
									"focus" );
							}
						}
						break;
					case Edit:
						throw new CFLibUsageException( getClass(),
							S_ProcName,
							"Cannot transition PaneMode Edit to Add" );
					case Update:
						if( ( editObj == null ) || ( ! editObj.getIsNew() ) ) {
							throw new CFLibUsageException( getClass(),
								S_ProcName,
								"Cannot transition PaneMode Update to Add" );
						}
						break;
					case Delete:
						throw new CFLibUsageException( getClass(),
							S_ProcName,
							"Cannot transition PaneMode Delete to Add" );
					default:
						throw new CFLibUsageException( getClass(),
							S_ProcName,
							"Cannot transition PaneMode default to Add" );
				}
				break;
			case View:
				switch( oldValue ) {
					case Unknown:
						break;
					case View:
						break;
					case Edit:
						break;
					case Update:
						break;
					case Delete:
						break;
					default:
						throw new CFLibUsageException( getClass(),
							S_ProcName,
							"Cannot transition PaneMode " + oldValue + " to View" );
				}
				if( editObj != null ) {
					editObj.endEdit();
					editObj = null;
				}
				break;
			case Edit:
				switch( oldValue ) {
					case Unknown:
						if( editObj == null ) {
							editObj = (ICFBamTableEditObj)focus.beginEdit();
							if( editObj == null ) {
								throw new CFLibUsageException( getClass(),
									S_ProcName,
									"Expected beginEdit() to return a new edition of the focus object" );
							}
						}
						break;
					case View:
						if( editObj == null ) {
							editObj = (ICFBamTableEditObj)focus.beginEdit();
							if( editObj == null ) {
								throw new CFLibUsageException( getClass(),
									S_ProcName,
									"Expected beginEdit() to return a new edition of the focus object" );
							}
						}
						break;
					case Edit:
						if( editObj == null ) {
							editObj = (ICFBamTableEditObj)focus.beginEdit();
							if( editObj == null ) {
								throw new CFLibUsageException( getClass(),
									S_ProcName,
									"Expected beginEdit() to return a new edition of the focus object" );
							}
						}
						break;
					case Update:
						if( editObj == null ) {
							throw new CFLibUsageException( getClass(),
								S_ProcName,
								"Cannot transition PaneMode " + oldValue + " to Edit" ); 
						}
						break;
					default:
						throw new CFLibUsageException( getClass(),
							S_ProcName,
							"Cannot transition PaneMode " + oldValue + " to Edit" ); 
				}
				break;
			case Update:
				if( ( oldValue != CFPane.PaneMode.Edit ) && ( oldValue != CFPane.PaneMode.Add ) ) {
					throw new CFLibUsageException( getClass(),
						S_ProcName,
						"Cannot transition from mode " + oldValue + " to Update" );
				}
				super.setPaneMode( value );
				if( editObj != null ) {
					postFields();
					if( editObj.getIsNew() ) {
						focus = (ICFBamTableObj)editObj.create();
						setJavaFXFocus( focus );
					}
					else {
						editObj.update();
					}
					editObj = null;
				}
				setPaneMode( CFPane.PaneMode.View );
				break;
			case Delete:
				switch( oldValue ) {
					case View:
						if( focus != null ) {
							if( editObj == null ) {
								editObj = (ICFBamTableEditObj)focus.beginEdit();
								if( editObj == null ) {
									throw new CFLibUsageException( getClass(),
										S_ProcName,
										"Expected beginEdit() to return a new edition of the focus object" );
								}
							}
						}
						break;
					case Edit:
						if( focus != null ) {
							if( editObj == null ) {
								editObj = (ICFBamTableEditObj)focus.beginEdit();
								if( editObj == null ) {
									throw new CFLibUsageException( getClass(),
										S_ProcName,
										"Expected beginEdit() to return a new edition of the focus object" );
								}
							}
						}
						break;
					case Update:
						throw new CFLibUsageException( getClass(),
							S_ProcName,
							"Cannot transition PaneMode Update to Delete" ); 
					case Delete:
						if( editObj == null ) {
							editObj = (ICFBamTableEditObj)focus.beginEdit();
							if( editObj == null ) {
								throw new CFLibUsageException( getClass(),
									S_ProcName,
									"Expected beginEdit() to return a new edition of the focus object" );
							}
						}
						break;
					default:
						throw new CFLibUsageException( getClass(),
							S_ProcName,
							"Cannot transition PaneMode " + oldValue + " to Delete" ); 
				}
				editObj.deleteInstance();
				editObj = null;
				setJavaFXFocus( null );
				setPaneMode( CFPane.PaneMode.Unknown );
				break;
			default:
				switch( oldValue ) {
					case Unknown:
						break;
					default:
						if( editObj != null ) {
							editObj.endEdit();
							editObj = null;
						}
						break;
				}
				break;
		}
		super.setPaneMode( value );
		populateFields();
		adjustComponentEnableStates();
	}

	public void adjustComponentEnableStates() {
		CFPane.PaneMode mode = getPaneMode();
		boolean isEditing;
		switch( mode ) {
			case Unknown:
			case View:
			case Delete:
				isEditing = false;
				break;
			case Add:
			case Edit:
			case Update:
				isEditing = true;
				break;
			default:
				isEditing = false;
				break;
		}
		if( isEditing ) {
			ICFBamTableObj focus = getJavaFXFocusAsTable();
			if( focus == null ) {
				isEditing = false;
			}
			else if( null == focus.getEdit() ) {
				isEditing = false;
			}
		}
		if( javafxReferenceLookupDefSchema != null ) {
			javafxReferenceLookupDefSchema.setCustomDisable( ! isEditing );
		}
		if( javafxReferenceLookupLookupIndex != null ) {
			javafxReferenceLookupLookupIndex.setCustomDisable( ! isEditing );
		}
		if( javafxReferenceLookupAltIndex != null ) {
			javafxReferenceLookupAltIndex.setCustomDisable( ! isEditing );
		}
		if( javafxReferenceLookupQualTable != null ) {
			javafxReferenceLookupQualTable.setCustomDisable( ! isEditing );
		}
		if( javafxReferenceLookupPrimaryIndex != null ) {
			javafxReferenceLookupPrimaryIndex.setCustomDisable( ! isEditing );
		}
		if( javafxEditorId != null ) {
			javafxEditorId.setDisable( true );
		}
		if( javafxEditorName != null ) {
			javafxEditorName.setDisable( ! isEditing );
		}
		if( javafxEditorDbName != null ) {
			javafxEditorDbName.setDisable( ! isEditing );
		}
		if( javafxEditorShortName != null ) {
			javafxEditorShortName.setDisable( ! isEditing );
		}
		if( javafxEditorLabel != null ) {
			javafxEditorLabel.setDisable( ! isEditing );
		}
		if( javafxEditorShortDescription != null ) {
			javafxEditorShortDescription.setDisable( ! isEditing );
		}
		if( javafxEditorDescription != null ) {
			javafxEditorDescription.setDisable( ! isEditing );
		}
		if( javafxEditorPageData != null ) {
			javafxEditorPageData.setDisable( ! isEditing );
		}
		if( javafxEditorTableClassCode != null ) {
			javafxEditorTableClassCode.setDisable( ! isEditing );
		}
		if( javafxEditorIsInstantiable != null ) {
			javafxEditorIsInstantiable.setDisable( ! isEditing );
		}
		if( javafxEditorHasHistory != null ) {
			javafxEditorHasHistory.setDisable( ! isEditing );
		}
		if( javafxEditorHasAuditColumns != null ) {
			javafxEditorHasAuditColumns.setDisable( ! isEditing );
		}
		if( javafxEditorIsMutable != null ) {
			javafxEditorIsMutable.setDisable( ! isEditing );
		}
		if( javafxEditorIsServerOnly != null ) {
			javafxEditorIsServerOnly.setDisable( ! isEditing );
		}
		if( javafxEditorLoaderBehaviour != null ) {
			javafxEditorLoaderBehaviour.setDisable( ! isEditing );
		}
		if( javafxEditorSecScope != null ) {
			javafxEditorSecScope.setDisable( ! isEditing );
		}
		if( javafxEditorJObjMembers != null ) {
			javafxEditorJObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorJObjInterface != null ) {
			javafxEditorJObjInterface.setDisable( ! isEditing );
		}
		if( javafxEditorJObjImport != null ) {
			javafxEditorJObjImport.setDisable( ! isEditing );
		}
		if( javafxEditorJObjImplementation != null ) {
			javafxEditorJObjImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorJEditObjMembers != null ) {
			javafxEditorJEditObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorJEditObjInterface != null ) {
			javafxEditorJEditObjInterface.setDisable( ! isEditing );
		}
		if( javafxEditorJEditObjImport != null ) {
			javafxEditorJEditObjImport.setDisable( ! isEditing );
		}
		if( javafxEditorJEditObjImplementation != null ) {
			javafxEditorJEditObjImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorJTableImport != null ) {
			javafxEditorJTableImport.setDisable( ! isEditing );
		}
		if( javafxEditorJTableMembers != null ) {
			javafxEditorJTableMembers.setDisable( ! isEditing );
		}
		if( javafxEditorJTableInterface != null ) {
			javafxEditorJTableInterface.setDisable( ! isEditing );
		}
		if( javafxEditorJTableImplementation != null ) {
			javafxEditorJTableImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorJTableObjImport != null ) {
			javafxEditorJTableObjImport.setDisable( ! isEditing );
		}
		if( javafxEditorJTableObjMembers != null ) {
			javafxEditorJTableObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorJTableObjInterface != null ) {
			javafxEditorJTableObjInterface.setDisable( ! isEditing );
		}
		if( javafxEditorJTableObjImplementation != null ) {
			javafxEditorJTableObjImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorJDb2LUWTableImport != null ) {
			javafxEditorJDb2LUWTableImport.setDisable( ! isEditing );
		}
		if( javafxEditorJDb2LUWTableMembers != null ) {
			javafxEditorJDb2LUWTableMembers.setDisable( ! isEditing );
		}
		if( javafxEditorJDb2LUWTableImplementation != null ) {
			javafxEditorJDb2LUWTableImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorJMSSqlTableImport != null ) {
			javafxEditorJMSSqlTableImport.setDisable( ! isEditing );
		}
		if( javafxEditorJMSSqlTableMembers != null ) {
			javafxEditorJMSSqlTableMembers.setDisable( ! isEditing );
		}
		if( javafxEditorJMSSqlTableImplementation != null ) {
			javafxEditorJMSSqlTableImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorJMySqlTableImport != null ) {
			javafxEditorJMySqlTableImport.setDisable( ! isEditing );
		}
		if( javafxEditorJMySqlTableMembers != null ) {
			javafxEditorJMySqlTableMembers.setDisable( ! isEditing );
		}
		if( javafxEditorJMySqlTableImplementation != null ) {
			javafxEditorJMySqlTableImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorJOracleTableImport != null ) {
			javafxEditorJOracleTableImport.setDisable( ! isEditing );
		}
		if( javafxEditorJOracleTableMembers != null ) {
			javafxEditorJOracleTableMembers.setDisable( ! isEditing );
		}
		if( javafxEditorJOracleTableImplementation != null ) {
			javafxEditorJOracleTableImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorJPgSqlTableImport != null ) {
			javafxEditorJPgSqlTableImport.setDisable( ! isEditing );
		}
		if( javafxEditorJPgSqlTableMembers != null ) {
			javafxEditorJPgSqlTableMembers.setDisable( ! isEditing );
		}
		if( javafxEditorJPgSqlTableImplementation != null ) {
			javafxEditorJPgSqlTableImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorJRamTableImport != null ) {
			javafxEditorJRamTableImport.setDisable( ! isEditing );
		}
		if( javafxEditorJRamTableMembers != null ) {
			javafxEditorJRamTableMembers.setDisable( ! isEditing );
		}
		if( javafxEditorJRamTableImplementation != null ) {
			javafxEditorJRamTableImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorJSaxLoaderImport != null ) {
			javafxEditorJSaxLoaderImport.setDisable( ! isEditing );
		}
		if( javafxEditorJSaxLoaderStartElement != null ) {
			javafxEditorJSaxLoaderStartElement.setDisable( ! isEditing );
		}
		if( javafxEditorJSaxLoaderEndElement != null ) {
			javafxEditorJSaxLoaderEndElement.setDisable( ! isEditing );
		}
		if( javafxEditorJXMsgTableImport != null ) {
			javafxEditorJXMsgTableImport.setDisable( ! isEditing );
		}
		if( javafxEditorJXMsgTableFormatters != null ) {
			javafxEditorJXMsgTableFormatters.setDisable( ! isEditing );
		}
		if( javafxEditorJXMsgRqstTableImport != null ) {
			javafxEditorJXMsgRqstTableImport.setDisable( ! isEditing );
		}
		if( javafxEditorJXMsgRspnTableImport != null ) {
			javafxEditorJXMsgRspnTableImport.setDisable( ! isEditing );
		}
		if( javafxEditorJXMsgClientTableImport != null ) {
			javafxEditorJXMsgClientTableImport.setDisable( ! isEditing );
		}
		if( javafxEditorJXMsgRqstTableBody != null ) {
			javafxEditorJXMsgRqstTableBody.setDisable( ! isEditing );
		}
		if( javafxEditorJXMsgRspnTableBody != null ) {
			javafxEditorJXMsgRspnTableBody.setDisable( ! isEditing );
		}
		if( javafxEditorJXMsgClientTableBody != null ) {
			javafxEditorJXMsgClientTableBody.setDisable( ! isEditing );
		}
		if( javafxEditorCppObjMembers != null ) {
			javafxEditorCppObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorCppObjInterface != null ) {
			javafxEditorCppObjInterface.setDisable( ! isEditing );
		}
		if( javafxEditorCppObjInclude != null ) {
			javafxEditorCppObjInclude.setDisable( ! isEditing );
		}
		if( javafxEditorCppObjImplementation != null ) {
			javafxEditorCppObjImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorCppEditObjMembers != null ) {
			javafxEditorCppEditObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorCppEditObjInterface != null ) {
			javafxEditorCppEditObjInterface.setDisable( ! isEditing );
		}
		if( javafxEditorCppEditObjInclude != null ) {
			javafxEditorCppEditObjInclude.setDisable( ! isEditing );
		}
		if( javafxEditorCppEditObjImplementation != null ) {
			javafxEditorCppEditObjImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorCppTableInclude != null ) {
			javafxEditorCppTableInclude.setDisable( ! isEditing );
		}
		if( javafxEditorCppTableMembers != null ) {
			javafxEditorCppTableMembers.setDisable( ! isEditing );
		}
		if( javafxEditorCppTableInterface != null ) {
			javafxEditorCppTableInterface.setDisable( ! isEditing );
		}
		if( javafxEditorCppTableImplementation != null ) {
			javafxEditorCppTableImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorCppTableObjInclude != null ) {
			javafxEditorCppTableObjInclude.setDisable( ! isEditing );
		}
		if( javafxEditorCppTableObjMembers != null ) {
			javafxEditorCppTableObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorCppTableObjInterface != null ) {
			javafxEditorCppTableObjInterface.setDisable( ! isEditing );
		}
		if( javafxEditorCppTableObjImplementation != null ) {
			javafxEditorCppTableObjImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorCppDb2LUWTableInclude != null ) {
			javafxEditorCppDb2LUWTableInclude.setDisable( ! isEditing );
		}
		if( javafxEditorCppDb2LUWTableMembers != null ) {
			javafxEditorCppDb2LUWTableMembers.setDisable( ! isEditing );
		}
		if( javafxEditorCppDb2LUWTableImplementation != null ) {
			javafxEditorCppDb2LUWTableImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorCppMSSqlTableInclude != null ) {
			javafxEditorCppMSSqlTableInclude.setDisable( ! isEditing );
		}
		if( javafxEditorCppMSSqlTableMembers != null ) {
			javafxEditorCppMSSqlTableMembers.setDisable( ! isEditing );
		}
		if( javafxEditorCppMSSqlTableImplementation != null ) {
			javafxEditorCppMSSqlTableImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorCppMySqlTableInclude != null ) {
			javafxEditorCppMySqlTableInclude.setDisable( ! isEditing );
		}
		if( javafxEditorCppMySqlTableMembers != null ) {
			javafxEditorCppMySqlTableMembers.setDisable( ! isEditing );
		}
		if( javafxEditorCppMySqlTableImplementation != null ) {
			javafxEditorCppMySqlTableImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorCppOracleTableInclude != null ) {
			javafxEditorCppOracleTableInclude.setDisable( ! isEditing );
		}
		if( javafxEditorCppOracleTableMembers != null ) {
			javafxEditorCppOracleTableMembers.setDisable( ! isEditing );
		}
		if( javafxEditorCppOracleTableImplementation != null ) {
			javafxEditorCppOracleTableImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorCppPgSqlTableInclude != null ) {
			javafxEditorCppPgSqlTableInclude.setDisable( ! isEditing );
		}
		if( javafxEditorCppPgSqlTableMembers != null ) {
			javafxEditorCppPgSqlTableMembers.setDisable( ! isEditing );
		}
		if( javafxEditorCppPgSqlTableImplementation != null ) {
			javafxEditorCppPgSqlTableImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorCppRamTableInclude != null ) {
			javafxEditorCppRamTableInclude.setDisable( ! isEditing );
		}
		if( javafxEditorCppRamTableMembers != null ) {
			javafxEditorCppRamTableMembers.setDisable( ! isEditing );
		}
		if( javafxEditorCppRamTableImplementation != null ) {
			javafxEditorCppRamTableImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorCppSaxLoaderInclude != null ) {
			javafxEditorCppSaxLoaderInclude.setDisable( ! isEditing );
		}
		if( javafxEditorCppSaxLoaderStartElement != null ) {
			javafxEditorCppSaxLoaderStartElement.setDisable( ! isEditing );
		}
		if( javafxEditorCppSaxLoaderEndElement != null ) {
			javafxEditorCppSaxLoaderEndElement.setDisable( ! isEditing );
		}
		if( javafxEditorCppXMsgTableInclude != null ) {
			javafxEditorCppXMsgTableInclude.setDisable( ! isEditing );
		}
		if( javafxEditorCppXMsgTableFormatters != null ) {
			javafxEditorCppXMsgTableFormatters.setDisable( ! isEditing );
		}
		if( javafxEditorCppXMsgRqstTableInclude != null ) {
			javafxEditorCppXMsgRqstTableInclude.setDisable( ! isEditing );
		}
		if( javafxEditorCppXMsgRspnTableInclude != null ) {
			javafxEditorCppXMsgRspnTableInclude.setDisable( ! isEditing );
		}
		if( javafxEditorCppXMsgClientTableInclude != null ) {
			javafxEditorCppXMsgClientTableInclude.setDisable( ! isEditing );
		}
		if( javafxEditorCppXMsgRqstTableBody != null ) {
			javafxEditorCppXMsgRqstTableBody.setDisable( ! isEditing );
		}
		if( javafxEditorCppXMsgRspnTableBody != null ) {
			javafxEditorCppXMsgRspnTableBody.setDisable( ! isEditing );
		}
		if( javafxEditorCppXMsgClientTableBody != null ) {
			javafxEditorCppXMsgClientTableBody.setDisable( ! isEditing );
		}
		if( javafxEditorHppObjMembers != null ) {
			javafxEditorHppObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorHppObjInterface != null ) {
			javafxEditorHppObjInterface.setDisable( ! isEditing );
		}
		if( javafxEditorHppObjInclude != null ) {
			javafxEditorHppObjInclude.setDisable( ! isEditing );
		}
		if( javafxEditorHppObjImplementation != null ) {
			javafxEditorHppObjImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorHppEditObjMembers != null ) {
			javafxEditorHppEditObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorHppEditObjInterface != null ) {
			javafxEditorHppEditObjInterface.setDisable( ! isEditing );
		}
		if( javafxEditorHppEditObjInclude != null ) {
			javafxEditorHppEditObjInclude.setDisable( ! isEditing );
		}
		if( javafxEditorHppEditObjImplementation != null ) {
			javafxEditorHppEditObjImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorHppTableInclude != null ) {
			javafxEditorHppTableInclude.setDisable( ! isEditing );
		}
		if( javafxEditorHppTableMembers != null ) {
			javafxEditorHppTableMembers.setDisable( ! isEditing );
		}
		if( javafxEditorHppTableInterface != null ) {
			javafxEditorHppTableInterface.setDisable( ! isEditing );
		}
		if( javafxEditorHppTableImplementation != null ) {
			javafxEditorHppTableImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorHppTableObjInclude != null ) {
			javafxEditorHppTableObjInclude.setDisable( ! isEditing );
		}
		if( javafxEditorHppTableObjMembers != null ) {
			javafxEditorHppTableObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorHppTableObjInterface != null ) {
			javafxEditorHppTableObjInterface.setDisable( ! isEditing );
		}
		if( javafxEditorHppTableObjImplementation != null ) {
			javafxEditorHppTableObjImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorHppDb2LUWTableInclude != null ) {
			javafxEditorHppDb2LUWTableInclude.setDisable( ! isEditing );
		}
		if( javafxEditorHppDb2LUWTableMembers != null ) {
			javafxEditorHppDb2LUWTableMembers.setDisable( ! isEditing );
		}
		if( javafxEditorHppDb2LUWTableImplementation != null ) {
			javafxEditorHppDb2LUWTableImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorHppMSSqlTableInclude != null ) {
			javafxEditorHppMSSqlTableInclude.setDisable( ! isEditing );
		}
		if( javafxEditorHppMSSqlTableMembers != null ) {
			javafxEditorHppMSSqlTableMembers.setDisable( ! isEditing );
		}
		if( javafxEditorHppMSSqlTableImplementation != null ) {
			javafxEditorHppMSSqlTableImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorHppMySqlTableInclude != null ) {
			javafxEditorHppMySqlTableInclude.setDisable( ! isEditing );
		}
		if( javafxEditorHppMySqlTableMembers != null ) {
			javafxEditorHppMySqlTableMembers.setDisable( ! isEditing );
		}
		if( javafxEditorHppMySqlTableImplementation != null ) {
			javafxEditorHppMySqlTableImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorHppOracleTableInclude != null ) {
			javafxEditorHppOracleTableInclude.setDisable( ! isEditing );
		}
		if( javafxEditorHppOracleTableMembers != null ) {
			javafxEditorHppOracleTableMembers.setDisable( ! isEditing );
		}
		if( javafxEditorHppOracleTableImplementation != null ) {
			javafxEditorHppOracleTableImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorHppPgSqlTableInclude != null ) {
			javafxEditorHppPgSqlTableInclude.setDisable( ! isEditing );
		}
		if( javafxEditorHppPgSqlTableMembers != null ) {
			javafxEditorHppPgSqlTableMembers.setDisable( ! isEditing );
		}
		if( javafxEditorHppPgSqlTableImplementation != null ) {
			javafxEditorHppPgSqlTableImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorHppRamTableInclude != null ) {
			javafxEditorHppRamTableInclude.setDisable( ! isEditing );
		}
		if( javafxEditorHppRamTableMembers != null ) {
			javafxEditorHppRamTableMembers.setDisable( ! isEditing );
		}
		if( javafxEditorHppRamTableImplementation != null ) {
			javafxEditorHppRamTableImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorHppSaxLoaderInclude != null ) {
			javafxEditorHppSaxLoaderInclude.setDisable( ! isEditing );
		}
		if( javafxEditorHppSaxLoaderStartElement != null ) {
			javafxEditorHppSaxLoaderStartElement.setDisable( ! isEditing );
		}
		if( javafxEditorHppSaxLoaderEndElement != null ) {
			javafxEditorHppSaxLoaderEndElement.setDisable( ! isEditing );
		}
		if( javafxEditorHppXMsgTableInclude != null ) {
			javafxEditorHppXMsgTableInclude.setDisable( ! isEditing );
		}
		if( javafxEditorHppXMsgTableFormatters != null ) {
			javafxEditorHppXMsgTableFormatters.setDisable( ! isEditing );
		}
		if( javafxEditorHppXMsgRqstTableInclude != null ) {
			javafxEditorHppXMsgRqstTableInclude.setDisable( ! isEditing );
		}
		if( javafxEditorHppXMsgRspnTableInclude != null ) {
			javafxEditorHppXMsgRspnTableInclude.setDisable( ! isEditing );
		}
		if( javafxEditorHppXMsgClientTableInclude != null ) {
			javafxEditorHppXMsgClientTableInclude.setDisable( ! isEditing );
		}
		if( javafxEditorHppXMsgRqstTableBody != null ) {
			javafxEditorHppXMsgRqstTableBody.setDisable( ! isEditing );
		}
		if( javafxEditorHppXMsgRspnTableBody != null ) {
			javafxEditorHppXMsgRspnTableBody.setDisable( ! isEditing );
		}
		if( javafxEditorHppXMsgClientTableBody != null ) {
			javafxEditorHppXMsgClientTableBody.setDisable( ! isEditing );
		}
		if( javafxEditorCsObjMembers != null ) {
			javafxEditorCsObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorCsObjInterface != null ) {
			javafxEditorCsObjInterface.setDisable( ! isEditing );
		}
		if( javafxEditorCsObjUsing != null ) {
			javafxEditorCsObjUsing.setDisable( ! isEditing );
		}
		if( javafxEditorCsObjImplementation != null ) {
			javafxEditorCsObjImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorCsEditObjMembers != null ) {
			javafxEditorCsEditObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorCsEditObjInterface != null ) {
			javafxEditorCsEditObjInterface.setDisable( ! isEditing );
		}
		if( javafxEditorCsEditObjUsing != null ) {
			javafxEditorCsEditObjUsing.setDisable( ! isEditing );
		}
		if( javafxEditorCsEditObjImplementation != null ) {
			javafxEditorCsEditObjImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorCsTableUsing != null ) {
			javafxEditorCsTableUsing.setDisable( ! isEditing );
		}
		if( javafxEditorCsTableMembers != null ) {
			javafxEditorCsTableMembers.setDisable( ! isEditing );
		}
		if( javafxEditorCsTableInterface != null ) {
			javafxEditorCsTableInterface.setDisable( ! isEditing );
		}
		if( javafxEditorCsTableImplementation != null ) {
			javafxEditorCsTableImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorCsTableObjUsing != null ) {
			javafxEditorCsTableObjUsing.setDisable( ! isEditing );
		}
		if( javafxEditorCsTableObjMembers != null ) {
			javafxEditorCsTableObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorCsTableObjInterface != null ) {
			javafxEditorCsTableObjInterface.setDisable( ! isEditing );
		}
		if( javafxEditorCsTableObjImplementation != null ) {
			javafxEditorCsTableObjImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorCsDb2LUWTableUsing != null ) {
			javafxEditorCsDb2LUWTableUsing.setDisable( ! isEditing );
		}
		if( javafxEditorCsDb2LUWTableMembers != null ) {
			javafxEditorCsDb2LUWTableMembers.setDisable( ! isEditing );
		}
		if( javafxEditorCsDb2LUWTableImplementation != null ) {
			javafxEditorCsDb2LUWTableImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorCsMSSqlTableUsing != null ) {
			javafxEditorCsMSSqlTableUsing.setDisable( ! isEditing );
		}
		if( javafxEditorCsMSSqlTableMembers != null ) {
			javafxEditorCsMSSqlTableMembers.setDisable( ! isEditing );
		}
		if( javafxEditorCsMSSqlTableImplementation != null ) {
			javafxEditorCsMSSqlTableImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorCsMySqlTableUsing != null ) {
			javafxEditorCsMySqlTableUsing.setDisable( ! isEditing );
		}
		if( javafxEditorCsMySqlTableMembers != null ) {
			javafxEditorCsMySqlTableMembers.setDisable( ! isEditing );
		}
		if( javafxEditorCsMySqlTableImplementation != null ) {
			javafxEditorCsMySqlTableImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorCsOracleTableUsing != null ) {
			javafxEditorCsOracleTableUsing.setDisable( ! isEditing );
		}
		if( javafxEditorCsOracleTableMembers != null ) {
			javafxEditorCsOracleTableMembers.setDisable( ! isEditing );
		}
		if( javafxEditorCsOracleTableImplementation != null ) {
			javafxEditorCsOracleTableImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorCsPgSqlTableUsing != null ) {
			javafxEditorCsPgSqlTableUsing.setDisable( ! isEditing );
		}
		if( javafxEditorCsPgSqlTableMembers != null ) {
			javafxEditorCsPgSqlTableMembers.setDisable( ! isEditing );
		}
		if( javafxEditorCsPgSqlTableImplementation != null ) {
			javafxEditorCsPgSqlTableImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorCsRamTableUsing != null ) {
			javafxEditorCsRamTableUsing.setDisable( ! isEditing );
		}
		if( javafxEditorCsRamTableMembers != null ) {
			javafxEditorCsRamTableMembers.setDisable( ! isEditing );
		}
		if( javafxEditorCsRamTableImplementation != null ) {
			javafxEditorCsRamTableImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorCsSaxLoaderUsing != null ) {
			javafxEditorCsSaxLoaderUsing.setDisable( ! isEditing );
		}
		if( javafxEditorCsSaxLoaderStartElement != null ) {
			javafxEditorCsSaxLoaderStartElement.setDisable( ! isEditing );
		}
		if( javafxEditorCsSaxLoaderEndElement != null ) {
			javafxEditorCsSaxLoaderEndElement.setDisable( ! isEditing );
		}
		if( javafxEditorCsXMsgTableUsing != null ) {
			javafxEditorCsXMsgTableUsing.setDisable( ! isEditing );
		}
		if( javafxEditorCsXMsgTableFormatters != null ) {
			javafxEditorCsXMsgTableFormatters.setDisable( ! isEditing );
		}
		if( javafxEditorCsXMsgRqstTableUsing != null ) {
			javafxEditorCsXMsgRqstTableUsing.setDisable( ! isEditing );
		}
		if( javafxEditorCsXMsgRspnTableUsing != null ) {
			javafxEditorCsXMsgRspnTableUsing.setDisable( ! isEditing );
		}
		if( javafxEditorCsXMsgClientTableUsing != null ) {
			javafxEditorCsXMsgClientTableUsing.setDisable( ! isEditing );
		}
		if( javafxEditorCsXMsgRqstTableBody != null ) {
			javafxEditorCsXMsgRqstTableBody.setDisable( ! isEditing );
		}
		if( javafxEditorCsXMsgRspnTableBody != null ) {
			javafxEditorCsXMsgRspnTableBody.setDisable( ! isEditing );
		}
		if( javafxEditorCsXMsgClientTableBody != null ) {
			javafxEditorCsXMsgClientTableBody.setDisable( ! isEditing );
		}
	}
}
