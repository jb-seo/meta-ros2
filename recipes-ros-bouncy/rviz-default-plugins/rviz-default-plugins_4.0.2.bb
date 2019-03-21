# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Several default plugins for rviz to cover the basic functionality."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs laser-geometry map-msgs nav-msgs pluginlib rclcpp resource-retriever rviz-common rviz-rendering tinyxml-vendor urdf visualization-msgs libqt5-core libqt5-gui libqt5-opengl libqt5-widgets qtbase5-dev"
SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/bouncy/rviz_default_plugins/4.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "be021042fa8ae44bab28859b8e612923"
SRC_URI[sha256sum] = "c556500191b41b4e320a463f22dfdc064bc7603c06a3e694f28fbabc1ed1915e"
S = "${WORKDIR}/rviz-release-release-bouncy-rviz_default_plugins-4.0.2-0"

inherit ros
inherit ament


