# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Wrapper around tinyxml2, providing nothing but a dependency on tinyxml2, on some systems.     On others, it provides a fixed CMake module or even an ExternalProject build of tinyxml2."
AUTHOR = "William Woodall <william@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = " \
    libtinyxml2 \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    libtinyxml2 \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/tinyxml2_vendor-release/archive/release/crystal/tinyxml2_vendor/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "67784c0447a3199f3a5886ffe71f4e40"
SRC_URI[sha256sum] = "68aa18c4cdfc73098b30c5b59de57a85458e88e38f54b790442cf6ab05861514"
S = "${WORKDIR}/tinyxml2_vendor-release-release-crystal-tinyxml2_vendor-0.6.1-0"

ROS_BUILD_TYPE = "cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/tinyxml2-vendor/tinyxml2-vendor_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/tinyxml2-vendor/tinyxml2-vendor_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/tinyxml2-vendor/tinyxml2-vendor-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/tinyxml2-vendor/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/tinyxml2-vendor/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
