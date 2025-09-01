// Description: Java 11 JavaFX Element TabPane implementation for PopTopDep.

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
 *	CFBamJavaFXPopTopDepEltTabPane JavaFX Element TabPane implementation
 *	for PopTopDep.
 */
public class CFBamJavaFXPopTopDepEltTabPane
extends CFTabPane
implements ICFBamJavaFXPopTopDepPaneCommon
{
	protected ICFFormManager cfFormManager = null;
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected boolean javafxIsInitializing = true;
	public final String LABEL_TabComponentsPopDepList = "Optional Components Population Dependency";
	protected CFTab tabComponentsPopDep = null;
	protected CFBorderPane tabViewComponentsPopDepListPane = null;

	public CFBamJavaFXPopTopDepEltTabPane( ICFFormManager formManager, ICFBamJavaFXSchema argSchema, ICFBamPopTopDepObj argFocus ) {
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
		setJavaFXFocusAsPopTopDep( argFocus );
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
		if( ( value == null ) || ( value instanceof ICFBamPopTopDepObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamPopTopDepObj" );
		}
	}

	public void setJavaFXFocusAsPopTopDep( ICFBamPopTopDepObj value ) {
		setJavaFXFocus( value );
	}

	public ICFBamPopTopDepObj getJavaFXFocusAsPopTopDep() {
		return( (ICFBamPopTopDepObj)getJavaFXFocus() );
	}

	protected class RefreshComponentsPopDepList
	implements ICFRefreshCallback
	{
		public RefreshComponentsPopDepList() {
		}

		public void refreshMe() {
			Collection<ICFBamPopSubDep1Obj> dataCollection;
			ICFBamPopTopDepObj focus = (ICFBamPopTopDepObj)getJavaFXFocusAsPopTopDep();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsPopDep( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsPopDepListPane();
			ICFBamJavaFXPopSubDep1PaneList jpList = (ICFBamJavaFXPopSubDep1PaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsPopDepListPane() {
		if( tabViewComponentsPopDepListPane == null ) {
			ICFBamPopTopDepObj focus = (ICFBamPopTopDepObj)getJavaFXFocusAsPopTopDep();
			Collection<ICFBamPopSubDep1Obj> dataCollection;
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsPopDep( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			ICFBamPopTopDepObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof ICFBamPopTopDepObj ) ) {
				javafxContainer = (ICFBamPopTopDepObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewComponentsPopDepListPane = javafxSchema.getPopSubDep1Factory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsPopDepList(), false );
		}
		return( tabViewComponentsPopDepListPane );
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		CFPane.PaneMode oldMode = getPaneMode();
		super.setPaneMode( value );
		if( tabViewComponentsPopDepListPane != null ) {
			((ICFBamJavaFXPopSubDep1PaneCommon)tabViewComponentsPopDepListPane).setPaneMode( value );
		}
	}
}
