// Description: Java 11 JavaFX List of Obj Pane implementation for PopDep.

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
 *	CFBamJavaFXPopDepListPane JavaFX List of Obj Pane implementation
 *	for PopDep.
 */
public class CFBamJavaFXPopDepListPane
extends CFBorderPane
implements ICFBamJavaFXPopDepPaneList
{
	public static String S_FormName = "List PopDep";
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamPopDepObj> javafxDataCollection = null;
	protected ObservableList<ICFBamPopDepObj> observableListOfPopDep = null;
	protected ScrollPane scrollMenu = null;
	protected CFHBox hboxMenu = null;
	protected ScrollPane scrollMenuAdd = null;
	protected CFVBox vboxMenuAdd = null;
	protected CFButton buttonAdd = null;
	protected CFButton buttonCancelAdd = null;
	protected CFButton buttonAddPopSubDep1 = null;
	protected CFButton buttonAddPopSubDep2 = null;
	protected CFButton buttonAddPopSubDep3 = null;
	protected CFButton buttonAddPopTopDep = null;
	protected CFButton buttonViewSelected = null;
	protected CFButton buttonEditSelected = null;
	protected CFButton buttonDeleteSelected = null;
	protected TableView<ICFBamPopDepObj> dataTable = null;
	protected TableColumn<ICFBamPopDepObj,String> tableColumnObjKind = null;
	protected TableColumn<ICFBamPopDepObj, Long> tableColumnId = null;
	protected TableColumn<ICFBamPopDepObj, ICFBamRelationObj> tableColumnLookupRelation = null;
	protected TableColumn<ICFBamPopDepObj, ICFBamSchemaDefObj> tableColumnLookupDefSchema = null;

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


	public CFBamJavaFXPopDepListPane( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFLibAnyObj argContainer,
		ICFBamPopDepObj argFocus,
		Collection<ICFBamPopDepObj> argDataCollection,
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
		dataTable = new TableView<ICFBamPopDepObj>();
		tableColumnObjKind = new TableColumn<ICFBamPopDepObj,String>( "Class Code" );
		tableColumnObjKind.setCellValueFactory( new Callback<CellDataFeatures<ICFBamPopDepObj,String>,ObservableValue<String> >() {
			@Override public ObservableValue<String> call( CellDataFeatures<ICFBamPopDepObj, String> p ) {
				ICFBamPopDepObj obj = p.getValue();
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
		tableColumnObjKind.setCellFactory( new Callback<TableColumn<ICFBamPopDepObj,String>,TableCell<ICFBamPopDepObj,String>>() {
			@Override public TableCell<ICFBamPopDepObj,String> call(
				TableColumn<ICFBamPopDepObj,String> arg)
			{
				return new CFStringTableCell<ICFBamPopDepObj>();
			}
		});
		dataTable.getColumns().add( tableColumnObjKind );
		tableColumnId = new TableColumn<ICFBamPopDepObj,Long>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<ICFBamPopDepObj,Long>,ObservableValue<Long> >() {
			public ObservableValue<Long> call( CellDataFeatures<ICFBamPopDepObj, Long> p ) {
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
		tableColumnId.setCellFactory( new Callback<TableColumn<ICFBamPopDepObj,Long>,TableCell<ICFBamPopDepObj,Long>>() {
			@Override public TableCell<ICFBamPopDepObj,Long> call(
				TableColumn<ICFBamPopDepObj,Long> arg)
			{
				return new CFInt64TableCell<ICFBamPopDepObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnLookupRelation = new TableColumn<ICFBamPopDepObj, ICFBamRelationObj>( "Relation" );
		tableColumnLookupRelation.setCellValueFactory( new Callback<CellDataFeatures<ICFBamPopDepObj,ICFBamRelationObj>,ObservableValue<ICFBamRelationObj> >() {
			public ObservableValue<ICFBamRelationObj> call( CellDataFeatures<ICFBamPopDepObj, ICFBamRelationObj> p ) {
				ICFBamPopDepObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					ICFBamRelationObj ref = obj.getRequiredLookupRelation();
					ReadOnlyObjectWrapper<ICFBamRelationObj> observable = new ReadOnlyObjectWrapper<ICFBamRelationObj>();
					observable.setValue( ref );
					return( observable );
				}
			}
		});
		tableColumnLookupRelation.setCellFactory( new Callback<TableColumn<ICFBamPopDepObj,ICFBamRelationObj>,TableCell<ICFBamPopDepObj,ICFBamRelationObj>>() {
			@Override public TableCell<ICFBamPopDepObj,ICFBamRelationObj> call(
				TableColumn<ICFBamPopDepObj,ICFBamRelationObj> arg)
			{
				return new CFReferenceTableCell<ICFBamPopDepObj,ICFBamRelationObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupRelation );
		tableColumnLookupDefSchema = new TableColumn<ICFBamPopDepObj, ICFBamSchemaDefObj>( "Defining Schema Definition" );
		tableColumnLookupDefSchema.setCellValueFactory( new Callback<CellDataFeatures<ICFBamPopDepObj,ICFBamSchemaDefObj>,ObservableValue<ICFBamSchemaDefObj> >() {
			public ObservableValue<ICFBamSchemaDefObj> call( CellDataFeatures<ICFBamPopDepObj, ICFBamSchemaDefObj> p ) {
				ICFBamPopDepObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					ICFBamSchemaDefObj ref = obj.getOptionalLookupDefSchema();
					ReadOnlyObjectWrapper<ICFBamSchemaDefObj> observable = new ReadOnlyObjectWrapper<ICFBamSchemaDefObj>();
					observable.setValue( ref );
					return( observable );
				}
			}
		});
		tableColumnLookupDefSchema.setCellFactory( new Callback<TableColumn<ICFBamPopDepObj,ICFBamSchemaDefObj>,TableCell<ICFBamPopDepObj,ICFBamSchemaDefObj>>() {
			@Override public TableCell<ICFBamPopDepObj,ICFBamSchemaDefObj> call(
				TableColumn<ICFBamPopDepObj,ICFBamSchemaDefObj> arg)
			{
				return new CFReferenceTableCell<ICFBamPopDepObj,ICFBamSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupDefSchema );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<ICFBamPopDepObj>() {
				@Override public void changed( ObservableValue<? extends ICFBamPopDepObj> observable,
					ICFBamPopDepObj oldValue,
					ICFBamPopDepObj newValue )
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
		if( observableListOfPopDep != null ) {
			dataTable.setItems( observableListOfPopDep );
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
		if( ( value == null ) || ( value instanceof ICFBamPopDepObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamPopDepObj" );
		}
		adjustListButtons();
	}

	public ICFBamPopDepObj getJavaFXFocusAsPopDep() {
		return( (ICFBamPopDepObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsPopDep( ICFBamPopDepObj value ) {
		setJavaFXFocus( value );
	}

	public class PopDepByQualNameComparator
	implements Comparator<ICFBamPopDepObj>
	{
		public PopDepByQualNameComparator() {
		}

		public int compare( ICFBamPopDepObj lhs, ICFBamPopDepObj rhs ) {
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

	protected PopDepByQualNameComparator comparePopDepByQualName = new PopDepByQualNameComparator();

	public Collection<ICFBamPopDepObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<ICFBamPopDepObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfPopDep = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<ICFBamPopDepObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfPopDep.add( iter.next() );
				}
				observableListOfPopDep.sort( comparePopDepByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfPopDep );
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
						ICFBamPopDepObj selectedInstance = getJavaFXFocusAsPopDep();
						if( selectedInstance != null ) {
							String classCode = selectedInstance.getClassCode();
							if( "a830".equals( classCode ) ) {
								CFBorderPane frame = javafxSchema.getPopDepFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
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
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ICFBamPopDepObj, ICFBamPopSubDep1Obj, ICFBamPopSubDep2Obj, ICFBamPopSubDep3Obj, ICFBamPopTopDepObj" );
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
						ICFBamPopDepObj selectedInstance = getJavaFXFocusAsPopDep();
						if( selectedInstance != null ) {
							String classCode = selectedInstance.getClassCode();
							if( "a830".equals( classCode ) ) {
								CFBorderPane frame = javafxSchema.getPopDepFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((ICFBamJavaFXPopDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( "a831".equals( classCode ) ) {
								ICFBamPopSubDep1Obj obj = (ICFBamPopSubDep1Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopSubDep1Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXPopSubDep1PaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( "a832".equals( classCode ) ) {
								ICFBamPopSubDep2Obj obj = (ICFBamPopSubDep2Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopSubDep2Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXPopSubDep2PaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( "a833".equals( classCode ) ) {
								ICFBamPopSubDep3Obj obj = (ICFBamPopSubDep3Obj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopSubDep3Factory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXPopSubDep3PaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( "a834".equals( classCode ) ) {
								ICFBamPopTopDepObj obj = (ICFBamPopTopDepObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getPopTopDepFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXPopTopDepPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ICFBamPopDepObj, ICFBamPopSubDep1Obj, ICFBamPopSubDep2Obj, ICFBamPopSubDep3Obj, ICFBamPopTopDepObj" );
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
						ICFBamPopDepObj selectedInstance = getJavaFXFocusAsPopDep();
						if( selectedInstance != null ) {
							String classCode = selectedInstance.getClassCode();
							if( "a830".equals( classCode ) ) {
								CFBorderPane frame = javafxSchema.getPopDepFactory().newAskDeleteForm( cfFormManager, selectedInstance, getDeleteCallback() );
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
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ICFBamPopDepObj, ICFBamPopSubDep1Obj, ICFBamPopSubDep2Obj, ICFBamPopSubDep3Obj, ICFBamPopTopDepObj" );
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
		ICFBamPopDepObj selectedObj = getJavaFXFocusAsPopDep();
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
