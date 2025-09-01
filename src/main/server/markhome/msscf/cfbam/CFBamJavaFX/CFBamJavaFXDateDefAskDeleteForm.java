// Description: Java 11 JavaFX Ask Delete Pane implementation for DateDef.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBamJavaFX;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cflib.CFLib.JavaFX.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfbam.CFBam.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBamObj.*;

/**
 *	CFBamJavaFXDateDefAskDeleteForm JavaFX Ask Delete Pane implementation
 *	for DateDef.
 */
public class CFBamJavaFXDateDefAskDeleteForm
extends CFBorderPane
implements ICFBamJavaFXDateDefPaneCommon,
	ICFForm
{
	public static String S_FormName = "Ask Delete DateDef";
	protected ICFFormManager cfFormManager = null;
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected ICFDeleteCallback deleteCallback = null;
	protected CFTextArea textAreaMessage = null;
	protected CFHBox hboxButtons = null;
	protected CFButton buttonOk = null;
	protected CFButton buttonCancel = null;
	protected ScrollPane scrollPane = null;
	protected CFGridPane attrPane = null;

	public CFBamJavaFXDateDefAskDeleteForm( ICFFormManager formManager, ICFBamJavaFXSchema argSchema, ICFBamDateDefObj argFocus, ICFDeleteCallback callback ) {
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
		javaFXFocus = argFocus;
		deleteCallback = callback;
		// Construct the various objects
		textAreaMessage = new CFTextArea();
		textAreaMessage.setText( "Are you sure you want to delete this DateDef?" );
		hboxButtons = new CFHBox( 10 );
		buttonOk = new CFButton();
		buttonOk.setMinWidth( 200 );
		buttonOk.setText( "Ok" );
		buttonOk.setOnAction( new EventHandler<ActionEvent>() {
			@Override public void handle( ActionEvent e ) {
				final String S_ProcName = "actionOkPerformed";
				try {
					ICFBamDateDefObj obj = getJavaFXFocusAsDateDef();
					ICFBamDateDefEditObj editObj = (ICFBamDateDefEditObj)obj.beginEdit();
					editObj.deleteInstance();
					editObj = null;
					cfFormManager.closeCurrentForm();
					if( deleteCallback != null ) {
						deleteCallback.formClosed( null );
						deleteCallback.deleted( obj );
					}
				}
				catch( Throwable t ) {
					CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
				}
			}
		});
		buttonCancel = new CFButton();
		buttonCancel.setMinWidth( 200 );
		buttonCancel.setText( "Cancel" );
		buttonCancel.setOnAction( new EventHandler<ActionEvent>() {
			@Override public void handle( ActionEvent e ) {
				final String S_ProcName = "actionCancelPerformed";
				try {
					cfFormManager.closeCurrentForm();
					if( deleteCallback != null ) {
						deleteCallback.formClosed( null );
					}
				}
				catch( Throwable t ) {
					CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
				}
			}
		});
		hboxButtons.getChildren().addAll( buttonOk, buttonCancel );
		attrPane = argSchema.getDateDefFactory().newAttrPane( cfFormManager, argFocus );
		scrollPane = new ScrollPane();
		scrollPane.setFitToWidth( true );
		scrollPane.setHbarPolicy( ScrollBarPolicy.NEVER );
		scrollPane.setVbarPolicy( ScrollBarPolicy.AS_NEEDED );
		scrollPane.setContent( attrPane );
		setTop( textAreaMessage );
		setCenter( scrollPane );
		setBottom( hboxButtons );
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
		if( ( value == null ) || ( value instanceof ICFBamDateDefObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamDateDefObj" );
		}
	}

	public ICFBamDateDefObj getJavaFXFocusAsDateDef() {
		return( (ICFBamDateDefObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsDateDef( ICFBamDateDefObj value ) {
		javaFXFocus = value;
		if( attrPane != null ) {
			((ICFBamJavaFXDateDefPaneCommon)attrPane).setJavaFXFocus( value );
		}
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		final String S_ProcName = "setPaneMode";
		CFPane.PaneMode oldMode = getPaneMode();
		if( oldMode == value ) {
			return;
		}
		if( ( value != CFPane.PaneMode.Unknown )
		 && ( value != CFPane.PaneMode.View )
		 && ( value != CFPane.PaneMode.Delete ) )
		{
			throw new CFLibUsageException( getClass(),
				S_ProcName,
				"AskDeleteForms only support PaneMode Unknown, View or Delete" );
		}
		super.setPaneMode( value );
		if( attrPane != null ) {
			((ICFBamJavaFXDateDefPaneCommon)attrPane).setPaneMode( value );
		}
	}

	public void forceCancelAndClose() {
		ICFBamDateDefObj focus = getJavaFXFocusAsDateDef();
		if( cfFormManager != null ) {
			if( cfFormManager.getCurrentForm() == this ) {
				cfFormManager.closeCurrentForm();
			}
		}
		if( deleteCallback != null ) {
			deleteCallback.formClosed( null );
		}
	}
}
