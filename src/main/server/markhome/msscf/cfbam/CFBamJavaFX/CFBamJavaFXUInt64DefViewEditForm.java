// Description: Java 11 JavaFX View/Edit Form implementation for UInt64Def.

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
 *	CFBamJavaFXUInt64DefViewEditForm JavaFX View/Edit Form implementation
 *	for UInt64Def.
 */
public class CFBamJavaFXUInt64DefViewEditForm
extends CFBorderPane
implements ICFBamJavaFXUInt64DefPaneCommon,
	ICFForm
{
	public static String S_FormName = "View/Edit UInt64Def";
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

	public CFBamJavaFXUInt64DefViewEditForm( ICFFormManager formManager, ICFBamJavaFXSchema argSchema, ICFBamUInt64DefObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
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
			argFocus = (ICFBamUInt64DefObj)argFocus.read( true );
			javaFXFocus = argFocus;
		}
		javafxViewEditPane = argSchema.getUInt64DefFactory().newViewEditPane( cfFormManager, argFocus );

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
		ICFBamUInt64DefObj focus = getJavaFXFocusAsUInt64Def();
		if( focus != null ) {
			ICFBamUInt64DefEditObj editObj = (ICFBamUInt64DefEditObj)focus.getEdit();
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
		if( ( value == null ) || ( value instanceof ICFBamUInt64DefObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamUInt64DefObj" );
		}
		((ICFBamJavaFXUInt64DefPaneCommon)javafxViewEditPane).setJavaFXFocus( value );
		ICFBamUInt64DefObj argFocus = (ICFBamUInt64DefObj)value;
		if( ( argFocus != null ) && ( ! argFocus.getIsNew() ) ) {
			argFocus = (ICFBamUInt64DefObj)argFocus.read( true );
			super.setJavaFXFocus( argFocus );
		}
	}

	public ICFBamUInt64DefObj getJavaFXFocusAsUInt64Def() {
		return( (ICFBamUInt64DefObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsUInt64Def( ICFBamUInt64DefObj value ) {
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
						if( getJavaFXFocusAsUInt64Def() != null ) {
							if( null == getJavaFXFocusAsUInt64Def().getEdit() ) {
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
						ICFBamUInt64DefObj focus = getJavaFXFocusAsUInt64Def();
						if( focus != null ) {
							ICFBamUInt64DefEditObj editObj = (ICFBamUInt64DefEditObj)( focus.getEdit() );
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
						ICFBamUInt64DefObj focus = getJavaFXFocusAsUInt64Def();
						if( focus != null ) {
							ICFBamUInt64DefEditObj editObj = (ICFBamUInt64DefEditObj)( focus.getEdit() );
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
							focus = getJavaFXFocusAsUInt64Def();
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
						ICFBamUInt64DefObj focus = getJavaFXFocusAsUInt64Def();
						if( focus != null ) {
							ICFBamUInt64DefEditObj editObj = (ICFBamUInt64DefEditObj)focus.getEdit();
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
								focus = getJavaFXFocusAsUInt64Def();
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
			((ICFBamJavaFXUInt64DefPaneCommon)javafxViewEditPane).setPaneMode( value );
		}
		catch( Throwable t ) {
			super.setPaneMode( oldMode );
			((ICFBamJavaFXUInt64DefPaneCommon)javafxViewEditPane).setPaneMode( oldMode );
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
