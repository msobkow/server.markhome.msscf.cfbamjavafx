// Description: Java 11 JavaFX View/Edit Form implementation for Int16Col.

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
 *	CFBamJavaFXInt16ColViewEditForm JavaFX View/Edit Form implementation
 *	for Int16Col.
 */
public class CFBamJavaFXInt16ColViewEditForm
extends CFBorderPane
implements ICFBamJavaFXInt16ColPaneCommon,
	ICFForm
{
	public static String S_FormName = "View/Edit Int16Col";
	protected ICFFormManager cfFormManager = null;
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected ICFFormClosedCallback formClosedCallback = null;
	protected boolean dataChanged = false;
	protected CFSplitPane javafxViewEditPane = null;
	protected CFButton buttonEdit = null;
	protected CFButton buttonSave = null;
	protected CFButton buttonClose = null;
	protected CFButton buttonCancel = null;
	protected ScrollPane scrollMenu = null;
	protected CFHBox hboxMenu = null;

	public CFBamJavaFXInt16ColViewEditForm( ICFFormManager formManager, ICFBamJavaFXSchema argSchema, ICFBamInt16ColObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		super();
		final String S_ProcName = "construct-schema-focus";
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
			argFocus = (ICFBamInt16ColObj)argFocus.read( true );
			javaFXFocus = argFocus;
		}
		javafxViewEditPane = argSchema.getInt16ColFactory().newViewEditPane( cfFormManager, argFocus );

		if( cameFromAdd ) {
			dataChanged = true;
		}

		scrollMenu = new ScrollPane();
		scrollMenu.setVbarPolicy( ScrollBarPolicy.NEVER );
		scrollMenu.setHbarPolicy( ScrollBarPolicy.AS_NEEDED );
		scrollMenu.setFitToHeight( true );
		scrollMenu.setContent( getHBoxMenu() );

		setTop( scrollMenu );
		setCenter( javafxViewEditPane );
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
		ICFBamInt16ColObj focus = getJavaFXFocusAsInt16Col();
		if( focus != null ) {
			ICFBamInt16ColEditObj editObj = (ICFBamInt16ColEditObj)focus.getEdit();
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

	public void setJavaFXFocus( ICFLibAnyObj value ) {
		final String S_ProcName = "setJavaFXFocus";
		if( ( value == null ) || ( value instanceof ICFBamInt16ColObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamInt16ColObj" );
		}
		((ICFBamJavaFXInt16ColPaneCommon)javafxViewEditPane).setJavaFXFocus( value );
		ICFBamInt16ColObj argFocus = (ICFBamInt16ColObj)value;
		if( ( argFocus != null ) && ( ! argFocus.getIsNew() ) ) {
			argFocus = (ICFBamInt16ColObj)argFocus.read( true );
			super.setJavaFXFocus( argFocus );
		}
	}

	public ICFBamInt16ColObj getJavaFXFocusAsInt16Col() {
		return( (ICFBamInt16ColObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsInt16Col( ICFBamInt16ColObj value ) {
		setJavaFXFocus( value );
	}

	public CFHBox getHBoxMenu() {
		if( hboxMenu == null ) {
			hboxMenu = new CFHBox( 10 );
			buttonEdit = new CFButton();
			buttonEdit.setMinWidth( 200 );
			buttonEdit.setText( "Edit" );
			buttonEdit.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						if( getJavaFXFocusAsInt16Col() != null ) {
							if( null == getJavaFXFocusAsInt16Col().getEdit() ) {
								setPaneMode( CFPane.PaneMode.Edit );
							}
							else {
								throw new CFLibUsageException( getClass(),
									S_ProcName,
									"Cannot begin an edit of an object already edited by another window instance" );
							}
						}
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
					adjustButtons();
				}
			});
			hboxMenu.getChildren().add( buttonEdit );

			buttonSave = new CFButton();
			buttonSave.setMinWidth( 200 );
			buttonSave.setText( "Save" );
			buttonSave.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						ICFBamInt16ColObj focus = getJavaFXFocusAsInt16Col();
						if( focus != null ) {
							ICFBamInt16ColEditObj editObj = (ICFBamInt16ColEditObj)( focus.getEdit() );
							if( editObj == null ) {
								throw new CFLibNullArgumentException( getClass(),
									S_ProcName,
									0,
									"editObj" );
							}

							CFPane.PaneMode oldMode = getPaneMode();
							try {
								setPaneMode( CFPane.PaneMode.Update );
								setPaneMode( CFPane.PaneMode.View );
							}
							catch( Throwable t ) {
								setPaneMode( oldMode );
								throw t;
							}
						}
						else {
							throw new CFLibNullArgumentException( getClass(),
								S_ProcName,
								0,
								"focus" );
						}
						dataChanged = true;
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
					adjustButtons();
				}
			});
			hboxMenu.getChildren().add( buttonSave );

			buttonClose = new CFButton();
			buttonClose.setMinWidth( 200 );
			buttonClose.setText( "Close" );
			buttonClose.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						ICFBamInt16ColObj focus = getJavaFXFocusAsInt16Col();
						if( focus != null ) {
							ICFBamInt16ColEditObj editObj = (ICFBamInt16ColEditObj)( focus.getEdit() );
							if( editObj == null ) {
								throw new CFLibNullArgumentException( getClass(),
									S_ProcName,
									0,
									"editObj" );
							}

							CFPane.PaneMode oldMode = getPaneMode();
							try {
								setPaneMode( CFPane.PaneMode.Update );
							}
							catch( Throwable t ) {
								setPaneMode( oldMode );
								throw t;
							}
							dataChanged = true;
						}
						else {
							throw new CFLibNullArgumentException( getClass(),
								S_ProcName,
								0,
								"focus" );
						}
						cfFormManager.closeCurrentForm();
						if( formClosedCallback != null ) {
							focus = getJavaFXFocusAsInt16Col();
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
						ICFBamInt16ColObj focus = getJavaFXFocusAsInt16Col();
						if( focus != null ) {
							ICFBamInt16ColEditObj editObj = (ICFBamInt16ColEditObj)focus.getEdit();
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
							if( dataChanged ) {
								focus = getJavaFXFocusAsInt16Col();
							}
							else {
								focus = null;
							}
							formClosedCallback.formClosed( focus );
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
			((ICFBamJavaFXInt16ColPaneCommon)javafxViewEditPane).setPaneMode( value );
		}
		catch( Throwable t ) {
			super.setPaneMode( oldMode );
			((ICFBamJavaFXInt16ColPaneCommon)javafxViewEditPane).setPaneMode( oldMode );
			throw t;
		}
		adjustButtons();
	}

	public void adjustButtons() {
		CFPane.PaneMode value = getPaneMode();
		if( value == CFPane.PaneMode.View ) {
			if( buttonEdit != null ) {
				buttonEdit.setDisable( false );
			}
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
			if( buttonEdit != null ) {
				buttonEdit.setDisable( true );
			}
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
			if( buttonEdit != null ) {
				buttonEdit.setDisable( true );
			}
			if( buttonSave != null ) {
				buttonSave.setDisable( false );
			}
			if( buttonClose != null ) {
				buttonClose.setDisable( false );
			}
			if( buttonCancel != null ) {
				buttonCancel.setDisable( false );
			}
		}
		else {
			if( buttonEdit != null ) {
				buttonEdit.setDisable( true );
			}
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
