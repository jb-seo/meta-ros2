# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Several default plugins for rviz to cover the basic functionality."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " geometry-msgs laser-geometry libqt5-core libqt5-gui libqt5-opengl libqt5-widgets map-msgs nav-msgs pluginlib qtbase5-dev rclcpp resource-retriever rviz-common rviz-rendering tinyxml-vendor urdf visualization-msgs"
SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/crystal/rviz_default_plugins/5.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0b9af956ee2997317b635eefd45bbffe"
SRC_URI[sha256sum] = "86db4edda8a8596f4b26e72fb17d9dbe7c48effc1b99a76d46dfd475312c9187"
S = "${WORKDIR}/rviz-release-release-crystal-rviz_default_plugins-5.1.0-0"

inherit ament
