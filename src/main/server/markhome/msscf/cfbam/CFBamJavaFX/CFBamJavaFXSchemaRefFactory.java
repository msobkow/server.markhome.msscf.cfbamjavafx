// Description: Java 11 JavaFX Display Element Factory for SchemaRef.

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
 *	CFBamJavaFXSchemaRefFactory JavaFX Display Element Factory
 *	for SchemaRef.
 */
public class CFBamJavaFXSchemaRefFactory
implements ICFBamJavaFXSchemaRefFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXSchemaRefFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamSchemaRefObj argFocus ) {
		CFBamJavaFXSchemaRefAttrPane retnew = new CFBamJavaFXSchemaRefAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamSchemaDefObj argContainer,
		ICFBamSchemaRefObj argFocus,
		Collection<ICFBamSchemaRefObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXSchemaRefListPane retnew = new CFBamJavaFXSchemaRefListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamSchemaRefObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamSchemaRefObj> argDataCollection,
		ICFBamJavaFXSchemaRefChosen whenChosen )
	{
		CFBamJavaFXSchemaRefPickerPane retnew = new CFBamJavaFXSchemaRefPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamSchemaRefObj argFocus ) {
		CFBamJavaFXSchemaRefEltTabPane retnew = new CFBamJavaFXSchemaRefEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamSchemaRefObj argFocus ) {
		CFBamJavaFXSchemaRefAddPane retnew = new CFBamJavaFXSchemaRefAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamSchemaRefObj argFocus ) {
		CFBamJavaFXSchemaRefViewEditPane retnew = new CFBamJavaFXSchemaRefViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamSchemaRefObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXSchemaRefAskDeleteForm retnew = new CFBamJavaFXSchemaRefAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamSchemaRefObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamSchemaRefObj> argDataCollection,
		ICFBamJavaFXSchemaRefChosen whenChosen )
	{
		CFBamJavaFXSchemaRefPickerForm retnew = new CFBamJavaFXSchemaRefPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamSchemaRefObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXSchemaRefAddForm retnew = new CFBamJavaFXSchemaRefAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamSchemaRefObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXSchemaRefViewEditForm retnew = new CFBamJavaFXSchemaRefViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
