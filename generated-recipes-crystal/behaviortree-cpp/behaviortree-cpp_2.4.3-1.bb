# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides a behavior trees core."
AUTHOR = "Michele Colledanchise <michele.colledanchise@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_BUILD_DEPENDS = " \
    zeromq \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    zeromq \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    zeromq \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/BehaviorTree/behaviortree_cpp-release/archive/release/crystal/behaviortree_cpp/2.4.3-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "8a33a0a2672e30229ed979898941deb2"
SRC_URI[sha256sum] = "119e8a57c251ae3979a0481b693f062941796764ee047eb40eff98789183a9aa"
S = "${WORKDIR}/behaviortree_cpp-release-release-crystal-behaviortree_cpp-2.4.3-1"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/behaviortree-cpp/behaviortree-cpp_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/behaviortree-cpp/behaviortree-cpp_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/behaviortree-cpp/behaviortree-cpp-${PV}_common.inc

inherit ros_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}

