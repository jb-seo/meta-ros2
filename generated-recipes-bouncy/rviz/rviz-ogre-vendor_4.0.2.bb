# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Wrapper around ogre3d, it provides a fixed CMake module and an ExternalProject build of ogre."
AUTHOR = "William Woodall <william@osrfoundation.org>"
HOMEPAGE = "https://www.ogre3d.org/"
SECTION = "devel"
LICENSE = "Apache-2.0 & MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=f12ef8c0445c08084ae92cf2dcb7ee92"

ROS_BUILD_DEPENDS = " \
    freetype \
    libx11 \
    libxaw \
    libxrandr \
    mesa \
    pkgconf \
"
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

RDEPENDS_${PN} = " \
    freetype \
    freetype \
    libx11 \
    libxaw \
    libxrandr \
    mesa \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
"

SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/bouncy/rviz_ogre_vendor/4.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "dab929ad518f6d2fcaff11d7e5ce394d"
SRC_URI[sha256sum] = "5ab4559752c54abf6c3ac4080f03cb9c437f87be1ed14c15ca1d0f8fe595dda2"
S = "${WORKDIR}/rviz-release-release-bouncy-rviz_ogre_vendor-4.0.2-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/rviz/rviz_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/rviz/rviz_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rviz/rviz-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rviz/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rviz/${BPN}-${PV}.inc

inherit ros_${ROSDISTRO}
inherit ros_${ROS_BUILD_TYPE}

