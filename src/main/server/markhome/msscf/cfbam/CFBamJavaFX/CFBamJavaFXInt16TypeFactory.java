// Description: Java 11 JavaFX Display Element Factory for Int16Type.

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
 *	CFBamJavaFXInt16TypeFactory JavaFX Display Element Factory
 *	for Int16Type.
 */
public class CFBamJavaFXInt16TypeFactory
implements ICFBamJavaFXInt16TypeFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXInt16TypeFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamInt16TypeObj argFocus ) {
		CFBamJavaFXInt16TypeAttrPane retnew = new CFBamJavaFXInt16TypeAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamSchemaDefObj argContainer,
		ICFBamInt16TypeObj argFocus,
		Collection<ICFBamInt16TypeObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXInt16TypeListPane retnew = new CFBamJavaFXInt16TypeListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamInt16TypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamInt16TypeObj> argDataCollection,
		ICFBamJavaFXInt16TypeChosen whenChosen )
	{
		CFBamJavaFXInt16TypePickerPane retnew = new CFBamJavaFXInt16TypePickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamInt16TypeObj argFocus ) {
		CFBamJavaFXInt16TypeEltTabPane retnew = new CFBamJavaFXInt16TypeEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamInt16TypeObj argFocus ) {
		CFBamJavaFXInt16TypeAddPane retnew = new CFBamJavaFXInt16TypeAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamInt16TypeObj argFocus ) {
		CFBamJavaFXInt16TypeViewEditPane retnew = new CFBamJavaFXInt16TypeViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamInt16TypeObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXInt16TypeAskDeleteForm retnew = new CFBamJavaFXInt16TypeAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamInt16TypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamInt16TypeObj> argDataCollection,
		ICFBamJavaFXInt16TypeChosen whenChosen )
	{
		CFBamJavaFXInt16TypePickerForm retnew = new CFBamJavaFXInt16TypePickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamInt16TypeObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXInt16TypeAddForm retnew = new CFBamJavaFXInt16TypeAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamInt16TypeObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXInt16TypeViewEditForm retnew = new CFBamJavaFXInt16TypeViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
