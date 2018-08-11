# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Wrapper around ogre3d, it provides a fixed CMake module and an ExternalProject build of ogre."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0 & MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=f12ef8c0445c08084ae92cf2dcb7ee92"

DEPENDS = "ament-cmake libfreetype6 libfreetype6-dev libx11-dev libxaw libxrandr opengl pkgconfig"
SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/bouncy/rviz_ogre_vendor/4.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a08f64fb120335104d581f49e44b0907"
SRC_URI[sha256sum] = "353223832909d4b27168003152c03084bbc3600b1cfc96caefb536044663dec1"
S = "${WORKDIR}/rviz-release-release-bouncy-rviz_ogre_vendor-4.0.1-0"

inherit catkin
