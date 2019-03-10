# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The pluginlib package provides tools for writing and dynamically loading plugins using the ROS build infrastructure.     To work, these tools require plugin providers to register their plugins in the package.xml of their package."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake ament-index-cpp class-loader rcutils tinyxml2-vendor"
SRC_URI = "https://github.com/ros2-gbp/${PN}-release/archive/release/crystal/${PN}/2.2.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0c5b93886e2b64f4335312c6d01e3612"
SRC_URI[sha256sum] = "f520bff44d60282657c97f75a9eee211d9e49e0ed605450997a0155f774adbaf"
S = "${WORKDIR}/${PN}-release-release-crystal-${PN}-2.2.1-0"

inherit catkin
