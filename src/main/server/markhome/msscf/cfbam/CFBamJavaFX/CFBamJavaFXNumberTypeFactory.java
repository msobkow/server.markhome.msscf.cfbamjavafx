// Description: Java 11 JavaFX Display Element Factory for NumberType.

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
 *	CFBamJavaFXNumberTypeFactory JavaFX Display Element Factory
 *	for NumberType.
 */
public class CFBamJavaFXNumberTypeFactory
implements ICFBamJavaFXNumberTypeFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXNumberTypeFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamNumberTypeObj argFocus ) {
		CFBamJavaFXNumberTypeAttrPane retnew = new CFBamJavaFXNumberTypeAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamSchemaDefObj argContainer,
		ICFBamNumberTypeObj argFocus,
		Collection<ICFBamNumberTypeObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXNumberTypeListPane retnew = new CFBamJavaFXNumberTypeListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamNumberTypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamNumberTypeObj> argDataCollection,
		ICFBamJavaFXNumberTypeChosen whenChosen )
	{
		CFBamJavaFXNumberTypePickerPane retnew = new CFBamJavaFXNumberTypePickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamNumberTypeObj argFocus ) {
		CFBamJavaFXNumberTypeEltTabPane retnew = new CFBamJavaFXNumberTypeEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamNumberTypeObj argFocus ) {
		CFBamJavaFXNumberTypeAddPane retnew = new CFBamJavaFXNumberTypeAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamNumberTypeObj argFocus ) {
		CFBamJavaFXNumberTypeViewEditPane retnew = new CFBamJavaFXNumberTypeViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamNumberTypeObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXNumberTypeAskDeleteForm retnew = new CFBamJavaFXNumberTypeAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamNumberTypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamNumberTypeObj> argDataCollection,
		ICFBamJavaFXNumberTypeChosen whenChosen )
	{
		CFBamJavaFXNumberTypePickerForm retnew = new CFBamJavaFXNumberTypePickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamNumberTypeObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXNumberTypeAddForm retnew = new CFBamJavaFXNumberTypeAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamNumberTypeObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXNumberTypeViewEditForm retnew = new CFBamJavaFXNumberTypeViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
