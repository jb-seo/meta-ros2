# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Wrapper around yaml-cpp, it provides a fixed CMake module and an ExternalProject build of it."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0 & MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=f12ef8c0445c08084ae92cf2dcb7ee92"

DEPENDS = "ament-cmake"
SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/bouncy/rviz_yaml_cpp_vendor/4.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d7c54aafeea25cb22bd26ee44fae7f5b"
SRC_URI[sha256sum] = "dab42632eaa0eadded9248eceb2d4e2bcc73b7d59d47a0868859627e21d90daa"
S = "${WORKDIR}/rviz-release-release-bouncy-rviz_yaml_cpp_vendor-4.0.1-0"

inherit catkin
