# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides an implementation of a 2D costmap that takes in sensor     data from the world, builds a 2D or 3D occupancy grid of the data (depending     on whether a voxel based implementation is used), and inflates costs in a     2D costmap based on the occupancy grid and a user specified inflation radius.     This package also provides support for map_server based initialization of a     costmap, rolling window based costmaps, and parameter based subscription to     and configuration of sensor topics."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " geometry-msgs laser-geometry libpcl-all-dev map-msgs message-filters nav2-dynamic-params nav2-msgs nav2-util nav2-voxel-grid nav-msgs pluginlib rclcpp sensor-msgs std-msgs tf2 tf2-geometry-msgs tf2-ros tf2-sensor-msgs visualization-msgs"
SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/crystal/nav2_costmap_2d/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "83a63244adf9a75823e79cf299e167cc"
SRC_URI[sha256sum] = "d7e4f9a66122fd0f8198987a294134caa3be6ae4acb6c8ae7add9062b79e91fc"
S = "${WORKDIR}/navigation2-release-release-crystal-nav2_costmap_2d-0.1.5-0"

inherit ament
