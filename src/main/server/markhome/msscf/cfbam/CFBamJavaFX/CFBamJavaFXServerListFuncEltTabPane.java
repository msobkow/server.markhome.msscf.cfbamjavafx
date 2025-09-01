// Description: Java 11 JavaFX Element TabPane implementation for ServerListFunc.

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
 *	CFBamJavaFXServerListFuncEltTabPane JavaFX Element TabPane implementation
 *	for ServerListFunc.
 */
public class CFBamJavaFXServerListFuncEltTabPane
extends CFTabPane
implements ICFBamJavaFXServerListFuncPaneCommon
{
	protected ICFFormManager cfFormManager = null;
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected boolean javafxIsInitializing = true;
	public final String LABEL_TabComponentsParamsList = "Optional Components Parameters";
	protected CFTab tabComponentsParams = null;
	protected CFBorderPane tabViewComponentsParamsListPane = null;

	public CFBamJavaFXServerListFuncEltTabPane( ICFFormManager formManager, ICFBamJavaFXSchema argSchema, ICFBamServerListFuncObj argFocus ) {
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
		setJavaFXFocusAsServerListFunc( argFocus );
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
		if( ( value == null ) || ( value instanceof ICFBamServerListFuncObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamServerListFuncObj" );
		}
	}

	public void setJavaFXFocusAsServerListFunc( ICFBamServerListFuncObj value ) {
		setJavaFXFocus( value );
	}

	public ICFBamServerListFuncObj getJavaFXFocusAsServerListFunc() {
		return( (ICFBamServerListFuncObj)getJavaFXFocus() );
	}

	protected class RefreshComponentsParamsList
	implements ICFRefreshCallback
	{
		public RefreshComponentsParamsList() {
		}

		public void refreshMe() {
			Collection<ICFBamParamObj> dataCollection;
			ICFBamServerListFuncObj focus = (ICFBamServerListFuncObj)getJavaFXFocusAsServerListFunc();
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
			ICFBamServerListFuncObj focus = (ICFBamServerListFuncObj)getJavaFXFocusAsServerListFunc();
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
