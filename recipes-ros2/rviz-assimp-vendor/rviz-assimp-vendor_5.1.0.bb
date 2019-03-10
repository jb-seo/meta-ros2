# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Wrapper around assimp, providing nothing but a dependency on assimp, on some systems.     On others, it provides a fixed CMake module or even an ExternalProject build of assimp."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0 & BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=f12ef8c0445c08084ae92cf2dcb7ee92"

DEPENDS = "ament-cmake assimp"
SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/crystal/rviz_assimp_vendor/5.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1f0ed357a155f8fda35ab2b7898d6afb"
SRC_URI[sha256sum] = "b571fec410ffc054065ebb16be64e2ef2e6b50b62c9a3fe4656ffde67750a8e9"
S = "${WORKDIR}/rviz-release-release-crystal-rviz_assimp_vendor-5.1.0-0"

inherit catkin
