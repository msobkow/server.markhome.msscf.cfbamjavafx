// Description: Java 11 JavaFX Add Form implementation for PopSubDep1.

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
 *	CFBamJavaFXPopSubDep1AddForm JavaFX Add Form implementation
 *	for PopSubDep1.
 */
public class CFBamJavaFXPopSubDep1AddForm
extends CFBorderPane
implements ICFBamJavaFXPopSubDep1PaneCommon,
	ICFForm
{
	public static String S_FormName = "Add PopSubDep1";
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

	public CFBamJavaFXPopSubDep1AddForm( ICFFormManager formManager, ICFBamJavaFXSchema argSchema, ICFBamPopSubDep1Obj argFocus, ICFFormClosedCallback closeCallback, boolean argAllowSave ) {
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
			argFocus = (ICFBamPopSubDep1Obj)argFocus.read( true );
			javaFXFocus = argFocus;
		}
		javafxAddPane = argSchema.getPopSubDep1Factory().newAddPane( cfFormManager, argFocus );

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
		ICFBamPopSubDep1Obj focus = getJavaFXFocusAsPopSubDep1();
		if( focus != null ) {
			ICFBamPopSubDep1EditObj editObj = (ICFBamPopSubDep1EditObj)focus.getEdit();
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
		if( ( value == null ) || ( value instanceof ICFBamPopSubDep1Obj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamPopSubDep1Obj" );
		}
		((ICFBamJavaFXPopSubDep1PaneCommon)javafxAddPane).setJavaFXFocus( value );
		ICFBamPopSubDep1Obj argFocus = (ICFBamPopSubDep1Obj)value;
		if( ( argFocus != null ) && ( ! argFocus.getIsNew() ) ) {
			argFocus = (ICFBamPopSubDep1Obj)argFocus.read( true );
			super.setJavaFXFocus( argFocus );
		}
	}

	public ICFBamPopSubDep1Obj getJavaFXFocusAsPopSubDep1() {
		return( (ICFBamPopSubDep1Obj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsPopSubDep1( ICFBamPopSubDep1Obj value ) {
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
						ICFBamPopSubDep1Obj focus = getJavaFXFocusAsPopSubDep1();
						if( focus != null ) {
							ICFBamPopSubDep1EditObj editObj = (ICFBamPopSubDep1EditObj)( focus.getEdit() );
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
						focus = getJavaFXFocusAsPopSubDep1();
						CFBorderPane frame = javafxSchema.getPopSubDep1Factory().newViewEditForm( cfFormManager, focus, formClosedCallback, true );
						((ICFBamJavaFXPopSubDep1PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
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
						ICFBamPopSubDep1Obj focus = getJavaFXFocusAsPopSubDep1();
						if( focus != null ) {
							ICFBamPopSubDep1EditObj editObj = (ICFBamPopSubDep1EditObj)( focus.getEdit() );
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
						focus = getJavaFXFocusAsPopSubDep1();
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
						ICFBamPopSubDep1Obj focus = getJavaFXFocusAsPopSubDep1();
						if( focus != null ) {
							ICFBamPopSubDep1EditObj editObj = (ICFBamPopSubDep1EditObj)focus.getEdit();
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
			((ICFBamJavaFXPopSubDep1PaneCommon)javafxAddPane).setPaneMode( value );
		}
		catch( Throwable t ) {
			super.setPaneMode( oldMode );
			((ICFBamJavaFXPopSubDep1PaneCommon)javafxAddPane).setPaneMode( oldMode );
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
