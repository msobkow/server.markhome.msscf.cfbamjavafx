// Description: Java 11 JavaFX Element TabPane implementation for PopSubDep2.

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
 *	CFBamJavaFXPopSubDep2EltTabPane JavaFX Element TabPane implementation
 *	for PopSubDep2.
 */
public class CFBamJavaFXPopSubDep2EltTabPane
extends CFTabPane
implements ICFBamJavaFXPopSubDep2PaneCommon
{
	protected ICFFormManager cfFormManager = null;
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected boolean javafxIsInitializing = true;
	public final String LABEL_TabComponentsPopDepList = "Optional Components Population Dependency";
	protected CFTab tabComponentsPopDep = null;
	protected CFBorderPane tabViewComponentsPopDepListPane = null;

	public CFBamJavaFXPopSubDep2EltTabPane( ICFFormManager formManager, ICFBamJavaFXSchema argSchema, ICFBamPopSubDep2Obj argFocus ) {
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
		setJavaFXFocusAsPopSubDep2( argFocus );
		// Wire the newly constructed Panes/Tabs to this TabPane
		tabComponentsPopDep = new CFTab();
		tabComponentsPopDep.setText( LABEL_TabComponentsPopDepList );
		tabComponentsPopDep.setContent( getTabViewComponentsPopDepListPane() );
		getTabs().add( tabComponentsPopDep );
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
		if( ( value == null ) || ( value instanceof ICFBamPopSubDep2Obj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamPopSubDep2Obj" );
		}
	}

	public void setJavaFXFocusAsPopSubDep2( ICFBamPopSubDep2Obj value ) {
		setJavaFXFocus( value );
	}

	public ICFBamPopSubDep2Obj getJavaFXFocusAsPopSubDep2() {
		return( (ICFBamPopSubDep2Obj)getJavaFXFocus() );
	}

	protected class RefreshComponentsPopDepList
	implements ICFRefreshCallback
	{
		public RefreshComponentsPopDepList() {
		}

		public void refreshMe() {
			Collection<ICFBamPopSubDep3Obj> dataCollection;
			ICFBamPopSubDep2Obj focus = (ICFBamPopSubDep2Obj)getJavaFXFocusAsPopSubDep2();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsPopDep( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsPopDepListPane();
			ICFBamJavaFXPopSubDep3PaneList jpList = (ICFBamJavaFXPopSubDep3PaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsPopDepListPane() {
		if( tabViewComponentsPopDepListPane == null ) {
			ICFBamPopSubDep2Obj focus = (ICFBamPopSubDep2Obj)getJavaFXFocusAsPopSubDep2();
			Collection<ICFBamPopSubDep3Obj> dataCollection;
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsPopDep( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			ICFBamPopSubDep2Obj javafxContainer;
			if( ( focus != null ) && ( focus instanceof ICFBamPopSubDep2Obj ) ) {
				javafxContainer = (ICFBamPopSubDep2Obj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewComponentsPopDepListPane = javafxSchema.getPopSubDep3Factory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsPopDepList(), false );
		}
		return( tabViewComponentsPopDepListPane );
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		CFPane.PaneMode oldMode = getPaneMode();
		super.setPaneMode( value );
		if( tabViewComponentsPopDepListPane != null ) {
			((ICFBamJavaFXPopSubDep3PaneCommon)tabViewComponentsPopDepListPane).setPaneMode( value );
		}
	}
}
