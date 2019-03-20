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
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

RDEPENDS_${PN} = " \
    libtinyxml2 \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
"

SRC_URI = "https://github.com/ros2-gbp/tinyxml2_vendor-release/archive/release/bouncy/tinyxml2_vendor/0.4.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "e6a25b5ff289dd74798e4d2b4a77c30a"
SRC_URI[sha256sum] = "a0c41d836a8e197e47c7be761a69de2a3ef6fdf0786807c1232958fac7830c17"
S = "${WORKDIR}/tinyxml2_vendor-release-release-bouncy-tinyxml2_vendor-0.4.0-0"

ROS_BUILD_TYPE = "cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/tinyxml2-vendor/tinyxml2-vendor_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/tinyxml2-vendor/tinyxml2-vendor_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/tinyxml2-vendor/tinyxml2-vendor-${PV}_common.inc

inherit ros_${ROSDISTRO}
inherit ros_${ROS_BUILD_TYPE}

