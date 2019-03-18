# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Interface for using ROS with the <a href="http://gazebosim.org/">Gazebo</a> simulator."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=8caad55b0e7a31e039fbcff07dba789e"

DEPENDS = " gazebo-dev gazebo-msgs gazebo-plugins gazebo-ros"
SRC_URI = "https://github.com/ros2-gbp/gazebo_ros_pkgs-release/archive/release/crystal/gazebo_ros_pkgs/3.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cf541b08388c020d92a5c85b355eafb5"
SRC_URI[sha256sum] = "0c9b8fd9e7e55dff91d9fe7a7f578f92147d278ca76e3d6ca6bec4e2233ea743"
S = "${WORKDIR}/gazebo_ros_pkgs-release-release-crystal-gazebo_ros_pkgs-3.1.0-0"

inherit ament
