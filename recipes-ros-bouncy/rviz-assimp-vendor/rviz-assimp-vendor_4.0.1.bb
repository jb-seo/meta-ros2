# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Wrapper around assimp, providing nothing but a dependency on assimp, on some systems.     On others, it provides a fixed CMake module or even an ExternalProject build of assimp."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0 & BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=f12ef8c0445c08084ae92cf2dcb7ee92"

DEPENDS = "ament-cmake assimp"
SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/bouncy/rviz_assimp_vendor/4.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3dbae51ffaa4740d5d7ef45ade5966fd"
SRC_URI[sha256sum] = "2c3e96836b02bb850ec1ad5491d8aef1582c5d407b2f4937aa553f9591f0bc4d"
S = "${WORKDIR}/rviz-release-release-bouncy-rviz_assimp_vendor-4.0.1-0"

inherit catkin
