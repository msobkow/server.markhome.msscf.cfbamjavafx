// Description: Java 11 JavaFX Element TabPane implementation for ClearSubDep2.

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
 *	CFBamJavaFXClearSubDep2EltTabPane JavaFX Element TabPane implementation
 *	for ClearSubDep2.
 */
public class CFBamJavaFXClearSubDep2EltTabPane
extends CFTabPane
implements ICFBamJavaFXClearSubDep2PaneCommon
{
	protected ICFFormManager cfFormManager = null;
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected boolean javafxIsInitializing = true;
	public final String LABEL_TabComponentsClearDepList = "Optional Components Clear Dependency";
	protected CFTab tabComponentsClearDep = null;
	protected CFBorderPane tabViewComponentsClearDepListPane = null;

	public CFBamJavaFXClearSubDep2EltTabPane( ICFFormManager formManager, ICFBamJavaFXSchema argSchema, ICFBamClearSubDep2Obj argFocus ) {
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
		setJavaFXFocusAsClearSubDep2( argFocus );
		// Wire the newly constructed Panes/Tabs to this TabPane
		tabComponentsClearDep = new CFTab();
		tabComponentsClearDep.setText( LABEL_TabComponentsClearDepList );
		tabComponentsClearDep.setContent( getTabViewComponentsClearDepListPane() );
		getTabs().add( tabComponentsClearDep );
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
		if( ( value == null ) || ( value instanceof ICFBamClearSubDep2Obj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamClearSubDep2Obj" );
		}
	}

	public void setJavaFXFocusAsClearSubDep2( ICFBamClearSubDep2Obj value ) {
		setJavaFXFocus( value );
	}

	public ICFBamClearSubDep2Obj getJavaFXFocusAsClearSubDep2() {
		return( (ICFBamClearSubDep2Obj)getJavaFXFocus() );
	}

	protected class RefreshComponentsClearDepList
	implements ICFRefreshCallback
	{
		public RefreshComponentsClearDepList() {
		}

		public void refreshMe() {
			Collection<ICFBamClearSubDep3Obj> dataCollection;
			ICFBamClearSubDep2Obj focus = (ICFBamClearSubDep2Obj)getJavaFXFocusAsClearSubDep2();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsClearDep( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsClearDepListPane();
			ICFBamJavaFXClearSubDep3PaneList jpList = (ICFBamJavaFXClearSubDep3PaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsClearDepListPane() {
		if( tabViewComponentsClearDepListPane == null ) {
			ICFBamClearSubDep2Obj focus = (ICFBamClearSubDep2Obj)getJavaFXFocusAsClearSubDep2();
			Collection<ICFBamClearSubDep3Obj> dataCollection;
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsClearDep( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			ICFBamClearSubDep2Obj javafxContainer;
			if( ( focus != null ) && ( focus instanceof ICFBamClearSubDep2Obj ) ) {
				javafxContainer = (ICFBamClearSubDep2Obj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewComponentsClearDepListPane = javafxSchema.getClearSubDep3Factory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsClearDepList(), false );
		}
		return( tabViewComponentsClearDepListPane );
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		CFPane.PaneMode oldMode = getPaneMode();
		super.setPaneMode( value );
		if( tabViewComponentsClearDepListPane != null ) {
			((ICFBamJavaFXClearSubDep3PaneCommon)tabViewComponentsClearDepListPane).setPaneMode( value );
		}
	}
}
