# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to export definitions to downstream packages in the ament buildsystem."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/bouncy/ament_cmake_export_definitions/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7b6410dd29f0390ca1d05d80ef17cb98"
SRC_URI[sha256sum] = "5677632100cb7908a107353174590115f8fadb50bf0b23d4379d41d6189a6415"
S = "${WORKDIR}/ament_cmake-release-release-bouncy-ament_cmake_export_definitions-0.5.1-0"

inherit catkin
