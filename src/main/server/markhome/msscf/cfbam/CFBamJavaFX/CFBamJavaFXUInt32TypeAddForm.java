// Description: Java 11 JavaFX Add Form implementation for UInt32Type.

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
 *	CFBamJavaFXUInt32TypeAddForm JavaFX Add Form implementation
 *	for UInt32Type.
 */
public class CFBamJavaFXUInt32TypeAddForm
extends CFBorderPane
implements ICFBamJavaFXUInt32TypePaneCommon,
	ICFForm
{
	public static String S_FormName = "Add UInt32Type";
	protected ICFFormManager cfFormManager = null;
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected ICFFormClosedCallback formClosedCallback = null;
	protected boolean allowSave = true;
	protected CFSplitPane javafxAddPane = null;
	protected CFButton buttonSave = null;
	protected CFButton buttonCancel = null;
	protected CFButton buttonClose = null;
	protected ScrollPane scrollMenu = null;
	protected CFHBox hboxMenu = null;

	public CFBamJavaFXUInt32TypeAddForm( ICFFormManager formManager, ICFBamJavaFXSchema argSchema, ICFBamUInt32TypeObj argFocus, ICFFormClosedCallback closeCallback, boolean argAllowSave ) {
		super();
		final String S_ProcName = "construct-schema-focus";
		allowSave = argAllowSave;
		if( formManager == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"formManager" );
		}
		cfFormManager = formManager;
		formClosedCallback = closeCallback;
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
		if( ( argFocus != null ) && ( ! argFocus.getIsNew() ) ) {
			argFocus = (ICFBamUInt32TypeObj)argFocus.read( true );
			javaFXFocus = argFocus;
		}
		javafxAddPane = argSchema.getUInt32TypeFactory().newAddPane( cfFormManager, argFocus );

		scrollMenu = new ScrollPane();
		scrollMenu.setVbarPolicy( ScrollBarPolicy.NEVER );
		scrollMenu.setHbarPolicy( ScrollBarPolicy.AS_NEEDED );
		scrollMenu.setFitToHeight( true );
		scrollMenu.setContent( getHBoxMenu() );

		setTop( scrollMenu );
		setCenter( javafxAddPane );
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

	public void forceCancelAndClose() {
		ICFBamUInt32TypeObj focus = getJavaFXFocusAsUInt32Type();
		if( focus != null ) {
			ICFBamUInt32TypeEditObj editObj = (ICFBamUInt32TypeEditObj)focus.getEdit();
			if( editObj != null ) {
				if( editObj.getIsNew() ) {
					editObj.endEdit();
					editObj = null;
					setJavaFXFocus( null );
					setPaneMode( CFPane.PaneMode.Unknown );
				}
				else {
					editObj.endEdit();
					editObj = null;
					setPaneMode( CFPane.PaneMode.View );
				}
			}
		}
		if( cfFormManager != null ) {
			if( cfFormManager.getCurrentForm() == this ) {
				cfFormManager.closeCurrentForm();
			}
		}
		if( formClosedCallback != null ) {
			formClosedCallback.formClosed( null );
		}
	}

	public ICFBamJavaFXSchema getJavaFXSchema() {
		return( javafxSchema );
	}

	public ICFLibAnyObj getJavaFXFocus() {
		ICFLibAnyObj obj;
		if( javafxAddPane != null ) {
			obj = javafxAddPane.getJavaFXFocus();
		}
		else {
			obj = null;
		}
		return( obj );
	}

	public void setJavaFXFocus( ICFLibAnyObj value ) {
		final String S_ProcName = "setJavaFXFocus";
		if( ( value == null ) || ( value instanceof ICFBamUInt32TypeObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamUInt32TypeObj" );
		}
		((ICFBamJavaFXUInt32TypePaneCommon)javafxAddPane).setJavaFXFocus( value );
		ICFBamUInt32TypeObj argFocus = (ICFBamUInt32TypeObj)value;
		if( ( argFocus != null ) && ( ! argFocus.getIsNew() ) ) {
			argFocus = (ICFBamUInt32TypeObj)argFocus.read( true );
			super.setJavaFXFocus( argFocus );
		}
	}

	public ICFBamUInt32TypeObj getJavaFXFocusAsUInt32Type() {
		return( (ICFBamUInt32TypeObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsUInt32Type( ICFBamUInt32TypeObj value ) {
		setJavaFXFocus( value );
	}

	public CFHBox getHBoxMenu() {
		if( hboxMenu == null ) {
			hboxMenu = new CFHBox( 10 );
			buttonSave = new CFButton();
			buttonSave.setMinWidth( 200 );
			buttonSave.setText( "Save" );
			buttonSave.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						ICFBamUInt32TypeObj focus = getJavaFXFocusAsUInt32Type();
						if( focus != null ) {
							ICFBamUInt32TypeEditObj editObj = (ICFBamUInt32TypeEditObj)( focus.getEdit() );
							if( editObj != null ) {
								setPaneMode( CFPane.PaneMode.Update );
							}
							else {
								throw new CFLibUsageException( getClass(),
									S_ProcName,
									"Cannot save an object that isn't being edited" );
							}
						}
						// If an object was added, the focus will change to the persisted instance
						focus = getJavaFXFocusAsUInt32Type();
						CFBorderPane frame = javafxSchema.getUInt32TypeFactory().newViewEditForm( cfFormManager, focus, formClosedCallback, true );
						((ICFBamJavaFXUInt32TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
						cfFormManager.closeCurrentForm();
						cfFormManager.pushForm( frame );
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			if( allowSave ) {
				hboxMenu.getChildren().add( buttonSave );
			}

			buttonClose = new CFButton();
			buttonClose.setMinWidth( 200 );
			buttonClose.setText( "Close" );
			buttonClose.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						ICFBamUInt32TypeObj focus = getJavaFXFocusAsUInt32Type();
						if( focus != null ) {
							ICFBamUInt32TypeEditObj editObj = (ICFBamUInt32TypeEditObj)( focus.getEdit() );
							if( editObj != null ) {
								setPaneMode( CFPane.PaneMode.Update );
							}
							else {
								throw new CFLibUsageException( getClass(),
									S_ProcName,
									"Cannot save an object that isn't being edited" );
							}
						}
						// If an object was added, the focus will change to the persisted instance
						focus = getJavaFXFocusAsUInt32Type();
						cfFormManager.closeCurrentForm();
						if( formClosedCallback != null ) {
							formClosedCallback.formClosed( focus );
						}
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonClose );

			buttonCancel = new CFButton();
			buttonCancel.setMinWidth( 200 );
			buttonCancel.setText( "Cancel" );
			buttonCancel.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						ICFBamUInt32TypeObj focus = getJavaFXFocusAsUInt32Type();
						if( focus != null ) {
							ICFBamUInt32TypeEditObj editObj = (ICFBamUInt32TypeEditObj)focus.getEdit();
							if( editObj != null ) {
								if( editObj.getIsNew() ) {
									editObj.endEdit();
									editObj = null;
									setJavaFXFocus( null );
									setPaneMode( CFPane.PaneMode.Unknown );
								}
								else {
									editObj.endEdit();
									editObj = null;
									setPaneMode( CFPane.PaneMode.View );
								}
							}
						}
						cfFormManager.closeCurrentForm();
						if( formClosedCallback != null ) {
							formClosedCallback.formClosed( null );
						}
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonCancel );

		}
		return( hboxMenu );
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		CFPane.PaneMode oldMode = getPaneMode();
		if( oldMode == value ) {
			return;
		}
		try {
			super.setPaneMode( value );
			((ICFBamJavaFXUInt32TypePaneCommon)javafxAddPane).setPaneMode( value );
		}
		catch( Throwable t ) {
			super.setPaneMode( oldMode );
			((ICFBamJavaFXUInt32TypePaneCommon)javafxAddPane).setPaneMode( oldMode );
			throw t;
		}
		if( value == CFPane.PaneMode.View ) {
			if( buttonSave != null ) {
				buttonSave.setDisable( true );
			}
			if( buttonCancel != null ) {
				buttonCancel.setDisable( false );
			}
			if( buttonClose != null ) {
				buttonClose.setDisable( true );
			}
		}
		else if( value == CFPane.PaneMode.Edit ) {
			if( buttonSave != null ) {
				buttonSave.setDisable( false );
			}
			if( buttonCancel != null ) {
				buttonCancel.setDisable( false );
			}
			if( buttonClose != null ) {
				buttonClose.setDisable( false );
			}
		}
		else if( value == CFPane.PaneMode.Add ) {
			if( buttonSave != null ) {
				buttonSave.setDisable( false );
			}
			if( buttonCancel != null ) {
				buttonCancel.setDisable( false );
			}
			if( buttonClose != null ) {
				buttonClose.setDisable( false );
			}
		}
		else {
			if( buttonSave != null ) {
				buttonSave.setDisable( true );
			}
			if( buttonCancel != null ) {
				buttonCancel.setDisable( false );
			}
			if( buttonClose != null ) {
				buttonClose.setDisable( true );
			}
		}
	}
}
