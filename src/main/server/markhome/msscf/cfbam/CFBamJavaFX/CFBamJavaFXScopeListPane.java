// Description: Java 11 JavaFX List of Obj Pane implementation for Scope.

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
import java.util.*;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.util.Callback;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cflib.CFLib.JavaFX.*;
import org.apache.commons.codec.binary.Base64;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfbam.CFBam.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBamObj.*;
import server.markhome.msscf.cfsec.CFSecJavaFX.*;
import server.markhome.msscf.cfint.CFIntJavaFX.*;

/**
 *	CFBamJavaFXScopeListPane JavaFX List of Obj Pane implementation
 *	for Scope.
 */
public class CFBamJavaFXScopeListPane
extends CFBorderPane
implements ICFBamJavaFXScopePaneList
{
	public static String S_FormName = "List Scope";
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamScopeObj> javafxDataCollection = null;
	protected ObservableList<ICFBamScopeObj> observableListOfScope = null;
	protected ScrollPane scrollMenu = null;
	protected CFHBox hboxMenu = null;
	protected ScrollPane scrollMenuAdd = null;
	protected CFVBox vboxMenuAdd = null;
	protected CFButton buttonAdd = null;
	protected CFButton buttonCancelAdd = null;
	protected CFButton buttonAddSchemaDef = null;
	protected CFButton buttonAddSchemaRef = null;
	protected CFButton buttonAddServerMethod = null;
	protected CFButton buttonAddServerObjFunc = null;
	protected CFButton buttonAddServerProc = null;
	protected CFButton buttonAddServerListFunc = null;
	protected CFButton buttonAddTable = null;
	protected CFButton buttonAddClearSubDep1 = null;
	protected CFButton buttonAddClearSubDep2 = null;
	protected CFButton buttonAddClearSubDep3 = null;
	protected CFButton buttonAddClearTopDep = null;
	protected CFButton buttonAddDelSubDep1 = null;
	protected CFButton buttonAddDelSubDep2 = null;
	protected CFButton buttonAddDelSubDep3 = null;
	protected CFButton buttonAddDelTopDep = null;
	protected CFButton buttonAddIndex = null;
	protected CFButton buttonAddPopSubDep1 = null;
	protected CFButton buttonAddPopSubDep2 = null;
	protected CFButton buttonAddPopSubDep3 = null;
	protected CFButton buttonAddPopTopDep = null;
	protected CFButton buttonAddRelation = null;
	protected CFButton buttonViewSelected = null;
	protected CFButton buttonEditSelected = null;
	protected CFButton buttonDeleteSelected = null;
	protected TableView<ICFBamScopeObj> dataTable = null;
	protected TableColumn<ICFBamScopeObj,String> tableColumnObjKind = null;
	protected TableColumn<ICFBamScopeObj, Long> tableColumnId = null;

	public final String S_ColumnNames[] = { "Name" };
	protected ICFFormManager cfFormManager = null;
	protected boolean javafxIsInitializing = true;
	protected boolean javafxSortByChain = false;
	protected ICFLibAnyObj javafxContainer = null;
	protected ICFRefreshCallback javafxRefreshCallback = null;
	class ViewEditClosedCallback implements ICFFormClosedCallback {
		public ViewEditClosedCallback() {
		}

		@Override
		public void formClosed( ICFLibAnyObj affectedObject ) {
			if( affectedObject != null ) {
				refreshMe();
			}
		}
	}

	protected ViewEditClosedCallback viewEditClosedCallback = null;

	public ICFFormClosedCallback getViewEditClosedCallback() {
		if( viewEditClosedCallback == null ) {
			viewEditClosedCallback = new ViewEditClosedCallback();
		}
		return( viewEditClosedCallback );
	}

	class DeleteCallback implements ICFDeleteCallback {
		public DeleteCallback() {
		}
		@Override
		public void deleted( ICFLibAnyObj deletedObject ) {
			if( deletedObject != null ) {
				refreshMe();
			}
		}

		@Override
		public void formClosed( ICFLibAnyObj affectedObject ) {
			if( affectedObject != null ) {
				refreshMe();
			}
		}
	}

	protected DeleteCallback deleteCallback = null;

	public ICFDeleteCallback getDeleteCallback() {
		if( deleteCallback == null ) {
			deleteCallback = new DeleteCallback();
		}
		return( deleteCallback );
	}


	public CFBamJavaFXScopeListPane( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFLibAnyObj argContainer,
		ICFBamScopeObj argFocus,
		Collection<ICFBamScopeObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
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
		javafxContainer = argContainer;
		javafxRefreshCallback = refreshCallback;
		javafxSortByChain = sortByChain;
		setJavaFXDataCollection( argDataCollection );
		dataTable = new TableView<ICFBamScopeObj>();
		tableColumnObjKind = new TableColumn<ICFBamScopeObj,String>( "Class Code" );
		tableColumnObjKind.setCellValueFactory( new Callback<CellDataFeatures<ICFBamScopeObj,String>,ObservableValue<String> >() {
			@Override public ObservableValue<String> call( CellDataFeatures<ICFBamScopeObj, String> p ) {
				ICFBamScopeObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String classCode = obj.getClassCode();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( classCode );
					return( observable );
				}
			}
		});
		tableColumnObjKind.setCellFactory( new Callback<TableColumn<ICFBamScopeObj,String>,TableCell<ICFBamScopeObj,String>>() {
			@Override public TableCell<ICFBamScopeObj,String> call(
				TableColumn<ICFBamScopeObj,String> arg)
			{
				return new CFStringTableCell<ICFBamScopeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnObjKind );
		tableColumnId = new TableColumn<ICFBamScopeObj,Long>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<ICFBamScopeObj,Long>,ObservableValue<Long> >() {
			public ObservableValue<Long> call( CellDataFeatures<ICFBamScopeObj, Long> p ) {
				ICFBamScopeObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					long value = obj.getRequiredId();
					Long wrapped = Long.valueOf( value );
					ReadOnlyObjectWrapper<Long> observable = new ReadOnlyObjectWrapper<Long>();
					observable.setValue( wrapped );
					return( observable );
				}
			}
		});
		tableColumnId.setCellFactory( new Callback<TableColumn<ICFBamScopeObj,Long>,TableCell<ICFBamScopeObj,Long>>() {
			@Override public TableCell<ICFBamScopeObj,Long> call(
				TableColumn<ICFBamScopeObj,Long> arg)
			{
				return new CFInt64TableCell<ICFBamScopeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<ICFBamScopeObj>() {
				@Override public void changed( ObservableValue<? extends ICFBamScopeObj> observable,
					ICFBamScopeObj oldValue,
					ICFBamScopeObj newValue )
				{
					setJavaFXFocus( newValue );
				}
			});

		scrollMenu = new ScrollPane();
		scrollMenu.setVbarPolicy( ScrollBarPolicy.NEVER );
		scrollMenu.setHbarPolicy( ScrollBarPolicy.AS_NEEDED );
		scrollMenu.setFitToHeight( true );
		scrollMenu.setContent( getPanelHBoxMenu() );

		setTop( scrollMenu );
		setCenter( dataTable );
		javafxIsInitializing = false;
		if( observableListOfScope != null ) {
			dataTable.setItems( observableListOfScope );
		}
		adjustListButtons();
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

	public void setPaneMode( CFPane.PaneMode value ) {
		super.setPaneMode( value );
		adjustListButtons();
	}

	public void setJavaFXFocus( ICFLibAnyObj value ) {
		final String S_ProcName = "setJavaFXFocus";
		if( ( value == null ) || ( value instanceof ICFBamScopeObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamScopeObj" );
		}
		adjustListButtons();
	}

	public ICFBamScopeObj getJavaFXFocusAsScope() {
		return( (ICFBamScopeObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsScope( ICFBamScopeObj value ) {
		setJavaFXFocus( value );
	}

	public class ScopeByQualNameComparator
	implements Comparator<ICFBamScopeObj>
	{
		public ScopeByQualNameComparator() {
		}

		public int compare( ICFBamScopeObj lhs, ICFBamScopeObj rhs ) {
			if( lhs == null ) {
				if( rhs == null ) {
					return( 0 );
				}
				else {
					return( -1 );
				}
			}
			else if( rhs == null ) {
				return( 1 );
			}
			else {
				String lhsValue = lhs.getObjQualifiedName();
				String rhsValue = rhs.getObjQualifiedName();
				if( lhsValue == null ) {
					if( rhsValue == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhsValue == null ) {
					return( 1 );
				}
				else {
					return( lhsValue.compareTo( rhsValue ) );
				}
			}
		}
	}

	protected ScopeByQualNameComparator compareScopeByQualName = new ScopeByQualNameComparator();

	public Collection<ICFBamScopeObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<ICFBamScopeObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfScope = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<ICFBamScopeObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfScope.add( iter.next() );
				}
				observableListOfScope.sort( compareScopeByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfScope );
			// Hack from stackoverflow to fix JavaFX TableView refresh issue
			((TableColumn)dataTable.getColumns().get(0)).setVisible( false );
			((TableColumn)dataTable.getColumns().get(0)).setVisible( true );
		}
	}

	protected class CompareCFButtonByText
	implements Comparator<CFButton>
	{
		public CompareCFButtonByText() {
		}

		@Override public int compare( CFButton lhs, CFButton rhs ) {
			if( lhs == null ) {
				if( rhs == null ) {
					return( 0 );
				}
				else {
					return( -1 );
				}
			}
			else if( rhs == null ) {
				return( 1 );
			}
			else {
				int retval = lhs.getText().compareTo( rhs.getText() );
				return( retval );
			}
		}
	}

	public CFHBox getPanelHBoxMenu() {
		if( hboxMenu == null ) {
			hboxMenu = new CFHBox( 10 );
				LinkedList<CFButton> list = new LinkedList<CFButton>();

				vboxMenuAdd = new CFVBox( 10 );
					buttonAddSchemaDef = new CFButton();
					buttonAddSchemaDef.setMinWidth( 200 );
					buttonAddSchemaDef.setText( "Add SchemaDef" );
					buttonAddSchemaDef.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
								ICFBamSchemaDefObj obj = (ICFBamSchemaDefObj)schemaObj.getSchemaDefTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getSchemaDefFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								ICFBamSchemaDefEditObj edit = (ICFBamSchemaDefEditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ICFSecTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerCTenant( secTenant );
								ICFBamMinorVersionObj container = (ICFBamMinorVersionObj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerMinorVersion( container );
								ICFBamJavaFXSchemaDefPaneCommon jpanelCommon = (ICFBamJavaFXSchemaDefPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof ICFIntMinorVersionObj ) {
						list.add( buttonAddSchemaDef );
					}
					buttonAddSchemaRef = new CFButton();
					buttonAddSchemaRef.setMinWidth( 200 );
					buttonAddSchemaRef.setText( "Add SchemaRef" );
					buttonAddSchemaRef.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
								ICFBamSchemaRefObj obj = (ICFBamSchemaRefObj)schemaObj.getSchemaRefTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getSchemaRefFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								ICFBamSchemaRefEditObj edit = (ICFBamSchemaRefEditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ICFSecTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								ICFBamSchemaDefObj container = (ICFBamSchemaDefObj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerSchema( container );
								ICFBamJavaFXSchemaRefPaneCommon jpanelCommon = (ICFBamJavaFXSchemaRefPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof ICFBamSchemaDefObj ) {
						list.add( buttonAddSchemaRef );
					}
					buttonAddServerMethod = new CFButton();
					buttonAddServerMethod.setMinWidth( 200 );
					buttonAddServerMethod.setText( "Add ServerMethod" );
					buttonAddServerMethod.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
								ICFBamServerMethodObj obj = (ICFBamServerMethodObj)schemaObj.getServerMethodTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getServerMethodFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								ICFBamServerMethodEditObj edit = (ICFBamServerMethodEditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ICFSecTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								ICFBamTableObj container = (ICFBamTableObj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerForTable( container );
								ICFBamJavaFXServerMethodPaneCommon jpanelCommon = (ICFBamJavaFXServerMethodPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof ICFBamTableObj ) {
						list.add( buttonAddServerMethod );
					}
					buttonAddServerObjFunc = new CFButton();
					buttonAddServerObjFunc.setMinWidth( 200 );
					buttonAddServerObjFunc.setText( "Add ServerObjFunc" );
					buttonAddServerObjFunc.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
								ICFBamServerObjFuncObj obj = (ICFBamServerObjFuncObj)schemaObj.getServerObjFuncTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getServerObjFuncFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								ICFBamServerObjFuncEditObj edit = (ICFBamServerObjFuncEditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ICFSecTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								ICFBamTableObj container = (ICFBamTableObj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerForTable( container );
								ICFBamJavaFXServerObjFuncPaneCommon jpanelCommon = (ICFBamJavaFXServerObjFuncPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof ICFBamTableObj ) {
						list.add( buttonAddServerObjFunc );
					}
					buttonAddServerProc = new CFButton();
					buttonAddServerProc.setMinWidth( 200 );
					buttonAddServerProc.setText( "Add ServerProc" );
					buttonAddServerProc.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
								ICFBamServerProcObj obj = (ICFBamServerProcObj)schemaObj.getServerProcTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getServerProcFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								ICFBamServerProcEditObj edit = (ICFBamServerProcEditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ICFSecTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								ICFBamTableObj container = (ICFBamTableObj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerForTable( container );
								ICFBamJavaFXServerProcPaneCommon jpanelCommon = (ICFBamJavaFXServerProcPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof ICFBamTableObj ) {
						list.add( buttonAddServerProc );
					}
					buttonAddServerListFunc = new CFButton();
					buttonAddServerListFunc.setMinWidth( 200 );
					buttonAddServerListFunc.setText( "Add ServerListFunc" );
					buttonAddServerListFunc.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
								ICFBamServerListFuncObj obj = (ICFBamServerListFuncObj)schemaObj.getServerListFuncTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getServerListFuncFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								ICFBamServerListFuncEditObj edit = (ICFBamServerListFuncEditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ICFSecTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								ICFBamTableObj container = (ICFBamTableObj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerForTable( container );
								ICFBamJavaFXServerListFuncPaneCommon jpanelCommon = (ICFBamJavaFXServerListFuncPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof ICFBamTableObj ) {
						list.add( buttonAddServerListFunc );
					}
					buttonAddTable = new CFButton();
					buttonAddTable.setMinWidth( 200 );
					buttonAddTable.setText( "Add Table" );
					buttonAddTable.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
								ICFBamTableObj obj = (ICFBamTableObj)schemaObj.getTableTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getTableFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								ICFBamTableEditObj edit = (ICFBamTableEditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ICFSecTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								ICFBamSchemaDefObj container = (ICFBamSchemaDefObj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerSchemaDef( container );
								ICFBamJavaFXTablePaneCommon jpanelCommon = (ICFBamJavaFXTablePaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof ICFBamSchemaDefObj ) {
						list.add( buttonAddTable );
					}
					buttonAddClearSubDep1 = new CFButton();
					buttonAddClearSubDep1.setMinWidth( 200 );
					buttonAddClearSubDep1.setText( "Add ClearSubDep1" );
					buttonAddClearSubDep1.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
								ICFBamClearSubDep1Obj obj = (ICFBamClearSubDep1Obj)schemaObj.getClearSubDep1TableObj().newInstance();
								CFBorderPane frame = javafxSchema.getClearSubDep1Factory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								ICFBamClearSubDep1EditObj edit = (ICFBamClearSubDep1EditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ICFSecTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								ICFBamClearTopDepObj container = (ICFBamClearTopDepObj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerClearTopDep( container );
								ICFBamJavaFXClearSubDep1PaneCommon jpanelCommon = (ICFBamJavaFXClearSubDep1PaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof ICFBamClearTopDepObj ) {
						list.add( buttonAddClearSubDep1 );
					}
					buttonAddClearSubDep2 = new CFButton();
					buttonAddClearSubDep2.setMinWidth( 200 );
					buttonAddClearSubDep2.setText( "Add ClearSubDep2" );
					buttonAddClearSubDep2.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
								ICFBamClearSubDep2Obj obj = (ICFBamClearSubDep2Obj)schemaObj.getClearSubDep2TableObj().newInstance();
								CFBorderPane frame = javafxSchema.getClearSubDep2Factory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								ICFBamClearSubDep2EditObj edit = (ICFBamClearSubDep2EditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ICFSecTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								ICFBamClearSubDep1Obj container = (ICFBamClearSubDep1Obj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerClearSubDep1( container );
								ICFBamJavaFXClearSubDep2PaneCommon jpanelCommon = (ICFBamJavaFXClearSubDep2PaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof ICFBamClearSubDep1Obj ) {
						list.add( buttonAddClearSubDep2 );
					}
					buttonAddClearSubDep3 = new CFButton();
					buttonAddClearSubDep3.setMinWidth( 200 );
					buttonAddClearSubDep3.setText( "Add ClearSubDep3" );
					buttonAddClearSubDep3.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
								ICFBamClearSubDep3Obj obj = (ICFBamClearSubDep3Obj)schemaObj.getClearSubDep3TableObj().newInstance();
								CFBorderPane frame = javafxSchema.getClearSubDep3Factory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								ICFBamClearSubDep3EditObj edit = (ICFBamClearSubDep3EditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ICFSecTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								ICFBamClearSubDep2Obj container = (ICFBamClearSubDep2Obj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerClearSubDep2( container );
								ICFBamJavaFXClearSubDep3PaneCommon jpanelCommon = (ICFBamJavaFXClearSubDep3PaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof ICFBamClearSubDep2Obj ) {
						list.add( buttonAddClearSubDep3 );
					}
					buttonAddClearTopDep = new CFButton();
					buttonAddClearTopDep.setMinWidth( 200 );
					buttonAddClearTopDep.setText( "Add ClearTopDep" );
					buttonAddClearTopDep.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
								ICFBamClearTopDepObj obj = (ICFBamClearTopDepObj)schemaObj.getClearTopDepTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getClearTopDepFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								ICFBamClearTopDepEditObj edit = (ICFBamClearTopDepEditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ICFSecTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								ICFBamTableObj container = (ICFBamTableObj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerTable( container );
								ICFBamJavaFXClearTopDepPaneCommon jpanelCommon = (ICFBamJavaFXClearTopDepPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof ICFBamTableObj ) {
						list.add( buttonAddClearTopDep );
					}
					buttonAddDelSubDep1 = new CFButton();
					buttonAddDelSubDep1.setMinWidth( 200 );
					buttonAddDelSubDep1.setText( "Add DelSubDep1" );
					buttonAddDelSubDep1.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
								ICFBamDelSubDep1Obj obj = (ICFBamDelSubDep1Obj)schemaObj.getDelSubDep1TableObj().newInstance();
								CFBorderPane frame = javafxSchema.getDelSubDep1Factory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								ICFBamDelSubDep1EditObj edit = (ICFBamDelSubDep1EditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ICFSecTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								ICFBamDelTopDepObj container = (ICFBamDelTopDepObj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerDelTopDep( container );
								ICFBamJavaFXDelSubDep1PaneCommon jpanelCommon = (ICFBamJavaFXDelSubDep1PaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof ICFBamDelTopDepObj ) {
						list.add( buttonAddDelSubDep1 );
					}
					buttonAddDelSubDep2 = new CFButton();
					buttonAddDelSubDep2.setMinWidth( 200 );
					buttonAddDelSubDep2.setText( "Add DelSubDep2" );
					buttonAddDelSubDep2.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
								ICFBamDelSubDep2Obj obj = (ICFBamDelSubDep2Obj)schemaObj.getDelSubDep2TableObj().newInstance();
								CFBorderPane frame = javafxSchema.getDelSubDep2Factory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								ICFBamDelSubDep2EditObj edit = (ICFBamDelSubDep2EditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ICFSecTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								ICFBamDelSubDep1Obj container = (ICFBamDelSubDep1Obj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerDelSubDep1( container );
								ICFBamJavaFXDelSubDep2PaneCommon jpanelCommon = (ICFBamJavaFXDelSubDep2PaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof ICFBamDelSubDep1Obj ) {
						list.add( buttonAddDelSubDep2 );
					}
					buttonAddDelSubDep3 = new CFButton();
					buttonAddDelSubDep3.setMinWidth( 200 );
					buttonAddDelSubDep3.setText( "Add DelSubDep3" );
					buttonAddDelSubDep3.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
								ICFBamDelSubDep3Obj obj = (ICFBamDelSubDep3Obj)schemaObj.getDelSubDep3TableObj().newInstance();
								CFBorderPane frame = javafxSchema.getDelSubDep3Factory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								ICFBamDelSubDep3EditObj edit = (ICFBamDelSubDep3EditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ICFSecTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								ICFBamDelSubDep2Obj container = (ICFBamDelSubDep2Obj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerDelSubDep2( container );
								ICFBamJavaFXDelSubDep3PaneCommon jpanelCommon = (ICFBamJavaFXDelSubDep3PaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof ICFBamDelSubDep2Obj ) {
						list.add( buttonAddDelSubDep3 );
					}
					buttonAddDelTopDep = new CFButton();
					buttonAddDelTopDep.setMinWidth( 200 );
					buttonAddDelTopDep.setText( "Add DelTopDep" );
					buttonAddDelTopDep.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
								ICFBamDelTopDepObj obj = (ICFBamDelTopDepObj)schemaObj.getDelTopDepTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getDelTopDepFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								ICFBamDelTopDepEditObj edit = (ICFBamDelTopDepEditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ICFSecTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								ICFBamTableObj container = (ICFBamTableObj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerTable( container );
								ICFBamJavaFXDelTopDepPaneCommon jpanelCommon = (ICFBamJavaFXDelTopDepPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof ICFBamTableObj ) {
						list.add( buttonAddDelTopDep );
					}
					buttonAddIndex = new CFButton();
					buttonAddIndex.setMinWidth( 200 );
					buttonAddIndex.setText( "Add Index" );
					buttonAddIndex.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
								ICFBamIndexObj obj = (ICFBamIndexObj)schemaObj.getIndexTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getIndexFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								ICFBamIndexEditObj edit = (ICFBamIndexEditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ICFSecTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerIdxTenant( secTenant );
								ICFBamTableObj container = (ICFBamTableObj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerTable( container );
								ICFBamJavaFXIndexPaneCommon jpanelCommon = (ICFBamJavaFXIndexPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof ICFBamTableObj ) {
						list.add( buttonAddIndex );
					}
					buttonAddPopSubDep1 = new CFButton();
					buttonAddPopSubDep1.setMinWidth( 200 );
					buttonAddPopSubDep1.setText( "Add PopSubDep1" );
					buttonAddPopSubDep1.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
								ICFBamPopSubDep1Obj obj = (ICFBamPopSubDep1Obj)schemaObj.getPopSubDep1TableObj().newInstance();
								CFBorderPane frame = javafxSchema.getPopSubDep1Factory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								ICFBamPopSubDep1EditObj edit = (ICFBamPopSubDep1EditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ICFSecTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								ICFBamPopTopDepObj container = (ICFBamPopTopDepObj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerContPopTopDep( container );
								ICFBamJavaFXPopSubDep1PaneCommon jpanelCommon = (ICFBamJavaFXPopSubDep1PaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof ICFBamPopTopDepObj ) {
						list.add( buttonAddPopSubDep1 );
					}
					buttonAddPopSubDep2 = new CFButton();
					buttonAddPopSubDep2.setMinWidth( 200 );
					buttonAddPopSubDep2.setText( "Add PopSubDep2" );
					buttonAddPopSubDep2.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
								ICFBamPopSubDep2Obj obj = (ICFBamPopSubDep2Obj)schemaObj.getPopSubDep2TableObj().newInstance();
								CFBorderPane frame = javafxSchema.getPopSubDep2Factory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								ICFBamPopSubDep2EditObj edit = (ICFBamPopSubDep2EditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ICFSecTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								ICFBamPopSubDep1Obj container = (ICFBamPopSubDep1Obj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerPopSubDep1( container );
								ICFBamJavaFXPopSubDep2PaneCommon jpanelCommon = (ICFBamJavaFXPopSubDep2PaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof ICFBamPopSubDep1Obj ) {
						list.add( buttonAddPopSubDep2 );
					}
					buttonAddPopSubDep3 = new CFButton();
					buttonAddPopSubDep3.setMinWidth( 200 );
					buttonAddPopSubDep3.setText( "Add PopSubDep3" );
					buttonAddPopSubDep3.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
								ICFBamPopSubDep3Obj obj = (ICFBamPopSubDep3Obj)schemaObj.getPopSubDep3TableObj().newInstance();
								CFBorderPane frame = javafxSchema.getPopSubDep3Factory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								ICFBamPopSubDep3EditObj edit = (ICFBamPopSubDep3EditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ICFSecTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								ICFBamPopSubDep2Obj container = (ICFBamPopSubDep2Obj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerPopSubDep2( container );
								ICFBamJavaFXPopSubDep3PaneCommon jpanelCommon = (ICFBamJavaFXPopSubDep3PaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof ICFBamPopSubDep2Obj ) {
						list.add( buttonAddPopSubDep3 );
					}
					buttonAddPopTopDep = new CFButton();
					buttonAddPopTopDep.setMinWidth( 200 );
					buttonAddPopTopDep.setText( "Add PopTopDep" );
					buttonAddPopTopDep.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
								ICFBamPopTopDepObj obj = (ICFBamPopTopDepObj)schemaObj.getPopTopDepTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getPopTopDepFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								ICFBamPopTopDepEditObj edit = (ICFBamPopTopDepEditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ICFSecTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								ICFBamRelationObj container = (ICFBamRelationObj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerContRelation( container );
								ICFBamJavaFXPopTopDepPaneCommon jpanelCommon = (ICFBamJavaFXPopTopDepPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof ICFBamRelationObj ) {
						list.add( buttonAddPopTopDep );
					}
					buttonAddRelation = new CFButton();
					buttonAddRelation.setMinWidth( 200 );
					buttonAddRelation.setText( "Add Relation" );
					buttonAddRelation.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
								ICFBamRelationObj obj = (ICFBamRelationObj)schemaObj.getRelationTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getRelationFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								ICFBamRelationEditObj edit = (ICFBamRelationEditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ICFSecTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerRelTenant( secTenant );
								ICFBamTableObj container = (ICFBamTableObj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerFromTable( container );
								ICFBamJavaFXRelationPaneCommon jpanelCommon = (ICFBamJavaFXRelationPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof ICFBamTableObj ) {
						list.add( buttonAddRelation );
					}

				int len = list.size();
				CFButton arr[] = new CFButton[len];
				Iterator<CFButton> iter = list.iterator();
				int idx = 0;
				while( iter.hasNext() ) {
					arr[idx++] = iter.next();
				}
				Arrays.sort( arr, new CompareCFButtonByText() );
				for( idx = 0; idx < len; idx ++ ) {
					vboxMenuAdd.getChildren().add( arr[idx] );
				}

				buttonCancelAdd = new CFButton();
				buttonCancelAdd.setMinWidth( 200 );
				buttonCancelAdd.setText( "Cancel Add..." );
				buttonCancelAdd.setOnAction( new EventHandler<ActionEvent>() {
					@Override public void handle( ActionEvent e ) {
						final String S_ProcName = "handle";
						try {
							setLeft( null );
							adjustListButtons();
						}
						catch( Throwable t ) {
							CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
						}
					}
				});
				vboxMenuAdd.getChildren().add( buttonCancelAdd );

				scrollMenuAdd = new ScrollPane();
				scrollMenuAdd.setMinWidth( 240 );
				scrollMenuAdd.setMaxWidth( 240 );
				scrollMenuAdd.setFitToWidth( true );
				scrollMenuAdd.setHbarPolicy( ScrollBarPolicy.NEVER );
				scrollMenuAdd.setVbarPolicy( ScrollBarPolicy.AS_NEEDED );
				scrollMenuAdd.setContent( vboxMenuAdd );

			buttonAdd = new CFButton();
			buttonAdd.setMinWidth( 200 );
			buttonAdd.setText( "Add..." );
			buttonAdd.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						setLeft( scrollMenuAdd );
						adjustListButtons();
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonAdd );

			buttonViewSelected = new CFButton();
			buttonViewSelected.setMinWidth( 200 );
			buttonViewSelected.setText( "View Selected" );
			buttonViewSelected.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
						if( schemaObj == null ) {
							throw new CFLibNullArgumentException( getClass(),
								S_ProcName,
								0,
								"schemaObj" );
						}
						ICFBamScopeObj selectedInstance = getJavaFXFocusAsScope();
						if( selectedInstance != null ) {
							String classCode = selectedInstance.getClassCode();
							if( "a801".equals( classCode ) ) {
								CFBorderPane frame = javafxSchema.getScopeFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((ICFBamJavaFXScopePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a802".equals( classCode ) ) {
								ICFBamSchemaDefObj obj = (ICFBamSchemaDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getSchemaDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXSchemaDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a804".equals( classCode ) ) {
								ICFBamSchemaRefObj obj = (ICFBamSchemaRefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getSchemaRefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXSchemaRefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a805".equals( classCode ) ) {
								ICFBamServerMethodObj obj = (ICFBamServerMethodObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getServerMethodFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXServerMethodPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a806".equals( classCode ) ) {
								ICFBamServerObjFuncObj obj = (ICFBamServerObjFuncObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getServerObjFuncFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXServerObjFuncPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a807".equals( classCode ) ) {
								ICFBamServerProcObj obj = (ICFBamServerProcObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getServerProcFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXServerProcPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a837".equals( classCode ) ) {
								ICFBamServerListFuncObj obj = (ICFBamServerListFuncObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getServerListFuncFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXServerListFuncPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a808".equals( classCode ) ) {
								ICFBamTableObj obj = (ICFBamTableObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTableFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXTablePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a810".equals( classCode ) ) {
								ICFBamClearDepObj obj = (ICFBamClearDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getClearDepFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXClearDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a811".equals( classCode ) ) {
								ICFBamClearSubDep1Obj obj = (ICFBamClearSubDep1Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getClearSubDep1Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXClearSubDep1PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a812".equals( classCode ) ) {
								ICFBamClearSubDep2Obj obj = (ICFBamClearSubDep2Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getClearSubDep2Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXClearSubDep2PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a813".equals( classCode ) ) {
								ICFBamClearSubDep3Obj obj = (ICFBamClearSubDep3Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getClearSubDep3Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXClearSubDep3PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a814".equals( classCode ) ) {
								ICFBamClearTopDepObj obj = (ICFBamClearTopDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getClearTopDepFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXClearTopDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a817".equals( classCode ) ) {
								ICFBamDelDepObj obj = (ICFBamDelDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDelDepFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXDelDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a818".equals( classCode ) ) {
								ICFBamDelSubDep1Obj obj = (ICFBamDelSubDep1Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDelSubDep1Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXDelSubDep1PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a819".equals( classCode ) ) {
								ICFBamDelSubDep2Obj obj = (ICFBamDelSubDep2Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDelSubDep2Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXDelSubDep2PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a81a".equals( classCode ) ) {
								ICFBamDelSubDep3Obj obj = (ICFBamDelSubDep3Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDelSubDep3Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXDelSubDep3PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a81b".equals( classCode ) ) {
								ICFBamDelTopDepObj obj = (ICFBamDelTopDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDelTopDepFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXDelTopDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a821".equals( classCode ) ) {
								ICFBamIndexObj obj = (ICFBamIndexObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getIndexFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXIndexPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a830".equals( classCode ) ) {
								ICFBamPopDepObj obj = (ICFBamPopDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopDepFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXPopDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a831".equals( classCode ) ) {
								ICFBamPopSubDep1Obj obj = (ICFBamPopSubDep1Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopSubDep1Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXPopSubDep1PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a832".equals( classCode ) ) {
								ICFBamPopSubDep2Obj obj = (ICFBamPopSubDep2Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopSubDep2Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXPopSubDep2PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a833".equals( classCode ) ) {
								ICFBamPopSubDep3Obj obj = (ICFBamPopSubDep3Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopSubDep3Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXPopSubDep3PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a834".equals( classCode ) ) {
								ICFBamPopTopDepObj obj = (ICFBamPopTopDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopTopDepFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXPopTopDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a835".equals( classCode ) ) {
								ICFBamRelationObj obj = (ICFBamRelationObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getRelationFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXRelationPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ICFBamScopeObj, ICFBamSchemaDefObj, ICFBamSchemaRefObj, ICFBamServerMethodObj, ICFBamServerObjFuncObj, ICFBamServerProcObj, ICFBamServerListFuncObj, ICFBamTableObj, ICFBamClearDepObj, ICFBamClearSubDep1Obj, ICFBamClearSubDep2Obj, ICFBamClearSubDep3Obj, ICFBamClearTopDepObj, ICFBamDelDepObj, ICFBamDelSubDep1Obj, ICFBamDelSubDep2Obj, ICFBamDelSubDep3Obj, ICFBamDelTopDepObj, ICFBamIndexObj, ICFBamPopDepObj, ICFBamPopSubDep1Obj, ICFBamPopSubDep2Obj, ICFBamPopSubDep3Obj, ICFBamPopTopDepObj, ICFBamRelationObj" );
							}
						}
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonViewSelected );

			buttonEditSelected = new CFButton();
			buttonEditSelected.setMinWidth( 200 );
			buttonEditSelected.setText( "Edit Selected" );
			buttonEditSelected.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
						if( schemaObj == null ) {
							throw new CFLibNullArgumentException( getClass(),
								S_ProcName,
								0,
								"schemaObj" );
						}
						ICFBamScopeObj selectedInstance = getJavaFXFocusAsScope();
						if( selectedInstance != null ) {
							String classCode = selectedInstance.getClassCode();
							if( "a801".equals( classCode ) ) {
								CFBorderPane frame = javafxSchema.getScopeFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((ICFBamJavaFXScopePaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( "a802".equals( classCode ) ) {
								ICFBamSchemaDefObj obj = (ICFBamSchemaDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getSchemaDefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXSchemaDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( "a804".equals( classCode ) ) {
								ICFBamSchemaRefObj obj = (ICFBamSchemaRefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getSchemaRefFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXSchemaRefPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( "a805".equals( classCode ) ) {
								ICFBamServerMethodObj obj = (ICFBamServerMethodObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getServerMethodFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXServerMethodPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( "a806".equals( classCode ) ) {
								ICFBamServerObjFuncObj obj = (ICFBamServerObjFuncObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getServerObjFuncFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXServerObjFuncPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a807".equals( classCode ) ) {
								ICFBamServerProcObj obj = (ICFBamServerProcObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getServerProcFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXServerProcPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a837".equals( classCode ) ) {
								ICFBamServerListFuncObj obj = (ICFBamServerListFuncObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getServerListFuncFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXServerListFuncPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a808".equals( classCode ) ) {
								ICFBamTableObj obj = (ICFBamTableObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTableFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXTablePaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( "a810".equals( classCode ) ) {
								ICFBamClearDepObj obj = (ICFBamClearDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getClearDepFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXClearDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( "a811".equals( classCode ) ) {
								ICFBamClearSubDep1Obj obj = (ICFBamClearSubDep1Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getClearSubDep1Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXClearSubDep1PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a812".equals( classCode ) ) {
								ICFBamClearSubDep2Obj obj = (ICFBamClearSubDep2Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getClearSubDep2Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXClearSubDep2PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a813".equals( classCode ) ) {
								ICFBamClearSubDep3Obj obj = (ICFBamClearSubDep3Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getClearSubDep3Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXClearSubDep3PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a814".equals( classCode ) ) {
								ICFBamClearTopDepObj obj = (ICFBamClearTopDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getClearTopDepFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXClearTopDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a817".equals( classCode ) ) {
								ICFBamDelDepObj obj = (ICFBamDelDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDelDepFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXDelDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( "a818".equals( classCode ) ) {
								ICFBamDelSubDep1Obj obj = (ICFBamDelSubDep1Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDelSubDep1Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXDelSubDep1PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a819".equals( classCode ) ) {
								ICFBamDelSubDep2Obj obj = (ICFBamDelSubDep2Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDelSubDep2Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXDelSubDep2PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a81a".equals( classCode ) ) {
								ICFBamDelSubDep3Obj obj = (ICFBamDelSubDep3Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDelSubDep3Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXDelSubDep3PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a81b".equals( classCode ) ) {
								ICFBamDelTopDepObj obj = (ICFBamDelTopDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDelTopDepFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXDelTopDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a821".equals( classCode ) ) {
								ICFBamIndexObj obj = (ICFBamIndexObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getIndexFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXIndexPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( "a830".equals( classCode ) ) {
								ICFBamPopDepObj obj = (ICFBamPopDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopDepFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXPopDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( "a831".equals( classCode ) ) {
								ICFBamPopSubDep1Obj obj = (ICFBamPopSubDep1Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopSubDep1Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXPopSubDep1PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a832".equals( classCode ) ) {
								ICFBamPopSubDep2Obj obj = (ICFBamPopSubDep2Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopSubDep2Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXPopSubDep2PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a833".equals( classCode ) ) {
								ICFBamPopSubDep3Obj obj = (ICFBamPopSubDep3Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopSubDep3Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXPopSubDep3PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a834".equals( classCode ) ) {
								ICFBamPopTopDepObj obj = (ICFBamPopTopDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopTopDepFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXPopTopDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a835".equals( classCode ) ) {
								ICFBamRelationObj obj = (ICFBamRelationObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getRelationFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXRelationPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ICFBamScopeObj, ICFBamSchemaDefObj, ICFBamSchemaRefObj, ICFBamServerMethodObj, ICFBamServerObjFuncObj, ICFBamServerProcObj, ICFBamServerListFuncObj, ICFBamTableObj, ICFBamClearDepObj, ICFBamClearSubDep1Obj, ICFBamClearSubDep2Obj, ICFBamClearSubDep3Obj, ICFBamClearTopDepObj, ICFBamDelDepObj, ICFBamDelSubDep1Obj, ICFBamDelSubDep2Obj, ICFBamDelSubDep3Obj, ICFBamDelTopDepObj, ICFBamIndexObj, ICFBamPopDepObj, ICFBamPopSubDep1Obj, ICFBamPopSubDep2Obj, ICFBamPopSubDep3Obj, ICFBamPopTopDepObj, ICFBamRelationObj" );
							}
						}
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonEditSelected );

			buttonDeleteSelected = new CFButton();
			buttonDeleteSelected.setMinWidth( 200 );
			buttonDeleteSelected.setText( "Delete Selected" );
			buttonDeleteSelected.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
						if( schemaObj == null ) {
							throw new CFLibNullArgumentException( getClass(),
								S_ProcName,
								0,
								"schemaObj" );
						}
						ICFBamScopeObj selectedInstance = getJavaFXFocusAsScope();
						if( selectedInstance != null ) {
							String classCode = selectedInstance.getClassCode();
							if( "a801".equals( classCode ) ) {
								CFBorderPane frame = javafxSchema.getScopeFactory().newAskDeleteForm( cfFormManager, selectedInstance, getDeleteCallback() );
								((ICFBamJavaFXScopePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a802".equals( classCode ) ) {
								ICFBamSchemaDefObj obj = (ICFBamSchemaDefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getSchemaDefFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((ICFBamJavaFXSchemaDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a804".equals( classCode ) ) {
								ICFBamSchemaRefObj obj = (ICFBamSchemaRefObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getSchemaRefFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((ICFBamJavaFXSchemaRefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a805".equals( classCode ) ) {
								ICFBamServerMethodObj obj = (ICFBamServerMethodObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getServerMethodFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((ICFBamJavaFXServerMethodPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a806".equals( classCode ) ) {
								ICFBamServerObjFuncObj obj = (ICFBamServerObjFuncObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getServerObjFuncFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((ICFBamJavaFXServerObjFuncPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a807".equals( classCode ) ) {
								ICFBamServerProcObj obj = (ICFBamServerProcObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getServerProcFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((ICFBamJavaFXServerProcPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a837".equals( classCode ) ) {
								ICFBamServerListFuncObj obj = (ICFBamServerListFuncObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getServerListFuncFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((ICFBamJavaFXServerListFuncPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a808".equals( classCode ) ) {
								ICFBamTableObj obj = (ICFBamTableObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getTableFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((ICFBamJavaFXTablePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a810".equals( classCode ) ) {
								ICFBamClearDepObj obj = (ICFBamClearDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getClearDepFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((ICFBamJavaFXClearDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a811".equals( classCode ) ) {
								ICFBamClearSubDep1Obj obj = (ICFBamClearSubDep1Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getClearSubDep1Factory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((ICFBamJavaFXClearSubDep1PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a812".equals( classCode ) ) {
								ICFBamClearSubDep2Obj obj = (ICFBamClearSubDep2Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getClearSubDep2Factory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((ICFBamJavaFXClearSubDep2PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a813".equals( classCode ) ) {
								ICFBamClearSubDep3Obj obj = (ICFBamClearSubDep3Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getClearSubDep3Factory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((ICFBamJavaFXClearSubDep3PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a814".equals( classCode ) ) {
								ICFBamClearTopDepObj obj = (ICFBamClearTopDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getClearTopDepFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((ICFBamJavaFXClearTopDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a817".equals( classCode ) ) {
								ICFBamDelDepObj obj = (ICFBamDelDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDelDepFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((ICFBamJavaFXDelDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a818".equals( classCode ) ) {
								ICFBamDelSubDep1Obj obj = (ICFBamDelSubDep1Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDelSubDep1Factory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((ICFBamJavaFXDelSubDep1PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a819".equals( classCode ) ) {
								ICFBamDelSubDep2Obj obj = (ICFBamDelSubDep2Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDelSubDep2Factory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((ICFBamJavaFXDelSubDep2PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a81a".equals( classCode ) ) {
								ICFBamDelSubDep3Obj obj = (ICFBamDelSubDep3Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDelSubDep3Factory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((ICFBamJavaFXDelSubDep3PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a81b".equals( classCode ) ) {
								ICFBamDelTopDepObj obj = (ICFBamDelTopDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDelTopDepFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((ICFBamJavaFXDelTopDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a821".equals( classCode ) ) {
								ICFBamIndexObj obj = (ICFBamIndexObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getIndexFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((ICFBamJavaFXIndexPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a830".equals( classCode ) ) {
								ICFBamPopDepObj obj = (ICFBamPopDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopDepFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((ICFBamJavaFXPopDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a831".equals( classCode ) ) {
								ICFBamPopSubDep1Obj obj = (ICFBamPopSubDep1Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopSubDep1Factory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((ICFBamJavaFXPopSubDep1PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a832".equals( classCode ) ) {
								ICFBamPopSubDep2Obj obj = (ICFBamPopSubDep2Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopSubDep2Factory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((ICFBamJavaFXPopSubDep2PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a833".equals( classCode ) ) {
								ICFBamPopSubDep3Obj obj = (ICFBamPopSubDep3Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopSubDep3Factory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((ICFBamJavaFXPopSubDep3PaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a834".equals( classCode ) ) {
								ICFBamPopTopDepObj obj = (ICFBamPopTopDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopTopDepFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((ICFBamJavaFXPopTopDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a835".equals( classCode ) ) {
								ICFBamRelationObj obj = (ICFBamRelationObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getRelationFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((ICFBamJavaFXRelationPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ICFBamScopeObj, ICFBamSchemaDefObj, ICFBamSchemaRefObj, ICFBamServerMethodObj, ICFBamServerObjFuncObj, ICFBamServerProcObj, ICFBamServerListFuncObj, ICFBamTableObj, ICFBamClearDepObj, ICFBamClearSubDep1Obj, ICFBamClearSubDep2Obj, ICFBamClearSubDep3Obj, ICFBamClearTopDepObj, ICFBamDelDepObj, ICFBamDelSubDep1Obj, ICFBamDelSubDep2Obj, ICFBamDelSubDep3Obj, ICFBamDelTopDepObj, ICFBamIndexObj, ICFBamPopDepObj, ICFBamPopSubDep1Obj, ICFBamPopSubDep2Obj, ICFBamPopSubDep3Obj, ICFBamPopTopDepObj, ICFBamRelationObj" );
							}
						}
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonDeleteSelected );

		}
		return( hboxMenu );
	}

	public ICFLibAnyObj getJavaFXContainer() {
		return( javafxContainer );
	}

	public void setJavaFXContainer( ICFLibAnyObj value ) {
		javafxContainer = value;
	}

	public void refreshMe() {
		if( javafxRefreshCallback != null ) {
			javafxRefreshCallback.refreshMe();
		}
	}

	public void adjustListButtons() {
		boolean enableState;
		boolean inEditState;
		boolean allowAdds;
		boolean inAddMode = false;
		ICFBamScopeObj selectedObj = getJavaFXFocusAsScope();
		CFPane.PaneMode mode = getPaneMode();
		if( mode == CFPane.PaneMode.Edit ) {
			inEditState = true;
			allowAdds = false;
		}
		else {
			inEditState = false;
			if( getJavaFXContainer() != null ) {
				if( getLeft() != null ) {
					allowAdds = false;
					inAddMode = true;
				}
				else {
					allowAdds = true;
				}
			}
			else {
				allowAdds = false;
			}
		}
		if( selectedObj == null ) {
			enableState = false;
		}
		else {
			if( ( ! inAddMode ) && ( ! inEditState ) ) {
				enableState = true;
			}
			else {
				enableState = false;
			}
		}

		if( buttonViewSelected != null ) {
			buttonViewSelected.setDisable( ! enableState );
		}
		if( buttonEditSelected != null ) {
			if( inEditState ) {
				buttonEditSelected.setDisable( true );
			}
			else {
				buttonEditSelected.setDisable( ! enableState );
			}
		}
		if( buttonDeleteSelected != null ) {
			buttonDeleteSelected.setDisable( ! enableState );
		}

		if( buttonAdd != null ) {
			buttonAdd.setDisable( ! allowAdds );
		}
	}
}
