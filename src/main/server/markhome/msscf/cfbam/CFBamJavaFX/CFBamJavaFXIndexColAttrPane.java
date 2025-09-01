// Description: Java 11 JavaFX Attribute Pane implementation for IndexCol.

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
 *	CFBamJavaFXIndexColAttrPane JavaFX Attribute Pane implementation
 *	for IndexCol.
 */
public class CFBamJavaFXIndexColAttrPane
extends CFGridPane
implements ICFBamJavaFXIndexColPaneCommon
{
	protected ICFFormManager cfFormManager = null;
	protected ICFBamJavaFXSchema javafxSchema = null;
	boolean javafxIsInitializing = true;

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
				ICFBamIndexColObj cur = getJavaFXFocusAsIndexCol();
				if( cur != null ) {
					ICFBamIndexColEditObj editObj = (ICFBamIndexColEditObj)cur.getEdit();
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
			ICFBamIndexColObj focus = getEffJavaFXFocus();
			ICFBamSchemaDefObj referencedObj = (ICFBamSchemaDefObj)javafxReferenceLookupDefSchema.getReferencedObject();
			java.util.List<ICFBamSchemaDefObj> listOfSchemaDef = null;
			Collection<ICFBamSchemaDefObj> cltn = null;
			CFBorderPane form = javafxSchema.getSchemaDefFactory().newPickerForm( cfFormManager, referencedObj, null, cltn, new CallbackDefSchemaChosen() );
			((ICFBamJavaFXSchemaDefPaneCommon)form).setPaneMode( CFPane.PaneMode.View );
			cfFormManager.pushForm( form );
		}

		public void view( ICFLibAnyObj value ) {
			final String S_ProcName = "actionPerformed";
			ICFBamIndexColObj focus = getEffJavaFXFocus();
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

	protected class ColumnCFLabel
		extends CFLabel
	{
		public ColumnCFLabel() {
			super();
			setText( "Column" );
		}
	}

	protected class CallbackColumnChosen
	implements ICFBamJavaFXValueChosen
	{
		public CallbackColumnChosen() {
		}

		public void choseValue( ICFBamValueObj value ) {
			if( javafxReferenceLookupColumn != null ) {
				ICFBamIndexColObj cur = getJavaFXFocusAsIndexCol();
				if( cur != null ) {
					ICFBamIndexColEditObj editObj = (ICFBamIndexColEditObj)cur.getEdit();
					if( null != editObj ) {
						CFPane.PaneMode curMode = getPaneMode();
						if( ( curMode == CFPane.PaneMode.Add ) || ( curMode == CFPane.PaneMode.Edit ) ) {
							javafxReferenceLookupColumn.setReferencedObject( value );
							editObj.setRequiredLookupColumn( value );
						}
					}
				}
			}
		}
	}

	protected class ColumnReferenceCallback
	implements ICFReferenceCallback
	{
		public void chose( ICFLibAnyObj value ) {
			final String S_ProcName = "chose";
			Node cont;
			ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
			ICFBamIndexColObj focus = getEffJavaFXFocus();
			ICFBamValueObj referencedObj = (ICFBamValueObj)javafxReferenceLookupColumn.getReferencedObject();
			java.util.List<ICFBamValueObj> listOfValue = null;
			ICFBamIndexObj refIndex = (ICFBamIndexObj)focus.getRequiredContainerIndex( javafxIsInitializing );
			if( refIndex == null ) {
				CFConsole.message( "You must specify a Containing Index before selecting a Column" );
				return;
			}
			ICFBamTableObj refTable = refIndex.getRequiredContainerTable( javafxIsInitializing );
			if( refTable == null ) {
				CFConsole.message( "You must specify a Table before selecting a Column" );
				return;
			}
			listOfValue = refTable.getOptionalComponentsColumns( javafxIsInitializing );
			if( listOfValue == null ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"listOfValue" );
			}
			Collection<ICFBamValueObj> cltn = listOfValue;
			CFBorderPane form = javafxSchema.getValueFactory().newPickerForm( cfFormManager, referencedObj, null, cltn, new CallbackColumnChosen() );
			((ICFBamJavaFXValuePaneCommon)form).setPaneMode( CFPane.PaneMode.View );
			cfFormManager.pushForm( form );
		}

		public void view( ICFLibAnyObj value ) {
			final String S_ProcName = "actionPerformed";
			ICFBamIndexColObj focus = getEffJavaFXFocus();
			if( focus != null ) {
				ICFBamValueObj referencedObj = (ICFBamValueObj)javafxReferenceLookupColumn.getReferencedObject();
				CFBorderPane form = null;
				if( referencedObj != null ) {
					String classCode = referencedObj.getClassCode();
					if( "a809".equals( classCode ) ) {
						form = javafxSchema.getValueFactory().newAddForm( cfFormManager, referencedObj, null, true );
						ICFBamJavaFXValuePaneCommon spec = (ICFBamJavaFXValuePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a80a".equals( classCode ) ) {
						ICFBamAtomObj obj = (ICFBamAtomObj)referencedObj;
						form = javafxSchema.getAtomFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXAtomPaneCommon spec = (ICFBamJavaFXAtomPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a80b".equals( classCode ) ) {
						ICFBamBlobDefObj obj = (ICFBamBlobDefObj)referencedObj;
						form = javafxSchema.getBlobDefFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXBlobDefPaneCommon spec = (ICFBamJavaFXBlobDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a80c".equals( classCode ) ) {
						ICFBamBlobTypeObj obj = (ICFBamBlobTypeObj)referencedObj;
						form = javafxSchema.getBlobTypeFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXBlobTypePaneCommon spec = (ICFBamJavaFXBlobTypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a852".equals( classCode ) ) {
						ICFBamBlobColObj obj = (ICFBamBlobColObj)referencedObj;
						form = javafxSchema.getBlobColFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXBlobColPaneCommon spec = (ICFBamJavaFXBlobColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a80d".equals( classCode ) ) {
						ICFBamBoolDefObj obj = (ICFBamBoolDefObj)referencedObj;
						form = javafxSchema.getBoolDefFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXBoolDefPaneCommon spec = (ICFBamJavaFXBoolDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a80e".equals( classCode ) ) {
						ICFBamBoolTypeObj obj = (ICFBamBoolTypeObj)referencedObj;
						form = javafxSchema.getBoolTypeFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXBoolTypePaneCommon spec = (ICFBamJavaFXBoolTypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a853".equals( classCode ) ) {
						ICFBamBoolColObj obj = (ICFBamBoolColObj)referencedObj;
						form = javafxSchema.getBoolColFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXBoolColPaneCommon spec = (ICFBamJavaFXBoolColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a815".equals( classCode ) ) {
						ICFBamDateDefObj obj = (ICFBamDateDefObj)referencedObj;
						form = javafxSchema.getDateDefFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXDateDefPaneCommon spec = (ICFBamJavaFXDateDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a816".equals( classCode ) ) {
						ICFBamDateTypeObj obj = (ICFBamDateTypeObj)referencedObj;
						form = javafxSchema.getDateTypeFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXDateTypePaneCommon spec = (ICFBamJavaFXDateTypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a854".equals( classCode ) ) {
						ICFBamDateColObj obj = (ICFBamDateColObj)referencedObj;
						form = javafxSchema.getDateColFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXDateColPaneCommon spec = (ICFBamJavaFXDateColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a81c".equals( classCode ) ) {
						ICFBamDoubleDefObj obj = (ICFBamDoubleDefObj)referencedObj;
						form = javafxSchema.getDoubleDefFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXDoubleDefPaneCommon spec = (ICFBamJavaFXDoubleDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a81d".equals( classCode ) ) {
						ICFBamDoubleTypeObj obj = (ICFBamDoubleTypeObj)referencedObj;
						form = javafxSchema.getDoubleTypeFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXDoubleTypePaneCommon spec = (ICFBamJavaFXDoubleTypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a855".equals( classCode ) ) {
						ICFBamDoubleColObj obj = (ICFBamDoubleColObj)referencedObj;
						form = javafxSchema.getDoubleColFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXDoubleColPaneCommon spec = (ICFBamJavaFXDoubleColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a81f".equals( classCode ) ) {
						ICFBamFloatDefObj obj = (ICFBamFloatDefObj)referencedObj;
						form = javafxSchema.getFloatDefFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXFloatDefPaneCommon spec = (ICFBamJavaFXFloatDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a820".equals( classCode ) ) {
						ICFBamFloatTypeObj obj = (ICFBamFloatTypeObj)referencedObj;
						form = javafxSchema.getFloatTypeFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXFloatTypePaneCommon spec = (ICFBamJavaFXFloatTypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a858".equals( classCode ) ) {
						ICFBamFloatColObj obj = (ICFBamFloatColObj)referencedObj;
						form = javafxSchema.getFloatColFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXFloatColPaneCommon spec = (ICFBamJavaFXFloatColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a823".equals( classCode ) ) {
						ICFBamInt16DefObj obj = (ICFBamInt16DefObj)referencedObj;
						form = javafxSchema.getInt16DefFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXInt16DefPaneCommon spec = (ICFBamJavaFXInt16DefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a824".equals( classCode ) ) {
						ICFBamInt16TypeObj obj = (ICFBamInt16TypeObj)referencedObj;
						form = javafxSchema.getInt16TypeFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXInt16TypePaneCommon spec = (ICFBamJavaFXInt16TypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a859".equals( classCode ) ) {
						ICFBamId16GenObj obj = (ICFBamId16GenObj)referencedObj;
						form = javafxSchema.getId16GenFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXId16GenPaneCommon spec = (ICFBamJavaFXId16GenPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a856".equals( classCode ) ) {
						ICFBamEnumDefObj obj = (ICFBamEnumDefObj)referencedObj;
						form = javafxSchema.getEnumDefFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXEnumDefPaneCommon spec = (ICFBamJavaFXEnumDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a857".equals( classCode ) ) {
						ICFBamEnumTypeObj obj = (ICFBamEnumTypeObj)referencedObj;
						form = javafxSchema.getEnumTypeFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXEnumTypePaneCommon spec = (ICFBamJavaFXEnumTypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a85c".equals( classCode ) ) {
						ICFBamInt16ColObj obj = (ICFBamInt16ColObj)referencedObj;
						form = javafxSchema.getInt16ColFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXInt16ColPaneCommon spec = (ICFBamJavaFXInt16ColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a825".equals( classCode ) ) {
						ICFBamInt32DefObj obj = (ICFBamInt32DefObj)referencedObj;
						form = javafxSchema.getInt32DefFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXInt32DefPaneCommon spec = (ICFBamJavaFXInt32DefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a826".equals( classCode ) ) {
						ICFBamInt32TypeObj obj = (ICFBamInt32TypeObj)referencedObj;
						form = javafxSchema.getInt32TypeFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXInt32TypePaneCommon spec = (ICFBamJavaFXInt32TypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a85a".equals( classCode ) ) {
						ICFBamId32GenObj obj = (ICFBamId32GenObj)referencedObj;
						form = javafxSchema.getId32GenFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXId32GenPaneCommon spec = (ICFBamJavaFXId32GenPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a85d".equals( classCode ) ) {
						ICFBamInt32ColObj obj = (ICFBamInt32ColObj)referencedObj;
						form = javafxSchema.getInt32ColFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXInt32ColPaneCommon spec = (ICFBamJavaFXInt32ColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a827".equals( classCode ) ) {
						ICFBamInt64DefObj obj = (ICFBamInt64DefObj)referencedObj;
						form = javafxSchema.getInt64DefFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXInt64DefPaneCommon spec = (ICFBamJavaFXInt64DefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a828".equals( classCode ) ) {
						ICFBamInt64TypeObj obj = (ICFBamInt64TypeObj)referencedObj;
						form = javafxSchema.getInt64TypeFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXInt64TypePaneCommon spec = (ICFBamJavaFXInt64TypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a85b".equals( classCode ) ) {
						ICFBamId64GenObj obj = (ICFBamId64GenObj)referencedObj;
						form = javafxSchema.getId64GenFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXId64GenPaneCommon spec = (ICFBamJavaFXId64GenPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a85e".equals( classCode ) ) {
						ICFBamInt64ColObj obj = (ICFBamInt64ColObj)referencedObj;
						form = javafxSchema.getInt64ColFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXInt64ColPaneCommon spec = (ICFBamJavaFXInt64ColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a829".equals( classCode ) ) {
						ICFBamNmTokenDefObj obj = (ICFBamNmTokenDefObj)referencedObj;
						form = javafxSchema.getNmTokenDefFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXNmTokenDefPaneCommon spec = (ICFBamJavaFXNmTokenDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a82a".equals( classCode ) ) {
						ICFBamNmTokenTypeObj obj = (ICFBamNmTokenTypeObj)referencedObj;
						form = javafxSchema.getNmTokenTypeFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXNmTokenTypePaneCommon spec = (ICFBamJavaFXNmTokenTypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a85f".equals( classCode ) ) {
						ICFBamNmTokenColObj obj = (ICFBamNmTokenColObj)referencedObj;
						form = javafxSchema.getNmTokenColFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXNmTokenColPaneCommon spec = (ICFBamJavaFXNmTokenColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a82b".equals( classCode ) ) {
						ICFBamNmTokensDefObj obj = (ICFBamNmTokensDefObj)referencedObj;
						form = javafxSchema.getNmTokensDefFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXNmTokensDefPaneCommon spec = (ICFBamJavaFXNmTokensDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a82c".equals( classCode ) ) {
						ICFBamNmTokensTypeObj obj = (ICFBamNmTokensTypeObj)referencedObj;
						form = javafxSchema.getNmTokensTypeFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXNmTokensTypePaneCommon spec = (ICFBamJavaFXNmTokensTypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a860".equals( classCode ) ) {
						ICFBamNmTokensColObj obj = (ICFBamNmTokensColObj)referencedObj;
						form = javafxSchema.getNmTokensColFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXNmTokensColPaneCommon spec = (ICFBamJavaFXNmTokensColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a82d".equals( classCode ) ) {
						ICFBamNumberDefObj obj = (ICFBamNumberDefObj)referencedObj;
						form = javafxSchema.getNumberDefFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXNumberDefPaneCommon spec = (ICFBamJavaFXNumberDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a82e".equals( classCode ) ) {
						ICFBamNumberTypeObj obj = (ICFBamNumberTypeObj)referencedObj;
						form = javafxSchema.getNumberTypeFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXNumberTypePaneCommon spec = (ICFBamJavaFXNumberTypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a861".equals( classCode ) ) {
						ICFBamNumberColObj obj = (ICFBamNumberColObj)referencedObj;
						form = javafxSchema.getNumberColFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXNumberColPaneCommon spec = (ICFBamJavaFXNumberColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a838".equals( classCode ) ) {
						ICFBamStringDefObj obj = (ICFBamStringDefObj)referencedObj;
						form = javafxSchema.getStringDefFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXStringDefPaneCommon spec = (ICFBamJavaFXStringDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a839".equals( classCode ) ) {
						ICFBamStringTypeObj obj = (ICFBamStringTypeObj)referencedObj;
						form = javafxSchema.getStringTypeFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXStringTypePaneCommon spec = (ICFBamJavaFXStringTypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a862".equals( classCode ) ) {
						ICFBamStringColObj obj = (ICFBamStringColObj)referencedObj;
						form = javafxSchema.getStringColFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXStringColPaneCommon spec = (ICFBamJavaFXStringColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a83a".equals( classCode ) ) {
						ICFBamTZDateDefObj obj = (ICFBamTZDateDefObj)referencedObj;
						form = javafxSchema.getTZDateDefFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXTZDateDefPaneCommon spec = (ICFBamJavaFXTZDateDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a83b".equals( classCode ) ) {
						ICFBamTZDateTypeObj obj = (ICFBamTZDateTypeObj)referencedObj;
						form = javafxSchema.getTZDateTypeFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXTZDateTypePaneCommon spec = (ICFBamJavaFXTZDateTypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a863".equals( classCode ) ) {
						ICFBamTZDateColObj obj = (ICFBamTZDateColObj)referencedObj;
						form = javafxSchema.getTZDateColFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXTZDateColPaneCommon spec = (ICFBamJavaFXTZDateColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a83c".equals( classCode ) ) {
						ICFBamTZTimeDefObj obj = (ICFBamTZTimeDefObj)referencedObj;
						form = javafxSchema.getTZTimeDefFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXTZTimeDefPaneCommon spec = (ICFBamJavaFXTZTimeDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a83d".equals( classCode ) ) {
						ICFBamTZTimeTypeObj obj = (ICFBamTZTimeTypeObj)referencedObj;
						form = javafxSchema.getTZTimeTypeFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXTZTimeTypePaneCommon spec = (ICFBamJavaFXTZTimeTypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a864".equals( classCode ) ) {
						ICFBamTZTimeColObj obj = (ICFBamTZTimeColObj)referencedObj;
						form = javafxSchema.getTZTimeColFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXTZTimeColPaneCommon spec = (ICFBamJavaFXTZTimeColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a83e".equals( classCode ) ) {
						ICFBamTZTimestampDefObj obj = (ICFBamTZTimestampDefObj)referencedObj;
						form = javafxSchema.getTZTimestampDefFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXTZTimestampDefPaneCommon spec = (ICFBamJavaFXTZTimestampDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a83f".equals( classCode ) ) {
						ICFBamTZTimestampTypeObj obj = (ICFBamTZTimestampTypeObj)referencedObj;
						form = javafxSchema.getTZTimestampTypeFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXTZTimestampTypePaneCommon spec = (ICFBamJavaFXTZTimestampTypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a865".equals( classCode ) ) {
						ICFBamTZTimestampColObj obj = (ICFBamTZTimestampColObj)referencedObj;
						form = javafxSchema.getTZTimestampColFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXTZTimestampColPaneCommon spec = (ICFBamJavaFXTZTimestampColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a841".equals( classCode ) ) {
						ICFBamTextDefObj obj = (ICFBamTextDefObj)referencedObj;
						form = javafxSchema.getTextDefFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXTextDefPaneCommon spec = (ICFBamJavaFXTextDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a842".equals( classCode ) ) {
						ICFBamTextTypeObj obj = (ICFBamTextTypeObj)referencedObj;
						form = javafxSchema.getTextTypeFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXTextTypePaneCommon spec = (ICFBamJavaFXTextTypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a866".equals( classCode ) ) {
						ICFBamTextColObj obj = (ICFBamTextColObj)referencedObj;
						form = javafxSchema.getTextColFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXTextColPaneCommon spec = (ICFBamJavaFXTextColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a843".equals( classCode ) ) {
						ICFBamTimeDefObj obj = (ICFBamTimeDefObj)referencedObj;
						form = javafxSchema.getTimeDefFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXTimeDefPaneCommon spec = (ICFBamJavaFXTimeDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a845".equals( classCode ) ) {
						ICFBamTimeTypeObj obj = (ICFBamTimeTypeObj)referencedObj;
						form = javafxSchema.getTimeTypeFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXTimeTypePaneCommon spec = (ICFBamJavaFXTimeTypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a867".equals( classCode ) ) {
						ICFBamTimeColObj obj = (ICFBamTimeColObj)referencedObj;
						form = javafxSchema.getTimeColFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXTimeColPaneCommon spec = (ICFBamJavaFXTimeColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a846".equals( classCode ) ) {
						ICFBamTimestampDefObj obj = (ICFBamTimestampDefObj)referencedObj;
						form = javafxSchema.getTimestampDefFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXTimestampDefPaneCommon spec = (ICFBamJavaFXTimestampDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a847".equals( classCode ) ) {
						ICFBamTimestampTypeObj obj = (ICFBamTimestampTypeObj)referencedObj;
						form = javafxSchema.getTimestampTypeFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXTimestampTypePaneCommon spec = (ICFBamJavaFXTimestampTypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a868".equals( classCode ) ) {
						ICFBamTimestampColObj obj = (ICFBamTimestampColObj)referencedObj;
						form = javafxSchema.getTimestampColFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXTimestampColPaneCommon spec = (ICFBamJavaFXTimestampColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a848".equals( classCode ) ) {
						ICFBamTokenDefObj obj = (ICFBamTokenDefObj)referencedObj;
						form = javafxSchema.getTokenDefFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXTokenDefPaneCommon spec = (ICFBamJavaFXTokenDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a849".equals( classCode ) ) {
						ICFBamTokenTypeObj obj = (ICFBamTokenTypeObj)referencedObj;
						form = javafxSchema.getTokenTypeFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXTokenTypePaneCommon spec = (ICFBamJavaFXTokenTypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a869".equals( classCode ) ) {
						ICFBamTokenColObj obj = (ICFBamTokenColObj)referencedObj;
						form = javafxSchema.getTokenColFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXTokenColPaneCommon spec = (ICFBamJavaFXTokenColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a84a".equals( classCode ) ) {
						ICFBamUInt16DefObj obj = (ICFBamUInt16DefObj)referencedObj;
						form = javafxSchema.getUInt16DefFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXUInt16DefPaneCommon spec = (ICFBamJavaFXUInt16DefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a84b".equals( classCode ) ) {
						ICFBamUInt16TypeObj obj = (ICFBamUInt16TypeObj)referencedObj;
						form = javafxSchema.getUInt16TypeFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXUInt16TypePaneCommon spec = (ICFBamJavaFXUInt16TypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a86a".equals( classCode ) ) {
						ICFBamUInt16ColObj obj = (ICFBamUInt16ColObj)referencedObj;
						form = javafxSchema.getUInt16ColFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXUInt16ColPaneCommon spec = (ICFBamJavaFXUInt16ColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a84c".equals( classCode ) ) {
						ICFBamUInt32DefObj obj = (ICFBamUInt32DefObj)referencedObj;
						form = javafxSchema.getUInt32DefFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXUInt32DefPaneCommon spec = (ICFBamJavaFXUInt32DefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a84d".equals( classCode ) ) {
						ICFBamUInt32TypeObj obj = (ICFBamUInt32TypeObj)referencedObj;
						form = javafxSchema.getUInt32TypeFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXUInt32TypePaneCommon spec = (ICFBamJavaFXUInt32TypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a86b".equals( classCode ) ) {
						ICFBamUInt32ColObj obj = (ICFBamUInt32ColObj)referencedObj;
						form = javafxSchema.getUInt32ColFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXUInt32ColPaneCommon spec = (ICFBamJavaFXUInt32ColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a84e".equals( classCode ) ) {
						ICFBamUInt64DefObj obj = (ICFBamUInt64DefObj)referencedObj;
						form = javafxSchema.getUInt64DefFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXUInt64DefPaneCommon spec = (ICFBamJavaFXUInt64DefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a84f".equals( classCode ) ) {
						ICFBamUInt64TypeObj obj = (ICFBamUInt64TypeObj)referencedObj;
						form = javafxSchema.getUInt64TypeFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXUInt64TypePaneCommon spec = (ICFBamJavaFXUInt64TypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a86c".equals( classCode ) ) {
						ICFBamUInt64ColObj obj = (ICFBamUInt64ColObj)referencedObj;
						form = javafxSchema.getUInt64ColFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXUInt64ColPaneCommon spec = (ICFBamJavaFXUInt64ColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a850".equals( classCode ) ) {
						ICFBamUuidDefObj obj = (ICFBamUuidDefObj)referencedObj;
						form = javafxSchema.getUuidDefFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXUuidDefPaneCommon spec = (ICFBamJavaFXUuidDefPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a851".equals( classCode ) ) {
						ICFBamUuidTypeObj obj = (ICFBamUuidTypeObj)referencedObj;
						form = javafxSchema.getUuidTypeFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXUuidTypePaneCommon spec = (ICFBamJavaFXUuidTypePaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a86e".equals( classCode ) ) {
						ICFBamUuidGenObj obj = (ICFBamUuidGenObj)referencedObj;
						form = javafxSchema.getUuidGenFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXUuidGenPaneCommon spec = (ICFBamJavaFXUuidGenPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a86d".equals( classCode ) ) {
						ICFBamUuidColObj obj = (ICFBamUuidColObj)referencedObj;
						form = javafxSchema.getUuidColFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXUuidColPaneCommon spec = (ICFBamJavaFXUuidColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else if( "a840".equals( classCode ) ) {
						ICFBamTableColObj obj = (ICFBamTableColObj)referencedObj;
						form = javafxSchema.getTableColFactory().newAddForm( cfFormManager, obj, null, true );
						ICFBamJavaFXTableColPaneCommon spec = (ICFBamJavaFXTableColPaneCommon)form;
						spec.setJavaFXFocus( referencedObj );
						spec.setPaneMode( CFPane.PaneMode.View );
					}
					else {
						throw new CFLibUnsupportedClassException( getClass(),
							S_ProcName,
							"javaFXFocus",
							focus,
							"ICFBamValueObj, ICFBamAtomObj, ICFBamBlobDefObj, ICFBamBlobTypeObj, ICFBamBlobColObj, ICFBamBoolDefObj, ICFBamBoolTypeObj, ICFBamBoolColObj, ICFBamDateDefObj, ICFBamDateTypeObj, ICFBamDateColObj, ICFBamDoubleDefObj, ICFBamDoubleTypeObj, ICFBamDoubleColObj, ICFBamFloatDefObj, ICFBamFloatTypeObj, ICFBamFloatColObj, ICFBamInt16DefObj, ICFBamInt16TypeObj, ICFBamId16GenObj, ICFBamEnumDefObj, ICFBamEnumTypeObj, ICFBamInt16ColObj, ICFBamInt32DefObj, ICFBamInt32TypeObj, ICFBamId32GenObj, ICFBamInt32ColObj, ICFBamInt64DefObj, ICFBamInt64TypeObj, ICFBamId64GenObj, ICFBamInt64ColObj, ICFBamNmTokenDefObj, ICFBamNmTokenTypeObj, ICFBamNmTokenColObj, ICFBamNmTokensDefObj, ICFBamNmTokensTypeObj, ICFBamNmTokensColObj, ICFBamNumberDefObj, ICFBamNumberTypeObj, ICFBamNumberColObj, ICFBamStringDefObj, ICFBamStringTypeObj, ICFBamStringColObj, ICFBamTZDateDefObj, ICFBamTZDateTypeObj, ICFBamTZDateColObj, ICFBamTZTimeDefObj, ICFBamTZTimeTypeObj, ICFBamTZTimeColObj, ICFBamTZTimestampDefObj, ICFBamTZTimestampTypeObj, ICFBamTZTimestampColObj, ICFBamTextDefObj, ICFBamTextTypeObj, ICFBamTextColObj, ICFBamTimeDefObj, ICFBamTimeTypeObj, ICFBamTimeColObj, ICFBamTimestampDefObj, ICFBamTimestampTypeObj, ICFBamTimestampColObj, ICFBamTokenDefObj, ICFBamTokenTypeObj, ICFBamTokenColObj, ICFBamUInt16DefObj, ICFBamUInt16TypeObj, ICFBamUInt16ColObj, ICFBamUInt32DefObj, ICFBamUInt32TypeObj, ICFBamUInt32ColObj, ICFBamUInt64DefObj, ICFBamUInt64TypeObj, ICFBamUInt64ColObj, ICFBamUuidDefObj, ICFBamUuidTypeObj, ICFBamUuidGenObj, ICFBamUuidColObj, ICFBamTableColObj" );
					}
					cfFormManager.pushForm( form );
				}
			}
		}
	}

	protected class ColumnCFReferenceEditor
		extends CFReferenceEditor
	{
		public ColumnCFReferenceEditor() {
			super( new ColumnReferenceCallback() );
			setFieldName( "Column" );
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
			setMinValue( CFBamIndexColBuff.ID_MIN_VALUE );
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
			setMaxLen( 128 );
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
			setMaxLen( 1023 );
			setFieldName( "Description" );
		}
	}

	protected class IsAscendingCFLabel
		extends CFLabel
	{
		public IsAscendingCFLabel() {
			super();
			setText( "IsAscending" );
		}
	}

	protected class IsAscendingEditor
		extends CFBoolEditor
	{
		public IsAscendingEditor() {
			super();
			setIsNullable( false );
			setFieldName( "IsAscending" );
		}
	}

	protected ICFBamSchemaDefObj javafxLookupDefSchemaObj = null;
	protected DefSchemaCFLabel javafxLabelLookupDefSchema = null;
	protected DefSchemaCFReferenceEditor javafxReferenceLookupDefSchema = null;
	protected ICFBamValueObj javafxLookupColumnObj = null;
	protected ColumnCFLabel javafxLabelLookupColumn = null;
	protected ColumnCFReferenceEditor javafxReferenceLookupColumn = null;
	protected IdCFLabel javafxLabelId = null;
	protected IdEditor javafxEditorId = null;
	protected NameCFLabel javafxLabelName = null;
	protected NameEditor javafxEditorName = null;
	protected ShortNameCFLabel javafxLabelShortName = null;
	protected ShortNameEditor javafxEditorShortName = null;
	protected LabelCFLabel javafxLabelLabel = null;
	protected LabelEditor javafxEditorLabel = null;
	protected ShortDescriptionCFLabel javafxLabelShortDescription = null;
	protected ShortDescriptionEditor javafxEditorShortDescription = null;
	protected DescriptionCFLabel javafxLabelDescription = null;
	protected DescriptionEditor javafxEditorDescription = null;
	protected IsAscendingCFLabel javafxLabelIsAscending = null;
	protected IsAscendingEditor javafxEditorIsAscending = null;

	public CFBamJavaFXIndexColAttrPane( ICFFormManager formManager, ICFBamJavaFXSchema argSchema, ICFBamIndexColObj argFocus ) {
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
		setJavaFXFocusAsIndexCol( argFocus );
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

		label = getJavaFXLabelLookupColumn();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		reference = getJavaFXReferenceLookupColumn();
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

		label = getJavaFXLabelIsAscending();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorIsAscending();
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
		if( ( value == null ) || ( value instanceof ICFBamIndexColObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamIndexColObj" );
		}
		populateFields();
		adjustComponentEnableStates();
	}

	public ICFBamIndexColObj getJavaFXFocusAsIndexCol() {
		return( (ICFBamIndexColObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsIndexCol( ICFBamIndexColObj value ) {
		setJavaFXFocus( value );
	}

	public ICFBamIndexColObj getEffJavaFXFocus() {
		ICFBamIndexColObj eff = (ICFBamIndexColObj)getJavaFXFocus();
		if( eff != null ) {
			if( null != eff.getEdit() ) {
				eff = (ICFBamIndexColObj)eff.getEdit();
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

	public ICFBamValueObj getJavaFXLookupColumnObj() {
		return( javafxLookupColumnObj );
	}

	public void setJavaFXLookupColumnObj( ICFBamValueObj value ) {
		javafxLookupColumnObj = value;
	}

	public CFLabel getJavaFXLabelLookupColumn() {
		if( javafxLabelLookupColumn == null ) {
			javafxLabelLookupColumn = new ColumnCFLabel();
		}
		return( javafxLabelLookupColumn );
	}

	public CFReferenceEditor getJavaFXReferenceLookupColumn() {
		if( javafxReferenceLookupColumn == null ) {
			javafxReferenceLookupColumn = new ColumnCFReferenceEditor();
		}
		return( javafxReferenceLookupColumn );
	}

	public void setJavaFXReferenceLookupColumn( ColumnCFReferenceEditor value ) {
		javafxReferenceLookupColumn = value;
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

	public IsAscendingCFLabel getJavaFXLabelIsAscending() {
		if( javafxLabelIsAscending == null ) {
			javafxLabelIsAscending = new IsAscendingCFLabel();
		}
		return( javafxLabelIsAscending );
	}

	public void setJavaFXLabelIsAscending( IsAscendingCFLabel value ) {
		javafxLabelIsAscending = value;
	}

	public IsAscendingEditor getJavaFXEditorIsAscending() {
		if( javafxEditorIsAscending == null ) {
			javafxEditorIsAscending = new IsAscendingEditor();
		}
		return( javafxEditorIsAscending );
	}

	public void setJavaFXEditorIsAscending( IsAscendingEditor value ) {
		javafxEditorIsAscending = value;
	}

	public void populateFields()
	{
		ICFBamIndexColObj popObj = getEffJavaFXFocus();
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
			javafxLookupColumnObj = null;
		}
		else {
			javafxLookupColumnObj = (ICFBamValueObj)popObj.getRequiredLookupColumn( javafxIsInitializing );
		}
		if( javafxReferenceLookupColumn != null ) {
			javafxReferenceLookupColumn.setReferencedObject( javafxLookupColumnObj );
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
			getJavaFXEditorIsAscending().setBooleanValue( null );
		}
		else {
			getJavaFXEditorIsAscending().setBooleanValue( popObj.getRequiredIsAscending() );
		}
	}

	public void postFields()
	{
		final String S_ProcName = "postFields";
		ICFBamIndexColObj focus = getJavaFXFocusAsIndexCol();
		ICFBamIndexColEditObj editObj;
		if( focus != null ) {
			editObj = (ICFBamIndexColEditObj)(focus.getEdit());
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

		javafxLookupColumnObj = (ICFBamValueObj)( javafxReferenceLookupColumn.getReferencedObject() );
		editObj.setRequiredLookupColumn( javafxLookupColumnObj );

		if( getJavaFXEditorName().getStringValue() == null ) {
			editObj.setRequiredName( "" );
		}
		else {
			editObj.setRequiredName( getJavaFXEditorName().getStringValue() );
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

		editObj.setRequiredIsAscending( getJavaFXEditorIsAscending().getBooleanValue() );
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		final String S_ProcName = "setPaneMode";
		CFPane.PaneMode oldValue = getPaneMode();
		if( oldValue == value ) {
			return;
		}
		ICFBamIndexColObj focus = getJavaFXFocusAsIndexCol();
		if( ( value != CFPane.PaneMode.Unknown ) && ( value != CFPane.PaneMode.View ) ) {
			if( focus == null ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"javaFXFocus" );
			}
		}
		ICFBamIndexColEditObj editObj;
		if( focus != null ) {
			editObj  = (ICFBamIndexColEditObj)focus.getEdit();
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
								editObj = (ICFBamIndexColEditObj)focus.beginEdit();
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
							editObj = (ICFBamIndexColEditObj)focus.beginEdit();
							if( editObj == null ) {
								throw new CFLibUsageException( getClass(),
									S_ProcName,
									"Expected beginEdit() to return a new edition of the focus object" );
							}
						}
						break;
					case View:
						if( editObj == null ) {
							editObj = (ICFBamIndexColEditObj)focus.beginEdit();
							if( editObj == null ) {
								throw new CFLibUsageException( getClass(),
									S_ProcName,
									"Expected beginEdit() to return a new edition of the focus object" );
							}
						}
						break;
					case Edit:
						if( editObj == null ) {
							editObj = (ICFBamIndexColEditObj)focus.beginEdit();
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
						focus = (ICFBamIndexColObj)editObj.create();
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
								editObj = (ICFBamIndexColEditObj)focus.beginEdit();
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
								editObj = (ICFBamIndexColEditObj)focus.beginEdit();
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
							editObj = (ICFBamIndexColEditObj)focus.beginEdit();
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
			ICFBamIndexColObj focus = getJavaFXFocusAsIndexCol();
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
		if( javafxReferenceLookupColumn != null ) {
			javafxReferenceLookupColumn.setCustomDisable( ! isEditing );
		}
		if( javafxEditorId != null ) {
			javafxEditorId.setDisable( true );
		}
		if( javafxEditorName != null ) {
			javafxEditorName.setDisable( ! isEditing );
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
		if( javafxEditorIsAscending != null ) {
			javafxEditorIsAscending.setDisable( ! isEditing );
		}
	}
}
