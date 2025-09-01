// Description: Java 11 JavaFX Display Element Factory for BlobType.

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
 *	CFBamJavaFXBlobTypeFactory JavaFX Display Element Factory
 *	for BlobType.
 */
public class CFBamJavaFXBlobTypeFactory
implements ICFBamJavaFXBlobTypeFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXBlobTypeFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamBlobTypeObj argFocus ) {
		CFBamJavaFXBlobTypeAttrPane retnew = new CFBamJavaFXBlobTypeAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamSchemaDefObj argContainer,
		ICFBamBlobTypeObj argFocus,
		Collection<ICFBamBlobTypeObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXBlobTypeListPane retnew = new CFBamJavaFXBlobTypeListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamBlobTypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamBlobTypeObj> argDataCollection,
		ICFBamJavaFXBlobTypeChosen whenChosen )
	{
		CFBamJavaFXBlobTypePickerPane retnew = new CFBamJavaFXBlobTypePickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamBlobTypeObj argFocus ) {
		CFBamJavaFXBlobTypeEltTabPane retnew = new CFBamJavaFXBlobTypeEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamBlobTypeObj argFocus ) {
		CFBamJavaFXBlobTypeAddPane retnew = new CFBamJavaFXBlobTypeAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamBlobTypeObj argFocus ) {
		CFBamJavaFXBlobTypeViewEditPane retnew = new CFBamJavaFXBlobTypeViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamBlobTypeObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXBlobTypeAskDeleteForm retnew = new CFBamJavaFXBlobTypeAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamBlobTypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamBlobTypeObj> argDataCollection,
		ICFBamJavaFXBlobTypeChosen whenChosen )
	{
		CFBamJavaFXBlobTypePickerForm retnew = new CFBamJavaFXBlobTypePickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamBlobTypeObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXBlobTypeAddForm retnew = new CFBamJavaFXBlobTypeAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamBlobTypeObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXBlobTypeViewEditForm retnew = new CFBamJavaFXBlobTypeViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
