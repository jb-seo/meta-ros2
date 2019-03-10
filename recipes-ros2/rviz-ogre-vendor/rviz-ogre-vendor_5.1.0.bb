# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Wrapper around ogre3d, it provides a fixed CMake module and an ExternalProject build of ogre."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0 & MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=f12ef8c0445c08084ae92cf2dcb7ee92"

DEPENDS = "ament-cmake libfreetype6 libfreetype6-dev libx11-dev libxaw libxrandr opengl pkgconfig"
SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/crystal/rviz_ogre_vendor/5.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d95c62249e8af73f32b1d5f15982c4c2"
SRC_URI[sha256sum] = "804f35dd8c1bf6183eb37bae744861da954bce63188ed3c11e1ed2bd135aecdb"
S = "${WORKDIR}/rviz-release-release-crystal-rviz_ogre_vendor-5.1.0-0"

inherit catkin
