// Description: Java 11 JavaFX Element TabPane implementation for ServerObjFunc.

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
import java.util.List;
import javafx.scene.Parent;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cflib.CFLib.JavaFX.*;
import org.apache.commons.codec.binary.Base64;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfbam.CFBam.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBamObj.*;

/**
 *	CFBamJavaFXServerObjFuncEltTabPane JavaFX Element TabPane implementation
 *	for ServerObjFunc.
 */
public class CFBamJavaFXServerObjFuncEltTabPane
extends CFTabPane
implements ICFBamJavaFXServerObjFuncPaneCommon
{
	protected ICFFormManager cfFormManager = null;
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected boolean javafxIsInitializing = true;
	public final String LABEL_TabComponentsParamsList = "Optional Components Parameters";
	protected CFTab tabComponentsParams = null;
	protected CFBorderPane tabViewComponentsParamsListPane = null;

	public CFBamJavaFXServerObjFuncEltTabPane( ICFFormManager formManager, ICFBamJavaFXSchema argSchema, ICFBamServerObjFuncObj argFocus ) {
		super();
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
		setJavaFXFocusAsServerObjFunc( argFocus );
		// Wire the newly constructed Panes/Tabs to this TabPane
		tabComponentsParams = new CFTab();
		tabComponentsParams.setText( LABEL_TabComponentsParamsList );
		tabComponentsParams.setContent( getTabViewComponentsParamsListPane() );
		getTabs().add( tabComponentsParams );
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
		if( ( value == null ) || ( value instanceof ICFBamServerObjFuncObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamServerObjFuncObj" );
		}
	}

	public void setJavaFXFocusAsServerObjFunc( ICFBamServerObjFuncObj value ) {
		setJavaFXFocus( value );
	}

	public ICFBamServerObjFuncObj getJavaFXFocusAsServerObjFunc() {
		return( (ICFBamServerObjFuncObj)getJavaFXFocus() );
	}

	protected class RefreshComponentsParamsList
	implements ICFRefreshCallback
	{
		public RefreshComponentsParamsList() {
		}

		public void refreshMe() {
			Collection<ICFBamParamObj> dataCollection;
			ICFBamServerObjFuncObj focus = (ICFBamServerObjFuncObj)getJavaFXFocusAsServerObjFunc();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsParams( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsParamsListPane();
			ICFBamJavaFXParamPaneList jpList = (ICFBamJavaFXParamPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsParamsListPane() {
		if( tabViewComponentsParamsListPane == null ) {
			ICFBamServerObjFuncObj focus = (ICFBamServerObjFuncObj)getJavaFXFocusAsServerObjFunc();
			Collection<ICFBamParamObj> dataCollection;
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsParams( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			ICFBamServerMethodObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof ICFBamServerMethodObj ) ) {
				javafxContainer = (ICFBamServerMethodObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewComponentsParamsListPane = javafxSchema.getParamFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsParamsList(), true );
		}
		return( tabViewComponentsParamsListPane );
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		CFPane.PaneMode oldMode = getPaneMode();
		super.setPaneMode( value );
		if( tabViewComponentsParamsListPane != null ) {
			((ICFBamJavaFXParamPaneCommon)tabViewComponentsParamsListPane).setPaneMode( value );
		}
	}
}
